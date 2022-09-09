---
title: JobAccountingSheet
second_title: Aspose.Page for Java API Reference
description: Describes the accounting sheet to be output for the job.
type: docs
weight: 44
url: /java/com.aspose.xps.metadata/jobaccountingsheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobAccountingSheet extends Feature implements IJobPrintTicketItem
```

Describes the accounting sheet to be output for the job. The accounting sheet should be output on the default  PageMediaSize  and using the default  PageMediaType . The accounting sheet should to be isolated from the remainder of the job. This means that any finishing or processing options (such as  JobDuplex ,  JobStaple , or  JobBinding ) should not include the accounting sheet. The accounting sheet may occur as the first or last page of the job at the implementer's discretion. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet
## Constructors

| Constructor | Description |
| --- | --- |
| [JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options)](#JobAccountingSheet-com.aspose.xps.metadata.JobAccountingSheet.JobAccountingSheetOption...-) | Creates a new instance. |
### JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options) {#JobAccountingSheet-com.aspose.xps.metadata.JobAccountingSheet.JobAccountingSheetOption...-}
```
public JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.JobAccountingSheet.JobAccountingSheetOption[] | An array of options specific for the feature. |

