---
title: Class GraphicsPathIterator
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Drawing2D.GraphicsPathIterator クラス. でサブパスを反復する機能を提供しますGraphicsPath各サブパスに含まれる形状のタイプをテストします. このクラスは継承できません.
type: docs
weight: 270
url: /ja/net/system.drawing.drawing2d/graphicspathiterator/
---
## GraphicsPathIterator class

でサブパスを反復する機能を提供します。GraphicsPath各サブパスに含まれる形状のタイプをテストします. このクラスは継承できません.

```csharp
public sealed class GraphicsPathIterator : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [GraphicsPathIterator](graphicspathiterator/)(GraphicsPath) | の新しいインスタンスを初期化します`GraphicsPathIterator`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Count](../../system.drawing.drawing2d/graphicspathiterator/count/) { get; } | パスのポイント数を取得します。 |
| [SubpathCount](../../system.drawing.drawing2d/graphicspathiterator/subpathcount/) { get; } | パス内のサブパスの数を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CopyData](../../system.drawing.drawing2d/graphicspathiterator/copydata/)(ref PointF[], ref byte[], int, int) | 関連する[`GraphicsPath`](../graphicspath/)指定された2つの配列に. |
| [Dispose](../../system.drawing.drawing2d/graphicspathiterator/dispose/)() | アンマネージ リソースの解放、解放、またはリセットに関連するアプリケーション定義のタスクを実行します。 |
| [Enumerate](../../system.drawing.drawing2d/graphicspathiterator/enumerate/)(ref PointF[], ref byte[]) | 関連する[`GraphicsPath`](../graphicspath/)指定された2つの配列に. |
| [HasCurve](../../system.drawing.drawing2d/graphicspathiterator/hascurve/)() | パスがこれに関連付けられているかどうかを示します`GraphicsPathIterator`曲線が含まれています. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker_1)(GraphicsPath) | これ`GraphicsPathIterator`オブジェクトは[`GraphicsPath`](../graphicspath/)それに関連付けられたオブジェクト. このメソッドは、関連付けられた[`GraphicsPath`](../graphicspath/)path 内の次のマーカーにコピーし、現在のマーカーと次のマーカー (またはパスの終わり) の間に含まれるすべてのポイントを 1 秒にコピーします。[`GraphicsPath`](../graphicspath/)パラメータに渡されたオブジェクト. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker)(out int, out int) | インクリメント`GraphicsPathIterator`path の次のマーカーに移動し、[out] パラメータを介して開始インデックスと終了インデックスを返します。 |
| [NextPathType](../../system.drawing.drawing2d/graphicspathiterator/nextpathtype/)(out byte, out int, out int) | すべて同じタイプのデータ ポイントの次のグループの開始インデックスと終了インデックスを取得します。 |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath_1)(GraphicsPath, out bool) | この関連付けられたパスから次の図形 (サブパス) を取得します`GraphicsPathIterator`. |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath)(out int, out int, out bool) | 移動します`GraphicsPathIterator`パス内の次のサブパスへ。 [out] パラメータには、次のサブパスの開始インデックスと終了インデックスが含まれます。 |
| [Rewind](../../system.drawing.drawing2d/graphicspathiterator/rewind/)() | これを巻き戻します`GraphicsPathIterator`関連するパスの先頭に. |

### 関連項目

* 名前空間 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 組み立て [Aspose.Drawing](../../)


