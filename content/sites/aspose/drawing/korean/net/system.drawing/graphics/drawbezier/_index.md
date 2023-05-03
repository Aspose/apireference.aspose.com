---
title: Graphics.DrawBezier
second_title: .NET API 참조용 Aspose.Drawing
description: Graphics 방법. 4개의 PointF 구조로 정의된 베지어 스플라인을 그립니다.
type: docs
weight: 270
url: /ko/net/system.drawing/graphics/drawbezier/
---
## DrawBezier(Pen, PointF, PointF, PointF, PointF) {#drawbezier_1}

4개의 PointF 구조로 정의된 베지어 스플라인을 그립니다.

```csharp
public void DrawBezier(Pen pen, PointF pt1, PointF pt2, PointF pt3, PointF pt4)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pen | Pen | 곡선의 색상, 너비 및 스타일을 결정하는 펜입니다. |
| pt1 | PointF | 곡선의 시작점을 나타내는 PointF 구조체입니다. |
| pt2 | PointF | 곡선의 첫 번째 제어점을 나타내는 PointF 구조체입니다. |
| pt3 | PointF | 곡선의 두 번째 제어점을 나타내는 PointF 구조체입니다. |
| pt4 | PointF | 곡선의 끝점을 나타내는 PointF 구조체입니다. |

### 또한보십시오

* class [Pen](../../pen/)
* struct [PointF](../../pointf/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## DrawBezier(Pen, float, float, float, float, float, float, float, float) {#drawbezier}

점을 나타내는 4개의 정렬된 좌표 쌍으로 정의된 베지어 스플라인을 그립니다.

```csharp
public void DrawBezier(Pen pen, float x1, float y1, float x2, float y2, float x3, float y3, 
    float x4, float y4)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pen | Pen | 곡선의 색상, 너비 및 스타일을 결정하는 펜입니다. |
| x1 | Single | 곡선 시작점의 x 좌표입니다. |
| y1 | Single | 곡선 시작점의 y 좌표입니다. |
| x2 | Single | 곡선의 첫 번째 제어점의 x 좌표입니다. |
| y2 | Single | 곡선의 첫 번째 제어점의 y 좌표입니다. |
| x3 | Single | 곡선의 두 번째 제어점의 x 좌표입니다. |
| y3 | Single | 곡선의 두 번째 제어점의 y 좌표입니다. |
| x4 | Single | 곡선 끝점의 x 좌표입니다. |
| y4 | Single | 곡선 끝점의 y 좌표입니다. |

### 또한보십시오

* class [Pen](../../pen/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)


