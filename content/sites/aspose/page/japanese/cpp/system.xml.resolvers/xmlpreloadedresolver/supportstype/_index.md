---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType メソッド"
linktitle: "SupportsType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType メソッド。C++ で、リゾルバーが Stream 以外の他の **Type** をサポートしているかどうかを判断します。"
type: docs
weight: 800
url: /ja/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


このリゾルバがストリーム以外の他の型をサポートしているかどうかを判定します。

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | チェックする絶対 URI。 |
| 型 | const TypeInfo\& | 返す **Type**。 |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
