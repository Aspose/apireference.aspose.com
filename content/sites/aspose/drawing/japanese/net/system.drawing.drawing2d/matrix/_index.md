---
title: Class Matrix
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Drawing2D.Matrix クラス. 幾何学的変換を表す 3 行 3 列のアフィン行列をカプセル化しますこのクラスは継承できません.
type: docs
weight: 360
url: /ja/net/system.drawing.drawing2d/matrix/
---
## Matrix class

幾何学的変換を表す 3 行 3 列のアフィン行列をカプセル化します。このクラスは継承できません.

```csharp
public sealed class Matrix : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Matrix](matrix/#constructor)() | Matrix クラスの新しいインスタンスを単位行列として初期化します。 |
| [Matrix](matrix/#constructor_2)(Rectangle, Point[]) | の新しいインスタンスを初期化します`Matrix`指定された長方形と点の配列によって定義される幾何学的変換へのクラス. |
| [Matrix](matrix/#constructor_3)(RectangleF, PointF[]) | の新しいインスタンスを初期化します`Matrix`指定された長方形と点の配列によって定義される幾何学的変換へのクラス. |
| [Matrix](matrix/#constructor_1)(float, float, float, float, float, float) | 指定された要素で Matrix クラスの新しいインスタンスを初期化します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements/) { get; } | この Matrix の要素を表す浮動小数点値の配列を取得します。 |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity/) { get; } | この Matrix が単位行列かどうかを示す値を取得します。 |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible/) { get; } | この Matrix が可逆かどうかを示す値を取得します。 |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx/) { get; } | この Matrix の x 平行移動値 (dx 値、または 3 行目と 1 列目の要素) を取得します。 |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety/) { get; } | y 平行移動値を取得します (`ダイ`値、またはこの Matrix の 3 行 2 列目の要素). |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone/)() | このマトリックスの正確なコピーを作成します。 |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose/)() | この Matrix で使用されているすべてのリソースを解放します。 |
| [Invert](../../system.drawing.drawing2d/matrix/invert/)() | 反転可能な場合、このマトリックスを反転します。 |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply)(Matrix) | これを掛けますMatrixで指定された行列によって*matrix*パラメータ、 、指定されたMatrix. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply_1)(Matrix, MatrixOrder) | これを掛けますMatrixで指定された行列によって*matrix*パラメータ、 で指定された順序で*order*パラメータ. |
| [Reset](../../system.drawing.drawing2d/matrix/reset/)() | これをリセットしますMatrix恒等行列の要素を持つ. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate)(float) | これに追加Matrix原点を中心に、指定された角度だけ時計回りに回転します。 |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate_1)(float, MatrixOrder) | 角度パラメーターで指定された量の時計回りの回転を、原点 (x 座標と y 座標がゼロ) の周りに適用します。Matrix. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat)(float, PointF) | point パラメータで指定された点を中心に、この Matrix に時計回りの回転を適用します。 |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat_1)(float, PointF, MatrixOrder) | 指定された点を中心に時計回りの回転を指定された順序でこの Matrix に適用します。 |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale)(float, float) | スケール ベクトルを先頭に追加することにより、指定されたスケール ベクトルをこの Matrix に適用します。 |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale_1)(float, float, MatrixOrder) | 指定された順序を使用して、指定されたスケール ベクトル (scaleX および scaleY) をこの Matrix に適用します。 |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear)(float, float) | せん断変換を先頭に追加することにより、指定されたせん断ベクトルをこの Matrix に適用します。 |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear_1)(float, float, MatrixOrder) | 指定されたせん断ベクトルを指定された順序でこのマトリックスに適用します。 |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints)(PointF[]) | これで表される幾何学的変換を適用しますMatrixポイントの指定された配列に. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints_1)(Point[]) | これで表される幾何学的変換を適用しますMatrixポイントの指定された配列に. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors/)(PointF[]) | 配列内の各ベクトルに行列を掛けます。この行列の変換要素 (3 行目) は無視されます. |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate)(float, float) | 指定された平行移動ベクトル (offsetX および offsetY) を、平行移動ベクトルを先頭に追加して、この Matrix に適用します。 |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate_1)(float, float, MatrixOrder) | 指定された平行移動ベクトルを指定された順序でこの Matrix に適用します。 |

### 関連項目

* 名前空間 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 組み立て [Aspose.Drawing](../../)


