---
title: Class Pen
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Pen クラス. 直線と曲線の描画に使用するオブジェクトを定義します.
type: docs
weight: 910
url: /ja/net/system.drawing/pen/
---
## Pen class

直線と曲線の描画に使用するオブジェクトを定義します.

```csharp
public class Pen : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Pen](pen/#constructor)(Brush) | の新しいインスタンスを初期化します`Pen`指定されたクラスBrush. |
| [Pen](pen/#constructor_2)(Color) | の新しいインスタンスを初期化します`Pen`指定されたクラスColor. |
| [Pen](pen/#constructor_1)(Brush, float) | 指定された Brush と Width で Pen クラスの新しいインスタンスを初期化します。 |
| [Pen](pen/#constructor_3)(Color, float) | 指定された Color プロパティと Width プロパティを使用して、Pen クラスの新しいインスタンスを初期化します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment/) { get; set; } | この配置を取得または設定しますPen. |
| [Brush](../../system.drawing/pen/brush/) { get; set; } | この属性を決定するブラシを取得または設定しますPen. |
| [Color](../../system.drawing/pen/color/) { get; set; } | この色を取得または設定しますPen. |
| [CompoundArray](../../system.drawing/pen/compoundarray/) { get; set; } | 複合ペンを指定する値の配列を取得または設定します。複合ペンは、 平行線とスペースで構成される複合線を描画します. |
| [CustomEndCap](../../system.drawing/pen/customendcap/) { get; set; } | これで描画された線の最後に使用するカスタム キャップを取得または設定しますPen. |
| [CustomStartCap](../../system.drawing/pen/customstartcap/) { get; set; } | これで描画された線の始点で使用するカスタム キャップを取得または設定しますPen. |
| [DashCap](../../system.drawing/pen/dashcap/) { get; set; } | this で描画された破線を構成する破線の端で使用されるキャップ スタイルを取得または設定しますPen. |
| [DashOffset](../../system.drawing/pen/dashoffset/) { get; set; } | 線の始点から破線パターンの始点までの距離を取得または設定します。 |
| [DashPattern](../../system.drawing/pen/dashpattern/) { get; set; } | カスタム ダッシュとスペースの配列を取得または設定します。 |
| [DashStyle](../../system.drawing/pen/dashstyle/) { get; set; } | これで描かれた破線に使用されるスタイルを取得または設定しますPen. |
| [EndCap](../../system.drawing/pen/endcap/) { get; set; } | この Pen で描画された線の終点で使用されるキャップ スタイルを取得または設定します。 |
| [LineJoin](../../system.drawing/pen/linejoin/) { get; set; } | この Pen で描画された 2 つの連続する線の端の結合スタイルを取得または設定します。 |
| [MiterLimit](../../system.drawing/pen/miterlimit/) { get; set; } | 留め継ぎコーナーの接合部の厚さの制限を取得または設定します. |
| [PenType](../../system.drawing/pen/pentype/) { get; } | この Pen で描画される線のスタイルを取得します。 |
| [StartCap](../../system.drawing/pen/startcap/) { get; set; } | この Pen で描画された線の始点で使用されるキャップ スタイルを取得または設定します。 |
| [Transform](../../system.drawing/pen/transform/) { get; set; } | この幾何学的変換のコピーを取得または設定しますPen. |
| [Width](../../system.drawing/pen/width/) { get; set; } | 描画に使用される Graphics オブジェクトの単位で、この Pen の幅を取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../system.drawing/pen/clone/)() | これの正確なコピーを作成しますPen. |
| [Dispose](../../system.drawing/pen/dispose/)() | このペンが使用するすべてのリソースを解放します。 |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform)(Matrix) | この変換行列を乗算しますPen指定されたMatrix. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | この変換行列を乗算しますPen指定されたMatrix指定された順序で. |
| [ResetTransform](../../system.drawing/pen/resettransform/)() | この幾何変換行列をリセットしますPenidentity. へ |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform)(float) | 指定した角度でローカル ジオメトリック トランスフォームを回転します。このメソッドは、変換の前に回転を追加します. |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | 指定された順序で、指定された角度だけローカル ジオメトリック変換を回転させます。 |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform)(float, float) | 指定された係数でローカル ジオメトリック トランスフォームをスケーリングします。このメソッドは、スケーリング マトリックスを変換の先頭に追加します。 |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | 指定された順序で、指定された係数によってローカル ジオメトリック変換をスケーリングします。 |
| [SetLineCap](../../system.drawing/pen/setlinecap/)(LineCap, LineCap, DashCap) | これによって描画された線を終了するために使用されるキャップのスタイルを決定する値を設定します`Pen`. |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform)(float, float) | 指定された次元でローカル ジオメトリック変換を変換します。このメソッドは、変換を変換の先頭に追加します。 |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | 指定された順序で、指定された次元でローカル ジオメトリック変換を変換します。 |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


