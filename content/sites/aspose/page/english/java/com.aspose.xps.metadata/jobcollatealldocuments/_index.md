---
title: JobCollateAllDocuments
second_title: Aspose.Page for Java API Reference
description: Describes the collating characteristics of the output.
type: docs
weight: 47
url: /java/com.aspose.xps.metadata/jobcollatealldocuments/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Collate](../../com.aspose.xps.metadata/collate)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobCollateAllDocuments extends Collate implements IJobPrintTicketItem
```

Describes the collating characteristics of the output. All documents in each individual job are collated. \`\`\` DocumentCollate \`\`\` and \`\`\` JobCollateAllDocuments \`\`\` are mutually exclusive. The behavior and implementation of whether both or only one of these keywords is implemented is left to the driver. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobcollatealldocuments
## Constructors

| Constructor | Description |
| --- | --- |
| [JobCollateAllDocuments(Collate.CollateOption[] options)](#JobCollateAllDocuments-com.aspose.xps.metadata.Collate.CollateOption...-) | Creates a new instance. |
### JobCollateAllDocuments(Collate.CollateOption[] options) {#JobCollateAllDocuments-com.aspose.xps.metadata.Collate.CollateOption...-}
```
public JobCollateAllDocuments(Collate.CollateOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.Collate.CollateOption[] | An array of options specific for the feature. |

