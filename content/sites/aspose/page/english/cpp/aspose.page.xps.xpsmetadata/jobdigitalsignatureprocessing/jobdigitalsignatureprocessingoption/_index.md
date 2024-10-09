---
title: Aspose::Page::XPS::XpsMetadata::JobDigitalSignatureProcessing::JobDigitalSignatureProcessingOption class
linktitle: JobDigitalSignatureProcessingOption
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::JobDigitalSignatureProcessing::JobDigitalSignatureProcessingOption class. Describes the JobDigitalSignatureProcessing feature options in C++.'
type: docs
weight: 200
url: /cpp/aspose.page.xps.xpsmetadata/jobdigitalsignatureprocessing/jobdigitalsignatureprocessingoption/
---
## JobDigitalSignatureProcessingOption class


Describes the [JobDigitalSignatureProcessing](../) feature options.

```cpp
class JobDigitalSignatureProcessingOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Fields

| Field | Description |
| --- | --- |
| static [PrintInvalidSignatures](./printinvalidsignatures/) | Print the job regardless of the validity of the digital signatures. Digital signatures MAY be ignored. |
| static [PrintInvalidSignaturesWithErrorReport](./printinvalidsignatureswitherrorreport/) | Print the job regardless of the validity of the digital signatures. In the event an invalid signature is encountered, an error page should print at the end of the job. Digital signatures MUST not be ignored. |
| static [PrintOnlyValidSignatures](./printonlyvalidsignatures/) | Print the job only if all digital signatures are valid. Digital signatures MUST not be ignored. |
## See Also

* Class [Option](../../option/)
* Class [JobDigitalSignatureProcessing](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
