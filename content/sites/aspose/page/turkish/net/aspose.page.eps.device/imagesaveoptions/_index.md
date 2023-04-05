---
title: Class ImageSaveOptions
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.EPS.Device.ImageSaveOptions sınıf. Bu sınıf görüntü kaydetme sürecini yönetmek için gerekli seçenekleri içerir.
type: docs
weight: 50
url: /tr/net/aspose.page.eps.device/imagesaveoptions/
---
## ImageSaveOptions class

Bu sınıf, görüntü kaydetme sürecini yönetmek için gerekli seçenekleri içerir.

```csharp
public class ImageSaveOptions : SaveOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [ImageSaveOptions](imagesaveoptions/#constructor)() | Yeni bir örneğini başlatır.`ImageSaveOptions` bayraklar için varsayılan değerler olan sınıf!:SuppressErrors (doğru) ve!:Debug (yanlış). |
| [ImageSaveOptions](imagesaveoptions/#constructor_1)(bool) | Yeni bir örneğini başlatır.`ImageSaveOptions` with bayrak için varsayılan değer!:Debug (yanlış). |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Dönüştürücünün giriş belgesi için yazı tiplerini bulması gereken ek klasörleri belirtir. Varsayılan klasör, işletim sisteminin dahili ihtiyaçlar için yazı tiplerini bulduğu standart yazı tipleri klasörüdür. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Hata ayıklama bilgilerinin standart çıktı akışına yazdırılıp yazdırılmayacağını belirtir. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Bastırılmış dönüştürme hatalarının bir listesini döndürür.!:SuppressErrors doğrudur. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kalite kategorisi bir görüntünün sıkıştırma düzeyini belirtir. Mevcut değerler 0 ila 100'dür. Belirtilen sayı ne kadar düşükse, sıkıştırma o kadar yüksek ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kalitede görüntü sağlarken, 100 değeri en yüksek sonucu verir. |
| [Resolution](../../aspose.page.eps.device/imagesaveoptions/resolution/) { get; set; } | Görüntü çözünürlüğünü alır/ayarlar. |
| [SmoothingMode](../../aspose.page.eps.device/imagesaveoptions/smoothingmode/) { get; set; } | Görüntüyü işlemek için yumuşatma modunu alır/ayarlar. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Hataların bastırılması gerekip gerekmediğini belirtir. Gerçek bastırılan hatalar eklenirse[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Yanlış ise, ilk hata programı sonlandırır. |

### Ayrıca bakınız

* class [SaveOptions](../../aspose.page/saveoptions/)
* ad alanı [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* toplantı [Aspose.Page](../../)


