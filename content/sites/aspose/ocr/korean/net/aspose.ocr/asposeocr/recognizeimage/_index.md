---
title: AsposeOcr.RecognizeImage
second_title: .NET API 참조용 Aspose.OCR
description: AsposeOcr 방법. 이미지의 텍스트를 인식합니다.
type: docs
weight: 140
url: /ko/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

이미지의 텍스트를 인식합니다.

```csharp
public string RecognizeImage(string fullPath)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath | String | 이미지의 경로입니다. |

### 반환 값

인식된 텍스트입니다.

### 비고

자동 이미지 왜곡 보정 및 텍스트 영역 감지를 사용합니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

### 또한보십시오

* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

이미지의 텍스트를 인식합니다.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath | String | 이미지의 경로입니다. |
| settings | RecognitionSettings | 인식 설정. |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체.

### 비고

지정하는 기능으로 이미지를 인식합니다.[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

이미지의 텍스트를 인식합니다.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | 이미지를 포함하는 메모리 스트림. |

### 반환 값

인식된 텍스트입니다.

### 비고

자동 이미지 왜곡 보정 및 텍스트 영역 감지를 사용합니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

### 또한보십시오

* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

이미지의 텍스트를 인식합니다.  지정하는 기능으로 이미지를 인식합니다.[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | 이미지를 포함하는 메모리 스트림. |
| settings | RecognitionSettings | 인식 설정. |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

이미지의 텍스트를 인식합니다.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| imageData | Byte[] | 바이트 배열의 디코딩된 이미지입니다. bitsPerPixel &gt; 1에 대해 RGB 조명 기술을 사용합니다. |
| width | Int32 | 이미지 폭. |
| height | Int32 | 이미지 높이. |
| pixelFormat | PixelType | 바이트, rgb, bgr, rgba를 지원합니다. |
| settings | RecognitionSettings | 인식 설정. |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체.

### 비고

지정하는 기능으로 이미지를 인식합니다.[`RecognitionSettings`](../../recognitionsettings/) . 행 디코딩 바이트 데이터를 지원합니다.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

이미지의 텍스트를 인식합니다.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| imageData | Color[] | Aspose.Drawing.Color 배열의 디코딩된 이미지. |
| width | Int32 | 이미지 폭. |
| height | Int32 | 이미지 높이. |
| settings | RecognitionSettings | 인식 설정. |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체.

### 비고

지정하는 기능으로 이미지를 인식합니다.[`RecognitionSettings`](../../recognitionsettings/) . 행 디코딩 바이트 데이터를 지원합니다.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)


