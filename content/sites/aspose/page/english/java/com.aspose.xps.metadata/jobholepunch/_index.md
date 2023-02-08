---
title: JobHolePunch
second_title: Aspose.Page for Java API Reference
description: Describes the hole punching characteristics of the output.
type: docs
weight: 55
url: /java/com.aspose.xps.metadata/jobholepunch/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.HolePunch](../../com.aspose.xps.metadata/holepunch)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobHolePunch extends HolePunch implements IJobPrintTicketItem
```

Describes the hole punching characteristics of the output. All documents are punched together. The \`\`\` JobHolePunch \`\`\` and \`\`\` DocumentHolePunch \`\`\` keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobholepunch
## Constructors

| Constructor | Description |
| --- | --- |
| [JobHolePunch(HolePunch.HolePunchOption[] options)](#JobHolePunch-com.aspose.xps.metadata.HolePunch.HolePunchOption...-) | Creates a new instance. |
### JobHolePunch(HolePunch.HolePunchOption[] options) {#JobHolePunch-com.aspose.xps.metadata.HolePunch.HolePunchOption...-}
```
public JobHolePunch(HolePunch.HolePunchOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.HolePunch.HolePunchOption[] | An array of options specific for the feature. |

