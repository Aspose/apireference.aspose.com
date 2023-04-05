---
title: Class XpsPathGeometry
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry 수업. PathGeometry 속성 요소 기능을 캡슐화하는 클래스. 이 요소에는 Figures 특성 또는 하위 PathFigure 요소가 있는 로 지정된 경로 그림 집합이 포함됩니다.
type: docs
weight: 3270
url: /ko/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

PathGeometry 속성 요소 기능을 캡슐화하는 클래스. 이 요소에는 Figures 특성 또는 하위 PathFigure 요소가 있는 로 지정된 경로 그림 집합이 포함됩니다.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | 기하학 모양의 교차 영역이 영역을 형성하기 위해 결합되는 방식을 지정하는 값을 반환/설정합니다. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | 하위 경로 그림 목록을 반환합니다. |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | 채우기, 클리핑 또는 스트로크에 사용 되기 전에 경로 지오메트리의 모든 자식 및 하위 요소에 적용되는 로컬 행렬 transformation 를 설정하는 아핀 변환 행렬을 반환/설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | 마지막 pah 수치의 하위 세그먼트 목록에 경로 세그먼트를 추가합니다. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | 이 경로 형상을 복제합니다. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | 의 하위 세그먼트 목록에 경로 세그먼트를 삽입합니다.*index* 위치. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | 마지막 경로 그림의 하위 세그먼트 목록에서 경로 세그먼트를 제거합니다. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | 의 하위 세그먼트 목록에서 경로 세그먼트를 제거합니다.*index* 위치. |

### 또한보십시오

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* 네임스페이스 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 집회 [Aspose.Page](../../)


