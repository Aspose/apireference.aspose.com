---
title: TemplateProcessor.RecognizeImage
second_title: .NET API 참조용 Aspose.OMR
description: TemplateProcessor 방법. 이미지 인식
type: docs
weight: 30
url: /ko/net/aspose.omr.api/templateprocessor/recognizeimage/
---
## RecognizeImage(string, int) {#recognizeimage_1}

이미지 인식

```csharp
public RecognitionResult RecognizeImage(string imagePath, int recognitionThreshold = -100)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| imagePath | String | 인식할 이미지 경로 |
| recognitionThreshold | Int32 | (선택 사항) 범위(0..100)의 인식 임계값입니다. 임계값 이상으로 채워진 요소만 채워진 것으로 계산됩니다. |

### 반환 값

인식 결과

### 또한보십시오

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* 네임스페이스 [Aspose.OMR.Api](../../templateprocessor/)
* 집회 [Aspose.OMR](../../../)

---

## RecognizeImage(MemoryStream, int) {#recognizeimage}

메모리 stream 에서 이미지 인식 중

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, int recognitionThreshold = -100)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | 이미지의 메모리 스트림. |
| recognitionThreshold | Int32 | (선택 사항) 범위(0..100)의 인식 임계값입니다. 임계값 이상으로 채워진 요소만 채워진 것으로 계산됩니다. |

### 반환 값

인식 결과

### 또한보십시오

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* 네임스페이스 [Aspose.OMR.Api](../../templateprocessor/)
* 집회 [Aspose.OMR](../../../)


