---
title: Graphics.DrawArc
second_title: .NET API 참조용 Aspose.Drawing
description: Graphics 방법. RectangleF 구조로 지정된 타원의 일부를 나타내는 호를 그립니다.
type: docs
weight: 260
url: /ko/net/system.drawing/graphics/drawarc/
---
## DrawArc(Pen, RectangleF, float, float) {#drawarc_1}

RectangleF 구조로 지정된 타원의 일부를 나타내는 호를 그립니다.

```csharp
public void DrawArc(Pen pen, RectangleF rect, float startAngle, float sweepAngle)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pen | Pen | 호의 색상, 너비 및 스타일을 결정하는 펜입니다. |
| rect | RectangleF | 타원의 경계를 정의하는 RectangleF 구조체입니다. |
| startAngle | Single | x축에서 호의 시작점까지 시계 방향으로 측정한 각도(도)입니다. |
| sweepAngle | Single | startAngle 매개변수에서 호의 끝점까지 시계 방향으로 측정한 각도(도)입니다. |

### 또한보십시오

* class [Pen](../../pen/)
* struct [RectangleF](../../rectanglef/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## DrawArc(Pen, float, float, float, float, float, float) {#drawarc}

좌표 쌍, 너비 및 높이로 지정된 타원의 일부를 나타내는 호를 그립니다.

```csharp
public void DrawArc(Pen pen, float x, float y, float width, float height, float startAngle, 
    float sweepAngle)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pen | Pen | 호의 색상, 너비 및 스타일을 결정하는 펜입니다. |
| x | Single | 타원을 정의하는 사각형의 왼쪽 위 모퉁이에 대한 x 좌표입니다. |
| y | Single | 타원을 정의하는 사각형의 왼쪽 위 모서리에 대한 y좌표입니다. |
| width | Single | 타원을 정의하는 사각형의 너비입니다. |
| height | Single | 타원을 정의하는 사각형의 높이입니다. |
| startAngle | Single | x축에서 호의 시작점까지 시계 방향으로 측정한 각도(도)입니다. |
| sweepAngle | Single | startAngle 매개변수에서 호의 끝점까지 시계 방향으로 측정한 각도(도)입니다. |

### 또한보십시오

* class [Pen](../../pen/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)


