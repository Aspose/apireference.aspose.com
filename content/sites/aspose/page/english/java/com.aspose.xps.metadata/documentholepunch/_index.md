---
title: DocumentHolePunch
second_title: Aspose.Page for Java API Reference
description: Describes the hole punching characteristics of the output.
type: docs
weight: 24
url: /java/com.aspose.xps.metadata/documentholepunch/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.HolePunch](../../com.aspose.xps.metadata/holepunch)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentHolePunch extends HolePunch implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describes the hole punching characteristics of the output. Each document is punched separately. The \`\`\` JobHolePunch \`\`\` and \`\`\` DocumentHolePunch \`\`\` keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentHolePunch(HolePunch.HolePunchOption[] options)](#DocumentHolePunch-com.aspose.xps.metadata.HolePunch.HolePunchOption...-) | Creates a new instance. |
### DocumentHolePunch(HolePunch.HolePunchOption[] options) {#DocumentHolePunch-com.aspose.xps.metadata.HolePunch.HolePunchOption...-}
```
public DocumentHolePunch(HolePunch.HolePunchOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.HolePunch.HolePunchOption[] | An array of options specific for the feature. |

