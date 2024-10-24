---
title: Aspose::Page::EPS::XMP::XmpMetadata class
linktitle: XmpMetadata
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::XMP::XmpMetadata class. Provides access to XMP metadata stream in C++.'
type: docs
weight: 200
url: /cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Provides access to [XMP](../) metadata stream.

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<Aspose::Page::EPS::XMP::XmpValue>>
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Adds value to metadata. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Adds value to metadata. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Adds pair with key and value into the dictionary. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Adds value into an array. The value will be added at the end of the array. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Adds value into an array by specified index. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Adds named value into a structure. |
| [Clear](./clear/)() override | Clears metadata. |
| [Contains](./contains/)(const System::String\&) const | Checks does key is contained in metadata. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Checks does specified key-value pair is contained in the dictionary. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Determines does this dictionary contasins specified key. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Copies elements of the collection into array. |
| [get_Count](./get_count/)() const override | Gets count of elements in the collection. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Checks if colleciton has fixed size. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Checks if collection is read-only. |
| [get_IsSynchronized](./get_issynchronized/)() | Checks if collection is synchronized. |
| [get_Keys](./get_keys/)() const override | Gets collection of metadata keys. |
| [get_NamespaceManager](./get_namespacemanager/)() | Gets namespace manager. |
| [get_SyncRoot](./get_syncroot/)() const | Gets collection synchronization object. |
| [get_Values](./get_values/)() const override | Gets values in the metadata. |
| [GetEnumerator](./getenumerator/)() override | Returns dictionary enumerator. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Returns namespace URI by prefix. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Returns prefix by namespace URI. |
| [idx_get](./idx_get/)(const System::String\&) const override | Gets data from metadata. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Sets data from metadata. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Registers namespace URI. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Registers namespace URI. |
| [Remove](./remove/)(const System::String\&) override | Removes entry from metadata. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Removes key/value pair from the colleciton. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Sets value in an array. Previous value will be replaced with new one. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Sets named value into a structure. Previous named value, if already exists, will be replaced with new one. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Tries to find key in the dictionary and retreives value if found. |
## See Also

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
