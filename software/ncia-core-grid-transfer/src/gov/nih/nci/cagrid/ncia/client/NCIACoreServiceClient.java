package gov.nih.nci.cagrid.ncia.client;

import java.io.InputStream;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.AxisClient;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.message.addressing.EndpointReferenceType;
import org.apache.axis.types.URI.MalformedURIException;

import org.oasis.wsrf.properties.GetResourcePropertyResponse;

import org.globus.gsi.GlobusCredential;

import gov.nih.nci.cagrid.ncia.stubs.NCIACoreServicePortType;
import gov.nih.nci.cagrid.ncia.stubs.service.NCIACoreServiceAddressingLocator;
import gov.nih.nci.cagrid.ncia.common.NCIACoreServiceI;
import gov.nih.nci.cagrid.introduce.security.client.ServiceSecurityClient;

/**
 * This class is autogenerated, DO NOT EDIT GENERATED GRID SERVICE ACCESS METHODS.
 *
 * This client is generated automatically by Introduce to provide a clean unwrapped API to the
 * service.
 *
 * On construction the class instance will contact the remote service and retrieve it's security
 * metadata description which it will use to configure the Stub specifically for each method call.
 *
 * @created by Introduce Toolkit version 1.3
 */
public class NCIACoreServiceClient extends NCIACoreServiceClientBase implements NCIACoreServiceI {

	public NCIACoreServiceClient(String url) throws MalformedURIException, RemoteException {
		this(url,null);
	}

	public NCIACoreServiceClient(String url, GlobusCredential proxy) throws MalformedURIException, RemoteException {
	   	super(url,proxy);
	}

	public NCIACoreServiceClient(EndpointReferenceType epr) throws MalformedURIException, RemoteException {
	   	this(epr,null);
	}

	public NCIACoreServiceClient(EndpointReferenceType epr, GlobusCredential proxy) throws MalformedURIException, RemoteException {
	   	super(epr,proxy);
	}

	public static void usage(){
		System.out.println(NCIACoreServiceClient.class.getName() + " -url <service url>");
	}

	public static void main(String [] args){
	    System.out.println("Running the Grid Service Client");
		try{
		if(!(args.length < 2)){
			if(args[0].equals("-url")){
			  NCIACoreServiceClient client = new NCIACoreServiceClient(args[1]);
			  // place client calls here if you want to use this main as a
			  // test....
			} else {
				usage();
				System.exit(1);
			}
		} else {
			usage();
			System.exit(1);
		}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

  public gov.nih.nci.nbia.remotesearch.UsAvailableSearchTerms getUsAvailableSearchTerms() throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getUsAvailableSearchTerms");
    gov.nih.nci.cagrid.ncia.stubs.GetUsAvailableSearchTermsRequest params = new gov.nih.nci.cagrid.ncia.stubs.GetUsAvailableSearchTermsRequest();
    gov.nih.nci.cagrid.ncia.stubs.GetUsAvailableSearchTermsResponse boxedResult = portType.getUsAvailableSearchTerms(params);
    return boxedResult.getUsAvailableSearchTerms();
    }
  }

  public gov.nih.nci.cagrid.cqlresultset.CQLQueryResults query(gov.nih.nci.cagrid.cqlquery.CQLQuery cqlQuery) throws RemoteException, gov.nih.nci.cagrid.data.faults.QueryProcessingExceptionType, gov.nih.nci.cagrid.data.faults.MalformedQueryExceptionType {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"query");
    gov.nih.nci.cagrid.data.QueryRequest params = new gov.nih.nci.cagrid.data.QueryRequest();
    gov.nih.nci.cagrid.data.QueryRequestCqlQuery cqlQueryContainer = new gov.nih.nci.cagrid.data.QueryRequestCqlQuery();
    cqlQueryContainer.setCQLQuery(cqlQuery);
    params.setCqlQuery(cqlQueryContainer);
    gov.nih.nci.cagrid.data.QueryResponse boxedResult = portType.query(params);
    return boxedResult.getCQLQueryResultCollection();
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference retrieveDicomData(gov.nih.nci.cagrid.cqlquery.CQLQuery cQLQuery) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveDicomData");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataRequest();
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataRequestCQLQuery cQLQueryContainer = new gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataRequestCQLQuery();
    cQLQueryContainer.setCQLQuery(cQLQuery);
    params.setCQLQuery(cQLQueryContainer);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataResponse boxedResult = portType.retrieveDicomData(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference retrieveDicomDataByPatientId(java.lang.String patientId) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveDicomDataByPatientId");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByPatientIdRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByPatientIdRequest();
    params.setPatientId(patientId);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByPatientIdResponse boxedResult = portType.retrieveDicomDataByPatientId(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference retrieveDicomDataBySeriesUID(java.lang.String seriesInstanceUID) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveDicomDataBySeriesUID");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataBySeriesUIDRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataBySeriesUIDRequest();
    params.setSeriesInstanceUID(seriesInstanceUID);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataBySeriesUIDResponse boxedResult = portType.retrieveDicomDataBySeriesUID(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference retrieveDicomDataByStudyUID(java.lang.String studyInstanceUID) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveDicomDataByStudyUID");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByStudyUIDRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByStudyUIDRequest();
    params.setStudyInstanceUID(studyInstanceUID);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByStudyUIDResponse boxedResult = portType.retrieveDicomDataByStudyUID(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference retrieveDicomDataByPatientIds(java.lang.String[] patientIds) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveDicomDataByPatientIds");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByPatientIdsRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByPatientIdsRequest();
    params.setPatientIds(patientIds);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByPatientIdsResponse boxedResult = portType.retrieveDicomDataByPatientIds(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference retrieveDicomDataBySeriesUIDs(java.lang.String[] seriesInstanceUids) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveDicomDataBySeriesUIDs");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataBySeriesUIDsRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataBySeriesUIDsRequest();
    params.setSeriesInstanceUids(seriesInstanceUids);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataBySeriesUIDsResponse boxedResult = portType.retrieveDicomDataBySeriesUIDs(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference retrieveDicomDataByStudyUIDs(java.lang.String[] studyInstanceUids) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveDicomDataByStudyUIDs");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByStudyUIDsRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByStudyUIDsRequest();
    params.setStudyInstanceUids(studyInstanceUids);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByStudyUIDsResponse boxedResult = portType.retrieveDicomDataByStudyUIDs(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

  public int getNumberOfStudyTimePointForPatient(java.lang.String patientId) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getNumberOfStudyTimePointForPatient");
    gov.nih.nci.cagrid.ncia.stubs.GetNumberOfStudyTimePointForPatientRequest params = new gov.nih.nci.cagrid.ncia.stubs.GetNumberOfStudyTimePointForPatientRequest();
    params.setPatientId(patientId);
    gov.nih.nci.cagrid.ncia.stubs.GetNumberOfStudyTimePointForPatientResponse boxedResult = portType.getNumberOfStudyTimePointForPatient(params);
    return boxedResult.getResponse();
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference retrieveDicomDataByNthStudyTimePointForPatient(java.lang.String patientId,int studyTimepoint) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveDicomDataByNthStudyTimePointForPatient");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByNthStudyTimePointForPatientRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByNthStudyTimePointForPatientRequest();
    params.setPatientId(patientId);
    params.setStudyTimepoint(studyTimepoint);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveDicomDataByNthStudyTimePointForPatientResponse boxedResult = portType.retrieveDicomDataByNthStudyTimePointForPatient(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

  public gov.nih.nci.ncia.domain.Image getRepresentativeImageBySeries(java.lang.String seriesInstanceUID) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getRepresentativeImageBySeries");
    gov.nih.nci.cagrid.ncia.stubs.GetRepresentativeImageBySeriesRequest params = new gov.nih.nci.cagrid.ncia.stubs.GetRepresentativeImageBySeriesRequest();
    params.setSeriesInstanceUID(seriesInstanceUID);
    gov.nih.nci.cagrid.ncia.stubs.GetRepresentativeImageBySeriesResponse boxedResult = portType.getRepresentativeImageBySeries(params);
    return boxedResult.getImage();
    }
  }

  public org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse getMultipleResourceProperties(org.oasis.wsrf.properties.GetMultipleResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getMultipleResourceProperties");
    return portType.getMultipleResourceProperties(params);
    }
  }

  public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getResourceProperty");
    return portType.getResourceProperty(params);
    }
  }

  public org.oasis.wsrf.properties.QueryResourcePropertiesResponse queryResourceProperties(org.oasis.wsrf.properties.QueryResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"queryResourceProperties");
    return portType.queryResourceProperties(params);
    }
  }

  public gov.nih.nci.ncia.search.AvailableSearchTerms getAvailableSearchTerms() throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getAvailableSearchTerms");
    gov.nih.nci.cagrid.ncia.stubs.GetAvailableSearchTermsRequest params = new gov.nih.nci.cagrid.ncia.stubs.GetAvailableSearchTermsRequest();
    gov.nih.nci.cagrid.ncia.stubs.GetAvailableSearchTermsResponse boxedResult = portType.getAvailableSearchTerms(params);
    return boxedResult.getAvailableSearchTerms();
    }
  }

  public gov.nih.nci.ncia.search.PatientSearchResult[] searchForPatients(gov.nih.nci.ncia.search.SearchCriteriaDTO[] searchCriteriaDTO) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"searchForPatients");
    gov.nih.nci.cagrid.ncia.stubs.SearchForPatientsRequest params = new gov.nih.nci.cagrid.ncia.stubs.SearchForPatientsRequest();
    gov.nih.nci.cagrid.ncia.stubs.SearchForPatientsRequestSearchCriteriaDTO searchCriteriaDTOContainer = new gov.nih.nci.cagrid.ncia.stubs.SearchForPatientsRequestSearchCriteriaDTO();
    searchCriteriaDTOContainer.setSearchCriteriaDTO(searchCriteriaDTO);
    params.setSearchCriteriaDTO(searchCriteriaDTOContainer);
    gov.nih.nci.cagrid.ncia.stubs.SearchForPatientsResponse boxedResult = portType.searchForPatients(params);
    return boxedResult.getPatientSearchResult();
    }
  }

  public gov.nih.nci.ncia.search.StudySearchResult[] retrieveStudyAndSeriesForPatient(gov.nih.nci.ncia.search.PatientSearchResult patientSearchResult) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveStudyAndSeriesForPatient");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveStudyAndSeriesForPatientRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveStudyAndSeriesForPatientRequest();
    gov.nih.nci.cagrid.ncia.stubs.RetrieveStudyAndSeriesForPatientRequestPatientSearchResult patientSearchResultContainer = new gov.nih.nci.cagrid.ncia.stubs.RetrieveStudyAndSeriesForPatientRequestPatientSearchResult();
    patientSearchResultContainer.setPatientSearchResult(patientSearchResult);
    params.setPatientSearchResult(patientSearchResultContainer);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveStudyAndSeriesForPatientResponse boxedResult = portType.retrieveStudyAndSeriesForPatient(params);
    return boxedResult.getStudySearchResult();
    }
  }

  public gov.nih.nci.ncia.search.ImageSearchResult[] retrieveImagesForSeries(gov.nih.nci.ncia.search.SeriesSearchResult seriesSearchResult) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"retrieveImagesForSeries");
    gov.nih.nci.cagrid.ncia.stubs.RetrieveImagesForSeriesRequest params = new gov.nih.nci.cagrid.ncia.stubs.RetrieveImagesForSeriesRequest();
    gov.nih.nci.cagrid.ncia.stubs.RetrieveImagesForSeriesRequestSeriesSearchResult seriesSearchResultContainer = new gov.nih.nci.cagrid.ncia.stubs.RetrieveImagesForSeriesRequestSeriesSearchResult();
    seriesSearchResultContainer.setSeriesSearchResult(seriesSearchResult);
    params.setSeriesSearchResult(seriesSearchResultContainer);
    gov.nih.nci.cagrid.ncia.stubs.RetrieveImagesForSeriesResponse boxedResult = portType.retrieveImagesForSeries(params);
    return boxedResult.getImageSearchResult();
    }
  }

  public gov.nih.nci.ncia.dto.DicomTagDTO[] viewDicomHeader(gov.nih.nci.ncia.search.ImageSearchResult imageSearchResult) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"viewDicomHeader");
    gov.nih.nci.cagrid.ncia.stubs.ViewDicomHeaderRequest params = new gov.nih.nci.cagrid.ncia.stubs.ViewDicomHeaderRequest();
    gov.nih.nci.cagrid.ncia.stubs.ViewDicomHeaderRequestImageSearchResult imageSearchResultContainer = new gov.nih.nci.cagrid.ncia.stubs.ViewDicomHeaderRequestImageSearchResult();
    imageSearchResultContainer.setImageSearchResult(imageSearchResult);
    params.setImageSearchResult(imageSearchResultContainer);
    gov.nih.nci.cagrid.ncia.stubs.ViewDicomHeaderResponse boxedResult = portType.viewDicomHeader(params);
    return boxedResult.getDicomTagDTO();
    }
  }

}