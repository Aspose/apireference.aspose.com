---
title: "Aspose::Page::EPS::XMP::XmpValue class"
linktitle: "XmpValue"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::XMP::XmpValue クラス。C++ で XMP 値を表します。"
type: docs
weight: 300
url: /ja/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


[XMP](../) の値を表します。

```cpp
class XmpValue : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_IsArray](./get_isarray/)() | [XmpValue](./) が配列の場合は true を返します。 |
| [get_IsDateTime](./get_isdatetime/)() const | 値が DateTime の場合は true を返します。 |
| [get_IsDouble](./get_isdouble/)() const | 値が浮動小数点数の場合は true を返します。 |
| [get_IsField](./get_isfield/)() | [XmpValue](./) がフィールドの場合は true を返します。 |
| [get_IsInteger](./get_isinteger/)() const | 値が整数の場合は true を返します。 |
| [get_IsNamedValue](./get_isnamedvalue/)() const | [XmpValue](./) が名前付き値の場合は true を返します。 |
| [get_IsNamedValues](./get_isnamedvalues/)() | [XmpValue](./) が名前付き値を表す場合は true を返します。 |
| [get_IsRaw](./get_israw/)() | 値はサポートされていない/不明で、未加工の XML コードが提供されます。 |
| [get_IsString](./get_isstring/)() | 値が文字列の場合は true を返します。 |
| [get_IsStructure](./get_isstructure/)() | [XmpValue](./) が構造体を表す場合は true を返します。 |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./) を名前付き値に変換します。 |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | XmlValue を名前付きコレクション値に変換します。 |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./) を文字列に変換します。 |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | 文字列を [XmpValue](./) に変換します。 |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | 整数を [XmpValue](./) に変換します。 |
| static [to_XmpValue](./to_xmpvalue/)(double) | double を [XmpValue](./) に変換します。 |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | DateTime を [XmpValue](./) に変換します。 |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | 配列を [XmpValue](./) に変換します。 |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./) を配列に変換します。 |
| [ToArray](./toarray/)() | 配列を返します。 |
| [ToDateTime](./todatetime/)() | 日付時刻に変換します。 |
| [ToDictionary](./todictionary/)() | 名前付き値を含む辞書を返します。 |
| [ToDouble](./todouble/)() | double に変換します。 |
| [ToField](./tofield/)() | [XMP](../) の値を [XMP](../) フィールドとして返します。 |
| [ToInteger](./tointeger/)() | 整数に変換します。 |
| [ToNamedValue](./tonamedvalue/)() | [XMP](../) の値を名前付き値として返します。 |
| [ToNamedValues](./tonamedvalues/)() | [XMP](../) の値を名前付き値コレクションとして返します。 |
| [ToRaw](./toraw/)() | 不明またはサポートされていない値の生 XML コード。 |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | 文字列表現を返します。 |
| [ToString](./tostring/)() const override | [XmpValue](./) の文字列表現を返します。 |
| [ToStringValue](./tostringvalue/)() | 文字列に変換します。 |
| [ToStructure](./tostructure/)() | [XMP](../) の値を構造体（フィールドの集合）として返します。 |
| [XmpValue](./xmpvalue/)(System::String) | 文字列値のコンストラクタ。 |
| [XmpValue](./xmpvalue/)(int32_t) | 整数値のコンストラクタ。 |
| [XmpValue](./xmpvalue/)(double) | 浮動小数点 Value のコンストラクタ。 |
| [XmpValue](./xmpvalue/)(System::DateTime) | 日付時刻値のコンストラクタ。 |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | 配列値のコンストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
