---
title: "System::Drawing::Imaging::PropertyItem クラス"
linktitle: "PropertyItem"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::PropertyItem クラス。画像ファイルに含めるメタデータプロパティを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 1400
url: /ja/cpp/system.drawing.imaging/propertyitem/
---
## PropertyItem class


画像ファイルに含めるメタデータプロパティを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class PropertyItem : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Id](./get_id/)() const | 現在のオブジェクトが表すプロパティの ID を返します。 |
| [get_Len](./get_len/)() const | 現在のオブジェクトで表されるプロパティの長さをバイト単位で返します。 |
| [get_Type](./get_type/)() const | 現在のオブジェクトで表されるプロパティの型をバイト単位で返します。 |
| [get_Value](./get_value/)() const | 現在のオブジェクトで表されるプロパティの値をバイト単位で返します。 |
| [PropertyItem](./propertyitem/)() | [PropertyItem](./) クラスの新しいインスタンスを構築します。 |
| [set_Id](./set_id/)(int32_t) | 現在のオブジェクトで表されるプロパティの ID を設定します。 |
| [set_Len](./set_len/)(int32_t) | 現在のオブジェクトで表されるプロパティの長さをバイト単位で設定します。 |
| [set_Type](./set_type/)(int16_t) | 現在のオブジェクトで表されるプロパティの型をバイト単位で設定します。 |
| [set_Value](./set_value/)(const System::ArrayPtr\<uint8_t\>\&) | 現在のオブジェクトで表されるプロパティの型をバイト単位で設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
