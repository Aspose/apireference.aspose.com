---
title: Bitmap.Clone
second_title: .NET API 참조용 Aspose.Drawing
description: Bitmap 방법. 이 섹션의 복사본을 만듭니다.Bitmap 에 의해 정의Rectangle structure 및 지정된PixelFormat 열거형.
type: docs
weight: 100
url: /ko/net/system.drawing/bitmap/clone/
---
## Clone(Rectangle, PixelFormat) {#clone}

이 섹션의 복사본을 만듭니다.Bitmap 에 의해 정의Rectangle structure 및 지정된PixelFormat 열거형.

```csharp
public Bitmap Clone(Rectangle rect, PixelFormat format)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | Rectangle | 이 부분을 정의합니다.Bitmap to copy. 좌표는 이것에 상대적입니다.Bitmap. |
| format | PixelFormat | 지정합니다PixelFormat the 목적지에 대한 열거Bitmap. |

### 반환 값

새로운Bitmap 이 메서드가 만드는 것입니다.

### 또한보십시오

* struct [Rectangle](../../rectangle/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Clone(RectangleF, PixelFormat) {#clone_1}

이 섹션의 복사본을 만듭니다.Bitmap 지정된PixelFormat 열거형.

```csharp
public Bitmap Clone(RectangleF rect, PixelFormat format)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | RectangleF | 이 부분을 정의합니다.Bitmap 복사합니다. |
| format | PixelFormat | 지정합니다PixelFormat 대상에 대한 열거Bitmap. |

### 반환 값

그만큼Bitmap 이 메서드가 만드는 것입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| OutOfMemoryException | *rect* 소스 비트맵 범위 밖에 있습니다. |
| ArgumentException | 높이 또는 너비*rect* 0입니다. |

### 또한보십시오

* struct [RectangleF](../../rectanglef/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)


