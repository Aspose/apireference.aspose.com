---
title: IPubPackageConverter.ConvertToFormat
second_title: Aspose.PUB for .NET API Reference
description: IPubPackageConverter method. Converts each document from the inputDocumentCollection list to the specified format and saves the results in the appropriate storage. Type of storage to save is specified by outputType parameter. References to converted documents are placed in the returned PackageDocumentCollection object. If the mergeFiles flag is set then all converted documents will be merged into single document in the same order in which they were placed in the inputDocumentCollection list
type: docs
weight: 10
url: /net/aspose.pub/ipubpackageconverter/converttoformat/
---
## IPubPackageConverter.ConvertToFormat method

Converts each document from the *inputDocumentCollection* list to the specified format and saves the results in the appropriate storage. Type of storage to save is specified by *outputType* parameter. References to converted documents are placed in the returned [`PackageDocumentCollection`](../../packagedocumentcollection/) object. If the *mergeFiles* flag is set, then all converted documents will be merged into single document in the same order in which they were placed in the *inputDocumentCollection* list.

```csharp
public PackageDocumentCollection ConvertToFormat(PackageDocumentCollection inputDocumentCollection, 
    bool mergeFiles, PubExportFormats outputFormat, PubDocumentType outputType)
```

| Parameter | Type | Description |
| --- | --- | --- |
| inputDocumentCollection | PackageDocumentCollection | Collection of input documents. |
| mergeFiles | Boolean | Specifies, whether to merge all output documents into the single one. |
| outputFormat | PubExportFormats | Output format. |
| outputType | PubDocumentType | Output storage type. |

### Return Value

References to the converted documents in the [`PackageDocumentCollection`](../../packagedocumentcollection/)object.

### See Also

* class [PackageDocumentCollection](../../packagedocumentcollection/)
* enum [PubExportFormats](../../pubexportformats/)
* enum [PubDocumentType](../../pubdocumenttype/)
* interface [IPubPackageConverter](../)
* namespace [Aspose.Pub](../../ipubpackageconverter/)
* assembly [Aspose.PUB](../../../)


