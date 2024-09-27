---
title: Aspose::Pub::PubPackageConverter::ConvertToFormat method
linktitle: ConvertToFormat
second_title: Aspose.PUB for C++
description: 'Aspose::Pub::PubPackageConverter::ConvertToFormat method. Converts each document from the inputDocumentCollection  list to the specified format and saves the results in the appropriate storage. Type of storage to save is specified by outputType  parameter. References to converted documents are placed in the returned PackageDocumentCollection object. If the mergeFiles  flag is set, then all converted documents will be merged into single document in the same order in which they were placed in the inputDocumentCollection  list in C++.'
type: docs
weight: 100
url: /cpp/aspose.pub/pubpackageconverter/converttoformat/
---
## PubPackageConverter::ConvertToFormat method


Converts each document from the *inputDocumentCollection*  list to the specified format and saves the results in the appropriate storage. Type of storage to save is specified by *outputType*  parameter. References to converted documents are placed in the returned [PackageDocumentCollection](../../packagedocumentcollection/) object. If the *mergeFiles*  flag is set, then all converted documents will be merged into single document in the same order in which they were placed in the *inputDocumentCollection*  list.

```cpp
System::SharedPtr<PackageDocumentCollection> Aspose::Pub::PubPackageConverter::ConvertToFormat(System::SharedPtr<PackageDocumentCollection> inputDocs, bool mergeFiles, PubExportFormats outputFormat, PubDocumentType outputType) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| inputDocumentCollection | System::SharedPtr\<PackageDocumentCollection\> | Collection of input documents. |
| mergeFiles | bool | Specifies, whether to merge all output documents into the single one. |
| outputFormat | PubExportFormats | Output format. |
| outputType | PubDocumentType | Output storage type. |

### ReturnValue

References to the converted documents in the [PackageDocumentCollection](../../packagedocumentcollection/)object.



## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PackageDocumentCollection](../../packagedocumentcollection/)
* Enum [PubExportFormats](../../pubexportformats/)
* Enum [PubDocumentType](../../pubdocumenttype/)
* Class [PubPackageConverter](../)
* Namespace [Aspose::Pub](../../)
* Library [Aspose.PUB for C++](../../../)
