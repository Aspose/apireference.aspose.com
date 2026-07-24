---
title: "System::Xml::XmlResolver::GetEntity メソッド"
linktitle: "GetEntity"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlResolver::GetEntity メソッド。派生クラスでオーバーライドされた場合、URI を実際のリソースを含むオブジェクトにマッピングします（C++）。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


派生クラスでオーバーライドされた場合、URI を実際のリソースを含むオブジェクトにマップします。

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) 呼び出しから返される URI です。 |
| role | String | 現在は使用されていません。 |
| ofObjectToReturn | const TypeInfo\& | 返すオブジェクトの型です。現在のバージョンでは Stream オブジェクトのみが返されます。 |

### ReturnValue

ストリームオブジェクト、またはストリーム以外の型が指定された場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
