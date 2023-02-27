---
title: RecognitionSettings.RecognitionSettings
second_title: .NET API 참조용 Aspose.OCR
description: RecognitionSettings 건설자. 의 새 인스턴스를 초기화합니다.RecognitionSettings전체 속성 세트가 있는 클래스.
type: docs
weight: 10
url: /ko/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

의 새 인스턴스를 초기화합니다.[`RecognitionSettings`](../)전체 속성 세트가 있는 클래스.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| language | Language | OCR에 사용되는 언어입니다. |
| recognitionAreas | List`1 | 인식할 영역을 수동으로 설정합니다. 기본적으로 Null - 전체 이미지가 처리됨을 의미합니다. |
| detectAreas | Boolean | 자동 텍스트 영역 감지를 활성화합니다. |
| autoSkew | Boolean | 자동 이미지 왜곡 보정을 활성화합니다. |
| skewAngle | Single | 이미지 회전 각도를 설정합니다. |
| recognizeSingleLine | Boolean | 단선 이미지의 경우 |
| threshold | Int32 | 사용자 지정 이미지 이진화 임계값 |

### 또한보십시오

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* 네임스페이스 [Aspose.OCR](../../recognitionsettings/)
* 집회 [Aspose.OCR](../../../)


