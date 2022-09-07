---
title: JobOutputBin
second_title: Aspose.Page for Java API Reference
description: Describes the installed output bin in a device or the full list of supported bins for a device.
type: docs
weight: 61
url: /java/com.aspose.xps.metadata/joboutputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.OutputBin](../../com.aspose.xps.metadata/outputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobOutputBin extends OutputBin implements IJobPrintTicketItem
```

Describes the installed output bin in a device or the full list of supported bins for a device. The \`\`\` JobOutputBin \`\`\`, \`\`\` DocumentOutputBin \`\`\` and \`\`\` PageOutputBin \`\`\` keywords are mutually exclusive only one should be specified in a PrintTicket or Print Capabilities document. https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin
## Constructors

| Constructor | Description |
| --- | --- |
| [JobOutputBin(OutputBin.IOutputBinItem[] items)](#JobOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-) | Creates a new instance. |
### JobOutputBin(OutputBin.IOutputBinItem[] items) {#JobOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-}
```
public JobOutputBin(OutputBin.IOutputBinItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.OutputBin.IOutputBinItem[] | An array of items specific for the feature. |

