---
title: Class RecognitionSettings
second_title: .NET API 참조용 Aspose.OCR
description: Aspose.OCR.RecognitionSettings 수업. 이미지 인식 설정. 인식 프로세스를 사용자 정의할 수 있는 요소를 포함합니다.
type: docs
weight: 240
url: /ko/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

이미지 인식 설정. 인식 프로세스를 사용자 정의할 수 있는 요소를 포함합니다.

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | 의 새 인스턴스를 초기화합니다.`RecognitionSettings`전체 속성 세트가 있는 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | 허용되는 문자가 설정되었습니다. 인식 결과에 허용되는 문자 유형을 결정합니다. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | 인식 전에 이미지에 대한 추가 대비 보정 알고리즘을 사용할 수 있습니다. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | 추가 신경망을 사용하여 이미지를 개선하여 노이즈를 줄입니다. 스캔 아티팩트, 왜곡, 반점, 플레어, 그라데이션, 외부 요소가 있는 이미지에 유용합니다. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | 자동 이미지 기울기 보정을 활성화해야 하는지 여부를 나타내는 플래그를 가져오거나 설정합니다. 기본적으로 활성화(true)됩니다. |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | 문서, 사진, 일반 텍스트, 열, 이미지 등 문서 유형 영역에 대한 최적의 모드를 선택할 수 있습니다. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | 인식 기호에 대한 블랙리스트를 설정합니다. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | OCR에 사용되는 언어를 가져오거나 설정합니다.  인식 중에 사용되는 알파벳을 결정합니다. 기본적으로 다중 언어입니다. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | 테이블의 텍스트를 인식할 수 있습니다(선으로 둘러싸인 영역). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | 전처리 방법을 조정하여 OCR용 이미지를 준비할 수 있습니다. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | 처리할 텍스트 영역 목록을 가져오거나 설정합니다.  보다 정확한 인식을 위해 텍스트로 영역을 수동으로 지정할 수 있습니다. 사용자 정의 영역이 설정된 경우DetectAreas 그리고!:AutoSkew 속성은 무시됩니다.  DetectAreas 및 AutoSkew를 비활성화합니다. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | 한 줄 이미지 인식을 설정합니다. 기본적으로 비활성화(false)됩니다. 라인 분할과 관련된 모든 처리 단계를 비활성화합니다. 이미지에 한 줄만 포함된 경우 이 매개 변수를 true로 설정합니다. RecognitionAreas 설정을 비활성화하므로 모든 영역 설정이 무시됩니다. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | 이미지 회전 각도를 가져오거나 설정합니다.  이 값을 설정하면[`AutoSkew`](../baserecognitionsettings/autoskew/) 자동 기울이기 보정이 적용되지 않도록 합니다. 기본적으로 0입니다. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | 처리할 스레드 수를 가져오거나 설정합니다. 기본적으로 0은 이미지가 프로세서 수와 동일한 스레드 수로 처리됨을 의미합니다. ThreadsCount = 1은 이미지가 기본 스레드에서 처리됨을 의미합니다. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | 이미지 이진화에 대한 사용자 지정 임계값을 가져오거나 설정합니다. 범위는 1~255입니다. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | 특히 작은 글꼴 인식을 위한 추가 알고리즘을 사용할 수 있습니다. 작은 크기의 문자가 있는 이미지에 유용합니다. |

### 또한보십시오

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* 네임스페이스 [Aspose.OCR](../../aspose.ocr/)
* 집회 [Aspose.OCR](../../)


