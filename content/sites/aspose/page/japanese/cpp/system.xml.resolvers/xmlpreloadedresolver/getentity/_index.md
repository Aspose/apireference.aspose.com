---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity メソッド"
linktitle: "GetEntity"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity メソッド。C++ で、URI を実際のリソースを含むオブジェクトにマッピングします。"
type: docs
weight: 400
url: /ja/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


URI を実際のリソースを含むオブジェクトにマッピングします。

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/) 呼び出しから返された URI。 |
| role | String | 現在は使用されていません。 |
| ofObjectToReturn | const TypeInfo\& | 返すオブジェクトの型。[XmlPreloadedResolver](../) は、[String](../../../system/string/) として追加された URI に対して Stream オブジェクトと TextReader オブジェクトをサポートします。要求された型がリゾルバーでサポートされていない場合、例外がスローされます。XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) メソッドを使用して、このリゾルバーが特定の **Type** をサポートしているかどうかを判断してください。 |

### ReturnValue

実際のソースに対応する Stream または TextReader オブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
