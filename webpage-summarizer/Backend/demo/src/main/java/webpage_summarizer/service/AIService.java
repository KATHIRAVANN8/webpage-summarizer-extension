package webpage_summarizer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class AIService {

    @Value("${gemini.api.key}")
    private String apiKey;

    private static final String GEMINI_URL =
            "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=";

    public String summarizeText(String text) {

        RestTemplate restTemplate = new RestTemplate();

        // Request body
        Map<String, Object> body = new HashMap<>();

        Map<String, Object> part = new HashMap<>();
        part.put("text", "Summarize the following webpage in 5 bullet points:\n" + text);

        Map<String, Object> content = new HashMap<>();
        content.put("parts", List.of(part));

        body.put("contents", List.of(content));

        try {
            Map response = restTemplate.postForObject(
                    GEMINI_URL + apiKey,
                    body,
                    Map.class
            );

            List candidates = (List) response.get("candidates");
            Map firstCandidate = (Map) candidates.get(0);
            Map contentMap = (Map) firstCandidate.get("content");
            List parts = (List) contentMap.get("parts");
            Map textPart = (Map) parts.get(0);

            return textPart.get("text").toString();

        } catch (Exception e) {
            return "⚠️ Unable to generate summary right now.";
        }
    }
}
