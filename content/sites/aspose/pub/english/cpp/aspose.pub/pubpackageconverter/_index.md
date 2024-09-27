---
title: Aspose::Pub::PubPackageConverter class
linktitle: PubPackageConverter
second_title: Aspose.PUB for C++
description: 'How to use Aspose::Pub::PubPackageConverter class in C++.'
type: docs
weight: 2900
url: /cpp/aspose.pub/pubpackageconverter/
---
## PubPackageConverter class




```cpp
class PubPackageConverter : public Aspose::Pub::IPubPackageConverter
```

## Methods

| Method | Description |
| --- | --- |
| [ConvertToFormat](./converttoformat/)(System::SharedPtr\<PackageDocumentCollection\>, bool, PubExportFormats, PubDocumentType) override | Converts each document from the *inputDocumentCollection*  list to the specified format and saves the results in the appropriate storage. Type of storage to save is specified by *outputType*  parameter. References to converted documents are placed in the returned [PackageDocumentCollection](../packagedocumentcollection/) object. If the *mergeFiles*  flag is set, then all converted documents will be merged into single document in the same order in which they were placed in the *inputDocumentCollection*  list. |
## See Also

* Class [IPubPackageConverter](../ipubpackageconverter/)
* Namespace [Aspose::Pub](../)
* Library [Aspose.PUB for C++](../../)
