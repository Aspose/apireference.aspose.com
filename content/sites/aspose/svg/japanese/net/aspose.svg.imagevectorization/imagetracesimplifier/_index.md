---
title: Class ImageTraceSimplifier
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.ImageVectorization.ImageTraceSimplifier クラス. ImageTraceSimplifier クラスは一連のトレース ポイントによって近似される曲線内のポイントの数を減らす責任があります
type: docs
weight: 2120
url: /ja/net/aspose.svg.imagevectorization/imagetracesimplifier/
---
## ImageTraceSimplifier class

ImageTraceSimplifier クラスは、一連のトレース ポイントによって近似される曲線内のポイントの数を減らす責任があります。

```csharp
public class ImageTraceSimplifier : IImageTraceSimplifier
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor)() | の新しいインスタンスを初期化します`ImageTraceSimplifier` class. |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor_1)(float) | の新しいインスタンスを初期化します`ImageTraceSimplifier` class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Tolerance](../../aspose.svg.imagevectorization/imagetracesimplifier/tolerance/) { get; set; } | 許容値は、ポイントがトレースから除外される最大許容誤差を決定します。 0 から 4 の範囲である必要があります。これより高い値または低い値は、この範囲の最小値および最大値に合わせて調整されます。 デフォルト値は 0.3 です。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Simplify](../../aspose.svg.imagevectorization/imagetracesimplifier/simplify/)(IEnumerable&lt;PointF&gt;) | トレース ポイントのリストからポイントの数を減らします。 |

### 関連項目

* interface [IImageTraceSimplifier](../iimagetracesimplifier/)
* 名前空間 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 組み立て [Aspose.SVG](../../)


