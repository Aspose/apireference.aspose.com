---
title: Class SaveOptions
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.SaveOptions sınıf. Bu sınıf dönüştürme sürecini yönetmek için gerekli seçenekleri içerir.
type: docs
weight: 300
url: /tr/net/aspose.page/saveoptions/
---
## SaveOptions class

Bu sınıf, dönüştürme sürecini yönetmek için gerekli seçenekleri içerir.

```csharp
public abstract class SaveOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [SaveOptions](saveoptions/#constructor)() | Yeni bir örneğini başlatır.`SaveOptions` bayraklar için varsayılan değerler olan sınıf!:SuppressErrors (doğru) ve[`Debug`](./debug/) (yanlış). |
| [SaveOptions](saveoptions/#constructor_1)(bool) | Yeni bir örneğini başlatır.`SaveOptions` bayrak için varsayılan değere sahip sınıf[`Debug`](./debug/) (yanlış). |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Dönüştürücünün giriş belgesi için yazı tiplerini bulması gereken ek klasörleri belirtir. Varsayılan klasör, işletim sisteminin dahili ihtiyaçlar için yazı tiplerini bulduğu standart yazı tipleri klasörüdür. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Hata ayıklama bilgilerinin standart çıktı akışına yazdırılıp yazdırılmayacağını belirtir. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Bastırılmış dönüştürme hatalarının bir listesini döndürür.!:SuppressErrors doğrudur. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kalite kategorisi bir görüntünün sıkıştırma düzeyini belirtir. Mevcut değerler 0 ila 100'dür. Belirtilen sayı ne kadar düşükse, sıkıştırma o kadar yüksek ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kalitede görüntü sağlarken, 100 değeri en yüksek sonucu verir. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Hataların bastırılması gerekip gerekmediğini belirtir. Gerçek bastırılan hatalar eklenirse[`Exceptions`](./exceptions/) list. Yanlış ise, ilk hata programı sonlandırır. |

### Ayrıca bakınız

* ad alanı [Aspose.Page](../../aspose.page/)
* toplantı [Aspose.Page](../../)


