---
title: DocumentNUp
second_title: Aspose.Page for Java API Reference
description: Describes the output and format of multiple logical pages to a single physical sheet.
type: docs
weight: 28
url: /java/com.aspose.xps.metadata/documentnup/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.NUp](../../com.aspose.xps.metadata/nup)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentNUp extends NUp implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describes the output and format of multiple logical pages to a single physical sheet. Each document is compiled separately.  DocumentNUp  and  JobNUpAllDocumentsContiguously  are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentNUp(NUp.INUpItem[] items)](#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | Adds and option with a  PagesPerSheet  scored property value. |
### DocumentNUp(NUp.INUpItem[] items) {#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-}
```
public DocumentNUp(NUp.INUpItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.NUp.INUpItem[] | An array of items specific for the feature. |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public DocumentNUp addPagesPerSheetOption(int value)
```


Adds and option with a  PagesPerSheet  scored property value. Specifies the number of logical pages per physical sheet.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | A

```java
PagesPerSheet
```

scored property value. Supported set can be any set of integers E.g. \{1,2,4,6,8,9,16\}. |

**Returns:**
[DocumentNUp](../../com.aspose.xps.metadata/documentnup) - This feature instance.
