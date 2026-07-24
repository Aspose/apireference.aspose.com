---
title: "System::Drawing::Font クラス"
linktitle: "フォント"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Font クラス。フォントファミリー、サイズ、スタイルを含む特定のテキスト形式を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 700
url: /ja/cpp/system.drawing/font/
---
## Font class


フォントファミリー、サイズ、スタイルを含む特定のテキスト形式を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class Font : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | 現在のフォントのコピーを返します。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したすべてのオペレーティングシステムリソースを解放します。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 現在のオブジェクトと指定されたオブジェクトが同一かどうかを判定します。 |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | 指定されたフォントスタイルで、指定された既存のフォントを表す [Font](./) クラスの新しいインスタンスを構築します。 |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | [Font](./) クラスの新しいインスタンスを構築します。 |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | [Font](./) クラスの新しいインスタンスを構築します。 |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | [Font](./) クラスの新しいインスタンスを構築します。 |
| [Font](./font/)(const String\&, float, GraphicsUnit) | [Font](./) クラスの新しいインスタンスを構築します。 |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | 未実装です。 |
| [get_Bold](./get_bold/)() | 現在のオブジェクトで表されるフォントに太字スタイルが適用されているかどうかを判定します。 |
| [get_FontFamily](./get_fontfamily/)() | 現在のオブジェクトで表されるフォントのフォントファミリーを返します。 |
| [get_FontStyle](./get_fontstyle/)() | 現在のオブジェクトで表されるフォントのフォントスタイルを返します。 |
| [get_GdiCharSet](./get_gdicharset/)() | 現在のオブジェクトで表されるフォントが使用する GDI 文字セットを示す値を返します。 |
| [get_Height](./get_height/)() | 現在のオブジェクトで表されるフォントの行間隔（ピクセル単位）を返します。 |
| [get_Italic](./get_italic/)() | 現在のオブジェクトが表すフォントにイタリックスタイルが適用されているかどうかを判断します。 |
| [get_Name](./get_name/)() | 現在のオブジェクトが表すフォントのフェイス名を返します。 |
| [get_OriginalFontName](./get_originalfontname/)() | フォントの元々指定された名前を返します。 |
| [get_Size](./get_size/)() | 現在のオブジェクトが表すフォントの em サイズを、Unit プロパティで指定された単位で測定して返します。 |
| [get_SizeInPoints](./get_sizeinpoints/)() | 現在のオブジェクトが表すフォントの em サイズをポイント単位で返します。 |
| [get_Strikeout](./get_strikeout/)() | 現在のオブジェクトが表すフォントに取り消し線スタイルが適用されているかどうかを判断します。 |
| [get_Style](./get_style/)() | 現在のオブジェクトが表すフォントのフォントスタイルを返します。 |
| [get_Underline](./get_underline/)() | 現在のオブジェクトが表すフォントに下線スタイルが適用されているかどうかを判断します。 |
| [get_Unit](./get_unit/)() | 現在のオブジェクトが表すフォントの測定単位を返します。 |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | 指定された [Graphics](../graphics/) オブジェクトの現在の単位で、現在のオブジェクトが表すフォントの行間隔を返します。 |
| [GetHeight](./getheight/)(float) | 指定された垂直解像度の表示デバイスに描画されたときの、現在のオブジェクトが表すフォントの高さを返します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
