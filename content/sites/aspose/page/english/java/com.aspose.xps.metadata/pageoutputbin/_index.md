---
title: PageOutputBin
second_title: Aspose.Page for Java API Reference
description: Describes the full list of supported bins for the device.
type: docs
weight: 114
url: /java/com.aspose.xps.metadata/pageoutputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.OutputBin](../../com.aspose.xps.metadata/outputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageOutputBin extends OutputBin implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Describes the full list of supported bins for the device. Allows specification of output bin on a per page basis. The  JobOutputBin ,  DocumentOutputBin  and  PageOutputBin  keywords are mutually exclusive only one should be specified in a PrintTicket or Print Capabilities document. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin
## Constructors

| Constructor | Description |
| --- | --- |
| [PageOutputBin(OutputBin.IOutputBinItem[] items)](#PageOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-) | Creates a new instance. |
### PageOutputBin(OutputBin.IOutputBinItem[] items) {#PageOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-}
```
public PageOutputBin(OutputBin.IOutputBinItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.OutputBin.IOutputBinItem[] | An array of items specific for the feature. |

