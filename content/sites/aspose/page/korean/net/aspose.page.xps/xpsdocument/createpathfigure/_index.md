---
title: XpsDocument.CreatePathFigure
second_title: .NET API 참조용 Aspose.Page
description: XpsDocument 방법. 새 경로 그림을 만듭니다.
type: docs
weight: 280
url: /ko/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

새 경로 그림을 만듭니다.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | PointF | 경로 그림의 첫 번째 세그먼트에 대한 시작점입니다. |
| isClosed | Boolean | 경로가 닫혀 있는지 여부를 지정합니다. true로 설정하면 스트로크가 그려집니다 "닫힘", 즉 경로 그림의 마지막 세그먼트에 있는 마지막 포인트가 StartPoint 속성에 지정된 포인트 와 연결되고, 그렇지 않으면 스트로크가 "열림"으로 그려지고 마지막 점이 그려집니다. 점이 시작점에 연결되어 있지 않습니다. 스트로크를 지정하는 {Path} 요소에서 사용되는 경로 그림이 인 경우에만 적용됩니다. |

### 반환 값

새로운 경로 그림.

### 또한보십시오

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* 네임스페이스 [Aspose.Page.XPS](../../xpsdocument/)
* 집회 [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

새 경로 그림을 만듭니다.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | PointF | 경로 그림의 첫 번째 세그먼트에 대한 시작점입니다. |
| segments | List`1 | 경로 세그먼트 목록. |
| isClosed | Boolean | 경로가 닫혀 있는지 여부를 지정합니다. true로 설정하면 스트로크가 그려집니다 "닫힘", 즉 경로 그림의 마지막 세그먼트에 있는 마지막 포인트가 StartPoint 속성에 지정된 포인트 와 연결되고, 그렇지 않으면 스트로크가 "열림"으로 그려지고 마지막 점이 그려집니다. 점이 시작점에 연결되어 있지 않습니다. 스트로크를 지정하는 {Path} 요소에서 사용되는 경로 그림이 인 경우에만 적용됩니다. |

### 반환 값

새로운 경로 그림.

### 또한보십시오

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* 네임스페이스 [Aspose.Page.XPS](../../xpsdocument/)
* 집회 [Aspose.Page](../../../)


