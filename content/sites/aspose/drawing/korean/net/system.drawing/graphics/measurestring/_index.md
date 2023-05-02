---
title: Graphics.MeasureString
second_title: .NET API 참조용 Aspose.Drawing
description: Graphics 방법. 지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font .
type: docs
weight: 620
url: /ko/net/system.drawing/graphics/measurestring/
---
## MeasureString(string, Font) {#measurestring}

지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font .

```csharp
public SizeF MeasureString(string text, Font font)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 측정할 문자열입니다. |
| font | Font | Font 문자열의 텍스트 형식을 정의합니다. |

### 반환 값

이 메소드는SizeF 크기를 나타내는 구조, 에 의해 지정된 단위로PageUnit 에 의해 지정된 문자열의 속성*text* 로 그린 매개변수*font* 매개변수.

### 또한보십시오

* struct [SizeF](../../sizef/)
* class [Font](../../font/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF) {#measurestring_4}

지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 측정할 문자열입니다. |
| font | Font | Font 문자열의 텍스트 형식을 정의합니다. |
| layoutArea | SizeF | SizeF 텍스트의 최대 레이아웃 영역을 지정하는 구조입니다. |

### 반환 값

이 메소드는SizeF 크기를 나타내는 구조, 에 의해 지정된 단위로PageUnit 에 의해 지정된 문자열의 속성*text* 로 그린 매개변수*font* 매개변수.

### 또한보십시오

* struct [SizeF](../../sizef/)
* class [Font](../../font/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int) {#measurestring_1}

지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font .

```csharp
public SizeF MeasureString(string text, Font font, int width)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 측정할 문자열입니다. |
| font | Font | Font 문자열의 텍스트 형식을 정의합니다. |
| width | Int32 | 문자열의 최대 너비(픽셀)입니다. |

### 반환 값

이 메소드는SizeF 크기를 나타내는 구조, 에 의해 지정된 단위로PageUnit 에 의해 지정된 문자열의 속성*text* 로 그린 매개변수*font* 매개변수.

### 또한보십시오

* struct [SizeF](../../sizef/)
* class [Font](../../font/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, PointF, StringFormat) {#measurestring_3}

지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font 및 formatted 지정된StringFormat .

```csharp
public SizeF MeasureString(string text, Font font, PointF origin, StringFormat stringFormat)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 측정할 문자열입니다. |
| font | Font | Font문자열의 텍스트 형식을 정의합니다. |
| origin | PointF | PointF 문자열의 왼쪽 위 모서리를 나타내는 구조체입니다. |
| stringFormat | StringFormat | StringFormat 문자열에 대한 줄 간격과 같은 서식 정보를 나타냅니다. |

### 반환 값

이 메소드는SizeF 크기를 나타내는 구조, 에 의해 지정된 단위로PageUnit 에 의해 지정된 문자열의 속성*text* 로 그린 매개변수*font* 매개변수 및*stringFormat* 매개변수.

### 또한보십시오

* struct [SizeF](../../sizef/)
* class [Font](../../font/)
* struct [PointF](../../pointf/)
* class [StringFormat](../../stringformat/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int, StringFormat) {#measurestring_2}

지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font 및 formatted 지정된StringFormat .

```csharp
public SizeF MeasureString(string text, Font font, int width, StringFormat format)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 측정할 문자열입니다. |
| font | Font | Font 문자열의 텍스트 형식을 정의합니다. |
| width | Int32 | 문자열의 최대 너비입니다. |
| format | StringFormat | StringFormat 문자열에 대한 줄 간격과 같은 형식 정보, 를 나타냅니다. |

### 반환 값

이 메소드는SizeF 크기를 나타내는 구조, 에 의해 지정된 단위로PageUnit 속성, 에 지정된 문자열의*text* 로 그린 매개변수*font* parameter 및*format* 매개변수.

### 또한보십시오

* struct [SizeF](../../sizef/)
* class [Font](../../font/)
* class [StringFormat](../../stringformat/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat) {#measurestring_5}

지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font 및 formatted 지정된StringFormat .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 측정할 문자열입니다. |
| font | Font | Font문자열의 텍스트 형식을 정의합니다. |
| layoutArea | SizeF | SizeF 텍스트의 최대 레이아웃 영역을 지정하는 구조입니다. |
| stringFormat | StringFormat | StringFormat 문자열에 대한 줄 간격과 같은 형식 정보, 를 나타냅니다. |

### 반환 값

이 메소드는SizeF 크기를 나타내는 구조, 에 의해 지정된 단위로PageUnit 속성, 에 지정된 문자열의*text* 로 그린 매개변수*font* parameter 및*stringFormat* 매개변수.

### 또한보십시오

* struct [SizeF](../../sizef/)
* class [Font](../../font/)
* class [StringFormat](../../stringformat/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat, out int, out int) {#measurestring_6}

지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font 및 formatted 지정된StringFormat .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat, 
    out int charactersFitted, out int linesFilled)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 측정할 문자열입니다. |
| font | Font | Font문자열의 텍스트 형식을 정의합니다. |
| layoutArea | SizeF | SizeF 텍스트의 최대 레이아웃 영역을 지정하는 구조입니다. |
| stringFormat | StringFormat | StringFormat 문자열에 대한 줄 간격과 같은 형식 정보, 를 나타냅니다. |
| charactersFitted | Int32& | 문자열의 문자 수입니다. |
| linesFilled | Int32& | 문자열의 텍스트 줄 수입니다. |

### 반환 값

이 메소드는SizeF 크기를 나타내는 구조, 에 의해 지정된 단위로PageUnit 속성, 에 지정된 문자열의*text* 로 그린 매개변수*font* parameter 및*stringFormat* 매개변수.

### 또한보십시오

* struct [SizeF](../../sizef/)
* class [Font](../../font/)
* class [StringFormat](../../stringformat/)
* class [Graphics](../)
* 네임스페이스 [System.Drawing](../../graphics/)
* 집회 [Aspose.Drawing](../../../)


