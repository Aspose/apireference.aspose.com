---
title: Class DrFont
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.Font.DrFont クラス. GDI の代わりにこのクラスを使用します Font
type: docs
weight: 220
url: /ja/net/aspose.page.font/drfont/
---
## DrFont class

GDI+ の代わりにこのクラスを使用します Font

```csharp
public class DrFont
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AscentLis](../../aspose.page.font/drfont/ascentlis/) { get; } | このフォントのセルのアセント (lis). これは、セルの上部からセルのベースラインまでの垂直距離です. |
| [AscentPoints](../../aspose.page.font/drfont/ascentpoints/) { get; } | セルのアセントをポイント単位で返します。 |
| [CellHeightLis](../../aspose.page.font/drfont/cellheightlis/) { get; } | このフォント (lis) のセルの高さを返します。 これは[`AscentLis`](./ascentlis/)+[`DescentLis`](./descentlis/). |
| [CellHeightPoints](../../aspose.page.font/drfont/cellheightpoints/) { get; } | のショートカット[`AscentPoints`](./ascentpoints/)+[`DescentPoints`](./descentpoints/). |
| [DescentLis](../../aspose.page.font/drfont/descentlis/) { get; } | このフォントのセルのディセント (lis). これは、セルの下部からセルのベースラインまでの垂直距離です. |
| [DescentPoints](../../aspose.page.font/drfont/descentpoints/) { get; } | セルの降下をポイントで返します。 |
| [FamilyName](../../aspose.page.font/drfont/familyname/) { get; } | このフォントの名前を取得します。 |
| [IsBold](../../aspose.page.font/drfont/isbold/) { get; } | このインスタンスが太字かどうかを示す値を取得します。 |
| [IsItalic](../../aspose.page.font/drfont/isitalic/) { get; } | このインスタンスが斜体かどうかを示す値を取得します。 |
| [LeadingLis](../../aspose.page.font/drfont/leadinglis/) { get; } | このフォント (lis) の先頭を返します。 のショートカットです。[`LineSpacingLis`](./linespacinglis/) -[`CellHeightLis`](./cellheightlis/). |
| [LeadingPoints](../../aspose.page.font/drfont/leadingpoints/) { get; } | このフォント (lis) の先頭を返します。 のショートカットです。[`LineSpacingLis`](./linespacinglis/) -[`CellHeightLis`](./cellheightlis/). |
| [LineSpacingLis](../../aspose.page.font/drfont/linespacinglis/) { get; } | このフォント (lis) のセル間隔を返します。 これは、2 つのグリフのベースライン間の垂直距離です。 |
| [LineSpacingPoints](../../aspose.page.font/drfont/linespacingpoints/) { get; } | このフォントのセル間隔 (ポイント) を返します。 これは、2 つのグリフのベースライン間の垂直距離です。 |
| [SizePoints](../../aspose.page.font/drfont/sizepoints/) { get; set; } | このフォントのサイズを取得します (ポイント). |
| [SmallCapsScaleFactor](../../aspose.page.font/drfont/smallcapsscalefactor/) { get; } | SmallCaps 倍率を取得します。 |
| [Style](../../aspose.page.font/drfont/style/) { get; } | このフォントのスタイルを取得します。 |
| [StyleEx](../../aspose.page.font/drfont/styleex/) { get; set; } | このプロパティには、フォントのスタイルに関する追加情報が含まれています |

## メソッド

| 名前 | 説明 |
| --- | --- |
| override [Equals](../../aspose.page.font/drfont/equals/)(object) | 指定されたObject、このインスタンスと等しい. |
| [GetCharWidthLis](../../aspose.page.font/drfont/getcharwidthlis/)(char) | 文字幅を取得する lis. |
| [GetCharWidthPoints](../../aspose.page.font/drfont/getcharwidthpoints/)(char) | 文字の幅を返します (ポイント). |
| override [GetHashCode](../../aspose.page.font/drfont/gethashcode/)() | このインスタンスのハッシュ コードを返します。 |
| [GetTextSizePoints](../../aspose.page.font/drfont/gettextsizepoints/)(string) | ポイント単位のテキストの測定テキスト ボックスを返します。 |
| [GetTextWidthLis](../../aspose.page.font/drfont/gettextwidthlis/)(string) | 文字幅を取得します. |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints)(string) | テキスト幅ポイントを取得します。 |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints_1)(string, int, int) | テキスト幅ポイントを取得します。 |
| [Replace](../../aspose.page.font/drfont/replace/)(DrFont) | フォントの置き換え content |
| static [IsPoorlyRenderedByGdiPlus](../../aspose.page.font/drfont/ispoorlyrenderedbygdiplus/)(string) | 「Microsoft Sans Serif」フォントに対して True を返します。これは、GDI+ によるレンダリングが不十分です。 Test286 と Gemini-6959. を参照してください。 |

### 関連項目

* 名前空間 [Aspose.Page.Font](../../aspose.page.font/)
* 組み立て [Aspose.Page](../../)


