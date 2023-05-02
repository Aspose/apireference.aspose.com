---
title: Bitmap.Bitmap
second_title: .NET API 참조용 Aspose.Drawing
description: Bitmap 건설자. 의 새 인스턴스를 초기화합니다.Bitmap 지정된 크기의 클래스.
type: docs
weight: 10
url: /ko/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../) 지정된 크기의 클래스.

```csharp
public Bitmap(int width, int height)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| width | Int32 | 새 비트맵의 너비(픽셀)입니다. |
| height | Int32 | 새 Bitmap의 높이(픽셀)입니다. |

### 비고

현재 유일하게 지원되는 내부 비트맵 형식은 다음과 같습니다.`PixelFormat.Format32bppPArgb` .

### 또한보십시오

* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../) 지정된 file. 의 클래스

```csharp
public Bitmap(string filename)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| filename | String | 비트맵 파일의 이름입니다. |

### 또한보십시오

* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../) 지정된 file. 의 클래스

```csharp
public Bitmap(string filename, bool useIcm)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| filename | String | 비트맵 파일의 이름입니다. |
| useIcm | Boolean | 이를 위해 색상 보정을 사용하려면 trueBitmap; 그렇지 않으면 거짓입니다. |

### 또한보십시오

* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../) 지정된 데이터 스트림의 클래스.

```csharp
public Bitmap(Stream stream)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | Stream | 이미지를 로드하는 데 사용되는 데이터 스트림입니다. |

### 또한보십시오

* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../) 지정된 데이터 스트림의 클래스.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | Stream | 이미지를 로드하는 데 사용되는 데이터 스트림입니다. |
| useIcm | Boolean | `진실` 이를 위해 색상 보정을 사용하려면Bitmap ; 그렇지 않으면,`거짓`. |

### 또한보십시오

* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../) 지정된 크기와 형식의 클래스.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| width | Int32 | 새 항목의 너비(픽셀 단위)Bitmap. |
| height | Int32 | 새 항목의 높이(픽셀 단위)Bitmap. |
| format | PixelFormat | 그만큼PixelFormat 새로운 것에 대한 열거Bitmap. |

### 또한보십시오

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../) 지정된 크기 및 픽셀 데이터가 있는 클래스.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| width | Int32 | 새 항목의 너비(픽셀 단위)Bitmap. |
| height | Int32 | 새 항목의 높이(픽셀 단위)Bitmap. |
| stride | Int32 | 한 스캔 라인의 시작과 다음 스캔 라인 사이의 바이트 오프셋은 4의 배수여야 합니다. |
| format | PixelFormat | 그만큼PixelFormat 새로운 것에 대한 열거Bitmap. |
| data | Int32[] | 픽셀 데이터입니다. |

### 또한보십시오

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../) 지정된 기존 이미지의 클래스.

```csharp
public Bitmap(Image original)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| original | Image | 그만큼Image 새로운 것을 만드는 것으로부터Bitmap. |

### 또한보십시오

* class [Image](../../image/)
* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../)지정된 크기로 조정된 지정된 기존 이미지의 클래스.

```csharp
public Bitmap(Image original, Size newSize)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| original | Image | 그만큼Image 새로운 것을 만드는 것으로부터Bitmap |
| newSize | Size | 그만큼Size 새로운 크기를 나타내는 구조Bitmap. |

### 또한보십시오

* class [Image](../../image/)
* struct [Size](../../size/)
* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

의 새 인스턴스를 초기화합니다.[`Bitmap`](../) 지정된 기존 이미지의 클래스, 지정된 크기로 조정됨.

```csharp
public Bitmap(Image original, int width, int height)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| original | Image | 그만큼Image 새로운 것을 만드는 것으로부터Bitmap. |
| width | Int32 | 새 항목의 너비(픽셀 단위)Bitmap. |
| height | Int32 | 새 항목의 높이(픽셀 단위)Bitmap. |

### 또한보십시오

* class [Image](../../image/)
* class [Bitmap](../)
* 네임스페이스 [System.Drawing](../../bitmap/)
* 집회 [Aspose.Drawing](../../../)


