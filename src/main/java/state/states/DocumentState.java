package state.states;

import state.context.Document;

public interface DocumentState {

    void edit(Document doc);

    void submitForReview(Document doc);

    void publish(Document doc);

}
