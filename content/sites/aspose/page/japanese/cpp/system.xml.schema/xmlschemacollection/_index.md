---
title: "System::Xml::Schema::XmlSchemaCollection クラス"
linktitle: "XmlSchemaCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollection クラス。C++ における XML Schema 定義言語 (XSD) と XML-Data Reduced (XDR) スキーマのキャッシュを保持します。"
type: docs
weight: 1500
url: /ja/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


XML [Schema](../) 定義言語 (XSD) と XML-Data Reduced (XDR) スキーマのキャッシュを保持します。

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | 指定された URL で位置付けられたスキーマをスキーマコレクションに追加します。 |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/) に含まれるスキーマをスキーマコレクションに追加します。 |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) に含まれるスキーマをスキーマコレクションに追加します。指定された [XmlResolver](../../system.xml/xmlresolver/) が外部リソースの解決に使用されます。 |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | [XmlSchema](../xmlschema/) をコレクションに追加します。 |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlSchema](../xmlschema/) をコレクションに追加します。指定された [XmlResolver](../../system.xml/xmlresolver/) が外部参照の解決に使用されます。 |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | 指定されたコレクションで定義されたすべての名前空間（関連付けられたスキーマを含む）をこのコレクションに追加します。 |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | 指定された [XmlSchema](../xmlschema/) の **targetNamespace** がコレクションに含まれているかどうかを示す値を返します。 |
| [Contains](./contains/)(const String\&) | 指定された名前空間を持つスキーマがコレクションに存在するかどうかを示す値を返します。 |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | このコレクションからすべての [XmlSchema](../xmlschema/) オブジェクトを、指定されたインデックスから開始して指定された配列にコピーします。 |
| [get_Count](./get_count/)() | このコレクションで定義された名前空間の数を返します。 |
| [get_NameTable](./get_nametable/)() | 新しいスキーマを読み込む際に [XmlSchemaCollection](./) が使用するデフォルトの [XmlNameTable](../../system.xml/xmlnametable/) を返します。 |
| [GetEnumerator](./getenumerator/)() override | スキーマコレクションの反復処理をサポートします。 |
| [idx_get](./idx_get/)(const String\&) | 指定された名前空間 URI に関連付けられた [XmlSchema](../xmlschema/) を返します。 |
| [XmlSchemaCollection](./xmlschemacollection/)() | [XmlSchemaCollection](./) クラスの新しいインスタンスを初期化します。 |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | 指定された [XmlNameTable](../../system.xml/xmlnametable/) を使用して [XmlSchemaCollection](./) クラスの新しいインスタンスを初期化します。[XmlNameTable](../../system.xml/xmlnametable/) はスキーマの読み込み時に使用されます。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考


## Deprecated
XmlSchemaCollection クラスは廃止予定です。代わりに XmlSchemaSet を使用してください。

このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
