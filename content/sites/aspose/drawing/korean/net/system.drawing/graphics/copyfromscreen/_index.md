---
title: Graphics.CopyFromScreen
second_title: .NET API 참조용 Aspose.Drawing
description: Graphics 방법. 픽셀의 사각형에 해당하는 색상 데이터를 화면에서 화면의 드로잉 표면으로 비트 블록 전송을 수행합니다.Graphics .
type: docs
weight: 240
url: /ko/net/system.drawing/graphics/copyfromscreen/
---
## CopyFromScreen(Point, Point, Size) {#copyfromscreen_1}

픽셀의 사각형에 해당하는 색상 데이터를 화면에서 화면의 드로잉 표면으로 비트 블록 전송을 수행합니다.Graphics .

```csharp
public void CopyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| upperLeftSource | Point | 소스 사각형의 왼쪽 위 모서리에 있는 점입니다. |
| upperLeftDestination | Point | 대상 사각형의 왼쪽 위 모서리에 있는 점입니다. |
| blockRegionSize | Size | 전송할 영역의 크기입니다. |

### 또한보십시오

* struct [Point](../../point/)
* struct [Size](../../size/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## CopyFromScreen(int, int, int, int, Size, CopyPixelOperation) {#copyfromscreen}

픽셀의 사각형에 해당하는 색상 데이터를 화면에서 화면의 드로잉 표면으로 비트 블록 전송을 수행합니다.Graphics .

```csharp
public void CopyFromScreen(int sourceX, int sourceY, int destinationX, int destinationY, 
    Size blockRegionSize, CopyPixelOperation copyPixelOperation)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| sourceX | Int32 | 소스 사각형의 왼쪽 위 모퉁이에 있는 점의 x 좌표입니다. |
| sourceY | Int32 | 소스 사각형의 왼쪽 위 모퉁이에 있는 점의 y 좌표입니다. |
| destinationX | Int32 | 대상 사각형의 왼쪽 위 모퉁이에 있는 점의 x 좌표입니다. |
| destinationY | Int32 | 대상 사각형의 왼쪽 위 모서리에 있는 점의 y 좌표입니다. |
| blockRegionSize | Size | 전송할 영역의 크기입니다. |
| copyPixelOperation | CopyPixelOperation | 중 하나[`CopyPixelOperation`](../../copypixeloperation/) 가치. |

### 또한보십시오

* struct [Size](../../size/)
* enum [CopyPixelOperation](../../copypixeloperation/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## CopyFromScreen(Point, Point, Size, CopyPixelOperation) {#copyfromscreen_2}

픽셀의 사각형에 해당하는 색상 데이터를 화면에서 화면의 드로잉 표면으로 비트 블록 전송을 수행합니다.Graphics .

```csharp
public void CopyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize, 
    CopyPixelOperation copyPixelOperation)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| upperLeftSource | Point | 소스 사각형의 왼쪽 위 모서리에 있는 점입니다. |
| upperLeftDestination | Point | 대상 사각형의 왼쪽 위 모서리에 있는 점입니다. |
| blockRegionSize | Size | 전송할 영역의 크기.. |
| copyPixelOperation | CopyPixelOperation | 네[`CopyPixelOperation`](../../copypixeloperation/) 가치. |

### 또한보십시오

* struct [Point](../../point/)
* struct [Size](../../size/)
* enum [CopyPixelOperation](../../copypixeloperation/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)


