---
title: "System::ComponentModel::EnumConverter クラス"
linktitle: "EnumConverter"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::EnumConverter クラス。EnumConverter を使用した翻訳コードがコンパイルできるようにするダミークラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡してください。"
type: docs
weight: 700
url: /ja/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


EnumConverter を使用した翻訳コードがコンパイルできるようにするダミークラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | 型が変換可能かどうかをチェックします；未実装です。 |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | 型が変換可能かどうかをチェックします；未実装です。 |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | 実際の型変換を行います；未実装です。 |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | 実際の型変換を行います；未実装です。 |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | RTTI 情報。 |
| [get_EnumType](./get_enumtype/)() | 使用している enum 型 [EnumConverter](./) を取得します; 未実装。 |
## 参照

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
