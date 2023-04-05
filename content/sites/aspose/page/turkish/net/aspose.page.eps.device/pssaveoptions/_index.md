---
title: Class PsSaveOptions
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.EPS.Device.PsSaveOptions sınıf. Bu sınıf belgeyi PostScript PS veya Encapsulated PostScript EPS dosyasına dönüştürme sürecini yönetmek için gerekli seçenekleri içerir.
type: docs
weight: 80
url: /tr/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

Bu sınıf, belgeyi PostScript (PS) veya Encapsulated PostScript (EPS) dosyasına dönüştürme sürecini yönetmek için gerekli seçenekleri içerir.

```csharp
public class PsSaveOptions : SaveOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | Yeni bir örneğini başlatır.`PsSaveOptions` bayraklar için varsayılan değerler olan sınıf!:SuppressErrors (doğru) ve!:Debug (yanlış). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | Yeni bir örneğini başlatır.`PsSaveOptions` bayrak için varsayılan değerlere sahip sınıf!:Debug (yanlış). |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Dönüştürücünün giriş belgesi için yazı tiplerini bulması gereken ek klasörleri belirtir. Varsayılan klasör, işletim sisteminin dahili ihtiyaçlar için yazı tiplerini bulduğu standart yazı tipleri klasörüdür. |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | Arka plan rengi. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Hata ayıklama bilgilerinin standart çıktı akışına yazdırılıp yazdırılmayacağını belirtir. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | Kullanılan yazı tiplerinin PS belgesine gömülüp gömülmeyeceğini belirtir. |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | PS belgesinde yazı tiplerinin gömüleceği bir yazı tipi türü. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Bastırılmış dönüştürme hatalarının bir listesini döndürür.!:SuppressErrors doğrudur. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kalite kategorisi bir görüntünün sıkıştırma düzeyini belirtir. Mevcut değerler 0 ila 100'dür. Belirtilen sayı ne kadar düşükse, sıkıştırma o kadar yüksek ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kalitede görüntü sağlarken, 100 değeri en yüksek sonucu verir. |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | Sayfanın kenar boşlukları. |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | Sayfanın boyutu. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | Ortaya çıkan dosyanın kaydetme biçimi. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Hataların bastırılması gerekip gerekmediğini belirtir. Gerçek bastırılan hatalar eklenirse[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Yanlış ise, ilk hata programı sonlandırır. |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | Arka planın şeffaf olup olmadığını gösterir. |

### Ayrıca bakınız

* class [SaveOptions](../../aspose.page/saveoptions/)
* ad alanı [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* toplantı [Aspose.Page](../../)


