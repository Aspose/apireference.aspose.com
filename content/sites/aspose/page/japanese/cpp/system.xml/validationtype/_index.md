---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::ValidationType enum。C++ で実行する検証のタイプを指定します。"
type: docs
weight: 5500
url: /ja/cpp/system.xml/validationtype/
---
## ValidationType enum


実行する検証の種類を指定します。

```cpp
enum class ValidationType
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | 検証は行われず、検証エラーもスローされません。この設定は XML 1.0 に準拠した非検証パーサーを作成します。 |
| 自動 | 1 | DTD またはスキーマ情報が見つかった場合に検証します。 |
| DTD | 2 | DTD に従って検証します。 |
| XDR | 3 | XML-Data Reduced (XDR) スキーマ、インライン XDR スキーマを含めて検証します。XDR スキーマは **x-schema** 名前空間プレフィックスまたは [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/) の値で認識されます。 |
| Schema | 4 | XML [Schema](../../system.xml.schema/) 定義言語 (XSD) スキーマ、インライン XML スキーマを含めて検証します。XML スキーマは **schemaLocation** 属性または提供された **Schemas** を使用して名前空間 URI に関連付けられます。 |

## 参照

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
