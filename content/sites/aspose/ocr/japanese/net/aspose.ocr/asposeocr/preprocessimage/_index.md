---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 画像の前処理を使用してOCR の精度を向上させます 指定した順序で入力画像に適用されるフィルタのリストを作成します フィルタを作成する例 PreprocessingFilter filters  new PreprocessingFilter  PreprocessingFilter.Invert  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box PreprocessingFilter.Scale6f  PreprocessingFilter.Dilate  すべて必要というわけではありません必要なものだけを設定してください.
type: docs
weight: 100
url: /ja/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

画像の前処理を使用して、OCR の精度を向上させます。 指定した順序で入力画像に適用されるフィルタのリストを作成します。 フィルタを作成する例: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; すべて必要というわけではありません。必要なものだけを設定してください.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのフルパス。 |
| filters | PreprocessingFilter | 画像最適化フィルター[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### 戻り値

画像を変更してストリーミングし、保存または認識できるようにします。

### 関連項目

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

画像の前処理を使用して、OCR の精度を向上させます。 指定した順序で入力画像に適用されるフィルタのリストを作成します。 フィルタを作成する例: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; すべて必要というわけではありません。必要なものだけを設定してください.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | イメージを含むメモリ ストリーム。 |
| filters | PreprocessingFilter | 画像最適化フィルター[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### 戻り値

画像を変更してストリーミングし、保存または認識できるようにします。

### 関連項目

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


