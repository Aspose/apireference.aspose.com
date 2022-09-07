---
title: DocumentCoverBack
second_title: Aspose.Page for Java API Reference
description: Describes the back ending cover sheet.
type: docs
weight: 19
url: /java/com.aspose.xps.metadata/documentcoverback/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentCoverBack extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describes the back (ending) cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the \`\`\` PageMediaSize \`\`\` and \`\`\` PageMediaType \`\`\` used for the final page of the document. The cover sheet should be integrated into processing options (such as \`\`\` DocumentDuplex \`\`\`, \`\`\` DocumentNUp \`\`\`) as indicated by the Option specified. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentCoverBack(DocumentCoverBack.CoverBackOption[] options)](#DocumentCoverBack-com.aspose.xps.metadata.DocumentCoverBack.CoverBackOption...-) | Creates a new instance. |
### DocumentCoverBack(DocumentCoverBack.CoverBackOption[] options) {#DocumentCoverBack-com.aspose.xps.metadata.DocumentCoverBack.CoverBackOption...-}
```
public DocumentCoverBack(DocumentCoverBack.CoverBackOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.DocumentCoverBack.CoverBackOption[] | An array of options specific for the feature. |

