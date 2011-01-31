package gov.nih.nci.ncia.search;

/**
 * This object is responsible for drilling down into a patient result to return
 * details like the studies, series and images for that patient.
 * 
 * <p>Used to be in something call ResultSetManager.
 */
public interface DrillDown {

	/**
	 * For a given patient, return all the studies for it. 
	 */
	public StudySearchResult[] retrieveStudyAndSeriesForPatient(PatientSearchResult patientSearchResult);
	

	/**
	 * For a given series id, return all the images for it.  This id is
	 * not the DICOM series instance uid, but the unique identifier at a given node (pkid).
	 */
	public ImageSearchResult[] retrieveImagesForSeries(SeriesSearchResult seriesSearchResult);
}