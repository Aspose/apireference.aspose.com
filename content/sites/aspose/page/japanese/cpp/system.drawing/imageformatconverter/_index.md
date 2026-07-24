---
title: "System::Drawing::ImageFormatConverter クラス"
linktitle: "ImageFormatConverter"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::ImageFormatConverter クラス。ImageFormat オブジェクトをあるデータ型から別のデータ型へ変換します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 1400
url: /ja/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


ImageFormat オブジェクトをあるデータ型から別のデータ型へ変換します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | オブジェクトを変換します。 |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | オブジェクトを変換します。 |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | オブジェクトを変換します。 |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | 文字列をオブジェクトに変換します。 |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | オブジェクトを特定の型に変換します。 |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | オブジェクトを特定の型に変換します。 |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | オブジェクトを特定の型に変換します。 |
| [ImageFormatConverter](./imageformatconverter/)() | 新しい [ImageFormatConverter](./) のインスタンスを構築します。 |
## 参照

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
