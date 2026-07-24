---
title: "System::Xml::XmlSecureResolver::GetEntity メソッド"
linktitle: "GetEntity"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlSecureResolver::GetEntity メソッド。C++ で、URI を実際のリソースを含むオブジェクトにマッピングします。"
type: docs
weight: 200
url: /ja/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


URI を実際のリソースを含むオブジェクトにマッピングします。

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) 呼び出しから返される URIです。 |
| role | String | 現在は使用されていません。 |
| ofObjectToReturn | const TypeInfo\& | 返すオブジェクトの型です。現在のバージョンでは Stream オブジェクトのみが返されます。 |

### ReturnValue

基礎となる [XmlResolver](../../xmlresolver/) で **GetEntity** を呼び出すことで返されるストリームです。Stream 以外の型が指定された場合、メソッドは **nullptr** を返します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
