---
title: Enum DetectAreasMode
second_title: .NET API 참조용 Aspose.OCR
description: Aspose.OCR.DetectAreasMode 열거형. 영역 감지에 사용되는 신경망 유형을 결정합니다.
type: docs
weight: 60
url: /ko/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

영역 감지에 사용되는 신경망 유형을 결정합니다.

```csharp
public enum DetectAreasMode
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| NONE | `0` | 단락을 감지하지 못합니다. 그림이 없는 단순한 1열 문서에 적합합니다. |
| DOCUMENT | `1` | 문서에 NN 모델을 사용하는 단락을 감지합니다. 다중 열 문서, 그림이 있는 문서 또는 텍스트가 아닌 다른 개체가 있는 문서에 더 적합합니다. |
| PHOTO | `2` | 사진에 NN 모델을 사용하는 단락을 감지합니다. 그림이 많고 텍스트 개체가 아닌 다른 개체가 있는 이미지에 적합합니다. |
| COMBINE | `3` | 텍스트가 있는 단락을 감지한 다음 다른 NN 모델을 사용하여 단락 내부 영역을 감지합니다. 복잡한 구조의 이미지에 더 적합합니다. |
| TABLE | `4` | 텍스트가 있는 셀을 감지합니다. 테이블 구조가 있는 이미지에 선호되는 모드입니다. |
| CURVED_TEXT | `5` | 곡선 이미지에서 선을 감지하고 텍스트를 인식합니다. 책 및 잡지 페이지 사진에 선호되는 모드입니다. |

### 비고

에서 사용[`RecognitionSettings`](../recognitionsettings/) 인식하려는 이미지 유형을 지정합니다.

### 또한보십시오

* 네임스페이스 [Aspose.OCR](../../aspose.ocr/)
* 집회 [Aspose.OCR](../../)


