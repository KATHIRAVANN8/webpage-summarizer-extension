chrome.runtime.onMessage.addListener((request, sender, sendResponse) => {
  if (request.action === "GET_PAGE_TEXT") {
    // Remove script & style text noise
    const bodyClone = document.body.cloneNode(true);
    bodyClone
      .querySelectorAll("script, style, nav, footer, header")
      .forEach((e) => e.remove());

    const cleanText = bodyClone.innerText.replace(/\s+/g, " ").trim();

    sendResponse({ text: cleanText });
  }
});
