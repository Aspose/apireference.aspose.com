---
title: "System::Drawing::ImageConverter クラス"
linktitle: "ImageConverter"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::ImageConverter クラス。Image オブジェクトをあるデータ型から別のデータ型へ変換します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 1300
url: /ja/cpp/system.drawing/imageconverter/
---
## ImageConverter class


[Image](../image/) オブジェクトをあるデータ型から別のデータ型へ変換します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class ImageConverter : public System::ComponentModel::TypeConverter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | オブジェクトを特定の型に変換します。 |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | オブジェクトを特定の型に変換します。 |
| [ImageConverter](./imageconverter/)() | [ImageConverter](./) の新しいインスタンスを構築します。 |
## 参照

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
