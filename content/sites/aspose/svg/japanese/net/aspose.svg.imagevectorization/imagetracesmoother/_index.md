---
title: Class ImageTraceSmoother
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.ImageVectorization.ImageTraceSmoother クラス. ImageTraceSimplifier クラスは一連のトレース ポイントによって近似される曲線内のポイント数を平滑化します このクラスは最近傍法を実装します
type: docs
weight: 2130
url: /ja/net/aspose.svg.imagevectorization/imagetracesmoother/
---
## ImageTraceSmoother class

ImageTraceSimplifier クラスは、一連のトレース ポイントによって近似される曲線内のポイント数を平滑化します。 このクラスは、最近傍法を実装します。

```csharp
public class ImageTraceSmoother : IImageTraceSmoother
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [ImageTraceSmoother](imagetracesmoother/#constructor)() | の新しいインスタンスを初期化します`ImageTraceSmoother` class. |
| [ImageTraceSmoother](imagetracesmoother/#constructor_1)(int) | の新しいインスタンスを初期化します`ImageTraceSmoother` class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Extent](../../aspose.svg.imagevectorization/imagetracesmoother/extent/) { get; set; } | クエリ ポイントによって考慮される領域のセットの範囲を取得します。 1 ～ 20 の範囲内である必要があります。これより高い値または低い値は、この範囲の最小値および最大値に合わせて調整されます。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| virtual [Smooth](../../aspose.svg.imagevectorization/imagetracesmoother/smooth/)(IEnumerable&lt;PointF&gt;) | トレースを滑らかにします。 |

### 関連項目

* interface [IImageTraceSmoother](../iimagetracesmoother/)
* 名前空間 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 組み立て [Aspose.SVG](../../)


