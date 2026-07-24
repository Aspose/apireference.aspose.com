---
title: "System::Xml::XmlSecureResolver::ResolveUri メソッド"
linktitle: "ResolveUri"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlSecureResolver::ResolveUri メソッド。C++ で基底 URI と相対 URI から、基礎となる XmlResolver の ResolveUri を呼び出して絶対 URI を解決します。"
type: docs
weight: 300
url: /ja/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


基底と相対 URI から、基礎となる [XmlResolver](../../xmlresolver/) の **ResolveUri** を呼び出して絶対 URI を解決します。

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | 相対 URI を解決するために使用されるベース URI。 |
| relativeUri | String | 解決する URI。URI は絶対または相対のいずれかです。絶対の場合、この値は実質的に **baseUri** の値を置き換えます。相対の場合、**baseUri** と組み合わせて絶対 URI を作成します。 |

### ReturnValue

相対 URI を解決できない場合は **nullptr**、それ以外の場合は絶対 URI が返されます（基礎となる [XmlResolver](../../xmlresolver/) の **ResolveUri** を呼び出して取得）。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
