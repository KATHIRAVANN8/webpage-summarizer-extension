package webpage_summarizer.controller;

import webpage_summarizer.dto.SummarizeRequest;
import webpage_summarizer.dto.SummarizeResponse;
import webpage_summarizer.service.AIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SummarizerController {

    private final AIService aiService;

    public SummarizerController(AIService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/summarize")
    public SummarizeResponse summarize(@RequestBody SummarizeRequest request) {
        String summary = aiService.summarizeText(request.getText());
        return new SummarizeResponse(summary);
    }
}
