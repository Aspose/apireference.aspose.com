---
title: AsposeOcr.RecognizeDjvu
second_title: .NET API 참조용 Aspose.OCR
description: AsposeOcr 방법. 다중 페이지 DJVU 이미지에서 텍스트를 인식합니다.  지정할 수 있는 기능으로 DJVU 파일을 인식합니다.DocumentRecognitionSettings . DJVU만 지원합니다. 다른 이미지 유형을 지원하지 않습니다.
type: docs
weight: 120
url: /ko/net/aspose.ocr/asposeocr/recognizedjvu/
---
## RecognizeDjvu(string, DocumentRecognitionSettings) {#recognizedjvu_1}

다중 페이지 DJVU 이미지에서 텍스트를 인식합니다.  지정할 수 있는 기능으로 DJVU 파일을 인식합니다.[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . DJVU만 지원합니다. 다른 이미지 유형을 지원하지 않습니다.

```csharp
public List<RecognitionResult> RecognizeDjvu(string fullPath, DocumentRecognitionSettings settings)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath | String | 이미지의 전체 경로입니다. |
| settings | DocumentRecognitionSettings | 인식 설정. |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체 목록입니다.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizeDjvu(MemoryStream, DocumentRecognitionSettings) {#recognizedjvu}

다중 페이지 DJVU 이미지에서 텍스트를 인식합니다.  지정할 수 있는 기능으로 DJVU 파일을 인식합니다.[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . DJVU만 지원합니다. 다른 이미지 유형을 지원하지 않습니다.

```csharp
public List<RecognitionResult> RecognizeDjvu(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | DJVU 파일이 있는 메모리 스트림. |
| settings | DocumentRecognitionSettings | 인식 설정. |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체 목록입니다.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)


