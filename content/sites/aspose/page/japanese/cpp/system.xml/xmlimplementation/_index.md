---
title: "System::Xml::XmlImplementation クラス"
linktitle: "XmlImplementation"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlImplementation クラス。C++ における XmlDocument オブジェクトの集合のコンテキストを定義します。"
type: docs
weight: 2000
url: /ja/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


[XmlDocument](../xmldocument/) オブジェクトの集合のコンテキストを定義します。

```cpp
class XmlImplementation : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | 新しい[XmlDocument](../xmldocument/)を作成します。 |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | ドキュメント [Object](../../system/object/) モデル (DOM) 実装が特定の機能を実装しているかテストします。 |
| [XmlImplementation](./xmlimplementation/)() | [XmlImplementation](./) クラスの新しいインスタンスを初期化します。 |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | 指定された[XmlNameTable](../xmlnametable/)を使用して、[XmlImplementation](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
