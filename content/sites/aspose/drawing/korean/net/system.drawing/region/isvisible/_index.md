---
title: Region.IsVisible
second_title: .NET API 참조용 Aspose.Drawing
description: Region 방법. 지정된 점이 이 안에 포함되는지 여부를 테스트합니다.Region .
type: docs
weight: 130
url: /ko/net/system.drawing/region/isvisible/
---
## IsVisible(float, float) {#isvisible_3}

지정된 점이 이 안에 포함되는지 여부를 테스트합니다.Region .

```csharp
public bool IsVisible(float x, float y)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Single | 테스트할 점의 x 좌표입니다. |
| y | Single | 테스트할 점의 y 좌표입니다. |

### 반환 값

지정된 점이 이 안에 포함된 경우 trueRegion; 그렇지 않으면 거짓입니다.

### 또한보십시오

* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(PointF) {#isvisible_9}

지정된PointF 구조는 이 안에 포함되어 있습니다.Region .

```csharp
public bool IsVisible(PointF point)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| point | PointF | 그만큼PointF 테스트할 구조입니다. |

### 반환 값

참 때*point* 이 안에 들어있다Region; 그렇지 않으면 거짓입니다.

### 또한보십시오

* struct [PointF](../../pointf/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(float, float, Graphics) {#isvisible_6}

지정된 점이 이 안에 포함되는지 여부를 테스트합니다.Region using 를 그릴 때 지정된Graphics.

```csharp
public bool IsVisible(float x, float y, Graphics g)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Single | 테스트할 점의 x 좌표입니다. |
| y | Single | 테스트할 점의 y 좌표입니다. |
| g | Graphics | ㅏGraphics 그래픽 컨텍스트를 나타냅니다. |

### 반환 값

지정된 점이 이 안에 포함된 경우 trueRegion; 그렇지 않으면 거짓입니다.

### 또한보십시오

* class [Graphics](../../graphics/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(PointF, Graphics) {#isvisible_10}

지정된PointF 구조는 이 안에 포함되어 있습니다.Region 지정된 것을 사용하여 그릴 때Graphics .

```csharp
public bool IsVisible(PointF point, Graphics g)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| point | PointF | 그만큼PointF 테스트할 구조입니다. |
| g | Graphics | ㅏGraphics 그래픽 컨텍스트를 나타냅니다. |

### 반환 값

참 때*point* 이 안에 들어있다Region; 그렇지 않으면 거짓입니다.

### 또한보십시오

* struct [PointF](../../pointf/)
* class [Graphics](../../graphics/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(float, float, float, float) {#isvisible_4}

지정된 사각형의 일부가 이 안에 포함되는지 여부를 테스트합니다.Region .

```csharp
public bool IsVisible(float x, float y, float width, float height)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Single | 테스트할 사각형의 왼쪽 위 모퉁이에 대한 x좌표입니다. |
| y | Single | 테스트할 사각형의 왼쪽 위 모서리에 대한 y좌표입니다. |
| width | Single | 테스트할 사각형의 너비입니다. |
| height | Single | 테스트할 사각형의 높이입니다. |

### 반환 값

지정된 사각형의 일부가 this 내에 포함된 경우 참Region 물체; 그렇지 않으면 거짓입니다.

### 또한보십시오

* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(RectangleF) {#isvisible_13}

지정된 부분이RectangleF 구조는 this 내에 포함되어 있습니다.Region .

```csharp
public bool IsVisible(RectangleF rect)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | RectangleF | 그만큼RectangleF 테스트할 구조입니다. |

### 반환 값

참*rect* 이 안에 들어있다Region; 그렇지 않으면 거짓입니다.

### 또한보십시오

* struct [RectangleF](../../rectanglef/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(float, float, float, float, Graphics) {#isvisible_5}

지정된 사각형의 일부가 이 안에 포함되는지 여부를 테스트합니다.Region 지정된 것을 사용하여 그릴 때Graphics .

```csharp
public bool IsVisible(float x, float y, float width, float height, Graphics g)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Single | 테스트할 사각형의 왼쪽 위 모퉁이에 대한 x좌표입니다. |
| y | Single | 테스트할 사각형의 왼쪽 위 모서리에 대한 y좌표입니다. |
| width | Single | 테스트할 사각형의 너비입니다. |
| height | Single | 테스트할 사각형의 높이입니다. |
| g | Graphics | ㅏGraphics 그래픽 컨텍스트를 나타냅니다. |

### 반환 값

지정된 사각형의 일부가 이 안에 포함된 경우 trueRegion; 그렇지 않으면 거짓입니다.

### 또한보십시오

* class [Graphics](../../graphics/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(RectangleF, Graphics) {#isvisible_14}

지정된 부분이RectangleF 구조는 this 내에 포함되어 있습니다.Region 지정된 것을 사용하여 그릴 때Graphics .

```csharp
public bool IsVisible(RectangleF rect, Graphics g)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | RectangleF | 그만큼RectangleF 테스트할 구조입니다. |
| g | Graphics | ㅏGraphics 그래픽 컨텍스트를 나타냅니다. |

### 반환 값

참 때*rect* 이 안에 들어있다Region; 그렇지 않으면 거짓입니다.

### 또한보십시오

* struct [RectangleF](../../rectanglef/)
* class [Graphics](../../graphics/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(int, int, Graphics) {#isvisible_2}

지정된 점이 이 안에 포함되는지 여부를 테스트합니다.Region using 지정된 객체를 그릴 때Graphics object.

```csharp
public bool IsVisible(int x, int y, Graphics g)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Int32 | 테스트할 점의 x 좌표입니다. |
| y | Int32 | 테스트할 점의 y 좌표입니다. |
| g | Graphics | ㅏGraphics 그래픽 컨텍스트를 나타냅니다. |

### 반환 값

지정된 점이 이 안에 포함된 경우 trueRegion; 그렇지 않으면 거짓입니다.

### 또한보십시오

* class [Graphics](../../graphics/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(Point) {#isvisible_7}

지정된Point 구조는 이 안에 포함되어 있습니다.Region .

```csharp
public bool IsVisible(Point point)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| point | Point | 그만큼Point 테스트할 구조입니다. |

### 반환 값

참 때*point* 이 안에 들어있다Region; 그렇지 않으면 거짓입니다.

### 또한보십시오

* struct [Point](../../point/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(Point, Graphics) {#isvisible_8}

지정된Point 구조는 이 안에 포함되어 있습니다.Region 지정된 것을 사용하여 그릴 때Graphics .

```csharp
public bool IsVisible(Point point, Graphics g)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| point | Point | 그만큼Point 테스트할 구조입니다. |
| g | Graphics | ㅏGraphics 그래픽 컨텍스트를 나타냅니다. |

### 반환 값

참 때*point* 이 안에 들어있다Region; 그렇지 않으면 거짓입니다.

### 또한보십시오

* struct [Point](../../point/)
* class [Graphics](../../graphics/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(int, int, int, int) {#isvisible}

지정된 사각형의 일부가 이 안에 포함되는지 여부를 테스트합니다.Region .

```csharp
public bool IsVisible(int x, int y, int width, int height)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Int32 | 테스트할 사각형의 왼쪽 위 모퉁이에 대한 x좌표입니다. |
| y | Int32 | 테스트할 사각형의 왼쪽 위 모서리에 대한 y좌표입니다. |
| width | Int32 | 테스트할 사각형의 너비입니다. |
| height | Int32 | 테스트할 사각형의 높이입니다. |

### 반환 값

지정된 사각형의 일부가 이 안에 포함된 경우 trueRegion; 그렇지 않으면 거짓입니다.

### 또한보십시오

* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(Rectangle) {#isvisible_11}

지정된 부분이Rectangle 구조는 this 내에 포함되어 있습니다.Region .

```csharp
public bool IsVisible(Rectangle rect)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | Rectangle | 그만큼Rectangle 테스트할 구조입니다. |

### 반환 값

이 메서드는 다음 중 일부라도 true를 반환합니다.*rect* 이 안에 포함되어 있습니다.Region; 그렇지 않으면 거짓입니다.

### 또한보십시오

* struct [Rectangle](../../rectangle/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(int, int, int, int, Graphics) {#isvisible_1}

지정된 사각형의 일부가 이 안에 포함되는지 여부를 테스트합니다.Region 지정된 것을 사용하여 drawn 때Graphics .

```csharp
public bool IsVisible(int x, int y, int width, int height, Graphics g)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| x | Int32 | 테스트할 사각형의 왼쪽 위 모퉁이에 대한 x좌표입니다. |
| y | Int32 | 테스트할 사각형의 왼쪽 위 모서리에 대한 y좌표입니다. |
| width | Int32 | 테스트할 사각형의 너비입니다. |
| height | Int32 | 테스트할 사각형의 높이입니다. |
| g | Graphics | ㅏGraphics 그래픽 컨텍스트를 나타냅니다. |

### 반환 값

지정된 사각형의 일부가 이 안에 포함된 경우 trueRegion; 그렇지 않으면 거짓입니다.

### 또한보십시오

* class [Graphics](../../graphics/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)

---

## IsVisible(Rectangle, Graphics) {#isvisible_12}

지정된 부분이Rectangle 구조는 this 내에 포함되어 있습니다.Region 지정된 것을 사용하여 그릴 때Graphics .

```csharp
public bool IsVisible(Rectangle rect, Graphics g)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | Rectangle | 그만큼Rectangle 테스트할 구조입니다. |
| g | Graphics | ㅏGraphics 그래픽 컨텍스트를 나타냅니다. |

### 반환 값

의 일부일 때 참*rect* 이 안에 포함되어 있습니다.Region; 그렇지 않으면 거짓입니다.

### 또한보십시오

* struct [Rectangle](../../rectangle/)
* class [Graphics](../../graphics/)
* class [Region](../)
* 네임스페이스 [System.Drawing](../../region/)
* 집회 [Aspose.Drawing](../../../)


