package xample;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

/**
 *
 * @author acabezaslopez
 */
public class Xample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            GitHub github = GitHub.connect();
            GHRepository repo = github.createRepository(
                    "new-repository", "this is my new repository",
                    "http://www.kohsuke.org/", true/*public*/);
            repo.addCollaborators(github.getUser("abayer"), github.getUser("rtyler"));
            repo.delete();
        } catch (IOException ex) {
            Logger.getLogger(Xample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
