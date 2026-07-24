---
title: "System::Xml::XmlWriter::LookupPrefix メソッド"
linktitle: "LookupPrefix"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriter::LookupPrefix メソッド。派生クラスでオーバーライドされた場合、現在の名前空間スコープで定義された、指定された名前空間 URI に最も近いプレフィックスを C++ で返します。"
type: docs
weight: 800
url: /ja/cpp/system.xml/xmlwriter/lookupprefix/
---
## XmlWriter::LookupPrefix method


派生クラスでオーバーライドされた場合、現在の名前空間スコープで名前空間 URI に対して定義された最も近いプレフィックスを返します。

```cpp
virtual String System::Xml::XmlWriter::LookupPrefix(String ns)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ns | String | 探したいプレフィックスに対応する名前空間 URI。 |

### ReturnValue

一致するプレフィックス、または現在のスコープで一致する名前空間 URI が見つからない場合は **nullptr**。

## 参照

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
