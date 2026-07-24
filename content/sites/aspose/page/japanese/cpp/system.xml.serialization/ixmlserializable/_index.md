---
title: "System::Xml::Serialization::IXmlSerializable クラス"
linktitle: "IXmlSerializable"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Serialization::IXmlSerializable クラス。XML のシリアライズおよびデシリアライズのためのカスタムフォーマットを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


XML のシリアライズおよびデシリアライズのためのカスタムフォーマットを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class IXmlSerializable : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [GetSchema](./getschema/)() | [WriteXml()](./writexml/) メソッドが返し、[ReadXml()](./readxml/) メソッドが受け取るオブジェクトの XML 表現を記述する XmlSchema オブジェクトです。 |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | オブジェクトをその XML 表現からデシリアライズします。 |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | 現在のオブジェクトを XML 表現にシリアライズします。 |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
