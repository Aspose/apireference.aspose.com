---
title: "System::Xml::Schema::XmlSchemaContentProcessing enum"
linktitle: "XmlSchemaContentProcessing"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaContentProcessing enum. C++ における any および anyAttribute 要素の置換の検証モードに関する情報を提供します。"
type: docs
weight: 7300
url: /ja/cpp/system.xml.schema/xmlschemacontentprocessing/
---
## XmlSchemaContentProcessing enum


**any** および **anyAttribute** 要素の置換に関する検証モードの情報を提供します。

```cpp
enum class XmlSchemaContentProcessing
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | ドキュメント項目は検証されません。 |
| スキップ | 1 | ドキュメント項目は、正しく形成された XML で構成されている必要があり、スキーマによって検証されません。 |
| 緩やか | 2 | 関連付けられたスキーマが見つかった場合、ドキュメント項目は検証されます。そうでなければエラーはスローされません。 |
| 厳格 | 3 | スキーマプロセッサは、ドキュメント項目を検証するために、示された名前空間に関連付けられたスキーマを見つけなければなりません。 |

## 参照

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
