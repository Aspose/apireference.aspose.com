---
title: JobNUpAllDocumentsContiguously
second_title: Aspose.Page for Java API Reference
description: Describes the output of multiple logical pages to a single physical sheet.
type: docs
weight: 58
url: /java/com.aspose.xps.metadata/jobnupalldocumentscontiguously/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.NUp](../../com.aspose.xps.metadata/nup)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobNUpAllDocumentsContiguously extends NUp implements IJobPrintTicketItem
```

Describes the output of multiple logical pages to a single physical sheet. All documents in the job are compiled together contiguously.  JobNUpAllDocumentsContiguously  and  DocumentNUp  are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously
## Constructors

| Constructor | Description |
| --- | --- |
| [JobNUpAllDocumentsContiguously(NUp.INUpItem[] items)](#JobNUpAllDocumentsContiguously-com.aspose.xps.metadata.NUp.INUpItem...-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | Adds and option with a  PagesPerSheet  scored property value. |
### JobNUpAllDocumentsContiguously(NUp.INUpItem[] items) {#JobNUpAllDocumentsContiguously-com.aspose.xps.metadata.NUp.INUpItem...-}
```
public JobNUpAllDocumentsContiguously(NUp.INUpItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.NUp.INUpItem[] | An array of items specific for the feature. |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public JobNUpAllDocumentsContiguously addPagesPerSheetOption(int value)
```


Adds and option with a  PagesPerSheet  scored property value. Specifies the number of logical pages per physical sheet.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | A  PagesPerSheet  scored property value. Supported set can be any set of integers E.g. \{1,2,4,6,8,9,16\}. |

**Returns:**
[JobNUpAllDocumentsContiguously](../../com.aspose.xps.metadata/jobnupalldocumentscontiguously) - This feature instance.
