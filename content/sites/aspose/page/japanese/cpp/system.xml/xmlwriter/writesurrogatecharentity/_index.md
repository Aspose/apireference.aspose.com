---
title: "System::Xml::XmlWriter::WriteSurrogateCharEntity method"
linktitle: "WriteSurrogateCharEntity"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriter::WriteSurrogateCharEntity method. 派生クラスでオーバーライドされた場合、C++ でサロゲート文字ペアのサロゲート文字エンティティを生成して書き込みます。"
type: docs
weight: 3400
url: /ja/cpp/system.xml/xmlwriter/writesurrogatecharentity/
---
## XmlWriter::WriteSurrogateCharEntity method


派生クラスでオーバーライドされた場合、サロゲート文字ペアのサロゲート文字エンティティを生成して書き込みます。

```cpp
virtual void System::Xml::XmlWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| lowChar | char16_t | 低位サロゲートです。これは 0xDC00 から 0xDFFF の間の値でなければなりません。 |
| highChar | char16_t | 高位サロゲートです。これは 0xD800 から 0xDBFF の間の値でなければなりません。 |

## 参照

* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
