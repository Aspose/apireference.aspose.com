---
title: Class FontFamily
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.FontFamily クラス. 基本的なデザインが類似しておりスタイルに特定のバリエーションがある書体のグループを定義します このクラスは継承できません
type: docs
weight: 510
url: /ja/net/system.drawing/fontfamily/
---
## FontFamily class

基本的なデザインが類似しており、スタイルに特定のバリエーションがある書体のグループを定義します。 このクラスは継承できません。

```csharp
public sealed class FontFamily : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [FontFamily](fontfamily/#constructor)(string) | の新しいインスタンスを初期化します`FontFamily`指定された名前のクラス. |
| [FontFamily](fontfamily/#constructor_1)(string, FontCollection) | の新しいインスタンスを初期化します`FontFamily`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| static [GenericMonospace](../../system.drawing/fontfamily/genericmonospace/) { get; } | 汎用モノスペースを取得しますFontFamily. |
| static [GenericSansSerif](../../system.drawing/fontfamily/genericsansserif/) { get; } | 一般的なサンセリフを取得しますFontFamilyobject. |
| static [GenericSerif](../../system.drawing/fontfamily/genericserif/) { get; } | 一般的なセリフを取得しますFontFamily. |
| [Name](../../system.drawing/fontfamily/name/) { get; } | この名前を取得しますFontFamily. |
| static [Families](../../system.drawing/fontfamily/families/) { get; } | すべてを含む配列を取得しますFontFamily現在のグラフィック コンテキストに関連付けられているオブジェクト。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Dispose](../../system.drawing/fontfamily/dispose/)() | これによって使用されたすべてのリソースを解放しますFontFamily. |
| override [Equals](../../system.drawing/fontfamily/equals/)(object) | 指定されたオブジェクトがFontFamilyそしてこれと同じですFontFamily. |
| [GetCellAscent](../../system.drawing/fontfamily/getcellascent/)(FontStyle) | セルのアセントを設計単位で返します。FontFamily指定されたスタイルの. |
| [GetCellDescent](../../system.drawing/fontfamily/getcelldescent/)(FontStyle) | のセル降下を設計単位で返します。FontFamily指定されたスタイルの. |
| [GetEmHeight](../../system.drawing/fontfamily/getemheight/)(FontStyle) | 指定されたスタイルの EM 正方形のフォント デザイン単位での高さを取得します。 |
| override [GetHashCode](../../system.drawing/fontfamily/gethashcode/)() | このハッシュコードを取得しますFontFamily. |
| [GetLineSpacing](../../system.drawing/fontfamily/getlinespacing/)(FontStyle) | ライン間隔をデザイン単位で返します。FontFamily指定されたスタイルの. 行間隔は、2 つの連続するテキスト行のベースライン間の垂直距離です. |
| [GetName](../../system.drawing/fontfamily/getname/)(int) | この名前を、指定された言語で返しますFontFamily. |
| [IsStyleAvailable](../../system.drawing/fontfamily/isstyleavailable/)(FontStyle) | 指定されたFontStyle列挙が可能です. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


