---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR for .NET API Referansı
description: AsposeOcr yöntem. OCRnin doğruluğunu artırmak için görüntü ön işlemeyi kullanın. Girdi görüntüsüne sizin belirlediğiniz sırayla uygulanacak filtrelerin bir listesini oluşturun. filtre oluşturma örneği PreprocessingFilter filter  new PreprocessingFilter  PreprocessingFilter.Invert  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box PreprocessingSilterfilter  PreprocessingFilter.Dilate  Bunların hepsine ihtiyacınız yok. Yalnızca ihtiyacınız olanı ayarlayın.
type: docs
weight: 100
url: /tr/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

OCR'nin doğruluğunu artırmak için görüntü ön işlemeyi kullanın. Girdi görüntüsüne sizin belirlediğiniz sırayla uygulanacak filtrelerin bir listesini oluşturun. filtre oluşturma örneği: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingSilter(filter) ), PreprocessingFilter.Dilate() }; Bunların hepsine ihtiyacınız yok. Yalnızca ihtiyacınız olanı ayarlayın.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath | String | Resmin tam yolu. |
| filters | PreprocessingFilter | Görüntü optimizasyon filtreleri[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Geri dönüş değeri

Kaydedebilmek veya tanıyabilmek için değiştirilmiş görüntüyle yayın yapın.

### Ayrıca bakınız

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

OCR'nin doğruluğunu artırmak için görüntü ön işlemeyi kullanın. Girdi görüntüsüne sizin belirlediğiniz sırayla uygulanacak filtrelerin bir listesini oluşturun. filtre oluşturma örneği: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingSilter(filter) ), PreprocessingFilter.Dilate() }; Bunların hepsine ihtiyacınız yok. Yalnızca ihtiyacınız olanı ayarlayın.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | Görüntüyü içeren bellek akışı. |
| filters | PreprocessingFilter | Görüntü optimizasyon filtreleri[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Geri dönüş değeri

Kaydedebilmek veya tanıyabilmek için değiştirilmiş görüntüyle yayın yapın.

### Ayrıca bakınız

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)


