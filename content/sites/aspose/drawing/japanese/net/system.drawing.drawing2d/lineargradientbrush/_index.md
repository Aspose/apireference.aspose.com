---
title: Class LinearGradientBrush
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Drawing2D.LinearGradientBrush クラス. をカプセル化しますBrush線形グラデーションでこのクラスは継承できません.
type: docs
weight: 340
url: /ja/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

をカプセル化しますBrush線形グラデーションで。このクラスは継承できません.

```csharp
public sealed class LinearGradientBrush : Brush
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush/#constructor)(Point, Point, Color, Color) | の新しいインスタンスを初期化します`LinearGradientBrush`指定されたポイントと色を持つクラス. |
| [LinearGradientBrush](lineargradientbrush/#constructor_1)(PointF, PointF, Color, Color) | の新しいインスタンスを初期化します`LinearGradientBrush`指定されたポイントと色を持つクラス. |
| [LinearGradientBrush](lineargradientbrush/#constructor_2)(Rectangle, Color, Color, float) | の新しいインスタンスを初期化します`LinearGradientBrush`長方形に基づくクラス、 開始色と終了色、および方向角度. |
| [LinearGradientBrush](lineargradientbrush/#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | の新しいインスタンスを初期化します`LinearGradientBrush`長方形に基づくクラス、 開始色と終了色、および向き. |
| [LinearGradientBrush](lineargradientbrush/#constructor_5)(RectangleF, Color, Color, float) | の新しいインスタンスを初期化します`LinearGradientBrush`長方形に基づくクラス、 開始色と終了色、および方向角度. |
| [LinearGradientBrush](lineargradientbrush/#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | の新しいインスタンスを初期化します`LinearGradientBrush`長方形に基づくクラス、 開始色と終了色、および方向モード. |
| [LinearGradientBrush](lineargradientbrush/#constructor_3)(Rectangle, Color, Color, float, bool) | の新しいインスタンスを初期化します`LinearGradientBrush`長方形に基づくクラス、 開始色と終了色、および方向角度. |
| [LinearGradientBrush](lineargradientbrush/#constructor_6)(RectangleF, Color, Color, float, bool) | の新しいインスタンスを初期化します`LinearGradientBrush`長方形に基づくクラス、 開始色と終了色、および方向角度. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend/) { get; set; } | を取得または設定しますBlendグラデーションの custom 減衰を定義する位置と係数を指定します。 |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection/) { get; set; } | ガンマ補正が有効かどうかを示す値を取得または設定しますLinearGradientBrush. |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors/) { get; set; } | を取得または設定しますColorBlendマルチカラーの線形グラデーションを定義します. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors/) { get; set; } | グラデーションの開始色と終了色を取得または設定します。 |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle/) { get; } | グラデーションの始点と終点を定義する四角形の領域を取得します。 |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform/) { get; set; } | コピーを取得または設定しますMatrixこれは、このためのローカル ジオメトリック transform を定義しますLinearGradientBrush. |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode/) { get; set; } | を取得または設定しますWrapModeこのためのラップ mode を示す列挙LinearGradientBrush. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone/)() | これの正確なコピーを作成しますLinearGradientBrush. |
| [Dispose](../../system.drawing/brush/dispose/)() | このブラシ オブジェクトで使用されているすべてのリソースを解放します。 |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform)(Matrix) | を乗算します。Matrixこれは、このローカル ジオメトリック transform を表しますLinearGradientBrush指定されたMatrixprepending により、指定されたMatrix. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | を乗算します。Matrixこれは、このローカル ジオメトリック transform を表しますLinearGradientBrush指定されたMatrix指定された順序で. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform/)() | をリセットしますTransformプロパティからidentity. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform)(float) | 指定された量だけローカル ジオメトリック トランスフォームを回転させます。 このメソッドは、トランスフォームの前に回転を追加します。 |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | 指定された順序で、指定された量だけローカル ジオメトリック トランスフォームを回転させます。 |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform)(float, float) | 指定した量だけローカル ジオメトリック トランスフォームをスケーリングします。 このメソッドは、スケーリング マトリックスをトランスフォームの先頭に追加します。 |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | 指定された順序で、指定された量だけローカル ジオメトリック トランスフォームをスケーリングします。 |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | 中央の色と両端の単一色への線形フォールオフを持つ線形グラデーションを作成します。 |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | 中央の色と両端の単一色への線形フォールオフを持つ線形グラデーションを作成します。 |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape)(float) | ベル型の曲線に基づいてグラデーション フォールオフを作成します。 |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | ベル型の曲線に基づいてグラデーション フォールオフを作成します。 |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform)(float, float) | 指定された次元でローカル ジオメトリック トランスフォームを変換します。 このメソッドはトランスフォームの前に変換を追加します。 |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | 指定された順序で、指定された次元でローカル ジオメトリック トランスフォームを変換します。 |

### 関連項目

* class [Brush](../../system.drawing/brush/)
* 名前空間 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 組み立て [Aspose.Drawing](../../)


