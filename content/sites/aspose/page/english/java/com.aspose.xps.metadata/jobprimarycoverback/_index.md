---
title: JobPrimaryCoverBack
second_title: Aspose.Page for Java API Reference
description: Describes the back ending cover sheet.
type: docs
weight: 66
url: /java/com.aspose.xps.metadata/jobprimarycoverback/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobPrimaryCoverBack extends Feature implements IJobPrintTicketItem
```

Describes the back (ending) cover sheet. Each job will have a separate primary sheet. The cover sheet should be printed on the  PageMediaSize  and  PageMediaType  used for the final page of the job. The cover sheet should be integrated into processing options (such as  JobDuplexAllDocumentsContiguously ,  JobNUpAllDocumentsContiguously ) as indicated by the Option specified. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverback
## Constructors

| Constructor | Description |
| --- | --- |
| [JobPrimaryCoverBack(JobPrimaryCoverBack.CoverBackOption[] options)](#JobPrimaryCoverBack-com.aspose.xps.metadata.JobPrimaryCoverBack.CoverBackOption...-) | Creates a new instance. |
### JobPrimaryCoverBack(JobPrimaryCoverBack.CoverBackOption[] options) {#JobPrimaryCoverBack-com.aspose.xps.metadata.JobPrimaryCoverBack.CoverBackOption...-}
```
public JobPrimaryCoverBack(JobPrimaryCoverBack.CoverBackOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.JobPrimaryCoverBack.CoverBackOption[] | An array of options specific for the feature. |

