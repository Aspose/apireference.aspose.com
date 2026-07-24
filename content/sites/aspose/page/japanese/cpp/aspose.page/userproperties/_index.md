---
title: "Aspose::Page::UserProperties クラス"
linktitle: "UserProperties"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::UserProperties クラス。 型付きプロパティの設定と取得を可能にする特別なプロパティクラスです。また、このプロパティオブジェクトにプロパティが存在しない場合に検索される 2 つのデフォルトプロパティオブジェクトのフックアップも可能です（C++）。"
type: docs
weight: 1600
url: /ja/cpp/aspose.page/userproperties/
---
## UserProperties class


型付きプロパティの設定と取得を可能にする特別なプロパティクラスです。また、このプロパティオブジェクトにプロパティが存在しない場合に検索される2つのデフォルトプロパティオブジェクトのフックアップも可能です。

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | 文字列プロパティの値を取得します。 |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | 文字列プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | 色プロパティの値を取得します。 |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | 色プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | double プロパティの値を取得します。 |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | double プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | float プロパティの値を取得します。 |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | float プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | integer プロパティの値を取得します。 |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | integer プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | margins プロパティの値を取得します。 |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | margins プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | matrix プロパティの値を取得します。 |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | matrix プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | rectangle プロパティの値を取得します。 |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | rectangle プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | size プロパティの値を取得します。 |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | size プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | string array プロパティの値を取得します。 |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | string array プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [IsProperty](./isproperty/)(System::String) | boolean プロパティの値を取得します。 |
| virtual [IsProperty](./isproperty/)(System::String, bool) | boolean プロパティの値を取得します。要求されたプロパティが存在しない場合、指定されたデフォルト値を返します。 |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | プロパティ名を返します。 |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | プロパティをコピーし、デフォルトもこの [UserProperties](./) に含めます。 |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | 文字列プロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | 文字列配列プロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | 指定されたプロパティテーブルで文字列配列プロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | 色プロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | 指定されたプロパティテーブルで色プロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | 矩形プロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | 指定されたプロパティテーブルで矩形プロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | 余白プロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | 指定されたプロパティテーブルで余白プロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | サイズプロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | 指定されたプロパティテーブルでサイズプロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | 整数プロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | 指定されたプロパティテーブルで整数プロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, double) | double プロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | 指定されたプロパティテーブルで double プロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, float) | float プロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | 指定されたプロパティテーブルで float プロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, bool) | boolean プロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | 指定されたプロパティテーブルで boolean プロパティの値を設定します。 |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 行列プロパティの値を設定します。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 指定されたプロパティテーブルで行列プロパティの値を設定します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |
| [UserProperties](./userproperties/)() | 空の [UserProperties](./) クラスのインスタンスを初期化します。 |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | デフォルト値を持つ [UserProperties](./) クラスのインスタンスを初期化します。 |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | [UserProperties](./) をデフォルトテーブルと altDefaults テーブルで構築し、その順序で検索されます。 |
## 参照

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
