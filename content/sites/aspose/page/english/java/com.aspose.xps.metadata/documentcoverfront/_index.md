---
title: DocumentCoverFront
second_title: Aspose.Page for Java API Reference
description: Describes the front beginning cover sheet.
type: docs
weight: 21
url: /java/com.aspose.xps.metadata/documentcoverfront/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentCoverFront extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describes the front (beginning) cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the  PageMediaSize  and  PageMediaType  used for the first page of the document. The cover sheet should be integrated into processing options (such as  DocumentDuplex ,  DocumentNUp ) as indicated by the Option specified. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentCoverFront(DocumentCoverFront.CoverFrontOption[] options)](#DocumentCoverFront-com.aspose.xps.metadata.DocumentCoverFront.CoverFrontOption...-) | Creates a new instance. |
### DocumentCoverFront(DocumentCoverFront.CoverFrontOption[] options) {#DocumentCoverFront-com.aspose.xps.metadata.DocumentCoverFront.CoverFrontOption...-}
```
public DocumentCoverFront(DocumentCoverFront.CoverFrontOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.DocumentCoverFront.CoverFrontOption[] | An array of options specific for the feature. |

