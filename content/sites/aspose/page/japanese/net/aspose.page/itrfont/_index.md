---
title: Interface ITrFont
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.ITrFont インターフェース. このインターフェイスはフォントの主要なパラメータへのアクセスを提供します.
type: docs
weight: 260
url: /ja/net/aspose.page/itrfont/
---
## ITrFont interface

このインターフェイスは、フォントの主要なパラメータへのアクセスを提供します.

```csharp
public interface ITrFont
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CharStrings](../../aspose.page/itrfont/charstrings/) { get; } | 文字名とグリフの間のマッピングを返します。 |
| [Encoding](../../aspose.page/itrfont/encoding/) { get; } | エンコード配列を返します。 |
| [EncodingTable](../../aspose.page/itrfont/encodingtable/) { get; } | エンコーディングの名前を返します。 |
| [FID](../../aspose.page/itrfont/fid/) { get; } | フォント識別子を返します。 |
| [Font](../../aspose.page/itrfont/font/) { get; } | このフォントに対応する DrFont を返します。 |
| [FontName](../../aspose.page/itrfont/fontname/) { get; } | フォント名を返します。 |
| [FontType](../../aspose.page/itrfont/fonttype/) { get; } | Adobe 分類のフォントの種類を返します。 |
| [NativeFont](../../aspose.page/itrfont/nativefont/) { get; } | このフォントに対応する System.Drawing.Font を返します。 |
| [Size](../../aspose.page/itrfont/size/) { get; } | フォントサイズを返します. |
| [Style](../../aspose.page/itrfont/style/) { get; } | フォント スタイルを返します。 |
| [Transform](../../aspose.page/itrfont/transform/) { get; } | フォント変換を返します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../aspose.page/itrfont/clone/)() | フォントを複製します。 |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont)(float) | 新しいサイズでこのフォントに相当するものを作成します. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_3)(FontStyle) | 新しいスタイルでこのフォントに相当するものを作成します. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_2)(Matrix) | f character 新しい変換でこのフォントに相当するものを作成します. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_1)(float, FontStyle) | 新しいサイズとスタイルでこのフォントに相当するものを作成します. |
| [GetCharWidth](../../aspose.page/itrfont/getcharwidth/)(char) | 文字の幅を返します。 |
| [GetOutline](../../aspose.page/itrfont/getoutline/)(char, float, float) | 指定された位置のグリフのアウトラインを返します。 |

### 関連項目

* 名前空間 [Aspose.Page](../../aspose.page/)
* 組み立て [Aspose.Page](../../)


