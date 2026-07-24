---
title: "Aspose::Page::Font::DrFont クラス"
linktitle: "DrFont"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Font::DrFont クラス。C++ で GDI+ Font の代わりにこのクラスを使用します。"
type: docs
weight: 100
url: /ja/cpp/aspose.page.font/drfont/
---
## DrFont class


GDI+ [Font](../) の代わりにこのクラスを使用します。

```cpp
class DrFont : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 指定された [System::Object](../../system/object/) がこのインスタンスと等しいかどうかを判断します。 |
| [get_AscentLis](./get_ascentlis/)() | このフォントのセル上昇 (lis)。セルの上端からベースラインまでの垂直距離です。 |
| [get_AscentPoints](./get_ascentpoints/)() | ポイント単位でセルの上昇量を返します。 |
| [get_CellHeightLis](./get_cellheightlis/)() | このフォントのセル高さ（lis）を返します。これは [AscentLis](../) + [DescentLis](../) のショートカットです。 |
| [get_CellHeightPoints](./get_cellheightpoints/)() | [AscentPoints](../) + [DescentPoints](../) のショートカットです。 |
| [get_DescentLis](./get_descentlis/)() | このフォントのセル降下（lis）。これはセル底部からセルベースラインまでの垂直距離です。 |
| [get_DescentPoints](./get_descentpoints/)() | ポイント単位でセルの降下量を返します。 |
| [get_FamilyName](./get_familyname/)() | このフォントの名前を取得します。 |
| [get_IsBold](./get_isbold/)() | このインスタンスが太字かどうかを示す値を取得します。 |
| [get_IsItalic](./get_isitalic/)() | このインスタンスが斜体かどうかを示す値を取得します。 |
| [get_LeadingLis](./get_leadinglis/)() | このフォントのリーディング（lis）を返します。これは [LineSpacingLis](../) - [CellHeightLis](../) のショートカットです。 |
| [get_LeadingPoints](./get_leadingpoints/)() | このフォントのリーディング（lis）を返します。これは [LineSpacingLis](../) - [CellHeightLis](../) のショートカットです。 |
| [get_LineSpacingLis](./get_linespacinglis/)() | このフォントのセル間隔（lis）を返します。これは2つのグリフのベースライン間の垂直距離です。 |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | このフォントのセル間隔（ポイント）を返します。これは2つのグリフのベースライン間の垂直距離です。 |
| [get_SizePoints](./get_sizepoints/)() | このフォントのサイズ（ポイント）を取得します。 |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | フォントの大文字を取得します。 |
| [get_Style](./get_style/)() | TrueType フォントを取得します。 |
| [get_StyleEx](./get_styleex/)() | このプロパティはフォントのスタイルに関する追加情報を含みます。 |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | 文字幅（lis）を取得します。 |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | 文字の幅（ポイント）を返します。 |
| [GetHashCode](./gethashcode/)() const override | このインスタンスのハッシュコードを返します。 |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | テキストの測定テキストボックスをポイント単位で返します。 |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | テキスト幅（lis）を取得します。 |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | テキスト幅（ポイント）を取得します。 |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | テキスト幅（ポイント）を取得します。 |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | \"Microsoft Sans Serif\" フォントに対して True を返します。このフォントは GDI+ での描画が不十分です。Test286 と Gemini-6959 を参照してください。 |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | フォントの内容を置き換えます。 |
| [set_SizePoints](./set_sizepoints/)(float) | このフォントのサイズ（ポイント）を取得します。 |
| [set_StyleEx](./set_styleex/)(int16_t) | このプロパティはフォントのスタイルに関する追加情報を含みます。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
