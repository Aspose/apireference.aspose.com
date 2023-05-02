---
title: Graphics.EnumerateMetafile
second_title: .NET API 참조용 Aspose.Drawing
description: Graphics 방법. 지정된 레코드를 보냅니다.Metafile  지정된 이미지 속성을 사용하여 지정된 지점에 표시하기 위해 한 번에 하나씩 콜백 메서드 에 지정합니다.
type: docs
weight: 460
url: /ko/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 지점에 표시하기 위해 한 번에 하나씩 콜백 메서드 에 지정합니다.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | PointF | [`PointF`](../../pointf/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | PointF | [`PointF`](../../pointf/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | PointF[] | 3개의 배열[`PointF`](../../pointf/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | Point | [`Point`](../../point/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | Point | [`Point`](../../point/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) 지정된 이미지 속성을 사용하여 지정된 지점에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | Point | [`Point`](../../point/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | PointF | [`PointF`](../../pointf/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | PointF[] | 3개의 배열[`PointF`](../../pointf/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | Point[] | 3개의 배열[`Point`](../../point/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | Point[] | 3개의 배열[`Point`](../../point/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 평행사변형으로 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | Point[] | 3개의 배열[`Point`](../../point/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| unit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | Point[] | 3개의 배열[`Point`](../../point/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | Point[] | 3개의 배열[`Point`](../../point/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 평행사변형으로 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | PointF[] | 3개의 배열[`PointF`](../../pointf/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| unit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | PointF[] | 3개의 배열[`PointF`](../../pointf/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

S에서 선택한 사각형의 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | PointF[] | 3개의 배열[`PointF`](../../pointf/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| unit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 평행사변형으로 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | PointF[] | 3개의 배열[`PointF`](../../pointf/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| unit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) 지정된 이미지 속성을 사용하여 지정된 지점에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | Point | [`Point`](../../point/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| unit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | Point | [`Point`](../../point/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | Point | [`Point`](../../point/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) 지정된 이미지 속성을 사용하여 지정된 지점에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | PointF | [`PointF`](../../pointf/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| unit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | PointF | [`PointF`](../../pointf/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoint | PointF | [`PointF`](../../pointf/) 그려진 메타파일의 왼쪽 위 모서리 위치를 지정하는 구조입니다. |
| srcRect | RectangleF | System.Drawing.RectangleF 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조체입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 평행사변형으로 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destPoints | Point[] | 3개의 배열[`Point`](../../point/) 그려진 메타파일의 크기와 위치를 결정하는 평행사변형을 정의하는 구조. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

선택한 사각형의 레코드를[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) 그릴 메타파일의 왼쪽 위 모서리를 기준으로 한 부분을 지정하는 구조입니다. |
| srcUnit | GraphicsUnit | 회원[`GraphicsUnit`](../../graphicsunit/) 사각형이 지정하는 메타파일 부분을 결정하는 데 사용되는 측정 단위를 지정하는 열거형*srcRect* 매개변수가 포함되어 있습니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

지정된 레코드를 보냅니다.[`Metafile`](../../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) 열거하다. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) 그려진 메타파일의 위치와 크기를 지정하는 구조입니다. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) 메타파일 레코드가 전송되는 메서드를 지정하는 대리자입니다. |
| callbackData | IntPtr | 필요하지만 무시되는 내부 포인터입니다. 당신은 통과할 수 있습니다Zero 이 매개변수의 경우. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) 그려진 이미지에 대한 이미지 속성 정보를 지정합니다. |

### 또한보십시오

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)


