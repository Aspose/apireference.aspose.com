---
title: "System::Xml::XPath::XPathItem クラス"
linktitle: "XPathItem"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathItem クラス。C++ における XQuery 1.0 と XPath 2.0 データモデルの項目を表します。"
type: docs
weight: 400
url: /ja/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


XQuery 1.0 と [XPath](../) 2.0 [Data](../../system.data/) モデルの項目を表します。

```cpp
class XPathItem : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | 派生クラスでオーバーライドされた場合、項目が [XPath](../) ノードかアトミック値かを示す値を取得します。 |
| virtual [get_TypedValue](./get_typedvalue/)() | 派生クラスでオーバーライドされた場合、スキーマ型に従って最も適切な型のボックス化されたオブジェクトとして現在の項目を取得します。 |
| virtual [get_Value](./get_value/)() | 派生クラスでオーバーライドされた場合、項目の **string** 値を取得します。 |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | 派生クラスでオーバーライドされた場合、項目の値を [Boolean](../../system/boolean/) として取得します。 |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | 派生クラスでオーバーライドされた場合、項目の値を [DateTime](../../system/datetime/) として取得します。 |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | 派生クラスでオーバーライドされた場合、項目の値を [Double](../../system/double/) として取得します。 |
| virtual [get_ValueAsInt](./get_valueasint/)() | 派生クラスでオーバーライドされた場合、項目の値を [Int32](../../system/int32/) として取得します。 |
| virtual [get_ValueAsLong](./get_valueaslong/)() | 派生クラスでオーバーライドされた場合、項目の値を [Int64](../../system/int64/) として取得します。 |
| virtual [get_ValueType](./get_valuetype/)() | 派生クラスでオーバーライドされた場合、項目の型を取得します。 |
| virtual [get_XmlType](./get_xmltype/)() | 派生クラスでオーバーライドされた場合、項目の XmlSchemaType を取得します。 |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | 項目の値を指定された型として返します。 |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 派生クラスでオーバーライドされた場合、名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用して、指定された型として項目の値を返します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
