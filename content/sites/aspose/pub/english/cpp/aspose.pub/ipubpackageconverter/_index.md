---
title: Aspose::Pub::IPubPackageConverter class
linktitle: IPubPackageConverter
second_title: Aspose.PUB for C++
description: 'Aspose::Pub::IPubPackageConverter class. Declares functionality for converting multiple Publisher documents to a specified format in C++.'
type: docs
weight: 1400
url: /cpp/aspose.pub/ipubpackageconverter/
---
## IPubPackageConverter class


Declares functionality for converting multiple Publisher documents to a specified format.

```cpp
class IPubPackageConverter : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [ConvertToFormat](./converttoformat/)(System::SharedPtr\<PackageDocumentCollection\>, bool, PubExportFormats, PubDocumentType) | Converts each document from the *inputDocumentCollection*  list to the specified format and saves the results in the appropriate storage. Type of storage to save is specified by *outputType*  parameter. References to converted documents are placed in the returned [PackageDocumentCollection](../packagedocumentcollection/) object. If the *mergeFiles*  flag is set, then all converted documents will be merged into single document in the same order in which they were placed in the *inputDocumentCollection*  list. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Pub](../)
* Library [Aspose.PUB for C++](../../)
