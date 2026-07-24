---
title: "System::Xml::XmlReader::LookupNamespace メソッド"
linktitle: "LookupNamespace"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::LookupNamespace メソッド。派生クラスでオーバーライドされた場合、C++ で現在の要素のスコープ内の名前空間プレフィックスを解決します。"
type: docs
weight: 3100
url: /ja/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


派生クラスでオーバーライドされた場合、現在の要素のスコープ内で名前空間プレフィックスを解決します。

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | const String\& | 解決したい名前空間 URI を持つプレフィックスです。デフォルト名前空間に一致させるには、空文字列を渡します。 |

### ReturnValue

プレフィックスがマップされる名前空間 URI、または一致するプレフィックスが見つからない場合は **nullptr** です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
