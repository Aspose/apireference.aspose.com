---
title: AsposeOcr.RecognizeMultipleImages
second_title: .NET API 참조용 Aspose.OCR
description: AsposeOcr 방법. 목록에서 여러 이미지를 인식합니다.  아카이브 및 폴더는 지원되지 않습니다. 최대 처리 이미지 수는 20입니다. GIF PNG JPEG BMP TIFF JFIF를 지원합니다.
type: docs
weight: 200
url: /ko/net/aspose.ocr/asposeocr/recognizemultipleimages/
---
## RecognizeMultipleImages(List&lt;string&gt;, RecognitionSettings) {#recognizemultipleimages_1}

목록에서 여러 이미지를 인식합니다.  아카이브 및 폴더는 지원되지 않습니다. 최대 처리 이미지 수는 20입니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files, 
    RecognitionSettings settings)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| files | List`1 | 이미지의 전체 경로. |
| settings | RecognitionSettings | 인식 설정. |

### 반환 값

의 배열[`RecognitionResult`](../../recognitionresult/) 각 처리된 이미지에 대한 인식 결과가 있는 객체.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(List&lt;string&gt;) {#recognizemultipleimages}

기본 설정으로 목록에서 여러 이미지를 인식합니다.  아카이브 및 폴더는 지원되지 않습니다. 최대 처리 이미지 수는 20입니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| files | List`1 | 이미지의 전체 경로. |

### 반환 값

의 배열[`RecognitionResult`](../../recognitionresult/) 각 처리된 이미지에 대한 인식 결과가 있는 객체.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string, RecognitionSettings) {#recognizemultipleimages_3}

ZIP 아카이브 또는 폴더에서 압축된 여러 이미지를 인식합니다.  중첩된 아카이브 및 폴더는 지원되지 않습니다. 처리된 이미지의 최대 양은 20입니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path, RecognitionSettings settings)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | zip 아카이브(.zip 확장자 포함) 또는 이미지가 있는 폴더의 전체 경로입니다. |
| settings | RecognitionSettings | 인식 설정. |

### 반환 값

의 배열[`RecognitionResult`](../../recognitionresult/) 각 처리된 이미지에 대한 인식 결과가 있는 객체.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string) {#recognizemultipleimages_2}

ZIP 아카이브 또는 기본 설정으로 폴더에서 압축된 여러 이미지를 인식합니다.  중첩된 아카이브 및 폴더는 지원되지 않습니다. 처리된 이미지의 최대 양은 20입니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | zip 아카이브(.zip 확장자 포함) 또는 이미지가 있는 폴더의 전체 경로입니다. |

### 반환 값

의 배열[`RecognitionResult`](../../recognitionresult/) 각 처리된 이미지에 대한 인식 결과가 있는 객체.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)


