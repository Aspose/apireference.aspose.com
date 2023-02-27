---
title: Class BaseRecognitionSettings
second_title: Aspose.OCR for .NET API Referansı
description: Aspose.OCR.BaseRecognitionSettings sınıf. Görüntü tanıma ayarları. Tanıma işleminin özelleştirilmesine izin veren öğeler içerir.
type: docs
weight: 30
url: /tr/net/aspose.ocr/baserecognitionsettings/
---
## BaseRecognitionSettings class

Görüntü tanıma ayarları. Tanıma işleminin özelleştirilmesine izin veren öğeler içerir.

```csharp
public class BaseRecognitionSettings
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [BaseRecognitionSettings](baserecognitionsettings/)(Language, bool, float, int) | Yeni bir örneğini başlatır.[`RecognitionSettings`](../recognitionsettings/)tam özelliklere sahip sınıf. |

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
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Görüntü döndürme için açıyı derece cinsinden alır veya ayarlar.  Bu değerin ayarlanması,[`AutoSkew`](./autoskew/) otomatik eğim düzeltmesi uygulanmaz. Varsayılan olarak sıfır. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | İşlenecek iş parçacığı sayısını alır veya ayarlar. Varsayılan olarak 0, görüntünün işlemci sayınıza eşit sayıda iş parçacığı ile işleneceği anlamına gelir. ThreadsCount = 1, görüntünün ana iş parçacığında işleneceği anlamına gelir. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Görüntü ikilileştirme için özel eşik değeri alır veya ayarlar. 1 ile 255 arasında değişir. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Özellikle küçük yazı tipi tanıma için ek algoritmalar kullanmanıza izin verir. Küçük boyutlu karakterleri olan resimler için kullanışlıdır. |

### Ayrıca bakınız

* ad alanı [Aspose.OCR](../../aspose.ocr/)
* toplantı [Aspose.OCR](../../)


