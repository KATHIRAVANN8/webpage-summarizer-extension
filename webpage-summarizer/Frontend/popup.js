document.getElementById("summarizeBtn").addEventListener("click", async () => {
  const result = document.getElementById("result");
  result.innerText = "Summarizing...";

  const [tab] = await chrome.tabs.query({ active: true, currentWindow: true });

  chrome.tabs.sendMessage(
    tab.id,
    { action: "GET_PAGE_TEXT" },
    async (response) => {
      if (!response || !response.text) {
        result.innerText = "Unable to read page content.";
        return;
      }

      const pageText = response.text.substring(0, 3000); // limit text

      // 🔴 Call AI API (example)
      const aiResponse = await fetch("http://localhost:8080/api/summarize", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
          text: pageText,
        }),
      });

      const data = await aiResponse.json();
      result.innerText = data.summary;
    }
  );
});
