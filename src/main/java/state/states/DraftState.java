package state.states;

import state.context.Document;

public class DraftState implements DocumentState {

    @Override
    public void edit(Document doc) {
        System.out.println("Editing document...");
    }

    @Override
    public void submitForReview(Document doc) {
        System.out.println("Submitting for review...");
        doc.setState(new ReviewState());
    }

    @Override
    public void publish(Document doc) {
        System.out.println("Cannot publish a draft.");
    }

}
