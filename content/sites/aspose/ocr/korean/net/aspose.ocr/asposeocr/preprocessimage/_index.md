---
title: AsposeOcr.PreprocessImage
second_title: .NET API 참조용 Aspose.OCR
description: AsposeOcr 방법. 이미지 전처리를 사용하여 OCR의 정확도를 높입니다. 지정한 순서대로 입력 이미지에 적용될 필터 목록을 만듭니다. 필터를 만드는 예 PreprocessingFilter filters  new PreprocessingFilter  PreprocessingFilter.Invert  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box ScalefilfilterFilterType.  PreprocessingFilter.Dilate  모두 필요하지는 않습니다. 필요한 것만 설정하세요.
type: docs
weight: 100
url: /ko/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

이미지 전처리를 사용하여 OCR의 정확도를 높입니다. 지정한 순서대로 입력 이미지에 적용될 필터 목록을 만듭니다. 필터를 만드는 예: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), ScalefilfilterFilterType. ), PreprocessingFilter.Dilate() }; 모두 필요하지는 않습니다. 필요한 것만 설정하세요.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath | String | 이미지의 전체 경로입니다. |
| filters | PreprocessingFilter | 이미지 최적화 필터[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### 반환 값

저장하거나 인식할 수 있도록 수정된 이미지로 스트리밍합니다.

### 또한보십시오

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

이미지 전처리를 사용하여 OCR의 정확도를 높입니다. 지정한 순서대로 입력 이미지에 적용될 필터 목록을 만듭니다. 필터를 만드는 예: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), ScalefilfilterFilterType. ), PreprocessingFilter.Dilate() }; 모두 필요하지는 않습니다. 필요한 것만 설정하세요.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | 이미지를 포함하는 메모리 스트림. |
| filters | PreprocessingFilter | 이미지 최적화 필터[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### 반환 값

저장하거나 인식할 수 있도록 수정된 이미지로 스트리밍합니다.

### 또한보십시오

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)


