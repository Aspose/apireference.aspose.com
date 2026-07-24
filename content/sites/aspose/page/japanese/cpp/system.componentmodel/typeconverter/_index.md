---
title: "System::ComponentModel::TypeConverter クラス"
linktitle: "TypeConverter"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::TypeConverter クラス。コンポーネントモデルで型変換を処理するクラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 1400
url: /ja/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


コンポーネントモデルで型変換を処理するクラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class TypeConverter : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | オブジェクトを変換します。 |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | オブジェクトを変換します。 |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | 文字列をオブジェクトに変換します。 |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | 不変文字列をオブジェクトに変換します。 |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | 不変文字列をオブジェクトに変換します。 |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | 文字列をオブジェクトに変換します。 |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | 文字列をオブジェクトに変換します。 |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | 文字列をオブジェクトに変換します。 |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | オブジェクトを特定の型に変換します。 |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | オブジェクトを特定の型に変換します。 |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | オブジェクトを不変文字列に変換します。 |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | オブジェクトを不変文字列に変換します。 |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | オブジェクトを文字列に変換します。 |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | オブジェクトを文字列に変換します。 |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | オブジェクトを文字列に変換します。 |
| [TypeConverter](./typeconverter/)() | RTTI 情報。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
