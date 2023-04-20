---
title: Class BezierPathBuilder
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.ImageVectorization.BezierPathBuilder クラス. SplinePathBuilderクラスはパス セグメントの構築を担当しますSVGPathSegトレース ポイントのリストから. このパス ビルダーは最小二乗法を使用してポイントのトレース用のベジエ コントロール ポイントを見つけることに基づいています.
type: docs
weight: 2080
url: /ja/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

[`SplinePathBuilder`](../splinepathbuilder/)クラスは、パス セグメントの構築を担当します[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/)トレース ポイントのリストから. このパス ビルダーは、最小二乗法を使用して、ポイントのトレース用のベジエ コントロール ポイントを見つけることに基づいています.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | の新しいインスタンスを初期化します`BezierPathBuilder` class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | エラーしきい値を取得または設定します。 このパラメーターは、適合曲線に対する点の最大偏差を定義します。 デフォルトでは 30 です。 |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | エラーしきい値を取得または設定します。 このパラメーターは、最小二乗近似法の反復回数を定義します。 デフォルトでは 30 です。 |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | トレースをスムーズに取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | トレース ポイントのリストからパス セグメントを構築します。 |

### 関連項目

* interface [IPathBuilder](../ipathbuilder/)
* 名前空間 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 組み立て [Aspose.SVG](../../)


