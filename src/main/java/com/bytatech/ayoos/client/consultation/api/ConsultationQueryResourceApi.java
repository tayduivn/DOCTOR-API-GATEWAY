/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.consultation.api;

import com.bytatech.ayoos.client.consultation.model.ConsultationDetails;
import com.bytatech.ayoos.client.consultation.model.DataResponse;
import com.bytatech.ayoos.client.consultation.model.HistoricProcessInstanceResponse;
import com.bytatech.ayoos.client.consultation.model.HistoricTaskInstanceQueryRequest;
import com.bytatech.ayoos.client.consultation.model.PrescriptionRequest;
import com.bytatech.ayoos.client.consultation.model.RestVariable;
import com.bytatech.ayoos.client.consultation.model.TaskResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-07T11:51:39.998+05:30[Asia/Kolkata]")

@Api(value = "ConsultationQueryResource", description = "the ConsultationQueryResource API")
public interface ConsultationQueryResourceApi {

    @ApiOperation(value = "getConsultationDetails", nickname = "getConsultationDetailsUsingGET", notes = "", response = ConsultationDetails.class, tags={ "consultation-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ConsultationDetails.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/consultation-details/{processInstanceId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ConsultationDetails> getConsultationDetailsUsingGET(@ApiParam(value = "processInstanceId",required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getHistoricProcessInstances", nickname = "getHistoricProcessInstancesUsingGET", notes = "", response = HistoricProcessInstanceResponse.class, tags={ "consultation-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = HistoricProcessInstanceResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/historic-process-instances/{processInstanceId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<HistoricProcessInstanceResponse> getHistoricProcessInstancesUsingGET(@ApiParam(value = "processInstanceId") @Valid @RequestParam(value = "processInstanceId", required = false) String processInstanceId);


    @ApiOperation(value = "getHistoricTask", nickname = "getHistoricTaskUsingPOST", notes = "", response = DataResponse.class, tags={ "consultation-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DataResponse.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/getHistoricTask",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DataResponse> getHistoricTaskUsingPOST(@ApiParam(value = "request" ,required=true )  @Valid @RequestBody HistoricTaskInstanceQueryRequest historicTaskInstanceQueryRequest);


    @ApiOperation(value = "getPrescriptionDetails", nickname = "getPrescriptionDetailsUsingGET", notes = "", response = PrescriptionRequest.class, tags={ "consultation-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PrescriptionRequest.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/prescription-details/{processInstanceId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<PrescriptionRequest> getPrescriptionDetailsUsingGET(@ApiParam(value = "processInstanceId",required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getTaskFormProperties", nickname = "getTaskFormPropertiesUsingGET", notes = "", response = DataResponse.class, tags={ "consultation-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DataResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/history",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DataResponse> getTaskFormPropertiesUsingGET(@ApiParam(value = "activityInstanceId") @Valid @RequestParam(value = "activityInstanceId", required = false) String activityInstanceId,@ApiParam(value = "executionId") @Valid @RequestParam(value = "executionId", required = false) String executionId,@ApiParam(value = "id") @Valid @RequestParam(value = "id", required = false) String id,@ApiParam(value = "processInstanceId") @Valid @RequestParam(value = "processInstanceId", required = false) String processInstanceId,@ApiParam(value = "selectOnlyFormProperties") @Valid @RequestParam(value = "selectOnlyFormProperties", required = false) Boolean selectOnlyFormProperties,@ApiParam(value = "selectOnlyVariableUpdates") @Valid @RequestParam(value = "selectOnlyVariableUpdates", required = false) Boolean selectOnlyVariableUpdates,@ApiParam(value = "taskId") @Valid @RequestParam(value = "taskId", required = false) String taskId);


    @ApiOperation(value = "getTaskInstanceVariable", nickname = "getTaskInstanceVariableUsingGET", notes = "", response = RestVariable.class, tags={ "consultation-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestVariable.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/tasks/{taskId}/{variableName}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<RestVariable> getTaskInstanceVariableUsingGET(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId,@ApiParam(value = "variableName",required=true) @PathVariable("variableName") String variableName,@ApiParam(value = "scope") @Valid @RequestParam(value = "scope", required = false) String scope);


    @ApiOperation(value = "getTask", nickname = "getTaskUsingGET", notes = "", response = TaskResponse.class, tags={ "consultation-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TaskResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/tasks/{taskId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<TaskResponse> getTaskUsingGET(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "getTaskVariables", nickname = "getTaskVariablesUsingGET", notes = "", response = RestVariable.class, responseContainer = "List", tags={ "consultation-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestVariable.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/tasks/{taskId}/variables",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<RestVariable>> getTaskVariablesUsingGET(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "getTasks", nickname = "getTasksUsingGET", notes = "", response = DataResponse.class, tags={ "consultation-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DataResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/tasks",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DataResponse> getTasksUsingGET(@ApiParam(value = "If true, only return tasks that are not suspended (either part of a process that is not suspended or not part of a process at all). If false, only tasks that are part of suspended process instances are returned.") @Valid @RequestParam(value = "active", required = false) Boolean active,@ApiParam(value = "assignee") @Valid @RequestParam(value = "assignee", required = false) String assignee,@ApiParam(value = "assigneeLike") @Valid @RequestParam(value = "assigneeLike", required = false) String assigneeLike,@ApiParam(value = "candidateGroup") @Valid @RequestParam(value = "candidateGroup", required = false) String candidateGroup,@ApiParam(value = "candidateGroups") @Valid @RequestParam(value = "candidateGroups", required = false) String candidateGroups,@ApiParam(value = "Select tasks that has been claimed or assigned to user or waiting to claim by user (candidate user or groups).") @Valid @RequestParam(value = "candidateOrAssigned", required = false) String candidateOrAssigned,@ApiParam(value = "candidateUser") @Valid @RequestParam(value = "candidateUser", required = false) String candidateUser,@ApiParam(value = "Select tasks with the given category. Note that this is the task category, not the category of the process definition (namespace within the BPMN Xml). ") @Valid @RequestParam(value = "category", required = false) String category,@ApiParam(value = "Only return tasks which are created after the given date.") @Valid @RequestParam(value = "createdAfter", required = false) String createdAfter,@ApiParam(value = "Only return tasks which are created before the given date.") @Valid @RequestParam(value = "createdBefore", required = false) String createdBefore,@ApiParam(value = "Only return tasks which are created on the given date.") @Valid @RequestParam(value = "createdOn", required = false) String createdOn,@ApiParam(value = "delegationState") @Valid @RequestParam(value = "delegationState", required = false) String delegationState,@ApiParam(value = "description") @Valid @RequestParam(value = "description", required = false) String description,@ApiParam(value = "Only return tasks which are due after the given date.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,@ApiParam(value = "Only return tasks which are due before the given date.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,@ApiParam(value = "Only return tasks which are due on the given date.") @Valid @RequestParam(value = "dueOn", required = false) String dueOn,@ApiParam(value = "Only return tasks that are not a subtask of another task.") @Valid @RequestParam(value = "excludeSubTasks", required = false) Boolean excludeSubTasks,@ApiParam(value = "Only return tasks which are part of the execution with the given id.") @Valid @RequestParam(value = "executionId", required = false) String executionId,@ApiParam(value = "Indication to include process variables in the result.") @Valid @RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,@ApiParam(value = "Indication to include task local variables in the result.") @Valid @RequestParam(value = "includeTaskLocalVariables", required = false) Boolean includeTaskLocalVariables,@ApiParam(value = "involvedUser") @Valid @RequestParam(value = "involvedUser", required = false) String involvedUser,@ApiParam(value = "maximumPriority") @Valid @RequestParam(value = "maximumPriority", required = false) String maximumPriority,@ApiParam(value = "minimumPriority") @Valid @RequestParam(value = "minimumPriority", required = false) String minimumPriority,@ApiParam(value = "name") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "nameLike") @Valid @RequestParam(value = "nameLike", required = false) String nameLike,@ApiParam(value = "owner") @Valid @RequestParam(value = "owner", required = false) String owner,@ApiParam(value = "ownerLike") @Valid @RequestParam(value = "ownerLike", required = false) String ownerLike,@ApiParam(value = "priority") @Valid @RequestParam(value = "priority", required = false) String priority,@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given id.") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given key.") @Valid @RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a key like the given value.") @Valid @RequestParam(value = "processDefinitionKeyLike", required = false) String processDefinitionKeyLike,@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given name.") @Valid @RequestParam(value = "processDefinitionName", required = false) String processDefinitionName,@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a name like the given value.") @Valid @RequestParam(value = "processDefinitionNameLike", required = false) String processDefinitionNameLike,@ApiParam(value = "processInstanceBusinessKey") @Valid @RequestParam(value = "processInstanceBusinessKey", required = false) String processInstanceBusinessKey,@ApiParam(value = "processInstanceBusinessKeyLike") @Valid @RequestParam(value = "processInstanceBusinessKeyLike", required = false) String processInstanceBusinessKeyLike,@ApiParam(value = "processInstanceId") @Valid @RequestParam(value = "processInstanceId", required = false) String processInstanceId,@ApiParam(value = "taskDefinitionKey") @Valid @RequestParam(value = "taskDefinitionKey", required = false) String taskDefinitionKey,@ApiParam(value = "taskDefinitionKeyLike") @Valid @RequestParam(value = "taskDefinitionKeyLike", required = false) String taskDefinitionKeyLike,@ApiParam(value = "Only return tasks with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,@ApiParam(value = "Only return tasks with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,@ApiParam(value = "unassigned") @Valid @RequestParam(value = "unassigned", required = false) String unassigned,@ApiParam(value = "Only return tasks which don�t have a due date. The property is ignored if the value is false.") @Valid @RequestParam(value = "withoutDueDate", required = false) Boolean withoutDueDate,@ApiParam(value = "If true, only returns tasks without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId);

}
