---
title: Class XmpMetadata
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.EPS.XMP.XmpMetadata class. Provides access to XMP metadata stream
type: docs
weight: 190
url: /net/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class

Provides access to XMP metadata stream.

```csharp
public sealed class XmpMetadata : IDictionary<string, XmpValue>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.page.eps.xmp/xmpmetadata/count/) { get; } | Gets count of elements in the collection. |
| [IsFixedSize](../../aspose.page.eps.xmp/xmpmetadata/isfixedsize/) { get; } | Checks if colleciton has fixed size. |
| [IsReadOnly](../../aspose.page.eps.xmp/xmpmetadata/isreadonly/) { get; } | Checks if collection is read-only. |
| [IsSynchronized](../../aspose.page.eps.xmp/xmpmetadata/issynchronized/) { get; } | Checks if collection is synchronized. |
| [Item](../../aspose.page.eps.xmp/xmpmetadata/item/) { get; set; } | Gets or sets data from metadata. |
| [Keys](../../aspose.page.eps.xmp/xmpmetadata/keys/) { get; } | Gets collection of metadata keys. |
| [NamespaceManager](../../aspose.page.eps.xmp/xmpmetadata/namespacemanager/) { get; } | Gets namespace manager. |
| [SyncRoot](../../aspose.page.eps.xmp/xmpmetadata/syncroot/) { get; } | Gets collection synchronization object. |
| [Values](../../aspose.page.eps.xmp/xmpmetadata/values/) { get; } | Gets values in the metadata. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add)(KeyValuePair&lt;string, XmpValue&gt;) | Adds pair with key and value into the dictionary. |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_2)(string, object) | Adds value to metadata. |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_1)(string, XmpValue) | Adds value to metadata. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem)(string, XmpValue) | Adds value into an array. The value will be added at the end of the array. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem_1)(string, int, XmpValue) | Adds value into an array by specified index. |
| [AddNamedValue](../../aspose.page.eps.xmp/xmpmetadata/addnamedvalue/)(string, string, XmpValue) | Adds named value into a structure. |
| [Clear](../../aspose.page.eps.xmp/xmpmetadata/clear/)() | Clears metadata. |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains)(KeyValuePair&lt;string, XmpValue&gt;) | Checks does specified key-value pair is contained in the dictionary. |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains_1)(string) | Checks does key is contained in metadata. |
| [ContainsKey](../../aspose.page.eps.xmp/xmpmetadata/containskey/)(string) | Determines does this dictionary contasins specified key. |
| [CopyTo](../../aspose.page.eps.xmp/xmpmetadata/copyto/)(KeyValuePair&lt;string, XmpValue&gt;[], int) | Copies elements of the collection into array. |
| [GetEnumerator](../../aspose.page.eps.xmp/xmpmetadata/getenumerator/)() | Returns dictionary enumerator. |
| [GetNamespaceUriByPrefix](../../aspose.page.eps.xmp/xmpmetadata/getnamespaceuribyprefix/)(string) | Returns namespace URI by prefix. |
| [GetPrefixByNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/getprefixbynamespaceuri/)(string) | Returns prefix by namespace URI. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri)(string, string) | Registers namespace URI. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri_1)(string, string, string) | Registers namespace URI. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove)(KeyValuePair&lt;string, XmpValue&gt;) | Removes key/value pair from the colleciton. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove_1)(string) | Removes entry from metadata. |
| [SetArrayItem](../../aspose.page.eps.xmp/xmpmetadata/setarrayitem/)(string, int, XmpValue) | Sets value in an array. Previous value will be replaced with new one. |
| [SetNamedValue](../../aspose.page.eps.xmp/xmpmetadata/setnamedvalue/)(string, string, XmpValue) | Sets named value into a structure. Previous named value, if already exists, will be replaced with new one. |
| [TryGetValue](../../aspose.page.eps.xmp/xmpmetadata/trygetvalue/)(string, out XmpValue) | Tries to find key in the dictionary and retreives value if found. |

### See Also

* class [XmpValue](../xmpvalue/)
* namespace [Aspose.Page.EPS.XMP](../../aspose.page.eps.xmp/)
* assembly [Aspose.Page](../../)


