---
title: AsposeOcr.RecognizeIDCard
second_title: .NET API 참조용 Aspose.OCR
description: AsposeOcr 방법. ID 카드의 텍스트를 인식합니다.
type: docs
weight: 130
url: /ko/net/aspose.ocr/asposeocr/recognizeidcard/
---
## RecognizeIDCard(string, IDCardRecognitionSettings) {#recognizeidcard_1}

ID 카드의 텍스트를 인식합니다.

```csharp
public RecognitionResult RecognizeIDCard(string fullPath, IDCardRecognitionSettings settings = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath | String | 이미지의 경로입니다. |
| settings | IDCardRecognitionSettings | 인식 설정[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체.

### 비고

지정하는 기능으로 이미지를 인식합니다.[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeIDCard(MemoryStream, IDCardRecognitionSettings) {#recognizeidcard}

ID 카드의 텍스트를 인식합니다.

```csharp
public RecognitionResult RecognizeIDCard(MemoryStream stream, 
    IDCardRecognitionSettings settings = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | 영수증 이미지를 포함하는 메모리 스트림. |
| settings | IDCardRecognitionSettings | 인식 설정[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체.

### 비고

지정하는 기능으로 이미지를 인식합니다.[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)


