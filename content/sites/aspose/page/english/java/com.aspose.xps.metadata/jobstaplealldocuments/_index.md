---
title: JobStapleAllDocuments
second_title: Aspose.Page for Java API Reference
description: Describes the stapling characteristics of the output.
type: docs
weight: 72
url: /java/com.aspose.xps.metadata/jobstaplealldocuments/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Staple](../../com.aspose.xps.metadata/staple)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobStapleAllDocuments extends Staple implements IJobPrintTicketItem
```

Describes the stapling characteristics of the output. All documents in the job are stapled together. The \`\`\` JobStapleAllDocuments \`\`\` and \`\`\` DocumentStaple \`\`\` keywords are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobstaplealldocuments
## Constructors

| Constructor | Description |
| --- | --- |
| [JobStapleAllDocuments(Staple.StapleOption[] options)](#JobStapleAllDocuments-com.aspose.xps.metadata.Staple.StapleOption...-) | Creates a new instance. |
### JobStapleAllDocuments(Staple.StapleOption[] options) {#JobStapleAllDocuments-com.aspose.xps.metadata.Staple.StapleOption...-}
```
public JobStapleAllDocuments(Staple.StapleOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.Staple.StapleOption[] | An array of options specific for the feature. |

