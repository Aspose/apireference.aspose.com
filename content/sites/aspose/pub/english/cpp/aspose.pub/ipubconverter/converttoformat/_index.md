---
title: Aspose::Pub::IPubConverter::ConvertToFormat method
linktitle: ConvertToFormat
second_title: Aspose.PUB for C++
description: 'Aspose::Pub::IPubConverter::ConvertToFormat method. Converts PUB document into format specified and saves result to file located at the fileName  in C++.'
type: docs
weight: 100
url: /cpp/aspose.pub/ipubconverter/converttoformat/
---
## IPubConverter::ConvertToFormat(System::SharedPtr\<Document\>, System::String, PubExportFormats) method


Converts PUB document into format specified and saves result to file located at the *fileName* .

```cpp
virtual void Aspose::Pub::IPubConverter::ConvertToFormat(System::SharedPtr<Document> doc, System::String fileName, PubExportFormats outFormat)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| doc | System::SharedPtr\<Document\> | PUB document |
| fileName | System::String | Location of the file |
| outFormat | PubExportFormats | Format options |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Document](../../document/)
* Class [String](../../../system/string/)
* Enum [PubExportFormats](../../pubexportformats/)
* Class [IPubConverter](../)
* Namespace [Aspose::Pub](../../)
* Library [Aspose.PUB for C++](../../../)
## IPubConverter::ConvertToFormat(System::SharedPtr\<Document\>, System::SharedPtr\<System::IO::Stream\>, PubExportFormats) method


Converts PUB document into format specified and saves result into stream passed.

```cpp
virtual void Aspose::Pub::IPubConverter::ConvertToFormat(System::SharedPtr<Document> doc, System::SharedPtr<System::IO::Stream> outputStream, PubExportFormats outFormat)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| doc | System::SharedPtr\<Document\> | PUB document |
| outputStream | System::SharedPtr\<System::IO::Stream\> | Output stream |
| outFormat | PubExportFormats | Format options |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Document](../../document/)
* Class [Stream](../../../system.io/stream/)
* Enum [PubExportFormats](../../pubexportformats/)
* Class [IPubConverter](../)
* Namespace [Aspose::Pub](../../)
* Library [Aspose.PUB for C++](../../../)
