---
title: Class PdfSaveOptions
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.EPS.Device.PdfSaveOptions sınıf. Bu sınıf giriş ve çıkış akışlarını ve dönüştürme sürecini yönetmek için gerekli diğer seçenekleri içerir.
type: docs
weight: 70
url: /tr/net/aspose.page.eps.device/pdfsaveoptions/
---
## PdfSaveOptions class

Bu sınıf, giriş ve çıkış akışlarını ve dönüştürme sürecini yönetmek için gerekli diğer seçenekleri içerir.

```csharp
public class PdfSaveOptions : SaveOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/#constructor)() | Yeni bir örneğini başlatır.`PdfSaveOptions` bayraklar için varsayılan değerler olan sınıf!:SuppressErrors (doğru) ve!:Debug (yanlış). |
| [PdfSaveOptions](pdfsaveoptions/#constructor_1)(bool) | Yeni bir örneğini başlatır.`PdfSaveOptions` bayrak için varsayılan değerlere sahip sınıf!:Debug (yanlış). |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Dönüştürücünün giriş belgesi için yazı tiplerini bulması gereken ek klasörleri belirtir. Varsayılan klasör, işletim sisteminin dahili ihtiyaçlar için yazı tiplerini bulduğu standart yazı tipleri klasörüdür. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Hata ayıklama bilgilerinin standart çıktı akışına yazdırılıp yazdırılmayacağını belirtir. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Bastırılmış dönüştürme hatalarının bir listesini döndürür.!:SuppressErrors doğrudur. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kalite kategorisi bir görüntünün sıkıştırma düzeyini belirtir. Mevcut değerler 0 ila 100'dür. Belirtilen sayı ne kadar düşükse, sıkıştırma o kadar yüksek ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kalitede görüntü sağlarken, 100 değeri en yüksek sonucu verir. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Hataların bastırılması gerekip gerekmediğini belirtir. Gerçek bastırılan hatalar eklenirse[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Yanlış ise, ilk hata programı sonlandırır. |

### Ayrıca bakınız

* class [SaveOptions](../../aspose.page/saveoptions/)
* ad alanı [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* toplantı [Aspose.Page](../../)


