---
title: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri メソッド"
linktitle: "ResolveUri"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri メソッド。C++ でベース URI と相対 URI から絶対 URI を解決します。"
type: docs
weight: 600
url: /ja/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


ベース URI と相対 URI から絶対 URI を解決します。

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | 相対 URI を解決するために使用されるベース URI。 |
| relativeUri | String | 解決する URI。URI は絶対または相対のいずれかです。絶対の場合、この値は実質的に **baseUri** の値を置き換えます。相対の場合、**baseUri** と組み合わせて絶対 URI を作成します。 |

### ReturnValue

絶対 URI を表す [Uri](../../../system/uri/)、相対 URI を解決できない場合は **nullptr** です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
