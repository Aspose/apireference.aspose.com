---
title: Class Metadata
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Metadata class. Provides access to XMP metadata stream
type: docs
weight: 7090
url: /net/aspose.pdf/metadata/
---
## Metadata class

Provides access to XMP metadata stream.

```csharp
public sealed class Metadata : IDictionary<string, XmpValue>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.pdf/metadata/count/) { get; } | Gets count of elements in the collection. |
| [ExtensionFields](../../aspose.pdf/metadata/extensionfields/) { get; } | Gets the dictionary of extension fields. |
| [IsFixedSize](../../aspose.pdf/metadata/isfixedsize/) { get; } | Checks if colleciton has fixed size. |
| [IsReadOnly](../../aspose.pdf/metadata/isreadonly/) { get; } | Checks if collection is read-only. |
| [IsSynchronized](../../aspose.pdf/metadata/issynchronized/) { get; } | Checks if collection is synchronized. |
| [Item](../../aspose.pdf/metadata/item/) { get; set; } | Gets or sets data from metadata. |
| [Keys](../../aspose.pdf/metadata/keys/) { get; } | Gets collection of metadata keys. |
| [NamespaceManager](../../aspose.pdf/metadata/namespacemanager/) { get; } | Gets namespace manager. |
| [SyncRoot](../../aspose.pdf/metadata/syncroot/) { get; } | Gets collection synchronization object. |
| [Values](../../aspose.pdf/metadata/values/) { get; } | Gets values in the metadata. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.pdf/metadata/add/#add)(KeyValuePair&lt;string, XmpValue&gt;) | Adds pair with key and value into the dictionary. |
| [Add](../../aspose.pdf/metadata/add/#add_3)(string, object) | Adds value to metadata. |
| [Add](../../aspose.pdf/metadata/add/#add_1)(string, XmpPdfAExtensionObject) | Adds pdf extension to metadata. |
| [Add](../../aspose.pdf/metadata/add/#add_2)(string, XmpValue) | Adds value to metadata. |
| [Clear](../../aspose.pdf/metadata/clear/)() | Clears metadata. |
| [Contains](../../aspose.pdf/metadata/contains/#contains)(KeyValuePair&lt;string, XmpValue&gt;) | Checks does specified key-value pair is contained in the dictionary. |
| [Contains](../../aspose.pdf/metadata/contains/#contains_1)(string) | Checks does key is contained in metadata. |
| [ContainsKey](../../aspose.pdf/metadata/containskey/)(string) | Determines does this dictionary contasins specified key. |
| [CopyTo](../../aspose.pdf/metadata/copyto/)(KeyValuePair&lt;string, XmpValue&gt;[], int) |  |
| [GetEnumerator](../../aspose.pdf/metadata/getenumerator/)() | Returns dictionary enumerator. |
| [GetNamespaceUriByPrefix](../../aspose.pdf/metadata/getnamespaceuribyprefix/)(string) | Returns namespace URI by prefix. |
| [GetPrefixByNamespaceUri](../../aspose.pdf/metadata/getprefixbynamespaceuri/)(string) | Returns prefix by namespace URI. |
| [RegisterNamespaceUri](../../aspose.pdf/metadata/registernamespaceuri/#registernamespaceuri)(string, string) | Registers namespace URI. |
| [RegisterNamespaceUri](../../aspose.pdf/metadata/registernamespaceuri/#registernamespaceuri_1)(string, string, string) | Registers namespace URI. |
| [Remove](../../aspose.pdf/metadata/remove/#remove)(KeyValuePair&lt;string, XmpValue&gt;) | Removes key/value pair from the colleciton. |
| [Remove](../../aspose.pdf/metadata/remove/#remove_1)(string) | Removes entry from metadata. |
| [TryGetValue](../../aspose.pdf/metadata/trygetvalue/)(string, out XmpValue) | Tries to find key in the dictionary and retreives value if found. |

### See Also

* class [XmpValue](../xmpvalue/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


