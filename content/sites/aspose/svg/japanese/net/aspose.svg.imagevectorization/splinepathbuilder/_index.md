---
title: Class SplinePathBuilder
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.ImageVectorization.SplinePathBuilder クラス. SplinePathBuilderクラスはパス セグメントの構築を担当しますSVGPathSegトレース ポイントのリストから. このパス ビルダーはCatmullRoma スプラインを平滑化および削減されたパス ポイントのセットに適用することに基づいています..
type: docs
weight: 2160
url: /ja/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

`SplinePathBuilder`クラスは、パス セグメントの構築を担当します[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/)トレース ポイントのリストから. このパス ビルダーは、Catmull-Roma スプラインを平滑化および削減されたパス ポイントのセットに適用することに基づいています..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | の新しいインスタンスを初期化します`SplinePathBuilder` class. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | の新しいインスタンスを初期化します`SplinePathBuilder` class. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | の新しいインスタンスを初期化します`SplinePathBuilder` class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | テンションの値は、(補間された) コントロール ポイントでカーブがどの程度鋭く曲がるかに影響します。それに応じて. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | トレース簡略化を取得または設定します。 |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | トレースをスムーズに取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | トレース ポイントのリストからパス セグメントを構築します。 |

### 関連項目

* interface [IPathBuilder](../ipathbuilder/)
* 名前空間 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 組み立て [Aspose.SVG](../../)


