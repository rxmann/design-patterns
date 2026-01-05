package state.context;

import state.states.DraftState;
import state.states.DocumentState;

public class Document {

    private DocumentState state = new DraftState();

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void edit() {
        state.edit(this);
    }

    public void submitForReview() {
        state.submitForReview(this);
    }

    public void publish() {
        state.publish(this);
    }

}
