---
title: Class RecognitionSettings
second_title: Aspose.OCR for .NET API Referansı
description: Aspose.OCR.RecognitionSettings sınıf. Görüntü tanıma ayarları. Tanıma işleminin özelleştirilmesine izin veren öğeler içerir.
type: docs
weight: 240
url: /tr/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

Görüntü tanıma ayarları. Tanıma işleminin özelleştirilmesine izin veren öğeler içerir.

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | Yeni bir örneğini başlatır.`RecognitionSettings`tam özelliklere sahip sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | İzin verilen karakterler ayarlandı. Tanıma sonucu için izin verilen karakterlerin türünü belirler. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Tanıma öncesinde görüntü için ek bir kontrast düzeltme algoritması kullanılmasına izin verir. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Görüntüyü iyileştirmek için ek bir sinir ağının kullanılmasını sağlar - gürültüyü azaltır. Tarama yapaylıkları, bozulma, noktalar, parlamalar, gradyanlar, yabancı öğeler içeren görüntüler için kullanışlıdır. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Otomatik görüntü eğim düzeltmesinin etkinleştirilip etkinleştirilmeyeceğini belirten bir bayrak alır veya ayarlar. Varsayılan olarak etkindir (doğru). |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Belge türü alanları için en uygun modun seçilmesine izin verir: belge, fotoğraf, düz metin, sütun, resim. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Tanıma sembolleri için kara liste ayarlar. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | OCR için kullanılan dili alır veya ayarlar.  Tanıma sırasında kullanılan alfabeyi belirler. Varsayılan olarak çoklu dil. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Tablolardaki metni tanımaya izin verir (çizgilerle çevrili bölgeler). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Ön işleme yöntemlerini ayarlayarak görüntüyü OCR için hazırlamayı sağlar. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | İşlenmek üzere metin alanlarının listesini alır veya ayarlar.  Daha doğru tanıma için metin içeren alanların manuel olarak belirtilmesine izin verir. Özel alanlar ayarlanmışsaDetectAreas Ve!:AutoSkew özellikler göz ardı edilecek.  Algılama Alanlarını ve Otomatik Eğriliği devre dışı bırakır. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | Tek satırlık görüntü tanımayı ayarlar. Varsayılan olarak Devre Dışı (yanlış). Satırlara bölme ile ilişkili tüm işleme adımlarını devre dışı bırakın. Görüntünüz yalnızca bir satır içeriyorsa bu parametreyi true olarak ayarlayın. RecognitionAreas ayarlarını devre dışı bırakır, böylece tüm alan ayarları yoksayılır. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Görüntü döndürme için açıyı derece cinsinden alır veya ayarlar.  Bu değerin ayarlanması,[`AutoSkew`](../baserecognitionsettings/autoskew/) otomatik eğim düzeltmesi uygulanmaz. Varsayılan olarak sıfır. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | İşlenecek iş parçacığı sayısını alır veya ayarlar. Varsayılan olarak 0, görüntünün işlemci sayınıza eşit sayıda iş parçacığı ile işleneceği anlamına gelir. ThreadsCount = 1, görüntünün ana iş parçacığında işleneceği anlamına gelir. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Görüntü ikilileştirme için özel eşik değeri alır veya ayarlar. 1 ile 255 arasında değişir. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Özellikle küçük yazı tipi tanıma için ek algoritmalar kullanmanıza izin verir. Küçük boyutlu karakterleri olan resimler için kullanışlıdır. |

### Ayrıca bakınız

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* ad alanı [Aspose.OCR](../../aspose.ocr/)
* toplantı [Aspose.OCR](../../)


