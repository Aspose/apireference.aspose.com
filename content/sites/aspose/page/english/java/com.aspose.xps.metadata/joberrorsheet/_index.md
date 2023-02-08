---
title: JobErrorSheet
second_title: Aspose.Page for Java API Reference
description: Describes the error sheet output.
type: docs
weight: 53
url: /java/com.aspose.xps.metadata/joberrorsheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobErrorSheet extends Feature implements IJobPrintTicketItem
```

Describes the error sheet output. The entire job will have a single error sheet. The error sheet should be output on the default  PageMediaSize  and using the default  PageMediaType . The error sheet should to be isolated from the remainder of the job. This means that any finishing or processing options (such as  JobDuplex ,  JobStaple , or  JobBinding ) should not include the error sheet. The error sheet should occur as the final sheet of the job. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet
## Constructors

| Constructor | Description |
| --- | --- |
| [JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)](#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-) | Creates a new instance. |
### JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items) {#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-}
```
public JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem[] | An array of items specific for the feature. |

