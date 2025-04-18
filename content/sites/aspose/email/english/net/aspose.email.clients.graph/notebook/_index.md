---
title: Class Notebook
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Clients.Graph.Notebook class. https//docs.microsoft.com/enus/graph/api/resources/notebookviewgraphrest1.0 A OneNote notebook
type: docs
weight: 16110
url: /net/aspose.email.clients.graph/notebook/
---
## Notebook class

https://docs.microsoft.com/en-us/graph/api/resources/notebook?view=graph-rest-1.0 A OneNote notebook.

```csharp
public class Notebook
```

## Constructors

| Name | Description |
| --- | --- |
| [Notebook](notebook/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [CreatedBy](../../aspose.email.clients.graph/notebook/createdby/) { get; } | Identity of the user, device, and application which created the item. Read-only. |
| [CreatedDateTime](../../aspose.email.clients.graph/notebook/createddatetime/) { get; } | The date and time when the notebook was created. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only. |
| [DisplayName](../../aspose.email.clients.graph/notebook/displayname/) { get; set; } | The name of the notebook. |
| [Id](../../aspose.email.clients.graph/notebook/id/) { get; } | The unique identifier of the notebook. Read-only. |
| [IsCreatedDateTimeSpecified](../../aspose.email.clients.graph/notebook/iscreateddatetimespecified/) { get; set; } | Indicates whether CreatedDateTime property is specified. |
| [IsDefault](../../aspose.email.clients.graph/notebook/isdefault/) { get; } | Indicates whether this is the user's default notebook. Read-only. |
| [IsDefaultSpecified](../../aspose.email.clients.graph/notebook/isdefaultspecified/) { get; set; } | Indicates whether IsDefault property is specified. |
| [IsLastModifiedDateTimeSpecified](../../aspose.email.clients.graph/notebook/islastmodifieddatetimespecified/) { get; set; } | Indicates whether LastModifiedDateTime property is specified. |
| [IsShared](../../aspose.email.clients.graph/notebook/isshared/) { get; } | Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the owner. Read-only. |
| [IsSharedSpecified](../../aspose.email.clients.graph/notebook/issharedspecified/) { get; set; } | Indicates whether IsShared property is specified. |
| [LastModifiedBy](../../aspose.email.clients.graph/notebook/lastmodifiedby/) { get; } | Identity of the user, device, and application which created the item. Read-only. |
| [LastModifiedDateTime](../../aspose.email.clients.graph/notebook/lastmodifieddatetime/) { get; } | The date and time when the notebook was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only. |
| [Links](../../aspose.email.clients.graph/notebook/links/) { get; set; } | Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web. |
| [SectionGroupsUrl](../../aspose.email.clients.graph/notebook/sectiongroupsurl/) { get; } | The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only. |
| [SectionsUrl](../../aspose.email.clients.graph/notebook/sectionsurl/) { get; } | The URL for the sections navigation property, which returns all the sections in the notebook. Read-only. |
| [Self](../../aspose.email.clients.graph/notebook/self/) { get; } | The endpoint where you can get details about the notebook. Read-only. |
| [UserRole](../../aspose.email.clients.graph/notebook/userrole/) { get; } | Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only. |

### See Also

* namespace [Aspose.Email.Clients.Graph](../../aspose.email.clients.graph/)
* assembly [Aspose.Email](../../)


