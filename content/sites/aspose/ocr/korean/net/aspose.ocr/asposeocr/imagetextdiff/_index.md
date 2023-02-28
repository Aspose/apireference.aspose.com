---
title: AsposeOcr.ImageTextDiff
second_title: .NET API 참조용 Aspose.OCR
description: AsposeOcr 방법. 두 이미지의 텍스트를 비교하고 얼마나 유사한지를 나타내는 숫자를 반환합니다0에서 1.
type: docs
weight: 90
url: /ko/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

두 이미지의 텍스트를 비교하고 얼마나 유사한지를 나타내는 숫자를 반환합니다(0에서 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath1 | String | 첫 번째 이미지의 경로입니다. |
| fullPath2 | String | 두 번째 이미지의 경로입니다. |
| settings | RecognitionSettings | 인식 설정. |
| ignoreCase | Boolean | True - 대소문자를 구분하지 않는 검색을 의미합니다. |

### 반환 값

0은 텍스트가 완전히 다르다는 것을 의미합니다. 1은 텍스트가 동일함을 의미합니다.

### 또한보십시오

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)


