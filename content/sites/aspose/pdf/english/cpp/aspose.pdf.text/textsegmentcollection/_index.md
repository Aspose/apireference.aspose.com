---
title: Aspose::Pdf::Text::TextSegmentCollection class
linktitle: TextSegmentCollection
second_title: Aspose.PDF for C++ API Reference
description: 'Aspose::Pdf::Text::TextSegmentCollection class. Represents a text segments collection in C++.'
type: docs
weight: 5200
url: /cpp/aspose.pdf.text/textsegmentcollection/
---
## TextSegmentCollection class


Represents a text segments collection.

```cpp
class TextSegmentCollection : public System::Collections::Generic::ICollection<System::SharedPtr<TextSegment>>
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<TextSegment\>\&) override | Adds the text segment element at the specified index. |
| [Clear](./clear/)() override | Clears all items from the collection. |
| [Contains](./contains/)(const System::SharedPtr\<TextSegment\>\&) const override | Determines whether the collection contains a specific value. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<TextSegment\>\>, int32_t) override | Copies the entire collection to a compatible one-dimensional Array, starting at the specified index of the target array. |
| [get_Count](./get_count/)() const override | Gets the number of [TextSegment](../textsegment/) object elements actually contained in the collection. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Gets a value indicating whether collection is read-only. |
| [get_IsSynchronized](./get_issynchronized/)() | Gets a value indicating whether access to the collection is synchronized (thread safe). |
| [get_SyncRoot](./get_syncroot/)() const | Gets an object that can be used to synchronize access to the collection. |
| [GetEnumerator](./getenumerator/)() override | Returns an enumerator for the entire collection. |
| [idx_get](./idx_get/)(int32_t) | Gets the text segment element at the specified index. |
| [Remove](./remove/)(const System::SharedPtr\<TextSegment\>\&) override | Deletes specified item from collection. |
## See Also

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [Aspose::Pdf::Text](../)
* Library [Aspose.PDF for C++](../../)
