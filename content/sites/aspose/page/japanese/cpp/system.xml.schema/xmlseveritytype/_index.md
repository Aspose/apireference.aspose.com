---
title: "System::Xml::Schema::XmlSeverityType 列挙型"
linktitle: "XmlSeverityType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSeverityType 列挙型。C++ における検証イベントの重大度を表します。"
type: docs
weight: 8100
url: /ja/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


検証イベントの重大度を表します。

```cpp
enum class XmlSeverityType
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Error | 0 | インスタンス文書の検証中に検証エラーが発生したことを示します。これは文書型定義 (DTD) および XML [Schema](../) 定義言語 (XSD) スキーマに適用されます。World Wide [Web](../../system.web/) Consortium (W3C) の有効性制約はエラーとみなされます。検証イベントハンドラが作成されていない場合、エラーは例外をスローします。 |
| Warning | 1 | エラーではない検証イベントが発生したことを示します。DTD が存在しない場合や、特定の要素や属性を検証する XML [Schema](../) がない場合に、警告が通常発行されます。エラーとは異なり、警告は検証イベントハンドラがない場合でも例外をスローしません。 |

## 参照

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
