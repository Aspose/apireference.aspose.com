---
title: Class Font
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Font クラス. フォント フェースサイズおよびスタイル属性を含むテキストの特定の形式を定義します このクラスは継承できません
type: docs
weight: 500
url: /ja/net/system.drawing/font/
---
## Font class

フォント フェース、サイズ、およびスタイル属性を含む、テキストの特定の形式を定義します。 このクラスは継承できません。

```csharp
public sealed class Font : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Font](font/#constructor)(Font, FontStyle) | の新しいインスタンスを初期化します`Font`クラスは指定された既存のものを使用しますFontとFontStyle列挙.. |
| [Font](font/#constructor_1)(FontFamily, float) | の新しいインスタンスを初期化します`Font`class. |
| [Font](font/#constructor_7)(string, float) | の新しいインスタンスを初期化します`Font`指定されたサイズを使用するクラス. |
| [Font](font/#constructor_2)(FontFamily, float, FontStyle) | の新しいインスタンスを初期化します`Font`指定されたサイズとスタイルを使用するクラス.. |
| [Font](font/#constructor_6)(FontFamily, float, GraphicsUnit) | の新しいインスタンスを初期化します`Font`指定されたサイズと単位を使用するクラス。スタイルをRegular. |
| [Font](font/#constructor_8)(string, float, FontStyle) | の新しいインスタンスを初期化します`Font`指定されたサイズとスタイルを使用するクラス. |
| [Font](font/#constructor_12)(string, float, GraphicsUnit) | の新しいインスタンスを初期化します`Font`指定されたサイズと単位を使用するクラス。スタイルはRegular. |
| [Font](font/#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | の新しいインスタンスを初期化します`Font`指定されたサイズ、スタイル、および単位を使用するクラス. |
| [Font](font/#constructor_9)(string, float, FontStyle, GraphicsUnit) | の新しいインスタンスを初期化します`Font`指定されたサイズ、スタイル、および単位を使用するクラス. |
| [Font](font/#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | の新しいインスタンスを初期化します`Font`指定されたサイズ、スタイル、単位、および文字セットを使用するクラス.. |
| [Font](font/#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | の新しいインスタンスを初期化します`Font`指定されたサイズ、スタイル、単位、および文字セットを使用するクラス. |
| [Font](font/#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | の新しいインスタンスを初期化します`Font`指定されたサイズ、スタイル、単位、および文字セットを使用するクラス.. |
| [Font](font/#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | の新しいインスタンスを初期化します`Font`指定されたサイズ、スタイル、単位、および文字セットを使用するクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Bold](../../system.drawing/font/bold/) { get; } | かどうかを示す値を取得します。Font太字. |
| [FontFamily](../../system.drawing/font/fontfamily/) { get; } | を取得しますFontFamilyこれに関連するFont. |
| [GdiCharSet](../../system.drawing/font/gdicharset/) { get; } | この GDI 文字セットを指定するバイト値を取得します。Font uses. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont/) { get; } | かどうかを示す値を取得します。Font GDI 垂直フォントから派生した.. |
| [Height](../../system.drawing/font/height/) { get; } | このフォントの行間隔を取得します。 |
| [IsSystemFont](../../system.drawing/font/issystemfont/) { get; } | フォントがメンバーであるかどうかを示す値を取得しますSystemFonts. |
| [Italic](../../system.drawing/font/italic/) { get; } | かどうかを示す値を取得します。Font斜体です。 |
| [Name](../../system.drawing/font/name/) { get; } | この面の名前を取得しますFont. |
| [OriginalFontName](../../system.drawing/font/originalfontname/) { get; } | 最初に指定されたフォントの名前を取得します。 |
| [Size](../../system.drawing/font/size/) { get; } | この全角サイズを取得しますFontthe で指定された単位で測定Unitプロパティ. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints/) { get; } | これの em サイズをポイント単位で取得しますFont. |
| [Strikeout](../../system.drawing/font/strikeout/) { get; } | かどうかを示す値を取得します。Fontフォントを通る水平線を指定します。 |
| [Style](../../system.drawing/font/style/) { get; } | このスタイル情報を取得しますFont. |
| [SystemFontName](../../system.drawing/font/systemfontname/) { get; } | IsSystemFont プロパティが true を返す場合、システム フォントの名前を取得します。 |
| [Underline](../../system.drawing/font/underline/) { get; } | かどうかを示す値を取得します。Font下線が引かれています. |
| [Unit](../../system.drawing/font/unit/) { get; } | この測定単位を取得しますFont. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../system.drawing/font/clone/)() | これの正確なコピーを作成しますFont. |
| [Dispose](../../system.drawing/font/dispose/)() | これによって使用されたすべてのリソースを解放しますFont. |
| override [Equals](../../system.drawing/font/equals/)(object) | 指定されたオブジェクトがFontそして同じですFontFamily, GdiVerticalFont 、GdiCharSet 、Style 、Size 、 およびUnitこのようにプロパティ値Font. |
| override [GetHashCode](../../system.drawing/font/gethashcode/)() | このハッシュコードを取得しますFont. |
| [GetHeight](../../system.drawing/font/getheight/#getheight)() | このフォントの行間隔をピクセル単位で返します。 |
| [GetHeight](../../system.drawing/font/getheight/#getheight_1)(float) | この高さをピクセル単位で返しますFont指定された垂直解像度でデバイスに描画されたとき. |
| [GetHeight](../../system.drawing/font/getheight/#getheight_2)(Graphics) | 指定された現在の単位で行間を返しますGraphics、このフォントの。 |
| override [ToString](../../system.drawing/font/tostring/)() | これの人間が読める文字列表現を返しますFont. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


