---
title: "System::Xml::Serialization::XmlSerializerNamespaces クラス"
linktitle: "XmlSerializerNamespaces"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Serialization::XmlSerializerNamespaces クラス。C++ の XML ドキュメント インスタンスで、Serialization::XmlSerializer が修飾名を生成するために使用する XML 名前空間とプレフィックスを含みます。"
type: docs
weight: 800
url: /ja/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


XML ドキュメント インスタンスで、[Serialization::XmlSerializer](../xmlserializer/) が修飾名を生成するために使用する XML 名前空間とプレフィックスを含みます。

```cpp
class XmlSerializerNamespaces : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | [Serialization::XmlSerializerNamespaces](./) オブジェクトにプレフィックスと名前空間のペアを追加します。 |
| [get_Count](./get_count/)() | コレクション内のプレフィックスと名前空間のペアの数を返します。 |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | [Serialization::XmlSerializerNamespaces](./) オブジェクト内のプレフィックスと名前空間のペアの配列を返します。 |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | [Serialization::XmlSerializerNamespaces](./) クラスの新しいインスタンスを初期化します。 |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | プレフィックスと名前空間のペアのコレクションを含む指定された **[XmlSerializerNamespaces](./)** インスタンスを使用して、[Serialization::XmlSerializerNamespaces](./) クラスの新しいインスタンスを初期化します。 |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | [Serialization::XmlSerializerNamespaces](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
