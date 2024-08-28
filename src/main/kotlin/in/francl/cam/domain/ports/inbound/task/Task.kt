package `in`.francl.cam.domain.ports.inbound.task

import java.time.Instant
import java.util.*

abstract class Task (
    val activityId: String,
    val activityInstanceId: String,
    val errorMessage: String?,
    val errorDetails: String?,
    val executionId: String,
    val id: String,
    val lockExpirationTime: Date,
    val createTime: Date?,
    val processDefinitionId: String,
    val processDefinitionKey: String,
    val processDefinitionVersionTag: String?,
    val processInstanceId: String,
    val retries: Int?,
    val workerId: String,
    val topicName: String,
    val tenantId: String?,
    val priority: Long,
    val variables: Map<String, Any?>,
    val businessKey: String?,
    val extensionProperties: Map<String, String>,
    val acquireAt: Instant,
){
    abstract fun <T> getOriginalTask(): T where T : Any
}
