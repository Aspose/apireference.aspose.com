---
title: JobDuplexAllDocumentsContiguously
second_title: Aspose.Page for Java API Reference
description: Describes the duplex characteristics of the output.
type: docs
weight: 52
url: /java/com.aspose.xps.metadata/jobduplexalldocumentscontiguously/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Duplex](../../com.aspose.xps.metadata/duplex)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobDuplexAllDocumentsContiguously extends Duplex implements IJobPrintTicketItem
```

Describes the duplex characteristics of the output. The duplex feature allows for printing on both sides of the media. All Documents in the job are duplexed together contiguously. \`\`\` JobDuplexAllDocumentsContiguously \`\`\` and \`\`\` DocumentDuplex \`\`\` are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobduplexalldocumentscontiguously
## Constructors

| Constructor | Description |
| --- | --- |
| [JobDuplexAllDocumentsContiguously(Duplex.DuplexOption[] options)](#JobDuplexAllDocumentsContiguously-com.aspose.xps.metadata.Duplex.DuplexOption...-) | Creates a new instance. |
### JobDuplexAllDocumentsContiguously(Duplex.DuplexOption[] options) {#JobDuplexAllDocumentsContiguously-com.aspose.xps.metadata.Duplex.DuplexOption...-}
```
public JobDuplexAllDocumentsContiguously(Duplex.DuplexOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.Duplex.DuplexOption[] | An array of options specific for the feature. |

