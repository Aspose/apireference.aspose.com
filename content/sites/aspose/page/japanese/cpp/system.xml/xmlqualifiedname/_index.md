---
title: "System::Xml::XmlQualifiedName クラス"
linktitle: "XmlQualifiedName"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlQualifiedName クラス。C++でXMLの修飾名を表します。"
type: docs
weight: 3200
url: /ja/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


XML の修飾名を表します。

```cpp
class XmlQualifiedName : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 指定された[XmlQualifiedName](./)オブジェクトが現在の[XmlQualifiedName](./)オブジェクトと等しいかどうかを判断します。 |
| [get_IsEmpty](./get_isempty/)() const | [XmlQualifiedName](./)が空かどうかを示す値を返します。 |
| [get_Name](./get_name/)() const | [XmlQualifiedName](./)の修飾名の文字列表現を返します。 |
| [get_Namespace](./get_namespace/)() const | [XmlQualifiedName](./)の名前空間の文字列表現を返します。 |
| [GetHashCode](./gethashcode/)() const override | [XmlQualifiedName](./)のハッシュコードを返します。 |
| static [ToString](./tostring/)(const String\&, const String\&) | [XmlQualifiedName](./)の文字列値を返します。 |
| [ToString](./tostring/)() const override | [XmlQualifiedName](./)の文字列値を返します。 |
| [XmlQualifiedName](./xmlqualifiedname/)() | [XmlQualifiedName](./)クラスの新しいインスタンスを初期化します。 |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | 指定された名前で[XmlQualifiedName](./)クラスの新しいインスタンスを初期化します。 |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | 指定された名前と名前空間で[XmlQualifiedName](./)クラスの新しいインスタンスを初期化します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | 空の[XmlQualifiedName](./)を提供します。 |
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
