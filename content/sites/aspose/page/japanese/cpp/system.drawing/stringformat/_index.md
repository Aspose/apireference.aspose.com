---
title: "System::Drawing::StringFormat クラス"
linktitle: "StringFormat"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::StringFormat クラス。テキストのレイアウト情報、表示操作、OpenType 機能をカプセル化します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2500
url: /ja/cpp/system.drawing/stringformat/
---
## StringFormat class


テキストのレイアウト情報、表示操作、OpenType 機能をカプセル化します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class StringFormat : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | 現在のオブジェクトの正確なコピーを返します。 |
| [get_Alignment](./get_alignment/)() const | 文字列の水平配置を示す値を返します。 |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | ローカル数字が西洋数字に置き換えられる際に使用される言語を示す値を返します。 |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | 数字置換方法を返します。 |
| [get_FormatFlags](./get_formatflags/)() const | 現在のオブジェクトが表す文字列書式を指定する [StringFormatFlags](../stringformatflags/) のビット単位の組み合わせを返します。 |
| static [get_GenericDefault](./get_genericdefault/)() | 汎用デフォルト書式を表す [StringFormat](./) オブジェクトを返します。 |
| static [get_GenericTypographic](./get_generictypographic/)() | 汎用組版書式を表す [StringFormat](./) オブジェクトを返します。 |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | ホットキー接頭辞の表示方法を示す値を返します。 |
| [get_LineAlignment](./get_linealignment/)() const | 文字列の垂直配置を示す値を返します。 |
| [get_Trimming](./get_trimming/)() const | 文字列のトリミング方法を示す値を返します。 |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | [CharacterRange](../characterrange/) 配列のサイズを取得します。 |
| [GetTabStops](./gettabstops/)(float\&) const | 現在の [StringFormat](./) オブジェクトのタブストップを返します。 |
| [set_Alignment](./set_alignment/)(StringAlignment) | 文字列の水平配置を設定します。 |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | 文字列書式フラグを設定します。 |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | ホットキー接頭辞の表示方法を指定する値を設定します。 |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | 文字列の垂直配置を設定します。 |
| [set_Trimming](./set_trimming/)(StringTrimming) | 文字列のトリミング方法を指定する値を設定します。 |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | 数字置換の言語と方法を設定します。 |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | [CharacterRange](../characterrange/) オブジェクトの配列を設定します。この配列は MeasureCharacterRanges() メソッドの呼び出しで測定された文字範囲を表します。 |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | 現在の [StringFormat](./) オブジェクトのタブストップを設定します。 |
| [StringFormat](./stringformat/)() | [StringFormat](./) クラスの新しいインスタンスを構築します。 |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | 指定されたフォーマットフラグと語言を使用して、[StringFormat](./) クラスの新しいインスタンスを作成します。 |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | コピーコンストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
