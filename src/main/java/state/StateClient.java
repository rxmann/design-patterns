package state;

import state.context.Document;


public class StateClient {

    public static void main(String[] args) {

        Document doc = new Document();

        doc.edit(); // allowed
        doc.publish(); // not allowed
        doc.submitForReview(); // moves to Review

        doc.edit(); // not allowed
        doc.publish(); // moves to Published

        doc.edit(); // not allowed

    }
}
