---
title: "System::Xml::XmlValidatingReader::LookupNamespace メソッド"
linktitle: "LookupNamespace"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlValidatingReader::LookupNamespace メソッド。C++ で現在の要素のスコープ内の名前空間プレフィックスを解決します。"
type: docs
weight: 3400
url: /ja/cpp/system.xml/xmlvalidatingreader/lookupnamespace/
---
## XmlValidatingReader::LookupNamespace method


現在の要素のスコープ内で名前空間プレフィックスを解決します。

```cpp
String System::Xml::XmlValidatingReader::LookupNamespace(const String &prefix) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | const String\& | 解決したい名前空間の Uniform Resource Identifier (URI) を持つプレフィックスです。デフォルト名前空間に一致させるには、空文字列を渡します。 |

### ReturnValue

プレフィックスがマップされる名前空間 URI、または一致するプレフィックスが見つからない場合は **nullptr** です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
