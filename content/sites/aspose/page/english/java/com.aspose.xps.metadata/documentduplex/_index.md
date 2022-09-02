---
title: DocumentDuplex
second_title: Aspose.Page for Java API Reference
description: Describes the duplex characteristics of the output.
type: docs
weight: 23
url: /java/com.aspose.xps.metadata/documentduplex/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Duplex](../../com.aspose.xps.metadata/duplex)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentDuplex extends Duplex implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describes the duplex characteristics of the output. The duplex feature allows for printing on both sides of the media. Each document is duplexed separately. DocumentDuplex and JobDuplexAllDocumentsContiguously are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentDuplex(Duplex.DuplexOption[] options)](#DocumentDuplex-com.aspose.xps.metadata.Duplex.DuplexOption...-) | Creates a new instance. |
### DocumentDuplex(Duplex.DuplexOption[] options) {#DocumentDuplex-com.aspose.xps.metadata.Duplex.DuplexOption...-}
```
public DocumentDuplex(Duplex.DuplexOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.Duplex.DuplexOption[] | An array of options specific for the feature. |

