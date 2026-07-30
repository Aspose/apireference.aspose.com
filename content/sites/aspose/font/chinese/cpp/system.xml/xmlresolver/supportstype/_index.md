---
title: "System::Xml::XmlResolver::SupportsType 方法"
linktitle: "SupportsType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlResolver::SupportsType 方法。使解析器能够在 C++ 中返回除 Stream 之外的类型。"
type: docs
weight: 400
url: /zh/cpp/system.xml/xmlresolver/supportstype/
---
## XmlResolver::SupportsType method


使解析器能够返回除 Stream 之外的其他类型。

```cpp
virtual bool System::Xml::XmlResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | 该 URI。 |
| 类型 | const TypeInfo\& | 要返回的类型。 |

### ReturnValue

**true** if the **type** is supported; otherwise, **false**.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
