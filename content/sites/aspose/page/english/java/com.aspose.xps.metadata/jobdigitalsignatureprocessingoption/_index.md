---
title: JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption
second_title: Aspose.Page for Java API Reference
description: Describes the JobDigitalSignatureProcessing feature options.
type: docs
weight: 10
url: /java/com.aspose.xps.metadata/jobdigitalsignatureprocessing.jobdigitalsignatureprocessingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption extends Option
```

Describes the \`\`\` JobDigitalSignatureProcessing \`\`\` feature options.
## Fields

| Field | Description |
| --- | --- |
| [PrintInvalidSignatures](#PrintInvalidSignatures) | Print the job regardless of the validity of the digital signatures. |
| [PrintInvalidSignaturesWithErrorReport](#PrintInvalidSignaturesWithErrorReport) | Print the job regardless of the validity of the digital signatures. |
| [PrintOnlyValidSignatures](#PrintOnlyValidSignatures) | Print the job only if all digital signatures are valid. |
### PrintInvalidSignatures {#PrintInvalidSignatures}
```
public static JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignatures
```


Print the job regardless of the validity of the digital signatures. Digital signatures MAY be ignored.

### PrintInvalidSignaturesWithErrorReport {#PrintInvalidSignaturesWithErrorReport}
```
public static JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignaturesWithErrorReport
```


Print the job regardless of the validity of the digital signatures. In the event an invalid signature is encountered, an error page should print at the end of the job. Digital signatures MUST not be ignored.

### PrintOnlyValidSignatures {#PrintOnlyValidSignatures}
```
public static JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintOnlyValidSignatures
```


Print the job only if all digital signatures are valid. Digital signatures MUST not be ignored.

