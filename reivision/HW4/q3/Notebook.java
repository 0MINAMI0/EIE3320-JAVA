import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * @author David J. Barnes and Michael Kolling.
 * @version 2001.06.08
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String>notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeNote(int noteNumber)
    {
        if(noteNumber < 0) {
            System.out.println("error");
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number.
            notes.remove(noteNumber);
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    public void showNote(int noteNumber)
    {
        if(noteNumber < 0) {
            System.out.println("error");
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    /**
     * List all notes in the notebook.
     */
    public void listNotes()
    {
        int index = 0;
        while(index < notes.size()) {
            System.out.println(notes.get(index));
            index++;
        }
    }
}
