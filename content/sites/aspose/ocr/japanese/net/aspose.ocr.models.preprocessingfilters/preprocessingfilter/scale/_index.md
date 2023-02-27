---
title: PreprocessingFilter.Scale
second_title: Aspose.OCR for .NET API リファレンス
description: PreprocessingFilter 方法. 画像の再スケーリング  画像の解像度をアップスケールまたはダウンスケールします InterpolationFilterType  Lanczos8
type: docs
weight: 120
url: /ja/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/
---
## Scale(float) {#scale}

画像の再スケーリング - 画像の解像度をアップスケールまたはダウンスケールします。 InterpolationFilterType = Lanczos8

```csharp
public static PreprocessingFilter Scale(float ratio)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| ratio | Single | 倍率。縮小するには 0.1 から 1 をお勧めします。 1から10まで拡大します。 |

### 戻り値

ScaleFilter オブジェクト。

### 関連項目

* class [PreprocessingFilter](../)
* 名前空間 [Aspose.OCR.Models.PreprocessingFilters](../../preprocessingfilter/)
* 組み立て [Aspose.OCR](../../../)

---

## Scale(float, InterpolationFilterType) {#scale_1}

画像の再スケーリング - 画像の解像度をアップスケールまたはダウンスケールします。

```csharp
public static PreprocessingFilter Scale(float ratio, InterpolationFilterType type)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| ratio | Single | 倍率。縮小するには 0.1 から 1 をお勧めします。 1から10まで拡大します。 |
| type | InterpolationFilterType | [`InterpolationFilterType`](../../../aspose.ocr.filters/interpolationfiltertype/) |

### 戻り値

ScaleFilter オブジェクト。

### 関連項目

* enum [InterpolationFilterType](../../../aspose.ocr.filters/interpolationfiltertype/)
* class [PreprocessingFilter](../)
* 名前空間 [Aspose.OCR.Models.PreprocessingFilters](../../preprocessingfilter/)
* 組み立て [Aspose.OCR](../../../)


