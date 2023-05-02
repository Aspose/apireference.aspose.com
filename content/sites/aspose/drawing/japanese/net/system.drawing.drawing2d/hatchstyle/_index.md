---
title: Enum HatchStyle
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Drawing2D.HatchStyle 列挙. で利用可能なさまざまなパターンを指定しますHatchBrushオブジェクト.
type: docs
weight: 300
url: /ja/net/system.drawing.drawing2d/hatchstyle/
---
## HatchStyle enumeration

で利用可能なさまざまなパターンを指定しますHatchBrushオブジェクト.

```csharp
public enum HatchStyle
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| Horizontal | `0` | 水平線のパターン。 |
| Vertical | `1` | 縦線のパターン。 |
| ForwardDiagonal | `2` | 左上から右下への対角線上の線のパターン。 |
| BackwardDiagonal | `3` | 右上から左下への対角線上の線のパターン。 |
| Cross | `4` | 交差する水平線と垂直線を指定します。 |
| DiagonalCross | `5` | 十字の斜め線のパターン。 |
| Percent05 | `6` | 5% のハッチングを指定します。前景色と背景色の比率は 5:100 です。 |
| Percent10 | `7` | 10% のハッチングを指定します。前景色と背景色の比率は 10:100 です。 |
| Percent20 | `8` | 20% のハッチングを指定します。前景色と背景色の比率は 20:100 です。 |
| Percent25 | `9` | 25% のハッチングを指定します。前景色と背景色の比率は 25:100 です。 |
| Percent30 | `10` | 30% のハッチングを指定します。前景色と背景色の比率は 30:100 です。 |
| Percent40 | `11` | 40% のハッチングを指定します。前景色と背景色の比率は 40:100 です。 |
| Percent50 | `12` | 50% ハッチングを指定します。前景色と背景色の比率は 50:100 です。 |
| Percent60 | `13` | 60% のハッチングを指定します。前景色と背景色の比率は 60:100 です。 |
| Percent70 | `14` | 70% のハッチングを指定します。前景色と背景色の比率は 70:100 です。 |
| Percent75 | `15` | 75% ハッチングを指定します。前景色と背景色の比率は 75:100 です。 |
| Percent80 | `16` | 80% ハッチングを指定します。前景色と背景色の比率は 80:100 です。 |
| Percent90 | `17` | 90% ハッチングを指定します。前景色と背景色の比率は 90:100 です。 |
| LightDownwardDiagonal | `18` | 上の点から下の点まで右に傾斜し、互いに 50% ずつ間隔が狭い対角線を指定します。ForwardDiagonal、しかしアンチエイリアス処理されていません。 |
| LightUpwardDiagonal | `19` | 上の点から下の点まで左に傾斜し、互いに 50% ずつ間隔が狭い対角線を指定します。BackwardDiagonal、しかしそれらはアンチエイリアスされていません。 |
| DarkDownwardDiagonal | `20` | 上の点から下の点まで右に傾斜し、間隔が より 50% 狭く、幅が の 2 倍である対角線を指定します。ForwardDiagonal.このハッチング パターンはアンチエイリアス処理されていません。 |
| DarkUpwardDiagonal | `21` | 上の点から下の点まで左に傾斜し、互いに 50% ずつ間隔が狭い対角線を指定します。BackwardDiagonal、およびその幅の 2 倍ですが、線はアンチエイリアス処理されていません。 |
| WideDownwardDiagonal | `22` | 上部の点から下部の点まで右に傾斜し、ハッチング スタイルと同じ間隔を持つ対角線を指定しますForwardDiagonal、およびその幅の 3 倍ですが、アンチエイリアス処理されていません。 |
| WideUpwardDiagonal | `23` | 上部の点から下部の点まで左に傾斜し、ハッチング スタイルと同じ間隔を持つ対角線を指定しますBackwardDiagonal、およびその幅の 3 倍ですが、アンチエイリアス処理されていません。 |
| LightVertical | `24` | よりも 50% 間隔が狭い垂直線を指定します。Vertical. |
| LightHorizontal | `25` | よりも 50% 間隔が狭い水平線を指定します。Horizontal. |
| NarrowVertical | `26` | ハッチング スタイルより 75% 間隔が狭い垂直線を指定しますVertical(または 25% 近くLightVertical）。 |
| NarrowHorizontal | `27` | ハッチング スタイルより 75% 間隔が狭い水平線を指定しますHorizontal(または 25% 近くLightHorizontal）。 |
| DarkVertical | `28` | よりも 50% 間隔が狭い垂直線を指定します。Verticalその幅の 2 倍です。 |
| DarkHorizontal | `29` | よりも 50% 間隔が狭い水平線を指定します。Horizontalの幅の 2 倍です。Horizontal. |
| DashedDownwardDiagonal | `30` | 上の点から下の点に向かって右に傾斜する斜線の破線を指定します。 |
| DashedUpwardDiagonal | `31` | 上の点から下の点に向かって左に傾斜する斜線を指定します。 |
| DashedHorizontal | `32` | 破線の水平線を指定します。 |
| DashedVertical | `33` | 縦の破線を指定します。 |
| SmallConfetti | `34` | 紙吹雪のようなハッチングを指定します。 |
| LargeConfetti | `35` | 紙吹雪のように見えるハッチを指定し、SmallConfetti. |
| ZigZag | `36` | ジグザグで構成される水平線を指定します。 |
| Wave | `37` | チルダで構成される水平線を指定します。 |
| DiagonalBrick | `38` | 上の点から下の点に向かって左に傾斜した層状のレンガの外観を持つハッチングを指定します。 |
| HorizontalBrick | `39` | レンガを水平に重ねたような外観のハッチングを指定します。 |
| Weave | `40` | 織物の外観を持つハッチングを指定します。 |
| Plaid | `41` | チェック柄のマテリアルの外観を持つハッチングを指定します。 |
| Divot | `42` | ディボットの外観を持つハッチングを指定します。 |
| DottedGrid | `43` | それぞれがドットで構成され、交差する水平線と垂直線を指定します。 |
| DottedDiamond | `44` | それぞれがドットで構成される、交差する前方斜め線と後方斜め線を指定します。 |
| Shingle | `45` | 上部の点から下部の点に向かって右に傾斜する、斜めに層状になった帯状疱疹の外観を持つハッチングを指定します。 |
| Trellis | `46` | 格子状の外観を持つハッチングを指定します。 |
| Sphere | `47` | 互いに隣接して配置された球の外観を持つハッチングを指定します。 |
| SmallGrid | `48` | 交差し、ハッチング スタイルより 50% 間隔が狭い水平線と垂直線を指定します。Cross. |
| SmallCheckerBoard | `49` | チェッカーボードの外観を持つハッチングを指定します。 |
| LargeCheckerBoard | `50` | の 2 倍のサイズの正方形を持つチェッカーボードの外観を持つハッチングを指定します。SmallCheckerBoard. |
| OutlinedDiamond | `51` | 交差するがアンチエイリアシングされていない前方対角線と後方対角線を指定します。 |
| SolidDiamond | `52` | 斜めに配置された市松模様のハッチングを指定します。 |
| LargeGrid | `4` | ハッチング スタイルを指定しますCross. |
| Min | `0` | ハッチング スタイルを指定しますHorizontal. |
| Max | `4` | ハッチング スタイルを指定しますSolidDiamond. |

### 関連項目

* 名前空間 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 組み立て [Aspose.Drawing](../../)


