---
title: Aspose.Svg.ImageVectorization
second_title: .NET API 참조용 Aspose.SVG
description: Aspose.Svg.ImageVectorization네임스페이스에는 래스터 이미지를 벡터화하고 SVG 문서로 변환하기 위한 클래스가 포함되어 있습니다. 이 프로세스에는 비트맵을 경로 요소로 구성된 기하학적 모양으로 줄이고 SVG로 저장하는 작업이 포함됩니다. 네임스페이스에는 경로 세그먼트를 구축하고 추적점을 단순화 및 매끄럽게 하기 위한 클래스가 포함되어 있습니다. 및 벡터화 옵션 구성.
type: docs
weight: 170
url: /ko/net/aspose.svg.imagevectorization/
---
**Aspose.Svg.ImageVectorization**네임스페이스에는 래스터 이미지를 벡터화하고 SVG 문서로 변환하기 위한 클래스가 포함되어 있습니다. 이 프로세스에는 비트맵을 경로 요소로 구성된 기하학적 모양으로 줄이고 SVG로 저장하는 작업이 포함됩니다. 네임스페이스에는 경로 세그먼트를 구축하고 추적점을 단순화 및 매끄럽게 하기 위한 클래스가 포함되어 있습니다. 및 벡터화 옵션 구성.

## 클래스

| 수업 | 설명 |
| --- | --- |
| [BezierPathBuilder](./bezierpathbuilder/) | [`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) 클래스는 경로 세그먼트 구축을 담당합니다.[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) 추적 포인트 목록에서. 이 경로 작성기는 최소 제곱법을 사용하여 포인트 추적을 위한 베지어 제어점을 찾습니다. |
| [ImageTraceSimplifier](./imagetracesimplifier/) | ImageTraceSimplifier 클래스는 일련의 추적점으로 근사되는 곡선의 점 수를 줄이는 역할을 합니다. |
| [ImageTraceSmoother](./imagetracesmoother/) | ImageTraceSimplifier 클래스는 일련의 추적점에 의해 근사화되는 곡선의 점 수를 부드럽게 하는 역할을 합니다. 이 클래스는 가장 가까운 이웃 접근법을 구현합니다. |
| [ImageVectorizer](./imagevectorizer/) | 이 ImageVectorizer 클래스는 PNG, JPG, GIF, BMP 등과 같은 래스터 이미지를 벡터화하고 SVGDocument를 반환합니다. 벡터화에서 우리는 비트맵을 경로 요소로 구성되고 SVG로 저장되는 기하학적 모양으로 줄이는 과정을 의미합니다. |
| [ImageVectorizerConfiguration](./imagevectorizerconfiguration/) | [`ImageVectorizerConfiguration`](../aspose.svg.imagevectorization/imagevectorizerconfiguration/) 클래스는 이미지 벡터화 방법 및 옵션의 구성을 정의합니다. 이 구성은 ImageVectorizer를 초기화하는 데 사용되며 이미지 벡터화를 위한 구성 옵션을 제공합니다. |
| [SplinePathBuilder](./splinepathbuilder/) | [`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) 클래스는 경로 세그먼트 구축을 담당합니다.[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) 추적 지점 목록에서. 이 경로 작성기는 매끄럽고 축소된 경로 지점 세트에 Catmull-Roma 스플라인을 적용하는 것을 기반으로 합니다.. |
| [StencilConfiguration](./stencilconfiguration/) | [`StencilConfiguration`](../aspose.svg.imagevectorization/stencilconfiguration/) 클래스는 스텐실 효과 옵션의 구성을 정의합니다. |
## 인터페이스

| 상호 작용 | 설명 |
| --- | --- |
| [IImageTraceSimplifier](./iimagetracesimplifier/) | IImageTraceSimplifier 인터페이스는 추적에서 포인트 감소를 담당합니다. |
| [IImageTraceSmoother](./iimagetracesmoother/) | IImageTraceSmoother 인터페이스는 매끄러운 추적을 담당합니다. |
| [IPathBuilder](./ipathbuilder/) | IPathBuilder 인터페이스는 경로 세그먼트 구축을 담당합니다.[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) 추적 지점 목록에서. |
## 열거

| 열거 | 설명 |
| --- | --- |
| [StencilType](./stenciltype/) | [`StencilType`](../aspose.svg.imagevectorization/stenciltype/) enum은 스텐실 유형을 정의합니다. |


