package gov.nih.nci.ncia.remotesearch;
import gov.nih.nci.ncia.search.DrillDown;
import gov.nih.nci.ncia.search.ImageSearchResult;
import gov.nih.nci.ncia.search.LocalDrillDown;
import gov.nih.nci.ncia.search.PatientSearchResult;
import gov.nih.nci.ncia.search.SeriesSearchResult;
import gov.nih.nci.ncia.search.StudySearchResult;
import gov.nih.nci.ncia.search.ThumbnailResolverFactory;

/**
 * <p>Depending on the result object, this composite drill down will send the
 * request locally or remote.
 */
public class CompositeDrillDown implements DrillDown {
	public CompositeDrillDown() {
		localDrillDown = new LocalDrillDown();
		localDrillDown.setThumbnailURLResolver(ThumbnailResolverFactory.getThumbnailURLResolver());
	}

	/**
	 * {@inheritDoc}
	 */
	public StudySearchResult[] retrieveStudyAndSeriesForPatient(PatientSearchResult patientSearchResult) {
		if(patientSearchResult.associatedLocation().isLocal()) {
			return localDrillDown.retrieveStudyAndSeriesForPatient(patientSearchResult);
		}
		else {
			return remoteDrillDown.retrieveStudyAndSeriesForPatient(patientSearchResult);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public ImageSearchResult[] retrieveImagesForSeries(SeriesSearchResult seriesSearchResult) {
		if(seriesSearchResult.associatedLocation().isLocal()) {
			return localDrillDown.retrieveImagesForSeries(seriesSearchResult);
		}
		else {
			return remoteDrillDown.retrieveImagesForSeries(seriesSearchResult);
		}
	}


	private DrillDown remoteDrillDown = new RemoteDrillDown();
	private LocalDrillDown localDrillDown;
}