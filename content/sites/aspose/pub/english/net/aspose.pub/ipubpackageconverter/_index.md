---
title: Interface IPubPackageConverter
second_title: Aspose.PUB for .NET API Reference
description: Aspose.Pub.IPubPackageConverter interface. Declares functionality for converting multiple Publisher documents to a specified format
type: docs
weight: 140
url: /net/aspose.pub/ipubpackageconverter/
---
## IPubPackageConverter interface

Declares functionality for converting multiple Publisher documents to a specified format.

```csharp
public interface IPubPackageConverter
```

## Methods

| Name | Description |
| --- | --- |
| [ConvertToFormat](../../aspose.pub/ipubpackageconverter/converttoformat/)(PackageDocumentCollection, bool, PubExportFormats, PubDocumentType) | Converts each document from the *inputDocumentCollection* list to the specified format and saves the results in the appropriate storage. Type of storage to save is specified by *outputType* parameter. References to converted documents are placed in the returned [`PackageDocumentCollection`](../packagedocumentcollection/) object. If the *mergeFiles* flag is set, then all converted documents will be merged into single document in the same order in which they were placed in the *inputDocumentCollection* list. |

### See Also

* namespace [Aspose.Pub](../../aspose.pub/)
* assembly [Aspose.PUB](../../)


