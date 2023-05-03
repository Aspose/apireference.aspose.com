---
title: Class TextureBrush
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.TextureBrush クラス. TextureBrush クラスの各プロパティはイメージを使用してシェイプの内部を塗りつぶす Brush オブジェクトです このクラスは継承できません
type: docs
weight: 1260
url: /ja/net/system.drawing/texturebrush/
---
## TextureBrush class

TextureBrush クラスの各プロパティは、イメージを使用してシェイプの内部を塗りつぶす Brush オブジェクトです。 このクラスは継承できません。

```csharp
public sealed class TextureBrush : Brush
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [TextureBrush](texturebrush/#constructor)(Image) | の新しいインスタンスを初期化します`TextureBrush`指定された画像を使用するクラス. |
| [TextureBrush](texturebrush/#constructor_3)(Image, RectangleF) | の新しいインスタンスを初期化します`TextureBrush`指定された画像と外接する四角形を使用するクラス. |
| [TextureBrush](texturebrush/#constructor_1)(Image, WrapMode) | の新しいインスタンスを初期化します`TextureBrush`指定されたイメージとラップ モードを使用するクラス. |
| [TextureBrush](texturebrush/#constructor_4)(Image, RectangleF, ImageAttributes) | の新しいインスタンスを初期化します`TextureBrush`指定された画像、外接する四角形、および画像属性を使用するクラス. |
| [TextureBrush](texturebrush/#constructor_2)(Image, WrapMode, RectangleF) | の新しいインスタンスを初期化します`TextureBrush`指定された画像、ラップ モード、外接する四角形を使用するクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image/) { get; } | この TextureBrush オブジェクトに関連付けられた Image オブジェクトを取得します。 |
| [Transform](../../system.drawing/texturebrush/transform/) { get; set; } | この TextureBrush オブジェクトに関連付けられた image のローカル ジオメトリック変換を定義する Matrix オブジェクトのコピーを取得または設定します。 |
| [WrapMode](../../system.drawing/texturebrush/wrapmode/) { get; set; } | この TextureBrush オブジェクトのラップ モードを示す WrapMode 列挙体を取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone/)() | これの正確なコピーを作成しますTextureBrushobject. |
| [Dispose](../../system.drawing/brush/dispose/)() | このブラシ オブジェクトで使用されているすべてのリソースを解放します。 |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform)(Matrix) | を乗算します。Matrixこのローカル幾何変換 を表すオブジェクトTextureBrush指定されたオブジェクトMatrixprepending によるオブジェクトMatrixobject. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | を乗算します。Matrixこのローカル幾何変換 を表すオブジェクトTextureBrush指定されたオブジェクトMatrix指定された順序のオブジェクト. |
| [ResetTransform](../../system.drawing/texturebrush/resettransform/)() | この Transform プロパティをリセットしますTextureBrushobject. へのオブジェクト |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform)(float) | このローカル幾何学的変換を回転させますTextureBrush このメソッドは、変換の前に回転を追加します. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | このローカル幾何学的変換を回転させますTextureBrush指定された順序で指定された量 によってオブジェクト。 |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform)(float, float) | このローカル幾何学的変換をスケーリングしますTextureBrush このメソッドは、スケーリング行列を変換の先頭に追加します. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | このローカル幾何学的変換をスケーリングしますTextureBrush object 指定された順序で指定された量によって. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform)(float, float) | このローカル幾何学的変換を変換しますTextureBrush指定された次元によるオブジェクト. このメソッドは、変換を変換の先頭に追加します. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | このローカル幾何学的変換を変換しますTextureBrush指定された寸法 のオブジェクトを指定された順序で. |

### 関連項目

* class [Brush](../brush/)
* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


