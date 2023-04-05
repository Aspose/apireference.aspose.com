---
title: Class PdfSaveOptions
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.Presentation.Pdf.PdfSaveOptions sınıf. PDF olarak XPS kaydetme seçenekleri için Sınıf.
type: docs
weight: 440
url: /tr/net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class

PDF olarak XPS kaydetme seçenekleri için Sınıf.

```csharp
public class PdfSaveOptions : SaveOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | Yeni seçenekler örneği oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Dönüştürücünün giriş belgesi için yazı tiplerini bulması gereken ek klasörleri belirtir. Varsayılan klasör, işletim sisteminin dahili ihtiyaçlar için yazı tiplerini bulduğu standart yazı tipleri klasörüdür. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Hata ayıklama bilgilerinin standart çıktı akışına yazdırılıp yazdırılmayacağını belirtir. |
| [EncryptionDetails](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/encryptiondetails/) { get; set; } | Bir şifreleme ayrıntısı alır veya ayarlar. Ayarlanmazsa şifreleme gerçekleştirilmez. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Bastırılmış dönüştürme hatalarının bir listesini döndürür.!:SuppressErrors doğrudur. |
| [ImageCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/imagecompression/) { get; set; } | Belgedeki tüm görüntüler için kullanılacak sıkıştırma türünü belirtir. Varsayılan değer:Auto . |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kalite kategorisi bir görüntünün sıkıştırma düzeyini belirtir. Mevcut değerler 0 ila 100'dür. Belirtilen sayı ne kadar düşükse, sıkıştırma o kadar yüksek ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kalitede görüntü sağlarken, 100 değeri en yüksek sonucu verir. |
| [OutlineTreeExpansionLevel](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeexpansionlevel/) { get; set; } | PDF dosyası bir görüntüleyicide açıldığında belge taslağının hangi düzeye kadar genişletilmesi gerektiğini belirtir. 1 - yalnızca birinci düzey anahat öğeleri gösterilir, 2 - yalnızca birinci ve ikinci düzey anahat öğeleri gösterilir, ve yani on. Varsayılan 1. |
| [OutlineTreeHeight](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeheight/) { get; set; } | Kaydedilecek belge anahat ağacının yüksekliğini belirtir. 0 - anahat ağacı dönüştürülmez, 1 - yalnızca birinci düzey anahat öğeleri dönüştürülür, ve benzeri. Varsayılan 10. |
| [PageNumbers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/pagenumbers/) { get; set; } | Dönüştürülecek sayfa sayısı dizisini alır/ayarlar. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Hataların bastırılması gerekip gerekmediğini belirtir. Gerçek bastırılan hatalar eklenirse[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Yanlış ise, ilk hata programı sonlandırır. |
| [TextCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/textcompression/) { get; set; } | Resimler dışındaki tüm içerik akışları için kullanılacak sıkıştırma türünü belirtir. Varsayılan değer:Flate . |

### Ayrıca bakınız

* class [SaveOptions](../../aspose.page/saveoptions/)
* ad alanı [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* toplantı [Aspose.Page](../../)


