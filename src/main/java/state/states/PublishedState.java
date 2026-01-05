package state.states;

import state.context.Document;

public class PublishedState implements DocumentState {

    @Override
    public void edit(Document doc) {
        System.out.println("Cannot edit a published document.");
    }

    @Override
    public void submitForReview(Document doc) {
        System.out.println("Already published.");
    }

    @Override
    public void publish(Document doc) {
        System.out.println("Already published.");
    }

}
