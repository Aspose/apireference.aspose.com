---
title: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity メソッド"
linktitle: "WriteSurrogateCharEntity"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity メソッド。サロゲート文字ペアのサロゲート文字エンティティを生成し、C++ で書き出します。"
type: docs
weight: 4000
url: /ja/cpp/system.xml/xmltextwriter/writesurrogatecharentity/
---
## XmlTextWriter::WriteSurrogateCharEntity method


サロゲート文字ペアのサロゲート文字エンティティを生成して書き出します。

```cpp
void System::Xml::XmlTextWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| lowChar | char16_t | 低位サロゲートです。これは **0xDC00** から **0xDFFF** の間の値でなければなりません。 |
| highChar | char16_t | 高位サロゲートです。これは **0xD800** から **0xDBFF** の間の値でなければなりません。 |

## 参照

* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
