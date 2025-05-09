---
title: Enum MapiCalendarOverrideFlags
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Mapi.MapiCalendarOverrideFlags enum. Specifies what data in the MapiCalendarOverrideFlags structure has a value different from the recurring series
type: docs
weight: 18210
url: /net/aspose.email.mapi/mapicalendaroverrideflags/
---
## MapiCalendarOverrideFlags enumeration

Specifies what data in the MapiCalendarOverrideFlags structure has a value different from the recurring series.

```csharp
[Flags]
public enum MapiCalendarOverrideFlags
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Subject | `1` | Indicates that the Subject, SubjectLength, and SubjectLength2 fields are present. |
| MeetingType | `2` | Indicates that the MeetingType field is present. |
| ReminderDelta | `4` | Indicates that the ReminderDelta field is present. |
| Reminder | `8` | Indicates that the ReminderSet field is present. |
| Location | `10` | Indicates that the Location, LocationLength, and LocationLength2 fields are present. |
| BusyStatus | `20` | Indicates that the BusyStatus field is present. |
| Attachment | `40` | Indicates that the attachment field is present. |
| Subtype | `80` | Indicates that the SubType field is present. |
| AppointmentColor | `100` | Reserved for future use and MUST NOT be set. |
| ExceptionalBody | `200` | Indicates that the Exception Embedded Message object has the PidTagRtfCompressed property set on it. |

### See Also

* namespace [Aspose.Email.Mapi](../../aspose.email.mapi/)
* assembly [Aspose.Email](../../)


