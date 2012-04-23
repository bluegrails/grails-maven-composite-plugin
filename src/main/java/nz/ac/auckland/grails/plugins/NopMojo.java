package nz.ac.auckland.grails.plugins;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.AbstractMojo;

/**
 * Executes an arbitrary Grails command.
 *
 * @author Richard Vowles
 * @version $Id$
 * @description Does nothing, here to prevent maven-plugin-compiler from being grumpy
 * @goal exec
 * @requiresProject false
 * @requiresDependencyResolution compile
 * @since 0.4
 */
public class NopMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("This does not do anything.");
    }
}
