---
title: Class PathGradientBrush
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Drawing2D.PathGradientBrush クラス. をカプセル化しますBrushの内部を満たすオブジェクトGraphicsPathグラデーションを持つオブジェクト. このクラスは継承できません.
type: docs
weight: 400
url: /ja/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

をカプセル化しますBrushの内部を満たすオブジェクトGraphicsPathグラデーションを持つオブジェクト. このクラスは継承できません.

```csharp
public sealed class PathGradientBrush : Brush
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PathGradientBrush](pathgradientbrush/#constructor)(GraphicsPath) | の新しいインスタンスを初期化します`PathGradientBrush`指定されたパスを持つクラス. |
| [PathGradientBrush](pathgradientbrush/#constructor_1)(PointF[]) | の新しいインスタンスを初期化します`PathGradientBrush`指定されたポイントを持つクラス. |
| [PathGradientBrush](pathgradientbrush/#constructor_3)(Point[]) | の新しいインスタンスを初期化します`PathGradientBrush`指定されたポイントを持つクラス. |
| [PathGradientBrush](pathgradientbrush/#constructor_2)(PointF[], WrapMode) | の新しいインスタンスを初期化します`PathGradientBrush`指定されたポイントとラップ モードを持つクラス. |
| [PathGradientBrush](pathgradientbrush/#constructor_4)(Point[], WrapMode) | の新しいインスタンスを初期化します`PathGradientBrush`指定されたポイントとラップ モードを持つクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend/) { get; set; } | を取得または設定しますBlendこれは、 グラデーションのカスタム減衰を定義する位置と係数を指定します. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor/) { get; set; } | パス グラデーションの中心の色を取得または設定します。 |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint/) { get; set; } | パスのグラデーションの中心点を取得または設定します。 |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales/) { get; set; } | グラデーション フォールオフのフォーカス ポイントを取得または設定します。 |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors/) { get; set; } | を取得または設定しますColorBlendマルチカラーの線形グラデーションを定義します. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle/) { get; } | この外接する四角形を取得しますPathGradientBrush. |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors/) { get; set; } | パス内のポイントに対応する色の配列を取得または設定します thisPathGradientBrush fills. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform/) { get; set; } | のコピーを取得または設定しますMatrixこれは、このためのローカル ジオメトリック transform を定義しますPathGradientBrush. |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode/) { get; set; } | を取得または設定しますWrapModeこれは、このためのラップ mode を示しますPathGradientBrush. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone/)() | これの正確なコピーを作成しますPathGradientBrush. |
| [Dispose](../../system.drawing/brush/dispose/)() | このブラシ オブジェクトで使用されているすべてのリソースを解放します。 |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform)(Matrix) | ブラシの変換マトリックスを、ブラシの変換マトリックス に別のマトリックスを掛けた積で更新します。 |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | ブラシの変換マトリックスを、ブラシの変換マトリックス に別のマトリックスを掛けた積で更新します。 |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform/)() | をリセットしますTransformプロパティからidentity. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform)(float) | 指定された量だけローカル ジオメトリック トランスフォームを回転させます。 このメソッドは、トランスフォームの前に回転を追加します。 |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | 指定された順序で、指定された量だけローカル ジオメトリック トランスフォームを回転させます。 |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform)(float, float) | 指定した量だけローカル ジオメトリック トランスフォームをスケーリングします。 このメソッドは、スケーリング マトリックスをトランスフォームの先頭に追加します。 |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | 指定された順序で、指定された量だけローカル ジオメトリック トランスフォームをスケーリングします。 |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | 中心の色と周囲の 1 つの色への線形減衰を使用してグラデーションを作成します。 |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | 中心の色と周囲の各色への線形減衰を使用してグラデーションを作成します。 |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape)(float) | パスの中心から外側に向かってパスの境界に向かって色を変化させるグラデーション ブラシを作成します。 ある色から別の色への移行は、ベル型の曲線に基づいています。 |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | パスの中心から外側に向かってパスの境界に向かって色を変化させるグラデーション ブラシを作成します。 ある色から別の色への移行は、ベル型の曲線に基づいています。 |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform)(float, float) | 指定された平行移動をローカル ジオメトリック トランスフォームに適用します。 このメソッドは、トランスフォームの前に平行移動を追加します。 |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | 指定された順序で、指定された平行移動をローカル ジオメトリック トランスフォームに適用します。 |

### 関連項目

* class [Brush](../../system.drawing/brush/)
* 名前空間 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 組み立て [Aspose.Drawing](../../)


