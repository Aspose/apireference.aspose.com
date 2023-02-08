---
title: DocumentStaple
second_title: Aspose.Page for Java API Reference
description: Describes the stapling characteristics of the output.
type: docs
weight: 35
url: /java/com.aspose.xps.metadata/documentstaple/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Staple](../../com.aspose.xps.metadata/staple)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentStaple extends Staple implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describes the stapling characteristics of the output. Each document is stapled separately. The \`\`\` JobStapleAllDocuments \`\`\` and \`\`\` DocumentStaple \`\`\` keywords are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentStaple(Staple.StapleOption[] options)](#DocumentStaple-com.aspose.xps.metadata.Staple.StapleOption...-) | Creates a new instance. |
### DocumentStaple(Staple.StapleOption[] options) {#DocumentStaple-com.aspose.xps.metadata.Staple.StapleOption...-}
```
public DocumentStaple(Staple.StapleOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.Staple.StapleOption[] | An array of options specific for the feature. |

