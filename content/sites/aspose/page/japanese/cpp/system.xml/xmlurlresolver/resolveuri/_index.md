---
title: "System::Xml::XmlUrlResolver::ResolveUri メソッド"
linktitle: "ResolveUri"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlUrlResolver::ResolveUri メソッド。C++ でベース URI と相対 URI から絶対 URI を解決します。"
type: docs
weight: 300
url: /ja/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


ベース URI と相対 URI から絶対 URI を解決します。

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | 相対 URI を解決するために使用されるベース URI。 |
| relativeUri | String | 解決する URI。URI は絶対または相対のいずれかです。絶対の場合、この値は実質的に **baseUri** の値を置き換えます。相対の場合、**baseUri** と組み合わせて絶対 URI を作成します。 |

### ReturnValue

絶対 URI、または相対 URI を解決できない場合は **nullptr** が返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
