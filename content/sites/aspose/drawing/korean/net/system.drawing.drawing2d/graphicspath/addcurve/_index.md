---
title: GraphicsPath.AddCurve
second_title: .NET API 참조용 Aspose.Drawing
description: GraphicsPath 방법. 현재 그림에 스플라인 곡선을 추가합니다. 곡선이 배열의 각 점을 통과하기 때문에 기본 스플라인 곡선이 사용됩니다.
type: docs
weight: 110
url: /ko/net/system.drawing.drawing2d/graphicspath/addcurve/
---
## AddCurve(Point[]) {#addcurve_3}

현재 그림에 스플라인 곡선을 추가합니다. 곡선이 배열의 각 점을 통과하기 때문에 기본 스플라인 곡선이 사용됩니다.

```csharp
public void AddCurve(Point[] points)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| points | Point[] | 배열Point 곡선을 정의하는 점을 나타내는 구조. |

### 또한보십시오

* struct [Point](../../../system.drawing/point/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## AddCurve(PointF[]) {#addcurve}

현재 그림에 스플라인 곡선을 추가합니다. 곡선이 배열의 각 점을 통과하기 때문에 기본 스플라인 곡선이 사용됩니다.

```csharp
public void AddCurve(PointF[] points)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| points | PointF[] | 배열PointF 곡선을 정의하는 점을 나타내는 구조. |

### 또한보십시오

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## AddCurve(PointF[], float) {#addcurve_2}

현재 그림에 스플라인 곡선을 추가합니다.

```csharp
public void AddCurve(PointF[] points, float tension)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| points | PointF[] | 곡선을 정의하는 점을 나타내는 PointF 구조의 배열입니다. |
| tension | Single | 제어점 사이에서 곡선이 구부러지는 양을 지정하는 값입니다. 1보다 큰 값은 예측할 수 없는 결과를 생성합니다. |

### 또한보십시오

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)

---

## AddCurve(PointF[], int, int, float) {#addcurve_1}

현재 그림에 스플라인 곡선을 추가합니다.

```csharp
public void AddCurve(PointF[] points, int offset, int numberOfSegments, float tension)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| points | PointF[] | 배열PointF 곡선을 정의하는 점을 나타내는 구조. |
| offset | Int32 | 에 있는 요소의 인덱스*points* 곡선의 첫 번째 점으로 사용되는 배열입니다. |
| numberOfSegments | Int32 | 곡선을 그리는 데 사용되는 세그먼트 수입니다. 세그먼트는 두 점을 연결하는 선으로 생각할 수 있습니다. |
| tension | Single | 곡선이 제어점 사이에서 구부러지는 양을 지정하는 값입니다. 1보다 큰 값은 예측할 수 없는 결과를 생성합니다. |

### 또한보십시오

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspath/)
* 집회 [Aspose.Drawing](../../../)


