---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType 方法"
linktitle: "SupportsType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType 方法。确定解析器是否支持除 Stream 之外的其他类型（在 C++ 中）。"
type: docs
weight: 800
url: /zh/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


确定解析器是否支持除 Stream 之外的其他类型。

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | 要检查的绝对 URI。 |
| 类型 | const TypeInfo\& | 要返回的 Type。 |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
