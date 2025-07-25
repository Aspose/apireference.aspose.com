---
title: Class Collection
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Collection class. Represents class for Collection12.3.5 Collections
type: docs
weight: 3130
url: /net/aspose.pdf/collection/
---
## Collection class

Represents class for Collection(12.3.5 Collections).

```csharp
public class Collection : EmbeddedFileCollection
```

## Constructors

| Name | Description |
| --- | --- |
| [Collection](collection/)() | Initializes new Collection object. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.pdf/embeddedfilecollection/count/) { get; } | Gets number of embedded files in collection. |
| [DefaultEntry](../../aspose.pdf/collection/defaultentry/) { get; } | Default embedded file name. |
| [IsSynchronized](../../aspose.pdf/embeddedfilecollection/issynchronized/) { get; } | Gets a value indicating whether access to this collection is synchronized (thread safe). |
| [Item](../../aspose.pdf/embeddedfilecollection/item/) { get; } | Gets embedded file by its index. (2 indexers) |
| [Keys](../../aspose.pdf/embeddedfilecollection/keys/) { get; } | Returns list of file attachment keys. |
| [Schema](../../aspose.pdf/collection/schema/) { get; } | Gets a "Schema" of a document collection. |
| [SyncRoot](../../aspose.pdf/embeddedfilecollection/syncroot/) { get; } | Gets an object that can be used to synchronize access to this collection. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.pdf/embeddedfilecollection/add/)(FileSpecification) | Adds embedded file specification into collection. |
| [Add](../../aspose.pdf/embeddedfilecollection/add/)(string, FileSpecification) | Adds file to embedded files with the specified key. |
| [CopyTo](../../aspose.pdf/embeddedfilecollection/copyto/)(FileSpecification[], int) | Copies array of FileSpecification object into colleciton. |
| [Delete](../../aspose.pdf/embeddedfilecollection/delete/)() | Remove all embedded files from document. |
| [Delete](../../aspose.pdf/embeddedfilecollection/delete/)(string) | Delete embedded file by name. |
| [DeleteByKey](../../aspose.pdf/embeddedfilecollection/deletebykey/)(string) | Deletes file from the collection by its key in the collection. |
| [FindByName](../../aspose.pdf/embeddedfilecollection/findbyname/)(string) | Returns embedded file by its name. |
| [GetEnumerator](../../aspose.pdf/embeddedfilecollection/getenumerator/)() | Returns colleciton enumerator. |
| [GetSortedCollection](../../aspose.pdf/collection/getsortedcollection/)() | Gets a collection of files sorted according to the specification. |

### See Also

* class [EmbeddedFileCollection](../embeddedfilecollection/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


