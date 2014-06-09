package crepe.examples.tools.servicecomposition;

import java.util.Random;

import org.eclipse.emf.ecore.EObject;

public class ExampleTool {

	private Random random = new Random();
	
	// The type of 'candidate' can be the root object type, i.e. CompositeApplication 
	// (assuming the classes have been generated from the metamodel and are on the classpath) 
	public double evaluate(EObject candidate) {
		// TODO: Delegate to simulator 
		
		return random.nextDouble();
	}
}
