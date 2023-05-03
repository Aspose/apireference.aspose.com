---
title: Graphics.DrawPie
second_title: .NET API 참조용 Aspose.Drawing
description: Graphics 방법. RectangleF 구조와 두 개의 방사형 선으로 지정된 타원으로 정의된 파이 모양을 그립니다.
type: docs
weight: 400
url: /ko/net/system.drawing/graphics/drawpie/
---
## DrawPie(Pen, RectangleF, float, float) {#drawpie_1}

RectangleF 구조와 두 개의 방사형 선으로 지정된 타원으로 정의된 파이 모양을 그립니다.

```csharp
public void DrawPie(Pen pen, RectangleF rect, float startAngle, float sweepAngle)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pen | Pen | 파이 모양의 색상, 너비 및 스타일을 결정하는 펜입니다. |
| rect | RectangleF | 파이 모양이 나오는 타원을 정의하는 경계 rectangle 를 나타내는 RectangleF 구조입니다. |
| startAngle | Single | x축에서 파이 모양의 첫 번째 면까지 시계 방향으로 측정한 각도입니다. |
| sweepAngle | Single | startAngle 매개변수 에서 파이 모양의 두 번째 면까지 시계 방향으로 측정된 각도입니다. |

### 또한보십시오

* class [Pen](../../pen/)
* struct [RectangleF](../../rectanglef/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## DrawPie(Pen, float, float, float, float, float, float) {#drawpie}

좌표 쌍, 너비, 높이 및 두 개의 방사형 선으로 지정된 타원으로 정의된 파이 모양을 그립니다.

```csharp
public void DrawPie(Pen pen, float x, float y, float width, float height, float startAngle, 
    float sweepAngle)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pen | Pen | Pen 파이 모양의 색상, 너비 및 스타일을 결정합니다. |
| x | Single | 파이 모양이 나오는 타원을 정의하는 경계 사각형의 왼쪽 위 모퉁이의 x 좌표입니다. |
| y | Single | 파이 모양이 나오는 타원을 정의하는 경계 사각형의 왼쪽 위 모퉁이에 대한 y좌표입니다. |
| width | Single | 파이 모양이 나오는 타원을 정의하는 경계 사각형의 너비입니다. |
| height | Single | 파이 모양이 나오는 타원을 정의하는 경계 사각형의 높이입니다. |
| startAngle | Single | x축에서 파이 모양의 첫 번째 면까지 시계 방향으로 측정한 각도입니다. |
| sweepAngle | Single | startAngle 매개변수에서 파이 모양의 두 번째 면까지 시계 방향으로 측정한 각도입니다. |

### 또한보십시오

* class [Pen](../../pen/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)


