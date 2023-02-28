---
title: PreprocessingFilter.Scale
second_title: .NET API 참조용 Aspose.OCR
description: PreprocessingFilter 방법. 이미지 재조정  이미지 해상도를 확대하거나 축소합니다. InterpolationFilterType  Lanczos8
type: docs
weight: 120
url: /ko/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/
---
## Scale(float) {#scale}

이미지 재조정 - 이미지 해상도를 확대하거나 축소합니다. InterpolationFilterType = Lanczos8

```csharp
public static PreprocessingFilter Scale(float ratio)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| ratio | Single | 배율 인수입니다.축소하려면 0.1에서 1 사이를 권장합니다. 1부터 10까지 확대합니다. |

### 반환 값

ScaleFilter 객체.

### 또한보십시오

* class [PreprocessingFilter](../)
* 네임스페이스 [Aspose.OCR.Models.PreprocessingFilters](../../preprocessingfilter/)
* 집회 [Aspose.OCR](../../../)

---

## Scale(float, InterpolationFilterType) {#scale_1}

이미지 재조정 - 이미지 해상도를 확대 또는 축소합니다.

```csharp
public static PreprocessingFilter Scale(float ratio, InterpolationFilterType type)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| ratio | Single | 배율 인수입니다.축소하려면 0.1에서 1 사이를 권장합니다. 1부터 10까지 확대합니다. |
| type | InterpolationFilterType | [`InterpolationFilterType`](../../../aspose.ocr.filters/interpolationfiltertype/) |

### 반환 값

ScaleFilter 객체.

### 또한보십시오

* enum [InterpolationFilterType](../../../aspose.ocr.filters/interpolationfiltertype/)
* class [PreprocessingFilter](../)
* 네임스페이스 [Aspose.OCR.Models.PreprocessingFilters](../../preprocessingfilter/)
* 집회 [Aspose.OCR](../../../)


