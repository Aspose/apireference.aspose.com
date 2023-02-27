---
title: AsposeOcr.ImageHasText
second_title: .NET API 참조용 Aspose.OCR
description: AsposeOcr 방법. 이미지에 제공된 텍스트 조각이 포함되어 있는지 확인하십시오.
type: docs
weight: 80
url: /ko/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

이미지에 제공된 텍스트 조각이 포함되어 있는지 확인하십시오.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath | String | 이미지의 경로입니다. |
| text | String | 이미지 검색을 위한 텍스트 조각입니다. |
| settings | RecognitionSettings | 인식 설정. |
| ignoreCase | Boolean | True - 대소문자를 구분하지 않는 검색을 의미합니다. |

### 반환 값

이미지에 텍스트 조각이 포함되어 있으면 참입니다. False - 이미지에 텍스트 조각이 포함되어 있지 않습니다.

### 비고

지정하는 기능으로 이미지를 인식합니다.[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

### 또한보십시오

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

이미지 텍스트가 제공된 정규식과 일치하는지 확인합니다.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath | String | 이미지의 경로입니다. |
| regex | Regex | 제공된 패턴 및 옵션이 있는 System.Text.RegularExpressions 개체입니다. |
| settings | RecognitionSettings | 인식 설정. |

### 반환 값

이미지 텍스트가 제공된 정규식과 일치하면 참입니다.

### 비고

지정하는 기능으로 이미지를 인식합니다.[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

### 또한보십시오

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)


