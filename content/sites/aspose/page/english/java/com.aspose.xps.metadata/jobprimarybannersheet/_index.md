---
title: JobPrimaryBannerSheet
second_title: Aspose.Page for Java API Reference
description: Describes the banner sheet to be output for the job.
type: docs
weight: 64
url: /java/com.aspose.xps.metadata/jobprimarybannersheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobPrimaryBannerSheet extends Feature implements IJobPrintTicketItem
```

Describes the banner sheet to be output for the job. The banner sheet should be output on the default \`\`\` PageMediaSize \`\`\` and using the default \`\`\` PageMediaType \`\`\`. The banner sheet should be isolated from the remainder of the job. This means that any finishing or processing options (such as \`\`\` JobDuplexAllDocumentsContiguously \`\`\`, \`\`\` JobStapleAllDocuments \`\`\`, or \`\`\` JobBindAllDocuments \`\`\`) should not include the banner sheet. The banner sheet should occur as the first sheet of the job.
## Constructors

| Constructor | Description |
| --- | --- |
| [JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options)](#JobPrimaryBannerSheet-com.aspose.xps.metadata.JobPrimaryBannerSheet.BannerSheetOption...-) | Creates a new instance. |
### JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options) {#JobPrimaryBannerSheet-com.aspose.xps.metadata.JobPrimaryBannerSheet.BannerSheetOption...-}
```
public JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | com.aspose.xps.metadata.JobPrimaryBannerSheet.BannerSheetOption[] | An array of options specific for the feature. |

