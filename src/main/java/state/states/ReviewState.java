package state.states;

import state.context.Document;

public class ReviewState implements DocumentState {

    @Override
    public void edit(Document doc) {
        System.out.println("Cannot edit while in review.");
    }

    @Override
    public void submitForReview(Document doc) {
        System.out.println("Already in review.");
    }

    @Override
    public void publish(Document doc) {
        System.out.println("Publishing document...");
        doc.setState(new PublishedState());
    }

}
