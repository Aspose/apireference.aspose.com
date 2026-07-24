---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::ConformanceLevel enum。C++ において XmlReader と XmlWriter オブジェクトが実行する入力または出力のチェック量を指定します。"
type: docs
weight: 4600
url: /ja/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


[XmlReader](../xmlreader/) と [XmlWriter](../xmlwriter/) オブジェクトが実行する入力または出力のチェック量を指定します。

```cpp
enum class ConformanceLevel
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Auto | 0 | [XmlReader](../xmlreader/) または [XmlWriter](../xmlwriter/) オブジェクトは、ドキュメントレベルのチェックが必要かフラグメントレベルのチェックが必要かを自動的に検出し、適切なチェックを実行します。別の [XmlReader](../xmlreader/) または [XmlWriter](../xmlwriter/) オブジェクトをラップしている場合、外側のオブジェクトは追加の適合性チェックを行いません。適合性チェックは基底オブジェクトに委ねられます。 |
| Fragment | 1 | XML データは、W3C によって定義された [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) です。この適合レベルは、ルート要素が存在しない可能性があるが、その他は正しく構成された XML ドキュメントを表します。このレベルのチェックにより、読み書きされるストリームが任意のプロセッサによって [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) として消費できることが保証されます。 |
| Document | 2 | XML データは、W3C によって定義された正しい構文の [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) の規則に準拠しています。このレベルのチェックにより、読み書きされるストリームが任意のプロセッサによって [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) として消費できることが保証されます。 |

## 参照

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
