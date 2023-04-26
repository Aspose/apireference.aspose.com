---
title: Class XpsMatrix
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsModel.XpsMatrix クラス. MatrixTransform プロパティ要素の機能をカプセル化するクラス. この要素は要素の座標 システムを操作するために使用される任意のアフィン行列変換を定義します.
type: docs
weight: 3220
url: /ja/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

MatrixTransform プロパティ要素の機能をカプセル化するクラス. この要素は、要素の座標 システムを操作するために使用される任意のアフィン行列変換を定義します.

```csharp
public sealed class XpsMatrix : XpsObject
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | このインスタンスが単位行列かどうかを示す値を取得します。 |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | M11 エレメントを取得します。 |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | M12 要素を取得します。 |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | M21 要素を取得します。 |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | M22 要素を取得します。 |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | M31 要素を取得します。 |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | M32 要素を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | この変換行列を複製します。 |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | 指定されたObjectこのインスタンスと等しい. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | このインスタンスのハッシュ コードを返します。 |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | この行列に、*matrix* デフォルト (Prepend) 順. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | この行列に、*matrix* デフォルト (Prepend) 順. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | この行列に、*matrix* で指定された順序で*matrixOrder*. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | この行列に、*matrix* で指定された順序で*matrixOrder*. |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | このマトリックスを単位マトリックスにリセットします。 |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | によって時計回りの回転を適用します*angle*デフォルトの (プリペンド) 順序でこのマトリックスに追加. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | によって時計回りの回転を適用します*angle*によって指定された order でこの行列に*matrixOrder*. |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | によって時計回りの回転を適用します*angle*の周辺*pivot* をこのマトリックスにデフォルト (プリペンド) の順序で追加します. |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | によって時計回りの回転を適用します*angle*の周辺*pivot* で指定された順序でこの Matrix に*matrixOrder*. |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | 指定されたスケール ベクトル (scaleX および scaleY) をこの Matrix にデフォルト (プリペンド) の順序で適用します。 |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | 指定されたスケール ベクトル (scaleX および scaleY) を、次の順序でこの Matrix に適用します。*matrixOrder*. |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | 指定された傾斜変換をこの Matrix に適用します。 |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | この文字列表現を返します`XpsMatrix`インスタンス. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | この Matrix によって表されるアフィン変換を指定された四角形に適用します。 |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | この Matrix によって表されるアフィン変換を指定された点に適用します。 |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | この Matrix によって表されるアフィン変換を、指定された点の配列に適用します。 |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | この Matrix によって表されるアフィン変換を、ポイントの配列の指定された部分に適用します。 |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | 指定された平行移動ベクトルをこの Matrix に適用します。 |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | で指定された順序で、指定された平行移動ベクトルをこの Matrix に適用します。*matrixOrder*. |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | 実際の実装. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | 演算子 ==. を実装します |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | 演算子 !=. を実装します |

### 関連項目

* class [XpsObject](../xpsobject/)
* 名前空間 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 組み立て [Aspose.Page](../../)


