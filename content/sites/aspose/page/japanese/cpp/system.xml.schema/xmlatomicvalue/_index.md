---
title: "System::Xml::Schema::XmlAtomicValue クラス"
linktitle: "XmlAtomicValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlAtomicValue クラス。検証された XML 要素または属性の型付けされた値を表します。XmlAtomicValue クラスは C++ では継承できません。"
type: docs
weight: 300
url: /ja/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


検証された XML 要素または属性の型付けされた値を表します。[XmlAtomicValue](./) クラスは継承できません。

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | この [XmlAtomicValue](./) オブジェクトのコピーを返します。 |
| [get_IsNode](./get_isnode/)() override | 検証された XML 要素または属性が [XPath](../../system.xml.xpath/) ノードか原子値かを示す値を返します。 |
| [get_TypedValue](./get_typedvalue/)() override | 検証された現在の XML 要素または属性を、そのスキーマ型に応じた最も適切な型のボックス化オブジェクトとして返します。 |
| [get_Value](./get_value/)() override | 検証された XML 要素または属性の [String](../../system/string/) 値を返します。 |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | 検証された XML 要素または属性の値を [Boolean](../../system/boolean/) として返します。 |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | 検証された XML 要素または属性の値を [DateTime](../../system/datetime/) として返します。 |
| [get_ValueAsDouble](./get_valueasdouble/)() override | 検証された XML 要素または属性の値を [Double](../../system/double/) として返します。 |
| [get_ValueAsInt](./get_valueasint/)() override | 検証された XML 要素または属性の値を [Int32](../../system/int32/) として返します。 |
| [get_ValueAsLong](./get_valueaslong/)() override | 検証された XML 要素または属性の値を [Int64](../../system/int64/) として返します。 |
| [get_ValueType](./get_valuetype/)() override | 検証された XML 要素または属性の型を返します。 |
| [get_XmlType](./get_xmltype/)() override | 検証された XML 要素または属性の [XmlSchemaType](../xmlschematype/) を返します。 |
| [ToString](./tostring/)() const override | 検証された XML 要素または属性の [String](../../system/string/) 値を返します。 |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | 検証された XML 要素または属性の値を、名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用して指定された型として返します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
