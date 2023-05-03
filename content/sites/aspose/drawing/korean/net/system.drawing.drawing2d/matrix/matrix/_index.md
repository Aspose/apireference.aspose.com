---
title: Matrix.Matrix
second_title: .NET API 참조용 Aspose.Drawing
description: Matrix 건설자. Matrix 클래스의 새 인스턴스를 항등 행렬로 초기화합니다.
type: docs
weight: 10
url: /ko/net/system.drawing.drawing2d/matrix/matrix/
---
## Matrix() {#constructor}

Matrix 클래스의 새 인스턴스를 항등 행렬로 초기화합니다.

```csharp
public Matrix()
```

### 또한보십시오

* class [Matrix](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../matrix/)
* 집회 [Aspose.Drawing](../../../)

---

## Matrix(float, float, float, float, float, float) {#constructor_1}

지정된 요소를 사용하여 Matrix 클래스의 새 인스턴스를 초기화합니다.

```csharp
public Matrix(float m11, float m12, float m21, float m22, float dx, float dy)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| m11 | Single | 새 Matrix의 첫 번째 행과 첫 번째 열에 있는 값입니다. |
| m12 | Single | 새 Matrix의 첫 번째 행과 두 번째 열에 있는 값입니다. |
| m21 | Single | 새 Matrix의 두 번째 행과 첫 번째 열에 있는 값입니다. |
| m22 | Single | 새 Matrix의 두 번째 행과 두 번째 열에 있는 값입니다. |
| dx | Single | 새 Matrix의 세 번째 행과 첫 번째 열에 있는 값입니다. |
| dy | Single | 새 Matrix의 세 번째 행과 두 번째 열에 있는 값입니다. |

### 또한보십시오

* class [Matrix](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../matrix/)
* 집회 [Aspose.Drawing](../../../)

---

## Matrix(Rectangle, Point[]) {#constructor_2}

의 새 인스턴스를 초기화합니다.[`Matrix`](../) 지정된 사각형과 포인트 배열로 정의된 기하학적 변환 클래스.

```csharp
public Matrix(Rectangle rect, Point[] plgpts)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | Rectangle | ㅏRectangle 변환할 사각형을 나타내는 구조체입니다. |
| plgpts | Point[] | 세 개의 배열Point 사각형의 왼쪽 위, 오른쪽 위 및 왼쪽 아래 모서리가 변환될 평행사변형의 점을 나타내는 구조체입니다. 평행사변형의 오른쪽 아래 모서리는 처음 세 모서리에 의해 암시됩니다. |

### 또한보십시오

* struct [Rectangle](../../../system.drawing/rectangle/)
* struct [Point](../../../system.drawing/point/)
* class [Matrix](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../matrix/)
* 집회 [Aspose.Drawing](../../../)

---

## Matrix(RectangleF, PointF[]) {#constructor_3}

의 새 인스턴스를 초기화합니다.[`Matrix`](../) 지정된 사각형과 포인트 배열로 정의된 기하학적 변환 클래스.

```csharp
public Matrix(RectangleF rect, PointF[] plgpts)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | RectangleF | ㅏRectangleF 변환할 사각형을 나타내는 구조체입니다. |
| plgpts | PointF[] | 세 개의 배열PointF 사각형의 왼쪽 위, 오른쪽 위 및 왼쪽 아래 모서리가 변환될 평행사변형의 점을 나타내는 구조체입니다. 평행사변형의 오른쪽 아래 모서리는 처음 세 모서리에 의해 암시됩니다. |

### 또한보십시오

* struct [RectangleF](../../../system.drawing/rectanglef/)
* struct [PointF](../../../system.drawing/pointf/)
* class [Matrix](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../matrix/)
* 집회 [Aspose.Drawing](../../../)


