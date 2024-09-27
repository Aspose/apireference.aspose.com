---
title: Aspose::Pub::PackageDocumentItem class
linktitle: PackageDocumentItem
second_title: Aspose.PUB for C++
description: 'Aspose::Pub::PackageDocumentItem class. Base class for Publisher document references for use in package conversions. Provides fields for specifying output source for the converted document - OutputFileName for a disk file and OutputStream for stream. Also provides conversion settings in C++.'
type: docs
weight: 2200
url: /cpp/aspose.pub/packagedocumentitem/
---
## PackageDocumentItem class


Base class for Publisher document references for use in package conversions. Provides fields for specifying output source for the converted document - [OutputFileName](../) for a disk file and [OutputStream](../) for stream. Also provides conversion settings.

```cpp
class PackageDocumentItem : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_ConversionOptions](./get_conversionoptions/)() const | Conversion settings. |
| [get_OutputFileName](./get_outputfilename/)() const | Name of output file. Full path is required. |
| [get_OutputStream](./get_outputstream/)() const | Output stream for saving conversion result. |
| [PackageDocumentItem](./packagedocumentitem/)(System::String) | Constructor. |
| [PackageDocumentItem](./packagedocumentitem/)(System::String, System::SharedPtr\<PubToPdfConversionOptions\>) | Constructor. |
| [PackageDocumentItem](./packagedocumentitem/)(System::SharedPtr\<System::IO::Stream\>) | Constructor. |
| [PackageDocumentItem](./packagedocumentitem/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<PubToPdfConversionOptions\>) | Constructor. |
| [set_ConversionOptions](./set_conversionoptions/)(System::SharedPtr\<PubToPdfConversionOptions\>) | Conversion settings. |
| [set_OutputFileName](./set_outputfilename/)(System::String) | Name of output file. Full path is required. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) | Output stream for saving conversion result. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Pub](../)
* Library [Aspose.PUB for C++](../../)
