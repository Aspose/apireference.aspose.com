---
title: GraphicsPath.Widen
second_title: .NET API 참조용 Aspose.Drawing
description: GraphicsPath 방법. 경로에 윤곽선을 추가합니다.
type: docs
weight: 360
url: /ko/net/system.drawing.drawing2d/graphicspath/widen/
---
## Widen(Pen) {#widen}

경로에 윤곽선을 추가합니다.

```csharp
public void Widen(Pen pen)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pen | Pen | ㅏPen 경로의 원래 윤곽선과 이 메서드가 만드는 새 윤곽선 사이의 너비를 지정합니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| NotImplementedException | 방법이 구현되지 않았습니다. |

### 또한보십시오

* class [Pen](../../../system.drawing/pen/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix) {#widen_1}

에 윤곽을 추가합니다.GraphicsPath .

```csharp
public void Widen(Pen pen, Matrix matrix)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pen | Pen | ㅏPen 경로의 원래 윤곽선과 이 메서드가 만드는 새 윤곽선 사이의 너비를 지정합니다. |
| matrix | Matrix | ㅏMatrix 확장하기 전에 경로에 적용할 변환을 지정합니다. |

### 또한보십시오

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix, float) {#widen_2}

이것을 대체합니다.GraphicsPath 지정된 펜으로 이 경로를 그릴 때 채워지는 영역을 둘러싸는 곡선으로.

```csharp
public void Widen(Pen pen, Matrix matrix, float flatness)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pen | Pen | ㅏPen 경로의 원래 윤곽선과 이 메서드가 만드는 새 윤곽선 사이의 너비를 지정합니다. |
| matrix | Matrix | ㅏMatrix 확장하기 전에 경로에 적용할 변환을 지정합니다. |
| flatness | Single | 곡선의 평탄도를 지정하는 값입니다. |

### 비고

MS System.Drawing 구현은 Widen() 내에서 Flatten()을 호출하거나 동일한 알고리즘을 사용합니다. Aspose.Drawing 구현은 곡선을 선분으로 대체하지 않고 Skia 알고리즘을 사용합니다. 그것은 무시`평탄` 매개변수.

### 또한보십시오

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)


