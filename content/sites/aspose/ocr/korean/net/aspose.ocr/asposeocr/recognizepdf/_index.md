---
title: AsposeOcr.RecognizePdf
second_title: .NET API 참조용 Aspose.OCR
description: AsposeOcr 방법. 스캔한 PDF에서 텍스트를 인식합니다이미지 추출.  지정하는 기능으로 pdf 파일을 인식합니다.DocumentRecognitionSettings . 스캔한 PDF만 지원합니다. 검색 가능한 PDF를 지원하지 않습니다.
type: docs
weight: 220
url: /ko/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

스캔한 PDF에서 텍스트를 인식합니다(이미지 추출).  지정하는 기능으로 pdf 파일을 인식합니다.[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . 스캔한 PDF만 지원합니다. 검색 가능한 PDF를 지원하지 않습니다.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath | String | 이미지의 전체 경로입니다. |
| settings | DocumentRecognitionSettings | 인식 설정. |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

스캔한 PDF에서 텍스트를 인식합니다(이미지 추출).  지정하는 기능으로 pdf 파일을 인식합니다.[`RecognitionSettings`](../../recognitionsettings/) . 스캔한 PDF만 지원합니다. 검색 가능한 PDF를 지원하지 않습니다.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | pdf 파일이 있는 메모리 스트림. |
| settings | DocumentRecognitionSettings | 인식 설정. |

### 반환 값

그만큼[`RecognitionResult`](../../recognitionresult/) 이미지 인식 결과가 있는 개체.

### 또한보십시오

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)


