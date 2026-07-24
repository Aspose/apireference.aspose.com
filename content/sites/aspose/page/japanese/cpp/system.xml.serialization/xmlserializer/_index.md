---
title: "System::Xml::Serialization::XmlSerializer クラス"
linktitle: "XmlSerializer"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Serialization::XmlSerializer クラス。オブジェクトを XML ドキュメントへ、または XML ドキュメントからシリアライズおよびデシリアライズします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 600
url: /ja/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


オブジェクトを XML ドキュメントへ、または XML ドキュメントからシリアライズおよびデシリアライズします。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class XmlSerializer : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | 特定のリーダーがデシリアライズ可能な状態かどうかをチェックします。 |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | XML ドキュメントをオブジェクトにデシリアライズします。 |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | XML ドキュメントをオブジェクトにデシリアライズします。 |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | XML ドキュメントをオブジェクトにデシリアライズします。 |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | XML ドキュメントをオブジェクトにデシリアライズします。 |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | ドキュメントを XML にシリアライズします。 |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | ドキュメントを XML にシリアライズします。 |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | ドキュメントを XML にシリアライズします。 |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | ドキュメントを XML にシリアライズします。 |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | ドキュメントを XML にシリアライズします。 |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | ドキュメントを XML にシリアライズします。 |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | ドキュメントを XML にシリアライズします。 |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | ドキュメントを XML にシリアライズします。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | 名前空間名をエンコードします。 |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI。 |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | WSDL タイプの名前空間名です。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
