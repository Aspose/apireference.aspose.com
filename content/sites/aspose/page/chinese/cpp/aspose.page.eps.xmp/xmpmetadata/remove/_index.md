---
title: "Aspose::Page::EPS::XMP::XmpMetadata::Remove 方法"
linktitle: "Remove"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata::Remove 方法。从 C++ 中的集合中移除键/值对。"
type: docs
weight: 2200
url: /zh/cpp/aspose.page.eps.xmp/xmpmetadata/remove/
---
## XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) method


从集合中移除键/值对。

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<XmpValue>> &item) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| item | const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\& | 要移除的键/值对。 |

### ReturnValue

如果找到并移除该对则返回 true。

## 另见

* Class [KeyValuePair](../../../system.collections.generic/keyvaluepair/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
## XmpMetadata::Remove(const System::String\&) method


从元数据中移除条目。

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::String &key) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 键 | const System::String\& | 要移除的条目的键。 |

### ReturnValue

如果键已移除则为 True；否则为 false。

## 另见

* Class [String](../../../system/string/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
