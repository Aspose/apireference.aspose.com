---
title: Enum MapiTaskFlags
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Mapi.MapiTaskFlags enum. Contains indication flags of the Task object
type: docs
weight: 18920
url: /net/aspose.email.mapi/mapitaskflags/
---
## MapiTaskFlags enumeration

Contains indication flags of the Task object.

```csharp
[Flags]
public enum MapiTaskFlags
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Complete | `1` | Indicates whether the task has been completed. |
| Accepted | `2` | Indicates whether a task assignee has replied to a task request for this Task object. |
| Updates | `4` | Indicates whether the task assignee has been requested to send a task update when the assigned Task object changes. |
| Recurring | `8` | Indicates whether the task includes a recurrence pattern. |
| StatusOnComplete | `10` | Indicates whether the task assignee has been requested to send an e-mail message update when the task assignee completes the assigned task. |
| DeadOccurrence | `20` | Indicates whether new occurrences remain to be generated. |
| ResetReminder | `40` | Indicates whether future instances of recurring tasks need reminders. |

### See Also

* namespace [Aspose.Email.Mapi](../../aspose.email.mapi/)
* assembly [Aspose.Email](../../)


