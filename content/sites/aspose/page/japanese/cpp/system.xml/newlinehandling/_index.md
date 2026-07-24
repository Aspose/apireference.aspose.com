---
title: "System::Xml::NewLineHandling 列挙体"
linktitle: "NewLineHandling"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::NewLineHandling 列挙体。C++ における改行の処理方法を指定します。"
type: docs
weight: 5200
url: /ja/cpp/system.xml/newlinehandling/
---
## NewLineHandling enum


改行の処理方法を指定します。

```cpp
enum class NewLineHandling
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Replace | 0 | 改行文字は、[XmlWriterSettings::set_NewLineChars](../xmlwritersettings/set_newlinechars/) の値で指定された文字に置き換えられます。 |
| Entitize | 1 | 改行文字はエンティティ化されます。この設定は、正規化する[XmlReader](../xmlreader/)で出力が読み取られる際にすべての文字を保持します。 |
| None | 2 | 改行文字は変更されません。出力は入力と同じです。 |

## 参照

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
