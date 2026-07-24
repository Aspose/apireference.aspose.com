---
title: "System::Xml::XmlUrlResolver::GetEntity メソッド"
linktitle: "GetEntity"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlUrlResolver::GetEntity メソッド。C++ で URI を実際のリソースを含むオブジェクトにマップします。"
type: docs
weight: 200
url: /ja/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


URI を実際のリソースを含むオブジェクトにマッピングします。

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/) 呼び出しから返される URI。 |
| role | String | 現在は使用されていません。 |
| ofObjectToReturn | const TypeInfo\& | 返すオブジェクトの型。現在の実装では Stream オブジェクトのみが返されます。 |

### ReturnValue

ストリームオブジェクト、またはストリーム以外の型が指定された場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
