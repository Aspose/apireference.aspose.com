---
title: Class SplinePathBuilder
second_title: .NET API 참조용 Aspose.SVG
description: Aspose.Svg.ImageVectorization.SplinePathBuilder 수업. SplinePathBuilder 클래스는 경로 세그먼트 구축을 담당합니다.SVGPathSeg 추적 지점 목록에서. 이 경로 작성기는 매끄럽고 축소된 경로 지점 세트에 CatmullRoma 스플라인을 적용하는 것을 기반으로 합니다..
type: docs
weight: 2160
url: /ko/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

`SplinePathBuilder` 클래스는 경로 세그먼트 구축을 담당합니다.[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) 추적 지점 목록에서. 이 경로 작성기는 매끄럽고 축소된 경로 지점 세트에 Catmull-Roma 스플라인을 적용하는 것을 기반으로 합니다..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | 의 새 인스턴스를 초기화합니다.`SplinePathBuilder` 클래스. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | 의 새 인스턴스를 초기화합니다.`SplinePathBuilder` 클래스. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | 의 새 인스턴스를 초기화합니다.`SplinePathBuilder` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | 장력 값은 (보간된) 제어점에서 곡선이 얼마나 급격하게 구부러지는지에 영향을 미칩니다. 0에서 1 사이의 범위에 있어야 합니다. 더 크거나 작은 값은 이 범위의 최소값 및 최대값과 정렬됩니다. 그에 따라. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | 추적 단순화를 가져오거나 설정합니다. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | 추적을 부드럽게 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | 추적 지점 목록에서 경로 세그먼트를 작성합니다. |

### 또한보십시오

* interface [IPathBuilder](../ipathbuilder/)
* 네임스페이스 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 집회 [Aspose.SVG](../../)


