---
title: "Aspose::Page::EPS::XMP::XmpMetadata::TryGetValue 方法"
linktitle: "TryGetValue"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata::TryGetValue 方法。 在 C++ 中尝试在字典中查找键并在找到时检索其值。"
type: docs
weight: 2500
url: /zh/cpp/aspose.page.eps.xmp/xmpmetadata/trygetvalue/
---
## XmpMetadata::TryGetValue method


尝试在字典中查找键，如果找到则检索其值。

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::TryGetValue(const System::String &key, System::SharedPtr<XmpValue> &value) const override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 键 | const System::String\& | 在字典中搜索的键。 |
| value | System::SharedPtr\<XmpValue\>\& | 检索的值。 |

### ReturnValue

如果找到键则返回 true。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
