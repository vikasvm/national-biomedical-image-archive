/**
 * 
 */
package gov.nih.nci.nbia.dto;

import junit.framework.TestCase;

/**
 * @author lethai
 *
 */
public class ImageDTOTestCase extends TestCase {
	public void testAccessors() {
		
		String SOPInstanceUID="1.2.3.4.5.6";
		String fileName="1.2.3.4.5.6.7.dcm";
		Long dicomSize = new Long(514);
		String project="RIDER";
		String site="RIDER";
		String ssg="test";
		int frameNum = 0;
        
        ImageDTO imageDTO = new ImageDTO(SOPInstanceUID, fileName, dicomSize, project, site, ssg, 0);

        assertTrue(imageDTO.getSOPInstanceUID().equals("1.2.3.4.5.6"));
        assertTrue(imageDTO.getFileName().equals("1.2.3.4.5.6.7.dcm"));        
        assertTrue(imageDTO.getDicomSize() ==514L);
        assertTrue(imageDTO.getProject().equals("RIDER"));	
        assertTrue(imageDTO.getSite().equals("RIDER"));	
        assertTrue(imageDTO.getSsg().equals("test"));	
    }
}