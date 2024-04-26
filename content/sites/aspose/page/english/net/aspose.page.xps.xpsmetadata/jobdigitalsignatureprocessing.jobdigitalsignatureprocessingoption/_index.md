---
title: Class JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.JobDigitalSignatureProcessingJobDigitalSignatureProcessingOption class. Describes the JobDigitalSignatureProcessing feature options
type: docs
weight: 1920
url: /net/aspose.page.xps.xpsmetadata/jobdigitalsignatureprocessing.jobdigitalsignatureprocessingoption/
---
## JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption class

Describes the [`JobDigitalSignatureProcessing`](../jobdigitalsignatureprocessing/) feature options.

```csharp
public sealed class JobDigitalSignatureProcessingOption : Option
```

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | Adds a list of items to the end of this option's item list. Each one must be a [`ScoredProperty`](../scoredproperty/) or [`Property`](../property/) instance. |

## Fields

| Name | Description |
| --- | --- |
| static [PrintInvalidSignatures](../../aspose.page.xps.xpsmetadata/jobdigitalsignatureprocessingoption/printinvalidsignatures/) | Print the job regardless of the validity of the digital signatures. Digital signatures MAY be ignored. |
| static [PrintInvalidSignaturesWithErrorReport](../../aspose.page.xps.xpsmetadata/jobdigitalsignatureprocessingoption/printinvalidsignatureswitherrorreport/) | Print the job regardless of the validity of the digital signatures. In the event an invalid signature is encountered, an error page should print at the end of the job. Digital signatures MUST not be ignored. |
| static [PrintOnlyValidSignatures](../../aspose.page.xps.xpsmetadata/jobdigitalsignatureprocessingoption/printonlyvalidsignatures/) | Print the job only if all digital signatures are valid. Digital signatures MUST not be ignored. |

### See Also

* class [Option](../option/)
* class [JobDigitalSignatureProcessing](../jobdigitalsignatureprocessing/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


