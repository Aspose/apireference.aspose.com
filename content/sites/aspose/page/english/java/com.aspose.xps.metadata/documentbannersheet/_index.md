---
title: DocumentBannerSheet
second_title: Aspose.Page for Java API Reference
description: Describes the banner sheet to be output for a particular document.
type: docs
weight: 13
url: /java/com.aspose.xps.metadata/documentbannersheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentBannerSheet extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describes the banner sheet to be output for a particular document. The banner sheet should be output on the default  PageMediaSize  and using the default  PageMediaType . The banner sheet should be also isolated from the remainder of the job. This means that any finishing or processing options (such as  DocumentDuplex ,  DocumentStaple , or  DocumentBinding ) should not include the banner sheet. The banner sheet may or may not be isolated from the remainder of the job. This means that any job finishing or processing options, may include the document banner sheet. The banner sheet should occur as the first sheet of the document. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options)](#DocumentBannerSheet-com.aspose.xps.metadata.DocumentBannerSheet.BannerSheetOption...-) | Creates a new instance. |
### DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options) {#DocumentBannerSheet-com.aspose.xps.metadata.DocumentBannerSheet.BannerSheetOption...-}
```
public DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.DocumentBannerSheet.BannerSheetOption[] | An array of options specific for the feature. |

