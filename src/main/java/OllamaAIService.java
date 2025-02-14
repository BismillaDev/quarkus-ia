import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface OllamaAIService {

    // Context message
    @SystemMessage("You are an expert in quarkus, java, javascript and langchain4j")
    // Prompt customisation
    @UserMessage("Answer as best possible to the following question: {question}. The answer must be in a style of a virtual assistant and use emoji.")
    String askAQuestion(String question);
}
