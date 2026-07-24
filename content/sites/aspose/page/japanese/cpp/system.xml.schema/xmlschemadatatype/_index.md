---
title: "System::Xml::Schema::XmlSchemaDatatype クラス"
linktitle: "XmlSchemaDatatype"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaDatatype クラス。XmlSchemaDatatype クラスは、XML Schema 定義言語 (XSD) の型を C++ の実行時型にマッピングするための抽象クラスです。"
type: docs
weight: 2400
url: /ja/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


[XmlSchemaDatatype](./) クラスは、XML [Schema](../) 定義言語 (XSD) の型を実行時型にマッピングする抽象クラスです。

```cpp
class XmlSchemaDatatype : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | 指定された値（その型は [XmlSchemaDatatype](./) が表す XML スキーマ型の有効な表現のいずれか）を、指定された実行時型に変換します。 |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 指定された値（その型は [XmlSchemaDatatype](./) が表す XML スキーマ型の有効な表現のいずれか）を、[IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) を使用して指定された実行時型に変換します。ただし、[XmlSchemaDatatype](./) が **xs:QName** 型またはそれから派生した型を表す場合です。 |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | 派生クラスでオーバーライドされた場合、World Wide [Web](../../system.web/) Consortium (W3C) XML 1.0 仕様で指定された **string** の型を取得します。 |
| virtual [get_TypeCode](./get_typecode/)() | 単純型の [XmlTypeCode](../xmltypecode/) 値を返します。 |
| virtual [get_ValueType](./get_valuetype/)() | 派生クラスでオーバーライドされた場合、項目の型を取得します。 |
| virtual [get_Variety](./get_variety/)() | 単純型の [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) 値を返します。 |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | このメソッドは常に **false** を返します。 |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | 派生クラスでオーバーライドされた場合、指定された **string** を組み込みまたはユーザー定義の単純型に対して検証します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
