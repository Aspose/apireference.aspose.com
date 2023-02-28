---
title: Class PreprocessingFilter
second_title: .NET API 참조용 Aspose.OCR
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter 수업. 이미지 처리 명령의 기본 클래스.
type: docs
weight: 170
url: /ko/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

이미지 처리 명령의 기본 클래스.

이미지 처리 명령의 기본 클래스.

```csharp
public class PreprocessingFilter : IEnumerable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | 기본 생성자입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | 추가 신경망을 사용하여 이미지를 개선하여 노이즈를 줄입니다. 스캔 아티팩트, 왜곡, 반점, 플레어, 그라데이션, 외부 요소가 있는 이미지에 유용합니다. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | 추가 신경망을 사용하여 이미지 부분을 개선하여 노이즈를 줄입니다. 스캔 아티팩트, 왜곡, 반점, 플레어, 그라데이션, 외부 요소가 있는 이미지에 유용합니다. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | 이미지의 기하학적 왜곡을 자동으로 수정합니다. 리소스를 많이 사용합니다! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | 자동 이미지 기울기 보정을 활성화합니다. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | 자동 이미지 부분 기울기 보정을 활성화합니다. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | 이미지를 흑백 이미지로 변환합니다. 이진 이미지는 픽셀에 가능한 강도 값이 두 개뿐인 이미지입니다. 일반적으로 흑백으로 표시됩니다. 수치적으로 두 값은 검정의 경우 0, 흰색의 경우 255인 경우가 많습니다. 이진 이미지는 이미지를 자동 임계값으로 지정하여 생성됩니다. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | 이미지의 일부를 흑백 이미지로 변환합니다. 이진 이미지는 픽셀에 가능한 강도 값이 두 개뿐인 이미지입니다. 일반적으로 흑백으로 표시됩니다. 수치적으로 두 값은 검정의 경우 0, 흰색의 경우 255인 경우가 많습니다. 이진 이미지는 이미지를 자동 임계값으로 지정하여 생성됩니다. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | 대비 보정 필터. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | 이미지 부분에 대한 대비 보정 필터. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | 확장은 이미지의 개체 경계에 픽셀을 추가합니다. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | 확장은 이미지의 일부에 있는 개체의 경계에 픽셀을 추가합니다. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | 문서 이미지의 색상을 자동으로 반전합니다. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | 이미지 일부의 색상을 자동으로 반전합니다. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | 중앙값 필터는 이미지의 각 요소를 통과하고 각 픽셀을 인접 픽셀의 중앙값으로 바꿉니다. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | 중앙값 필터는 이미지 부분의 각 요소를 통과하고 각 픽셀을 인접 픽셀의 중앙값으로 바꿉니다. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | 이미지 재조정 - 이미지 해상도를 확대하거나 축소합니다. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | 이미지 재조정 - 이미지 해상도를 확대 또는 축소합니다. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | 원본 이미지를 회전합니다. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | 이미지의 일부를 회전합니다. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | 이미지 재조정 - 이미지 해상도를 확대하거나 축소합니다. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | 이미지 재조정 - 이미지 해상도를 확대 또는 축소합니다. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | 원본 이미지의 픽셀 강도에 대한 임계값 설정을 기반으로 이진 이미지를 만듭니다. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | 원본 이미지 부분의 픽셀 강도에 대한 임계값 설정을 기반으로 이미지의 이진 부분을 만듭니다. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | 이미지를 그레이스케일 이미지로 변환합니다. 그레이스케일 이미지는 이미지에서 256 레벨의 빛을 가집니다(0 ~ 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | 컬렉션에 새 필터를 추가하여 모든 작업을 추가로 실행합니다. 컬렉션의 일관성이 중요합니다. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | IEnumarable 인터페이스 실현용. |

### 또한보십시오

* 네임스페이스 [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* 집회 [Aspose.OCR](../../)


