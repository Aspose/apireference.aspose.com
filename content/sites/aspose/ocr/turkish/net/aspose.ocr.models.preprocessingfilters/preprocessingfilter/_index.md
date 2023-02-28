---
title: Class PreprocessingFilter
second_title: Aspose.OCR for .NET API Referansı
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter sınıf. Görüntü işleme komutları için temel sınıf.
type: docs
weight: 170
url: /tr/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Görüntü işleme komutları için temel sınıf.

Görüntü işleme komutları için temel sınıf.

```csharp
public class PreprocessingFilter : IEnumerable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Default_Constructor |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Görüntüyü iyileştirmek için ek bir sinir ağının kullanılmasını sağlar - gürültüyü azaltır. Tarama yapaylıkları, bozulma, noktalar, parlamalar, gradyanlar, yabancı öğeler içeren görüntüler için kullanışlıdır. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Görüntü bölümünü iyileştirmek için ek bir sinir ağının kullanılmasını sağlar - paraziti azaltır. Tarama yapaylıkları, bozulma, noktalar, parlamalar, gradyanlar, yabancı öğeler içeren görüntüler için kullanışlıdır. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Görüntüdeki geometrik bozulmaları otomatik olarak düzeltir. Son derece kaynak yoğun! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Otomatik görüntü eğriliği düzeltmesini etkinleştirir. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Otomatik görüntü parçası eğim düzeltmesini etkinleştirir. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Görüntüyü siyah beyaz görüntüye dönüştürür. İkili görüntüler, pikselleri yalnızca iki olası yoğunluk değerine sahip görüntülerdir. Normalde siyah beyaz olarak görüntülenirler. Sayısal olarak, iki değer genellikle siyah için 0 ve beyaz için 255'tir. İkili görüntüler, bir görüntünün otomatik eşiklenmesiyle üretilir. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Görüntünün bir bölümünü siyah beyaz görüntüye dönüştürür. İkili görüntüler, pikselleri yalnızca iki olası yoğunluk değerine sahip görüntülerdir. Normalde siyah beyaz olarak görüntülenirler. Sayısal olarak, iki değer genellikle siyah için 0 ve beyaz için 255'tir. İkili görüntüler, bir görüntünün otomatik eşiklenmesiyle üretilir. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Kontrast düzeltme filtresi. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Görüntünün bölümü için kontrast düzeltme filtresi. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | Genişletme, görüntüdeki nesnelerin sınırlarına piksel ekler. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | Genişletme, görüntünün bir bölümündeki nesnelerin sınırlarına pikseller ekler. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Bir belge görüntüsündeki renkleri otomatik olarak ters çevirir. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Görüntünün bir bölümündeki renkleri otomatik olarak tersine çevirir. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | Medyan filtresi görüntünün her öğesinden geçer ve her pikseli komşu piksellerin medyanı ile değiştirir. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | Medyan filtresi, görüntü parçasının her öğesinden geçer ve her pikseli komşu piksellerin medyanı ile değiştirir. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Görüntüyü yeniden ölçeklendir - Görüntü çözünürlüğünü yukarı veya aşağı ölçeklendir. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Görüntüyü yeniden ölçeklendir - Görüntü çözünürlüğünü yukarı veya aşağı ölçeklendir. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Orijinal görüntüyü döndür. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Görüntünün bir bölümünü döndürün. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Görüntüyü yeniden ölçeklendir - Görüntü çözünürlüğünü yukarı veya aşağı ölçeklendir. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Görüntüyü yeniden ölçeklendir - Görüntü çözünürlüğünü yukarı veya aşağı ölçeklendir. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Orijinal görüntünün piksel yoğunluğunda bir eşik değeri ayarlamaya dayalı olarak ikili bir görüntü oluşturun. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Orijinal görüntü bölümünün piksel yoğunluğu üzerinde bir eşik değeri ayarlayarak görüntünün ikili bir bölümünü oluşturun. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Görüntüyü gri tonlamalı görüntüye dönüştürür. Gri tonlamalı görüntünün görüntüde 256 ışık seviyesi vardır (0 ila 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Tüm işlemleri daha fazla çalıştırmak için koleksiyona yeni filtre ekleyin. Koleksiyonda tutarlılık önemlidir. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | Numaralandırılabilir arabirim gerçekleştirme için. |

### Ayrıca bakınız

* ad alanı [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* toplantı [Aspose.OCR](../../)


