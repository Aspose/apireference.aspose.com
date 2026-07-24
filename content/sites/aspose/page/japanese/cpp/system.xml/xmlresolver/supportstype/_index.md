---
title: "System::Xml::XmlResolver::SupportsType メソッド"
linktitle: "SupportsType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlResolver::SupportsType メソッド。C++ で、Resolver が Stream 以外の型を返すことを可能にします。"
type: docs
weight: 400
url: /ja/cpp/system.xml/xmlresolver/supportstype/
---
## XmlResolver::SupportsType method


リゾルバーが Stream 以外の型を返すことを可能にします。

```cpp
virtual bool System::Xml::XmlResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URIです。 |
| 型 | const TypeInfo\& | 返す型です。 |

### ReturnValue

**true** if the **type** is supported; otherwise, **false**.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
