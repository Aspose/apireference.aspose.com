---
title: IGraphClient
second_title: Aspose.Email for Python via .NET API Reference
description: 
type: docs
weight: 110
url: /python-net/aspose.email.clients.graph/igraphclient/
---

## IGraphClient class

Represents the interface for Exchange REST client.

The IGraphClient type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
|multiple_services_token_provider|Gets or sets an object allows to retrieve OAuth access token.|
|token_provider|Gets or sets an object allows to retrieve OAuth access token.|
|timeout|Gets or sets the number of milliseconds to wait before the operation times out.<br/>            The default value is 100,000 milliseconds (100 seconds).|
|tenant_id|Gets or sets tenant identifier|
|resource_id|Gets or sets resource id.<br/>            For instance for users it may be user principal name (UPN) or user id|
|end_point|Gets or sets Microsoft Graph REST API endpoint.<br/>            If not specified, the default is "https://graph.microsoft.com".|
|resource|Gets or sets resource type.|
## Methods
| Name | Description |
| :- | :- |
|list_folders()|  |
|list_folders(id)|  |
|create_folder(folder_name)|  |
|create_folder(parent_folder_id, folder_name)|  |
|list_messages(id)|  |
|list_messages(id, page, query)|  |
|update_calendar_item(mapi_calendar)|  |
|update_calendar_item(mapi_calendar, update_settings)|  |
|create_message(folder_id, message)|  |
|create_message(folder_id, message)|  |
|update_message(message)|  |
|update_message(message, update_settings)|  |
|update_message(message)|  |
|update_message(message, update_settings)|  |
|send(item_id)|  |
|send(message)|  |
|send(message, save_to_sent_items)|  |
|send(message)|  |
|create_or_update_override(sender, classify_as)|  |
|create_or_update_override(classification_override)|  |
|update_task(task)|  |
|update_task(task, update_settings)|  |
|delete(id)|  |
|get_folder(id)|  |
|update_folder(folder_info)|  |
|copy_folder(new_parent_id, item_id)|  |
|move_folder(new_parent_id, item_id)|  |
|list_contacts(id)|  |
|list_calendar_items(id)|  |
|fetch_calendar_item(id)|  |
|create_calendar_item(cal_id, mapi_calendar)|  |
|fetch_contact(id)|  |
|create_attachment(parent_id, attachment)|  |
|fetch_attachment(id)|  |
|delete_attachment(id)|  |
|list_attachments(id)|  |
|fetch_message(id)|  |
|create_contact(folder_id, contact)|  |
|update_contact(contact)|  |
|send_as_mime(message)|  |
|copy_message(new_parent_id, item_id)|  |
|move_message(new_parent_id, item_id)|  |
|set_read(item_id)|  |
|list_categories()|  |
|create_category(display_name, preset)|  |
|update_category(category)|  |
|fetch_category(item_id)|  |
|update_override(classification_override)|  |
|list_overrides()|  |
|fetch_notebook(item_id)|  |
|create_notebook(notebook)|  |
|list_notebooks()|  |
|copy_notebook(item_id, group_id, rename_as)|  |
|get_one_note_operation_status(operation_id)|  |
|list_calendars()|  |
|list_task_lists()|  |
|get_task_list(id)|  |
|create_task_list(task_list)|  |
|update_task_list(task_list)|  |
|delete_task_list(id)|  |
|list_tasks(id)|  |
|fetch_task(id)|  |
|create_task(task, task_list_uri)|  |

### See Also

* namespace [aspose.email.clients.graph](/email/python-net/aspose.email.clients.graph/)
* assembly [Aspose.Email](/email/python-net/)

