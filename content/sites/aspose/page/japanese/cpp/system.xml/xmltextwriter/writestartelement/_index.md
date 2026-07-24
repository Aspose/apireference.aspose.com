---
title: "System::Xml::XmlTextWriter::WriteStartElement メソッド"
linktitle: "WriteStartElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextWriter::WriteStartElement メソッド。 指定された開始タグを書き込み、C++ で指定された名前空間とプレフィックスに関連付けます。"
type: docs
weight: 3800
url: /ja/cpp/system.xml/xmltextwriter/writestartelement/
---
## XmlTextWriter::WriteStartElement method


指定された開始タグを書き出し、指定された名前空間とプレフィックスに関連付けます。

```cpp
void System::Xml::XmlTextWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | const String\& | 要素の名前空間プレフィックスです。 |
| localName | const String\& | 要素のローカル名です。 |
| ns | const String\& | 要素に関連付ける名前空間 URI です。この名前空間がすでにスコープ内にあり、関連付けられたプレフィックスがある場合、ライターは自動的にそのプレフィックスも書き込みます。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
