---
title: DocumentCollate
second_title: Aspose.Page for Java API Reference
description: Describes the collating characteristics of the output.
type: docs
weight: 17
url: /java/com.aspose.xps.metadata/documentcollate/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Collate](../../com.aspose.xps.metadata/collate)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentCollate extends Collate implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describes the collating characteristics of the output. All pages in each individual document are collated. DocumentCollate and JobCollateAlldocuments are mutually exclusive. The behavior and implementation of whether both or only one of these keywords is implemented is left to the driver. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentCollate(Collate.CollateOption[] options)](#DocumentCollate-com.aspose.xps.metadata.Collate.CollateOption...-) |  |
### DocumentCollate(Collate.CollateOption[] options) {#DocumentCollate-com.aspose.xps.metadata.Collate.CollateOption...-}
```
public DocumentCollate(Collate.CollateOption[] options)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.Collate.CollateOption[] |  |

