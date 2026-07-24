---
title: "System::Xml::Schema::XmlSchemaValidationFlags 列挙型"
linktitle: "XmlSchemaValidationFlags"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidationFlags 列挙型。C++ の XmlSchemaValidator と XmlReader クラスで使用されるスキーマ検証オプションを指定します。"
type: docs
weight: 7900
url: /ja/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


[XmlSchemaValidator](../xmlschemavalidator/) と [XmlReader](../../system.xml/xmlreader/) クラスで使用されるスキーマ検証オプションを指定します。

```cpp
enum class XmlSchemaValidationFlags
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | 同一性制約、インラインスキーマ、スキーマ位置ヒントを処理せず、スキーマ検証警告も報告しません。 |
| ProcessInlineSchema | 1 | 検証中に検出されたインラインスキーマを処理します。 |
| ProcessSchemaLocation | 2 | 検証中に検出されたスキーマ位置ヒント（**xsi:schemaLocation**、**xsi:noNamespaceSchemaLocation**）を処理します。 |
| ReportValidationWarnings | 4 | 検証中に検出されたスキーマ検証警告を報告します。 |
| ProcessIdentityConstraints | 8 | 検証中に検出された同一性制約（**xs:ID**、**xs:IDREF**、**xs:key**、**xs:keyref**、**xs:unique**）を処理します。 |
| AllowXmlAttributes | 16 | スキーマで定義されていなくても xml:* 属性を許可します。属性はデータ型に基づいて検証されます。 |

## 参照

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
