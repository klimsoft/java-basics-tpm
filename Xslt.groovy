import javax.xml.transform.TransformerFactory
import javax.xml.transform.stream.StreamResult
import javax.xml.transform.stream.StreamSource

// Specify the paths to the XML and XSLT files
def xmlFile = "src/main/resources/input.xml"
def xsltFile = "src/main/resources/transform.xslt"

// Create the TransformerFactory
def transformerFactory = TransformerFactory.newInstance()

// Create a StreamSource for the XML file
def xmlSource = new StreamSource(new File(xmlFile))

// Create a StreamSource for the XSLT file
def xsltSource = new StreamSource(new File(xsltFile))

// Create a StreamResult to capture the transformation result
def result = new StreamResult(System.out)

try {
    // Create a Transformer object from the XSLT source
    def transformer = transformerFactory.newTransformer(xsltSource)

    // Perform the transformation
    transformer.transform(xmlSource, result)

    // Flush and close the output stream
    System.out.flush()
    System.out.close()
} catch (Exception e) {
    // Handle any exceptions that occur during the transformation
    e.printStackTrace()
}






