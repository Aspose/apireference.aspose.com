---
title: IGraphClient
second_title: Aspose.Email for Java API Reference
description: Represents the interface for Exchange REST client.
type: docs
weight: 781
url: /java/com.aspose.email/igraphclient/
---

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public interface IGraphClient extends System.IDisposable
```

Represents the interface for Exchange REST client.
## Methods

| Method | Description |
| --- | --- |
| [copyFolder(String newParentId, String itemId)](#copyFolder-java.lang.String-java.lang.String-) | Copy a mailfolder and its contents to another mailfolder. |
| [copyMessage(String newParentId, String itemId)](#copyMessage-java.lang.String-java.lang.String-) | Copy a Message to another mailfolder. |
| [copyNotebook(String itemId, String groupId, String renameAs)](#copyNotebook-java.lang.String-java.lang.String-java.lang.String-) | Copies a notebook to the Notebooks folder in the destination Documents library. |
| [createAttachment(String parentId, MapiAttachment attachment)](#createAttachment-java.lang.String-com.aspose.email.MapiAttachment-) | Creates new attachment for specified item |
| [createCalendar(String name)](#createCalendar-java.lang.String-) | Creates new Calendar. |
| [createCalendarItem(String calId, MapiCalendar mapiCalendar)](#createCalendarItem-java.lang.String-com.aspose.email.MapiCalendar-) | Creates MapiCalendar in specified calendar |
| [createCategory(String displayName, int preset)](#createCategory-java.lang.String-int-) | Creates an [OutlookCategory](../../com.aspose.email/outlookcategory) object in the user's master list of categories. |
| [createContact(String folderId, MapiContact contact)](#createContact-java.lang.String-com.aspose.email.MapiContact-) | Creates contact in specified folder |
| [createFolder(String folderName)](#createFolder-java.lang.String-) | Create new folder. |
| [createFolder(String parentFolderId, String folderName)](#createFolder-java.lang.String-java.lang.String-) | Create new folder. |
| [createMessage(String folderId, MailMessage message)](#createMessage-java.lang.String-com.aspose.email.MailMessage-) | Creates message in specified folder |
| [createMessage(String folderId, MapiMessage message)](#createMessage-java.lang.String-com.aspose.email.MapiMessage-) | Creates message in specified folder |
| [createNotebook(GraphNotebook notebook)](#createNotebook-com.aspose.email.GraphNotebook-) | Create a new OneNote notebook. |
| [createOrUpdateOverride(ClassificationOverride classificationOverride)](#createOrUpdateOverride-com.aspose.email.ClassificationOverride-) | Create an override for a sender identified by an SMTP address. |
| [createOrUpdateOverride(MailAddress sender, int classifyAs)](#createOrUpdateOverride-com.aspose.email.MailAddress-int-) | Create an override for a sender identified by an SMTP address. |
| [createRule(InboxRule rule)](#createRule-com.aspose.email.InboxRule-) | Create a message rule by specifying a set of conditions and actions. |
| [createTask(MapiTask task, String taskListUri)](#createTask-com.aspose.email.MapiTask-java.lang.String-) | Creates Task in specified folder |
| [createTaskList(GraphTaskListInfo taskList)](#createTaskList-com.aspose.email.GraphTaskListInfo-) | Creates new TaskList. |
| [delete(String id)](#delete-java.lang.String-) | Delete object. |
| [deleteAttachment(String id)](#deleteAttachment-java.lang.String-) | Removes attachment |
| [deleteTaskList(String id)](#deleteTaskList-java.lang.String-) | Delete TaskList. |
| [fetchAttachment(String id)](#fetchAttachment-java.lang.String-) | Gets attachment for specified id |
| [fetchCalendarItem(String id)](#fetchCalendarItem-java.lang.String-) | Gets MapiCalendar for specified id |
| [fetchCategory(String itemId)](#fetchCategory-java.lang.String-) | Get the properties and relationships of the specified outlookCategory object. |
| [fetchContact(String id)](#fetchContact-java.lang.String-) | Gets MapiContact for specified id |
| [fetchMessage(String id)](#fetchMessage-java.lang.String-) | Gets message in specified id |
| [fetchNotebook(String itemId)](#fetchNotebook-java.lang.String-) | Retrieve the properties and relationships of a notebook object. |
| [fetchRule(String itemId)](#fetchRule-java.lang.String-) | Get the properties and relationships of a message rule object. |
| [fetchTask(String id)](#fetchTask-java.lang.String-) | Gets MapiTask for specified id |
| [getEndpoint()](#getEndpoint--) | Gets or sets Endpoint URL. |
| [getFolder(String id)](#getFolder-java.lang.String-) | Gets folder by an id. |
| [getMultipleServicesTokenProvider()](#getMultipleServicesTokenProvider--) | Gets or sets an object allows to retrieve OAuth access token. |
| [getOneNoteOperationStatus(String operationId)](#getOneNoteOperationStatus-java.lang.String-) | Get the status of a long-running OneNote operation. |
| [getResource()](#getResource--) | Gets or sets resource type. |
| [getResourceId()](#getResourceId--) | Gets or sets resource id. |
| [getTaskList(String id)](#getTaskList-java.lang.String-) | Gets TaskList by an id. |
| [getTenantId()](#getTenantId--) | Gets or sets tenant identifier |
| [getTimeout()](#getTimeout--) | Gets or sets the number of milliseconds to wait before the operation times out. |
| [getTokenProvider()](#getTokenProvider--) | Gets or sets an object allows to retrieve OAuth access token. |
| [listAttachments(String id)](#listAttachments-java.lang.String-) | List Attachments from the parent message. |
| [listCalendarItems(String id)](#listCalendarItems-java.lang.String-) | List MapiCalendar from the calendar. |
| [listCalendars()](#listCalendars--) | List CalendarInfo items. |
| [listCategories()](#listCategories--) | Get all the categories that have been defined for the user. |
| [listCategoriesInternal()](#listCategoriesInternal--) |  |
| [listContactFolders()](#listContactFolders--) | Get a collection of child folders under the root contact folder. |
| [listContacts(String id)](#listContacts-java.lang.String-) | List MapiContact from the parent folder. |
| [listFolders()](#listFolders--) | List folders from the root folder. |
| [listFolders(String id)](#listFolders-java.lang.String-) | List folders from the parent folder for folders that are displayed in normal mail clients, such as the inbox. |
| [listMessages(String id)](#listMessages-java.lang.String-) | List GraphMessageInfo from the parent folder. |
| [listMessages(String id, PageInfo page, MailQuery query)](#listMessages-java.lang.String-com.aspose.email.PageInfo-com.aspose.email.MailQuery-) | List GraphMessageInfo from the parent folder. |
| [listNotebooks()](#listNotebooks--) | Retrieve a list of notebook objects. |
| [listOverrides()](#listOverrides--) | Get the overrides that a user has set up to always classify messages from certain senders in specific ways. |
| [listOverridesInternal()](#listOverridesInternal--) |  |
| [listRules()](#listRules--) | Get all the messageRule objects defined for the user's Inbox. |
| [listRulesInternal()](#listRulesInternal--) |  |
| [listTaskLists()](#listTaskLists--) | List TaskList items. |
| [listTasks(String id)](#listTasks-java.lang.String-) | List MapiTask from the parent TaskList. |
| [moveFolder(String newParentId, String itemId)](#moveFolder-java.lang.String-java.lang.String-) | Move a mailfolder and its contents to another mailfolder. |
| [moveMessage(String newParentId, String itemId)](#moveMessage-java.lang.String-java.lang.String-) | Move a message to another mailfolder. |
| [send(MailMessage message)](#send-com.aspose.email.MailMessage-) | Sends email message using MIME format |
| [send(MapiMessage message)](#send-com.aspose.email.MapiMessage-) | Sends email message |
| [send(MapiMessage message, boolean saveToSentItems)](#send-com.aspose.email.MapiMessage-boolean-) | Sends email message |
| [send(String itemId)](#send-java.lang.String-) | Send a message in the draft folder. |
| [sendAsMime(MapiMessage message)](#sendAsMime-com.aspose.email.MapiMessage-) | Sends email message using MIME format |
| [setEndpoint(String value)](#setEndpoint-java.lang.String-) | Gets or sets Endpoint URL. |
| [setMultipleServicesTokenProvider(IMultipleServicesTokenProvider value)](#setMultipleServicesTokenProvider-com.aspose.email.IMultipleServicesTokenProvider-) | Gets or sets an object allows to retrieve OAuth access token. |
| [setRead(String itemId)](#setRead-java.lang.String-) | Mark message as read. |
| [setResource(int value)](#setResource-int-) | Gets or sets resource type. |
| [setResourceId(String value)](#setResourceId-java.lang.String-) | Gets or sets resource id. |
| [setTenantId(String value)](#setTenantId-java.lang.String-) | Gets or sets tenant identifier |
| [setTimeout(int value)](#setTimeout-int-) | Gets or sets the number of milliseconds to wait before the operation times out. |
| [setTokenProvider(ITokenProvider value)](#setTokenProvider-com.aspose.email.ITokenProvider-) | Gets or sets an object allows to retrieve OAuth access token. |
| [updateCalendarItem(MapiCalendar mapiCalendar)](#updateCalendarItem-com.aspose.email.MapiCalendar-) | Updates MapiCalendar |
| [updateCalendarItem(MapiCalendar mapiCalendar, UpdateSettings updateSettings)](#updateCalendarItem-com.aspose.email.MapiCalendar-com.aspose.email.UpdateSettings-) | Updates appointment |
| [updateCategory(OutlookCategory category)](#updateCategory-com.aspose.email.OutlookCategory-) | Updates pre-set color constant for specified category |
| [updateContact(MapiContact contact)](#updateContact-com.aspose.email.MapiContact-) | Updates contact |
| [updateFolder(GraphFolderInfo folderInfo)](#updateFolder-com.aspose.email.GraphFolderInfo-) | Updates folder. |
| [updateMessage(MailMessage message)](#updateMessage-com.aspose.email.MailMessage-) | Updates message |
| [updateMessage(MailMessage message, UpdateSettings updateSettings)](#updateMessage-com.aspose.email.MailMessage-com.aspose.email.UpdateSettings-) | Updates message |
| [updateMessage(MapiMessage message)](#updateMessage-com.aspose.email.MapiMessage-) | Updates message |
| [updateMessage(MapiMessage message, UpdateSettings updateSettings)](#updateMessage-com.aspose.email.MapiMessage-com.aspose.email.UpdateSettings-) | Updates message |
| [updateOverride(ClassificationOverride classificationOverride)](#updateOverride-com.aspose.email.ClassificationOverride-) | Change the classifyAs field of an override as specified. |
| [updateRule(InboxRule rule)](#updateRule-com.aspose.email.InboxRule-) | Change writable properties on a messageRule object and save the changes. |
| [updateTask(MapiTask task)](#updateTask-com.aspose.email.MapiTask-) | Updates Task |
| [updateTask(MapiTask task, UpdateSettings updateSettings)](#updateTask-com.aspose.email.MapiTask-com.aspose.email.UpdateSettings-) | Updates Task |
| [updateTaskList(GraphTaskListInfo taskList)](#updateTaskList-com.aspose.email.GraphTaskListInfo-) | Updates TaskList. |
### copyFolder(String newParentId, String itemId) {#copyFolder-java.lang.String-java.lang.String-}
```
public abstract GraphFolderInfo copyFolder(String newParentId, String itemId)
```


Copy a mailfolder and its contents to another mailfolder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| newParentId | java.lang.String | New parent folder id |
| itemId | java.lang.String | Item id to be copied |

**Returns:**
[GraphFolderInfo](../../com.aspose.email/graphfolderinfo) - Copied folder
### copyMessage(String newParentId, String itemId) {#copyMessage-java.lang.String-java.lang.String-}
```
public abstract MapiMessage copyMessage(String newParentId, String itemId)
```


Copy a Message to another mailfolder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| newParentId | java.lang.String | New parent folder id |
| itemId | java.lang.String | Item id to be copied |

**Returns:**
[MapiMessage](../../com.aspose.email/mapimessage) - Copied message
### copyNotebook(String itemId, String groupId, String renameAs) {#copyNotebook-java.lang.String-java.lang.String-java.lang.String-}
```
public abstract String copyNotebook(String itemId, String groupId, String renameAs)
```


Copies a notebook to the Notebooks folder in the destination Documents library. The folder is created if it doesn't exist. For Copy operations, you follow an asynchronous calling pattern: First call the Copy action, and then poll the operation endpoint for the result. Permissions One of the following permissions is required to call this API. Delegated(work or school account) Notes.Create, Notes.ReadWrite, Notes.ReadWrite.All Delegated(personal Microsoft account) Notes.Create, Notes.ReadWrite Application Notes.ReadWrite.All

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| itemId | java.lang.String | Item id to be copied |
| groupId | java.lang.String | The id of the group to copy to. Use only when copying to an Office 365 group. |
| renameAs | java.lang.String | The name of the copy. Defaults to the name of the existing item. |

**Returns:**
java.lang.String - If successful, this method returns an Operation-Location string. You may use this value to get the status of the operation.
### createAttachment(String parentId, MapiAttachment attachment) {#createAttachment-java.lang.String-com.aspose.email.MapiAttachment-}
```
public abstract MapiAttachment createAttachment(String parentId, MapiAttachment attachment)
```


Creates new attachment for specified item

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parentId | java.lang.String | Item id |
| attachment | [MapiAttachment](../../com.aspose.email/mapiattachment) | Attachment to create |

**Returns:**
[MapiAttachment](../../com.aspose.email/mapiattachment) - Returns created attachment
### createCalendar(String name) {#createCalendar-java.lang.String-}
```
public abstract GraphCalendarInfo createCalendar(String name)
```


Creates new Calendar.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | New Calendar name |

**Returns:**
[GraphCalendarInfo](../../com.aspose.email/graphcalendarinfo) - Returns CalendarInfo [GraphCalendarInfo](../../com.aspose.email/graphcalendarinfo)
### createCalendarItem(String calId, MapiCalendar mapiCalendar) {#createCalendarItem-java.lang.String-com.aspose.email.MapiCalendar-}
```
public abstract MapiCalendar createCalendarItem(String calId, MapiCalendar mapiCalendar)
```


Creates MapiCalendar in specified calendar

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| calId | java.lang.String | Calendar id |
| mapiCalendar | [MapiCalendar](../../com.aspose.email/mapicalendar) | MapiCalendar to be created |

**Returns:**
[MapiCalendar](../../com.aspose.email/mapicalendar) - Created MapiCalendar
### createCategory(String displayName, int preset) {#createCategory-java.lang.String-int-}
```
public abstract OutlookCategory createCategory(String displayName, int preset)
```


Creates an [OutlookCategory](../../com.aspose.email/outlookcategory) object in the user's master list of categories.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| displayName | java.lang.String | A unique name that identifies a category in the user's mailbox. |
| preset | int | pre-set color constant that characterizes a category, and that is mapped to one of 25 predefined colors |

**Returns:**
[OutlookCategory](../../com.aspose.email/outlookcategory) - Category by which a user can group Outlook items such as messages and events
### createContact(String folderId, MapiContact contact) {#createContact-java.lang.String-com.aspose.email.MapiContact-}
```
public abstract MapiContact createContact(String folderId, MapiContact contact)
```


Creates contact in specified folder

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| folderId | java.lang.String | Parent folder id |
| contact | [MapiContact](../../com.aspose.email/mapicontact) | MapiContact to be created |

**Returns:**
[MapiContact](../../com.aspose.email/mapicontact) - Created contact
### createFolder(String folderName) {#createFolder-java.lang.String-}
```
public abstract GraphFolderInfo createFolder(String folderName)
```


Create new folder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| folderName | java.lang.String | Folder name |

**Returns:**
[GraphFolderInfo](../../com.aspose.email/graphfolderinfo) - Returns created folder
### createFolder(String parentFolderId, String folderName) {#createFolder-java.lang.String-java.lang.String-}
```
public abstract GraphFolderInfo createFolder(String parentFolderId, String folderName)
```


Create new folder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parentFolderId | java.lang.String | Parent folder id |
| folderName | java.lang.String | Folder name |

**Returns:**
[GraphFolderInfo](../../com.aspose.email/graphfolderinfo) - Returns folder for specified id
### createMessage(String folderId, MailMessage message) {#createMessage-java.lang.String-com.aspose.email.MailMessage-}
```
public abstract MailMessage createMessage(String folderId, MailMessage message)
```


Creates message in specified folder

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| folderId | java.lang.String | Parent folder id |
| message | [MailMessage](../../com.aspose.email/mailmessage) | Mime message to be created |

**Returns:**
[MailMessage](../../com.aspose.email/mailmessage) - Created message
### createMessage(String folderId, MapiMessage message) {#createMessage-java.lang.String-com.aspose.email.MapiMessage-}
```
public abstract MapiMessage createMessage(String folderId, MapiMessage message)
```


Creates message in specified folder

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| folderId | java.lang.String | Parent folder id |
| message | [MapiMessage](../../com.aspose.email/mapimessage) | Mapi message to be created |

**Returns:**
[MapiMessage](../../com.aspose.email/mapimessage) - Created message
### createNotebook(GraphNotebook notebook) {#createNotebook-com.aspose.email.GraphNotebook-}
```
public abstract GraphNotebook createNotebook(GraphNotebook notebook)
```


Create a new OneNote notebook. Permissions One of the following permissions is required to call this API. Delegated (work or school account) Notes.Create, Notes.ReadWrite, Notes.ReadWrite.All Delegated (personal Microsoft account) Notes.Create, Notes.ReadWrite Application Notes.ReadWrite.All

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| notebook | [GraphNotebook](../../com.aspose.email/graphnotebook) | Notebook to be created |

**Returns:**
[GraphNotebook](../../com.aspose.email/graphnotebook) - Created notebook
### createOrUpdateOverride(ClassificationOverride classificationOverride) {#createOrUpdateOverride-com.aspose.email.ClassificationOverride-}
```
public abstract ClassificationOverride createOrUpdateOverride(ClassificationOverride classificationOverride)
```


Create an override for a sender identified by an SMTP address. Future messages from that SMTP address will be consistently classified as specified in the override. Note: - If an override already exists with the same SMTP address, then the classifyAs and name fields of that override are updated with the provided values. - The maximum number of overrides supported for a mailbox is 1000, based on unique sender SMTP addresses. Permissions: Delegated(work or school account) Mail.ReadWrite Delegated(personal Microsoft account) Mail.ReadWrite Application Mail.ReadWrite

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| classificationOverride | [ClassificationOverride](../../com.aspose.email/classificationoverride) |  |

**Returns:**
[ClassificationOverride](../../com.aspose.email/classificationoverride) - 
### createOrUpdateOverride(MailAddress sender, int classifyAs) {#createOrUpdateOverride-com.aspose.email.MailAddress-int-}
```
public abstract ClassificationOverride createOrUpdateOverride(MailAddress sender, int classifyAs)
```


Create an override for a sender identified by an SMTP address. Future messages from that SMTP address will be consistently classified as specified in the override. Note: - If an override already exists with the same SMTP address, then the classifyAs and name fields of that override are updated with the provided values. - The maximum number of overrides supported for a mailbox is 1000, based on unique sender SMTP addresses. Permissions: Delegated(work or school account) Mail.ReadWrite Delegated(personal Microsoft account) Mail.ReadWrite Application Mail.ReadWrite

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sender | [MailAddress](../../com.aspose.email/mailaddress) | Email address information of the sender for whom the override is created. |
| classifyAs | int | Value which specifies how incoming messages from a specific sender should always be classified as. |

**Returns:**
[ClassificationOverride](../../com.aspose.email/classificationoverride) - 
### createRule(InboxRule rule) {#createRule-com.aspose.email.InboxRule-}
```
public abstract InboxRule createRule(InboxRule rule)
```


Create a message rule by specifying a set of conditions and actions. Outlook carries out those actions if an incoming message in the user's Inbox meets the specified conditions. Permissions: One of the following permissions is required to call this API.To learn more, including how to choose permissions, see Permissions. Delegated (work or school account) MailboxSettings.ReadWrite Delegated (personal Microsoft account) MailboxSettings.ReadWrite Application MailboxSettings.ReadWrite

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rule | [InboxRule](../../com.aspose.email/inboxrule) | Rule to be created in inbox |

**Returns:**
[InboxRule](../../com.aspose.email/inboxrule) - Created rule
### createTask(MapiTask task, String taskListUri) {#createTask-com.aspose.email.MapiTask-java.lang.String-}
```
public abstract MapiTask createTask(MapiTask task, String taskListUri)
```


Creates Task in specified folder

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| task | [MapiTask](../../com.aspose.email/mapitask) | MapiTask to be created |
| taskListUri | java.lang.String | Parent TaskList uri |

**Returns:**
[MapiTask](../../com.aspose.email/mapitask) - Created MapiTask
### createTaskList(GraphTaskListInfo taskList) {#createTaskList-com.aspose.email.GraphTaskListInfo-}
```
public abstract GraphTaskListInfo createTaskList(GraphTaskListInfo taskList)
```


Creates new TaskList.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| taskList | [GraphTaskListInfo](../../com.aspose.email/graphtasklistinfo) | New TaskList [GraphTaskListInfo](../../com.aspose.email/graphtasklistinfo) |

**Returns:**
[GraphTaskListInfo](../../com.aspose.email/graphtasklistinfo) - Returns created TaskListInfo
### delete(String id) {#delete-java.lang.String-}
```
public abstract void delete(String id)
```


Delete object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Object id to delete |

### deleteAttachment(String id) {#deleteAttachment-java.lang.String-}
```
public abstract void deleteAttachment(String id)
```


Removes attachment

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Attachment id to delete |

### deleteTaskList(String id) {#deleteTaskList-java.lang.String-}
```
public abstract void deleteTaskList(String id)
```


Delete TaskList.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | TaskList id to delete |

### fetchAttachment(String id) {#fetchAttachment-java.lang.String-}
```
public abstract MapiAttachment fetchAttachment(String id)
```


Gets attachment for specified id

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Attachment id |

**Returns:**
[MapiAttachment](../../com.aspose.email/mapiattachment) - Returns attachment
### fetchCalendarItem(String id) {#fetchCalendarItem-java.lang.String-}
```
public abstract MapiCalendar fetchCalendarItem(String id)
```


Gets MapiCalendar for specified id

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | MapiCalendar id |

**Returns:**
[MapiCalendar](../../com.aspose.email/mapicalendar) - Returns MapiCalendar
### fetchCategory(String itemId) {#fetchCategory-java.lang.String-}
```
public abstract OutlookCategory fetchCategory(String itemId)
```


Get the properties and relationships of the specified outlookCategory object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| itemId | java.lang.String | Item id to be fetched |

**Returns:**
[OutlookCategory](../../com.aspose.email/outlookcategory) - Category specified by id
### fetchContact(String id) {#fetchContact-java.lang.String-}
```
public abstract MapiContact fetchContact(String id)
```


Gets MapiContact for specified id

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Contact id |

**Returns:**
[MapiContact](../../com.aspose.email/mapicontact) - Returns MapiContact
### fetchMessage(String id) {#fetchMessage-java.lang.String-}
```
public abstract MapiMessage fetchMessage(String id)
```


Gets message in specified id

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Message id to fetch |

**Returns:**
[MapiMessage](../../com.aspose.email/mapimessage) - Mapi message
### fetchNotebook(String itemId) {#fetchNotebook-java.lang.String-}
```
public abstract GraphNotebook fetchNotebook(String itemId)
```


Retrieve the properties and relationships of a notebook object. Permissions One of the following permissions is required to call this API. Delegated (work or school account) Notes.Create, Notes.Read, Notes.ReadWrite, Notes.Read.All, Notes.ReadWrite.All Delegated (personal Microsoft account) Notes.Create, Notes.Read, Notes.ReadWrite Application Notes.Read.All, Notes.ReadWrite.All

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| itemId | java.lang.String | Item id |

**Returns:**
[GraphNotebook](../../com.aspose.email/graphnotebook) - Notebook object
### fetchRule(String itemId) {#fetchRule-java.lang.String-}
```
public abstract InboxRule fetchRule(String itemId)
```


Get the properties and relationships of a message rule object. Permissions One of the following permissions is required to call this API.To learn more, including how to choose permissions, see Permissions. Delegated (work or school account) MailboxSettings.Read Delegated (personal Microsoft account) MailboxSettings.Read Application MailboxSettings.Read

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| itemId | java.lang.String | Item id |

**Returns:**
[InboxRule](../../com.aspose.email/inboxrule) - Inbox rule
### fetchTask(String id) {#fetchTask-java.lang.String-}
```
public abstract MapiTask fetchTask(String id)
```


Gets MapiTask for specified id

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | MapiTask id |

**Returns:**
[MapiTask](../../com.aspose.email/mapitask) - Returns MapiTask
### getEndpoint() {#getEndpoint--}
```
public abstract String getEndpoint()
```


Gets or sets Endpoint URL.

**Returns:**
java.lang.String
### getFolder(String id) {#getFolder-java.lang.String-}
```
public abstract GraphFolderInfo getFolder(String id)
```


Gets folder by an id.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Folder id |

**Returns:**
[GraphFolderInfo](../../com.aspose.email/graphfolderinfo) - Returns folder for specified id
### getMultipleServicesTokenProvider() {#getMultipleServicesTokenProvider--}
```
public abstract IMultipleServicesTokenProvider getMultipleServicesTokenProvider()
```


Gets or sets an object allows to retrieve OAuth access token.

**Returns:**
[IMultipleServicesTokenProvider](../../com.aspose.email/imultipleservicestokenprovider)
### getOneNoteOperationStatus(String operationId) {#getOneNoteOperationStatus-java.lang.String-}
```
public abstract GraphOnenoteOperation getOneNoteOperationStatus(String operationId)
```


Get the status of a long-running OneNote operation. This applies to operations that return the Operation-Location header in the response, such as CopyNotebook, CopyToNotebook, CopyToSectionGroup, and CopyToSection. You can poll the Operation-Location endpoint until the status property returns completed or failed. If the status is completed, the resourceLocation property contains the resource endpoint URI. If the status is failed, the error and @api.diagnostics properties provide error information.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| operationId | java.lang.String | Operation id |

**Returns:**
[GraphOnenoteOperation](../../com.aspose.email/graphonenoteoperation) - 
### getResource() {#getResource--}
```
public abstract int getResource()
```


Gets or sets resource type.

**Returns:**
int
### getResourceId() {#getResourceId--}
```
public abstract String getResourceId()
```


Gets or sets resource id. For instance for users it may be user principal name (UPN) or user id

**Returns:**
java.lang.String
### getTaskList(String id) {#getTaskList-java.lang.String-}
```
public abstract GraphTaskListInfo getTaskList(String id)
```


Gets TaskList by an id.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | TaskList id |

**Returns:**
[GraphTaskListInfo](../../com.aspose.email/graphtasklistinfo) - Returns TaskListInfo for specified id
### getTenantId() {#getTenantId--}
```
public abstract String getTenantId()
```


Gets or sets tenant identifier

**Returns:**
java.lang.String
### getTimeout() {#getTimeout--}
```
public abstract int getTimeout()
```


Gets or sets the number of milliseconds to wait before the operation times out. The default value is 100,000 milliseconds (100 seconds).

**Returns:**
int
### getTokenProvider() {#getTokenProvider--}
```
public abstract ITokenProvider getTokenProvider()
```


Gets or sets an object allows to retrieve OAuth access token.

**Returns:**
[ITokenProvider](../../com.aspose.email/itokenprovider)
### listAttachments(String id) {#listAttachments-java.lang.String-}
```
public abstract MapiAttachmentCollection listAttachments(String id)
```


List Attachments from the parent message.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Parent message id |

**Returns:**
[MapiAttachmentCollection](../../com.aspose.email/mapiattachmentcollection) - Returns list of attachments of a message
### listCalendarItems(String id) {#listCalendarItems-java.lang.String-}
```
public abstract MapiCalendarCollection listCalendarItems(String id)
```


List MapiCalendar from the calendar.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Calendar id |

**Returns:**
[MapiCalendarCollection](../../com.aspose.email/mapicalendarcollection) - Returns list of MapiCalendar
### listCalendars() {#listCalendars--}
```
public abstract GraphCalendarInfoCollection listCalendars()
```


List CalendarInfo items.

**Returns:**
[GraphCalendarInfoCollection](../../com.aspose.email/graphcalendarinfocollection) - Returns list of CalendarInfo [GraphCalendarInfo](../../com.aspose.email/graphcalendarinfo)
### listCategories() {#listCategories--}
```
public abstract List<OutlookCategory> listCategories()
```


Get all the categories that have been defined for the user.

**Returns:**
java.util.List<com.aspose.email.OutlookCategory> - Returns list of categories for the user
### listCategoriesInternal() {#listCategoriesInternal--}
```
public abstract System.Collections.Generic.List<OutlookCategory> listCategoriesInternal()
```




**Returns:**
com.aspose.ms.System.Collections.Generic.List<com.aspose.email.OutlookCategory>
### listContactFolders() {#listContactFolders--}
```
public abstract GraphFolderInfoCollection listContactFolders()
```


Get a collection of child folders under the root contact folder.

**Returns:**
[GraphFolderInfoCollection](../../com.aspose.email/graphfolderinfocollection) - RReturns list of subfolders of the root contact folder
### listContacts(String id) {#listContacts-java.lang.String-}
```
public abstract MapiContactCollection listContacts(String id)
```


List MapiContact from the parent folder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Parent folder id |

**Returns:**
[MapiContactCollection](../../com.aspose.email/mapicontactcollection) - Returns list of MapiContact of the folder
### listFolders() {#listFolders--}
```
public abstract GraphFolderInfoCollection listFolders()
```


List folders from the root folder.

**Returns:**
[GraphFolderInfoCollection](../../com.aspose.email/graphfolderinfocollection) - Returns list of subfolders of the root folder
### listFolders(String id) {#listFolders-java.lang.String-}
```
public abstract GraphFolderInfoCollection listFolders(String id)
```


List folders from the parent folder for folders that are displayed in normal mail clients, such as the inbox.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Parent folder id |

**Returns:**
[GraphFolderInfoCollection](../../com.aspose.email/graphfolderinfocollection) - Returns list of subfolders of the root folder
### listMessages(String id) {#listMessages-java.lang.String-}
```
public abstract GraphMessageInfoCollection listMessages(String id)
```


List GraphMessageInfo from the parent folder. The [GraphKnownFolders](../../com.aspose.email/graphknownfolders) identifies well-known folders that can be used as folder id.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Parent folder id |

**Returns:**
[GraphMessageInfoCollection](../../com.aspose.email/graphmessageinfocollection) - Returns list of GraphMessageInfo of the folder
### listMessages(String id, PageInfo page, MailQuery query) {#listMessages-java.lang.String-com.aspose.email.PageInfo-com.aspose.email.MailQuery-}
```
public abstract GraphMessagePageInfo listMessages(String id, PageInfo page, MailQuery query)
```


List GraphMessageInfo from the parent folder. The [GraphKnownFolders](../../com.aspose.email/graphknownfolders) identifies well-known folders that can be used as folder id.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Parent folder id |
| page | [PageInfo](../../com.aspose.email/pageinfo) | A page info |
| query | [MailQuery](../../com.aspose.email/mailquery) | [MailQuery](../../com.aspose.email/mailquery) that represents search query. |

**Returns:**
[GraphMessagePageInfo](../../com.aspose.email/graphmessagepageinfo) - Returns list of GraphMessageInfo of the folder
### listNotebooks() {#listNotebooks--}
```
public abstract GraphNotebookCollection listNotebooks()
```


Retrieve a list of notebook objects. Permissions One of the following permissions is required to call this API. Delegated (work or school account) Notes.Create, Notes.Read, Notes.ReadWrite, Notes.Read.All, Notes.ReadWrite.All Delegated (personal Microsoft account) Notes.Create, Notes.Read, Notes.ReadWrite Application Notes.Read.All, Notes.ReadWrite.All

**Returns:**
[GraphNotebookCollection](../../com.aspose.email/graphnotebookcollection) - List of notebooks
### listOverrides() {#listOverrides--}
```
public abstract List<ClassificationOverride> listOverrides()
```


Get the overrides that a user has set up to always classify messages from certain senders in specific ways. Each override corresponds to an SMTP address of a sender.Initially, a user does not have any overrides. Permissions: One of the following permissions is required to call this API.To learn more, including how to choose permissions, see Permissions. Delegated (work or school account) Mail.Read Delegated (personal Microsoft account) Mail.Read Application Mail.Read

**Returns:**
java.util.List<com.aspose.email.ClassificationOverride> - 
### listOverridesInternal() {#listOverridesInternal--}
```
public abstract System.Collections.Generic.List<ClassificationOverride> listOverridesInternal()
```




**Returns:**
com.aspose.ms.System.Collections.Generic.List<com.aspose.email.ClassificationOverride>
### listRules() {#listRules--}
```
public abstract List<InboxRule> listRules()
```


Get all the messageRule objects defined for the user's Inbox. Permissions One of the following permissions is required to call this API.To learn more, including how to choose permissions, see Permissions. Delegated (work or school account) MailboxSettings.Read Delegated (personal Microsoft account) MailboxSettings.Read Application MailboxSettings.Read

**Returns:**
java.util.List<com.aspose.email.InboxRule> - List of inbox rules
### listRulesInternal() {#listRulesInternal--}
```
public abstract System.Collections.Generic.List<InboxRule> listRulesInternal()
```




**Returns:**
com.aspose.ms.System.Collections.Generic.List<com.aspose.email.InboxRule>
### listTaskLists() {#listTaskLists--}
```
public abstract GraphTaskListInfoCollection listTaskLists()
```


List TaskList items.

**Returns:**
[GraphTaskListInfoCollection](../../com.aspose.email/graphtasklistinfocollection) - Returns list of TaskList [GraphTaskListInfo](../../com.aspose.email/graphtasklistinfo)
### listTasks(String id) {#listTasks-java.lang.String-}
```
public abstract MapiTaskCollection listTasks(String id)
```


List MapiTask from the parent TaskList.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | java.lang.String | Parent TaskList id |

**Returns:**
[MapiTaskCollection](../../com.aspose.email/mapitaskcollection) - Returns list of MapiTask of the TaskList
### moveFolder(String newParentId, String itemId) {#moveFolder-java.lang.String-java.lang.String-}
```
public abstract GraphFolderInfo moveFolder(String newParentId, String itemId)
```


Move a mailfolder and its contents to another mailfolder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| newParentId | java.lang.String | New parent folder id |
| itemId | java.lang.String | Item id to be moved |

**Returns:**
[GraphFolderInfo](../../com.aspose.email/graphfolderinfo) - Moved folder
### moveMessage(String newParentId, String itemId) {#moveMessage-java.lang.String-java.lang.String-}
```
public abstract MapiMessage moveMessage(String newParentId, String itemId)
```


Move a message to another mailfolder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| newParentId | java.lang.String | New parent folder id |
| itemId | java.lang.String | Item id to be moved |

**Returns:**
[MapiMessage](../../com.aspose.email/mapimessage) - Moved folder
### send(MailMessage message) {#send-com.aspose.email.MailMessage-}
```
public abstract void send(MailMessage message)
```


Sends email message using MIME format

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | [MailMessage](../../com.aspose.email/mailmessage) | Mime message to send |

### send(MapiMessage message) {#send-com.aspose.email.MapiMessage-}
```
public abstract void send(MapiMessage message)
```


Sends email message

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | [MapiMessage](../../com.aspose.email/mapimessage) | Mapi message to send |

### send(MapiMessage message, boolean saveToSentItems) {#send-com.aspose.email.MapiMessage-boolean-}
```
public abstract void send(MapiMessage message, boolean saveToSentItems)
```


Sends email message

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | [MapiMessage](../../com.aspose.email/mapimessage) | Mapi message to send |
| saveToSentItems | boolean | Indicates whether to save the message in Sent Items. |

### send(String itemId) {#send-java.lang.String-}
```
public abstract void send(String itemId)
```


Send a message in the draft folder. The draft message can be a new message draft, reply draft, reply-all draft, or a forward draft. The message is then saved in the Sent Items folder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| itemId | java.lang.String | Item id of the draft message |

### sendAsMime(MapiMessage message) {#sendAsMime-com.aspose.email.MapiMessage-}
```
public abstract void sendAsMime(MapiMessage message)
```


Sends email message using MIME format

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | [MapiMessage](../../com.aspose.email/mapimessage) | Mapi message to send |

### setEndpoint(String value) {#setEndpoint-java.lang.String-}
```
public abstract void setEndpoint(String value)
```


Gets or sets Endpoint URL.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String |  |

### setMultipleServicesTokenProvider(IMultipleServicesTokenProvider value) {#setMultipleServicesTokenProvider-com.aspose.email.IMultipleServicesTokenProvider-}
```
public abstract void setMultipleServicesTokenProvider(IMultipleServicesTokenProvider value)
```


Gets or sets an object allows to retrieve OAuth access token.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [IMultipleServicesTokenProvider](../../com.aspose.email/imultipleservicestokenprovider) |  |

### setRead(String itemId) {#setRead-java.lang.String-}
```
public abstract void setRead(String itemId)
```


Mark message as read.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| itemId | java.lang.String | Item id to mark read |

### setResource(int value) {#setResource-int-}
```
public abstract void setResource(int value)
```


Gets or sets resource type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### setResourceId(String value) {#setResourceId-java.lang.String-}
```
public abstract void setResourceId(String value)
```


Gets or sets resource id. For instance for users it may be user principal name (UPN) or user id

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String |  |

### setTenantId(String value) {#setTenantId-java.lang.String-}
```
public abstract void setTenantId(String value)
```


Gets or sets tenant identifier

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String |  |

### setTimeout(int value) {#setTimeout-int-}
```
public abstract void setTimeout(int value)
```


Gets or sets the number of milliseconds to wait before the operation times out. The default value is 100,000 milliseconds (100 seconds).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### setTokenProvider(ITokenProvider value) {#setTokenProvider-com.aspose.email.ITokenProvider-}
```
public abstract void setTokenProvider(ITokenProvider value)
```


Gets or sets an object allows to retrieve OAuth access token.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ITokenProvider](../../com.aspose.email/itokenprovider) |  |

### updateCalendarItem(MapiCalendar mapiCalendar) {#updateCalendarItem-com.aspose.email.MapiCalendar-}
```
public abstract MapiCalendar updateCalendarItem(MapiCalendar mapiCalendar)
```


Updates MapiCalendar

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mapiCalendar | [MapiCalendar](../../com.aspose.email/mapicalendar) | MapiCalendar to be updated |

**Returns:**
[MapiCalendar](../../com.aspose.email/mapicalendar) - Updated MapiCalendar
### updateCalendarItem(MapiCalendar mapiCalendar, UpdateSettings updateSettings) {#updateCalendarItem-com.aspose.email.MapiCalendar-com.aspose.email.UpdateSettings-}
```
public abstract MapiCalendar updateCalendarItem(MapiCalendar mapiCalendar, UpdateSettings updateSettings)
```


Updates appointment

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mapiCalendar | [MapiCalendar](../../com.aspose.email/mapicalendar) | MapiCalendar to be updated |
| updateSettings | [UpdateSettings](../../com.aspose.email/updatesettings) | Update settings |

**Returns:**
[MapiCalendar](../../com.aspose.email/mapicalendar) - Updated MapiCalendar
### updateCategory(OutlookCategory category) {#updateCategory-com.aspose.email.OutlookCategory-}
```
public abstract OutlookCategory updateCategory(OutlookCategory category)
```


Updates pre-set color constant for specified category

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| category | [OutlookCategory](../../com.aspose.email/outlookcategory) | Category to update |

**Returns:**
[OutlookCategory](../../com.aspose.email/outlookcategory) - Category by which a user can group Outlook items such as messages and events
### updateContact(MapiContact contact) {#updateContact-com.aspose.email.MapiContact-}
```
public abstract MapiContact updateContact(MapiContact contact)
```


Updates contact

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contact | [MapiContact](../../com.aspose.email/mapicontact) | MapiContact to be updated |

**Returns:**
[MapiContact](../../com.aspose.email/mapicontact) - Updated contact
### updateFolder(GraphFolderInfo folderInfo) {#updateFolder-com.aspose.email.GraphFolderInfo-}
```
public abstract GraphFolderInfo updateFolder(GraphFolderInfo folderInfo)
```


Updates folder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| folderInfo | [GraphFolderInfo](../../com.aspose.email/graphfolderinfo) | Folder to update |

**Returns:**
[GraphFolderInfo](../../com.aspose.email/graphfolderinfo) - Returns updated folder
### updateMessage(MailMessage message) {#updateMessage-com.aspose.email.MailMessage-}
```
public abstract MailMessage updateMessage(MailMessage message)
```


Updates message

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | [MailMessage](../../com.aspose.email/mailmessage) | MailMessage to be updated |

**Returns:**
[MailMessage](../../com.aspose.email/mailmessage) - Updated message
### updateMessage(MailMessage message, UpdateSettings updateSettings) {#updateMessage-com.aspose.email.MailMessage-com.aspose.email.UpdateSettings-}
```
public abstract MailMessage updateMessage(MailMessage message, UpdateSettings updateSettings)
```


Updates message

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | [MailMessage](../../com.aspose.email/mailmessage) | MailMessage to be updated |
| updateSettings | [UpdateSettings](../../com.aspose.email/updatesettings) | Update settings |

**Returns:**
[MailMessage](../../com.aspose.email/mailmessage) - Updated message
### updateMessage(MapiMessage message) {#updateMessage-com.aspose.email.MapiMessage-}
```
public abstract MapiMessage updateMessage(MapiMessage message)
```


Updates message

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | [MapiMessage](../../com.aspose.email/mapimessage) | Mapi message to be updated |

**Returns:**
[MapiMessage](../../com.aspose.email/mapimessage) - Updated message
### updateMessage(MapiMessage message, UpdateSettings updateSettings) {#updateMessage-com.aspose.email.MapiMessage-com.aspose.email.UpdateSettings-}
```
public abstract MapiMessage updateMessage(MapiMessage message, UpdateSettings updateSettings)
```


Updates message

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | [MapiMessage](../../com.aspose.email/mapimessage) | Mapi message to be updated |
| updateSettings | [UpdateSettings](../../com.aspose.email/updatesettings) | Update settings |

**Returns:**
[MapiMessage](../../com.aspose.email/mapimessage) - Updated message
### updateOverride(ClassificationOverride classificationOverride) {#updateOverride-com.aspose.email.ClassificationOverride-}
```
public abstract ClassificationOverride updateOverride(ClassificationOverride classificationOverride)
```


Change the classifyAs field of an override as specified. You cannot use this method to change any other fields in an ClassificationOverride instance. If an override exists for a sender and the sender changes his/her display name, you can use CreateOrUpdateOverride to force an update to the name field in the existing override. If an override exists for a sender and the sender changes his/her SMTP address, deleting the existing override and creating a new one with the new SMTP address is the only way to "update" the override for this sender. Permissions: One of the following permissions is required to call this API.To learn more, including how to choose permissions, see Permissions. Delegated (work or school account) Mail.ReadWrite Delegated (personal Microsoft account) Mail.ReadWrite Application Mail.ReadWrite

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| classificationOverride | [ClassificationOverride](../../com.aspose.email/classificationoverride) | Classification override to update |

**Returns:**
[ClassificationOverride](../../com.aspose.email/classificationoverride) - 
### updateRule(InboxRule rule) {#updateRule-com.aspose.email.InboxRule-}
```
public abstract InboxRule updateRule(InboxRule rule)
```


Change writable properties on a messageRule object and save the changes. Permissions One of the following permissions is required to call this API.To learn more, including how to choose permissions, see Permissions. Delegated (work or school account) MailboxSettings.ReadWrite Delegated (personal Microsoft account) MailboxSettings.ReadWrite Application MailboxSettings.ReadWrite

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rule | [InboxRule](../../com.aspose.email/inboxrule) | Rule to update |

**Returns:**
[InboxRule](../../com.aspose.email/inboxrule) - Updated rule
### updateTask(MapiTask task) {#updateTask-com.aspose.email.MapiTask-}
```
public abstract MapiTask updateTask(MapiTask task)
```


Updates Task

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| task | [MapiTask](../../com.aspose.email/mapitask) | MapiTask to be updated |

**Returns:**
[MapiTask](../../com.aspose.email/mapitask) - Updated MapiTask
### updateTask(MapiTask task, UpdateSettings updateSettings) {#updateTask-com.aspose.email.MapiTask-com.aspose.email.UpdateSettings-}
```
public abstract MapiTask updateTask(MapiTask task, UpdateSettings updateSettings)
```


Updates Task

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| task | [MapiTask](../../com.aspose.email/mapitask) | MapiTask to be updated |
| updateSettings | [UpdateSettings](../../com.aspose.email/updatesettings) | Update settings |

**Returns:**
[MapiTask](../../com.aspose.email/mapitask) - Updated MapiTask
### updateTaskList(GraphTaskListInfo taskList) {#updateTaskList-com.aspose.email.GraphTaskListInfo-}
```
public abstract GraphTaskListInfo updateTaskList(GraphTaskListInfo taskList)
```


Updates TaskList.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| taskList | [GraphTaskListInfo](../../com.aspose.email/graphtasklistinfo) | TaskListInfo to update |

**Returns:**
[GraphTaskListInfo](../../com.aspose.email/graphtasklistinfo) - Returns updated TaskListInfo
