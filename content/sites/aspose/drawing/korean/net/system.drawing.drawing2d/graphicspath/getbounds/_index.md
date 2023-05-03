---
title: GraphicsPath.GetBounds
second_title: .NET API 참조용 Aspose.Drawing
description: GraphicsPath 방법. 이것을 경계하는 사각형을 반환합니다.GraphicsPath .
type: docs
weight: 260
url: /ko/net/system.drawing.drawing2d/graphicspath/getbounds/
---
## GetBounds() {#getbounds}

이것을 경계하는 사각형을 반환합니다.GraphicsPath .

```csharp
public RectangleF GetBounds()
```

### 반환 값

ㅏRectangleF bounds this 인 직사각형을 나타냅니다.GraphicsPath.

### 또한보십시오

* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## GetBounds(Matrix) {#getbounds_1}

이것을 경계하는 사각형을 반환합니다.GraphicsPath 이 경로가 지정된 경로에 의해 변환될 때Matrix .

```csharp
public RectangleF GetBounds(Matrix matrix)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| matrix | Matrix | 그만큼Matrix 경계 사각형이 계산되기 전에 이 경로에 적용할 transformation 를 지정합니다. 이 경로는 영구적으로 변환되지 않습니다. 변환은 경계 사각형을 계산하는 process 동안에만 사용됩니다. |

### 반환 값

ㅏRectangleF bounds this 인 직사각형을 나타냅니다.GraphicsPath.

### 또한보십시오

* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## GetBounds(Matrix, Pen) {#getbounds_2}

이것을 경계하는 사각형을 반환합니다.GraphicsPath 현재 경로가 지정된 경로에 의해 변환된 경우Matrix 그리고 지정된Pen .

```csharp
public RectangleF GetBounds(Matrix matrix, Pen pen)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| matrix | Matrix | 그만큼Matrix 경계 사각형이 계산되기 전에 이 path 에 적용할 변환을 지정합니다. 이 경로는 영구적으로 변환되지 않습니다. 변환은 경계 사각형을 계산하는 동안에만 사용됩니다. |
| pen | Pen | 그만큼Pen 를 그리는 것으로GraphicsPath. |

### 반환 값

ㅏRectangleF this 를 경계로 하는 직사각형을 나타냅니다.GraphicsPath.

### 또한보십시오

* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [Pen](../../../system.drawing/pen/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)


