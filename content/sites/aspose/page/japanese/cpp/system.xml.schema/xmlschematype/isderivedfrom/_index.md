---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom メソッド"
linktitle: "IsDerivedFrom"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom メソッド。指定された派生スキーマ型が、C++ で指定された基底スキーマ型から派生しているかどうかを示す値を返します。"
type: docs
weight: 1700
url: /ja/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


指定された派生スキーマ型が指定された基底スキーマ型から派生しているかどうかを示す値を返します。

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | テスト対象の派生 [XmlSchemaType](../) 。 |
| baseType | const SharedPtr\<XmlSchemaType\>\& | 派生 [XmlSchemaType](../) をテストするための基底 [XmlSchemaType](../) 。 |
| except | XmlSchemaDerivationMethod | テストから除外する型派生方法を表す [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) 値のいずれかです。 |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
