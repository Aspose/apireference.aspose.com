---
title: "System::Xml::XmlResolver::ResolveUri メソッド"
linktitle: "ResolveUri"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlResolver::ResolveUri メソッド。派生クラスでオーバーライドされた場合、C++ でベース URI と相対 URI から絶対 URI を解決します。"
type: docs
weight: 200
url: /ja/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


派生クラスでオーバーライドされた場合、基底 URI と相対 URI から絶対 URI を解決します。

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | 相対 URI を解決するために使用されるベース URI。 |
| relativeUri | String | 解決する URI。URI は絶対または相対のいずれかです。絶対の場合、この値は実質的に **baseUri** の値を置き換えます。相対の場合、**baseUri** と組み合わせて絶対 URI を作成します。 |

### ReturnValue

相対 URI を解決できない場合は **nullptr** になる絶対 URIです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
