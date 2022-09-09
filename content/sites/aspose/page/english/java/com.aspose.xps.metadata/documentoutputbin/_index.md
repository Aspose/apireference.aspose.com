---
title: DocumentOutputBin
second_title: Aspose.Page for Java API Reference
description: Describes the full list of supported bins for the device.
type: docs
weight: 30
url: /java/com.aspose.xps.metadata/documentoutputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.OutputBin](../../com.aspose.xps.metadata/outputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentOutputBin extends OutputBin implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describes the full list of supported bins for the device. Allows specification of output bin on a per document basis. The  JobOutputBin ,  DocumentOutputBin  and  PageOutputBin  keywords are mutually exclusive only one should be specified in a PrintTicket or Print Capabilities document. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentOutputBin(OutputBin.IOutputBinItem[] items)](#DocumentOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-) | Creates a new instance. |
### DocumentOutputBin(OutputBin.IOutputBinItem[] items) {#DocumentOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-}
```
public DocumentOutputBin(OutputBin.IOutputBinItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.OutputBin.IOutputBinItem[] | An array of items specific for the feature. |

