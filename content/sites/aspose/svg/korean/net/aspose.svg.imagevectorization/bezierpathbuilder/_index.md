---
title: Class BezierPathBuilder
second_title: .NET API 참조용 Aspose.SVG
description: Aspose.Svg.ImageVectorization.BezierPathBuilder 수업. SplinePathBuilder 클래스는 경로 세그먼트 구축을 담당합니다.SVGPathSeg 추적 포인트 목록에서. 이 경로 작성기는 최소 제곱법을 사용하여 포인트 추적을 위한 베지어 제어점을 찾습니다.
type: docs
weight: 2080
url: /ko/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

[`SplinePathBuilder`](../splinepathbuilder/) 클래스는 경로 세그먼트 구축을 담당합니다.[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) 추적 포인트 목록에서. 이 경로 작성기는 최소 제곱법을 사용하여 포인트 추적을 위한 베지어 제어점을 찾습니다.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | 의 새 인스턴스를 초기화합니다.`BezierPathBuilder` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | 오류 임계값을 가져오거나 설정합니다. 이 매개변수는 적합 곡선에 대한 점의 최대 편차를 정의합니다. 기본적으로 30입니다. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | 오류 임계값을 가져오거나 설정합니다. 이 매개 변수는 최소 제곱 근사 방법의 반복 횟수를 정의합니다. 기본적으로 30입니다. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | 추적을 부드럽게 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | 추적 지점 목록에서 경로 세그먼트를 작성합니다. |

### 또한보십시오

* interface [IPathBuilder](../ipathbuilder/)
* 네임스페이스 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 집회 [Aspose.SVG](../../)


