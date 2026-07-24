---
title: "Aspose::Page::EPS::XMP::XmpMetadata::Contains 方法"
linktitle: "Contains"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata::Contains 方法。 在 C++ 中检查指定的键值对是否包含在字典中。"
type: docs
weight: 500
url: /zh/cpp/aspose.page.eps.xmp/xmpmetadata/contains/
---
## XmpMetadata::Contains(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const method


检查指定的键值对是否包含在字典中。

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Contains(const System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<XmpValue>> &item) const override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| item | const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\& | 键值对。 |

### ReturnValue

如果找到此对则返回 true。

## 另见

* Class [KeyValuePair](../../../system.collections.generic/keyvaluepair/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
## XmpMetadata::Contains(const System::String\&) const method


检查键是否包含在元数据中。

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Contains(const System::String &key) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 键 | const System::String\& | 要查找的条目的键。 |

### ReturnValue

如果元数据中包含该键则返回 True。

## 另见

* Class [String](../../../system/string/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
