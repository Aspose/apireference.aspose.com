---
title: Class PsDocument
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.EPS.PsDocument sınıf. Bu sınıf PS/EPS belgelerini kapsar.
type: docs
weight: 140
url: /tr/net/aspose.page.eps/psdocument/
---
## PsDocument class

Bu sınıf, PS/EPS belgelerini kapsar.

```csharp
public sealed class PsDocument : Document
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Başlatır`PsDocument` PS/EPS dosyası akışı ile. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Boş başlatır`PsDocument` başlatılan sayfa ile. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Boş başlatır`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Boş başlatır`PsDocument` Postscript belge sayfalarının sayısı önceden bilindiğinde. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Ortaya çıkan PDF belgesindeki sayfa sayısını döndürür. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Klibi geçerli grafik durumuna ekler. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Klibi mevcut grafik durumuna ekler ve ardından "yeni yol" operatörünü yazar. Bu kırpma yolu ile "charpath" operatörüyle ana hatları çizilen glifler gibi bazı sonraki yolların birleşiminden kaçmak için yapılması gerekir. |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Geçerli grafik durumuna kırpma dikdörtgeni ekler. |
| [ClipText](../../aspose.page.eps/psdocument/cliptext/)(string, Font, float, float) |  |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Geçerli sayfayı tamamlayın. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | İsteğe bağlı bir yol çizin. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Maskeli resim çizin. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Resmi çiz. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Dönüştürülen görüntüyü arka planla birlikte çizin. |
| [DrawTransparentImage](../../aspose.page.eps/psdocument/drawtransparentimage/)(Bitmap, Matrix, int) | Dönüştürülen saydam görüntüyü çizin. Görüntünün Alfa kanalı yoksa, opak image olarak çizilecektir. |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | İsteğe bağlı bir yolu doldurun. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, DrFont, float, float, Brush, Pen) | Gliflerin içini doldurarak ve glif konturları çizerek bir metin dizesi ekler. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_3)(string, Font, float, float, Brush, Pen) | Gliflerin içini doldurarak ve glif konturları çizerek bir metin dizesi ekler. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, float[], DrFont, float, float, Brush, Pen) | Gliflerin içini doldurarak ve glif konturları çizerek bir metin dizesi ekler. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_2)(string, float[], Font, float, float, Brush, Pen) | Gliflerin içini doldurarak ve glif konturları çizerek bir metin dizesi ekler. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, DrFont, float, float) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_6)(string, Font, float, float) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, DrFont, float, float, Brush) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_2)(string, float[], DrFont, float, float) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_4)(string, float[], Font, float, float) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_7)(string, Font, float, float, Brush) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_3)(string, float[], DrFont, float, float, Brush) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_5)(string, float[], Font, float, float, Brush) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Mevcut grafik durumunun boyasını alır. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Mevcut grafik durumunun vuruşunu alır. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | PS/EPS dosyasını okur ve varsa XmpMetdata'yı çıkarır veya yoksa yenisini ekler. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | PS/EPS dosyalarını bir cihazda birleştirir. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage_1)(string) | Dokümanın boyutunda yeni bir sayfa oluşturur ve onu geçerli bir sayfa yapar. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage)(float, float) | Yeni sayfa oluşturur ve geçerli sayfa yapar. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, DrFont, float, float) | Glif konturları çizerek bir metin dizesi ekler. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_6)(string, Font, float, float) | Glif konturları çizerek bir metin dizesi ekler. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, DrFont, float, float, Pen) | Glif konturları çizerek bir metin dizesi ekler. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_2)(string, float[], DrFont, float, float) | Glif konturları çizerek bir metin dizesi ekler. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_4)(string, float[], Font, float, float) | Glif konturları çizerek bir metin dizesi ekler. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_7)(string, Font, float, float, Pen) | Glif konturları çizerek bir metin dizesi ekler. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_3)(string, float[], DrFont, float, float, Pen) | Glif konturları çizerek bir metin dizesi ekler. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_5)(string, float[], Font, float, float, Pen) | Glif konturları çizerek bir metin dizesi ekler. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate_1)(float) | Geçerli grafik durumuna orijin etrafında saat yönünün tersine dönüş ekler (mevcut matrisi döndür). |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate)(int) | Geçerli grafik durumuna orijin etrafında saat yönünün tersine dönüş ekler (mevcut matrisi döndür). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Kayıt verildi`PsDocument`EPS dosyası olarak. Bu yöntem yalnızca PsDocument sıfırdan oluşturulduğunda kullanılır. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | Kayıt verildi`PsDocument` EPS dosyası olarak. Bu yöntem yalnızca XMP meta verilerini güncelledikten sonra kullanılır. İlk EPS dosyasını güncellenmiş mevcut meta verilerle veya GetMetadata yöntemi çağrılırken oluşturulan yenisiyle kaydeder. Son durumda, gerekli tüm PostScript kodu ve EPS yorumları eklenir. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | PS/EPS dosyasını bir cihaza kaydeder. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Geçerli grafik durumuna ölçek ekler (geçerli matrisi ölçeklendir). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Sayfa cihazı parametrelerini ayarlar ("setpagedevice" PostScript spesifikasyonu operatörüne bakın). Bunların arasında sayfa boyutu ve rengi vb. olabilir. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Sayfa boyutunu ayarlar. Tek bir belgede farklı boyutlarda sayfalar oluşturmak için şunu kullanın:[`SetPageDevice`](./setpagedevice/) yöntemi bu yöntemden hemen sonra. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Geçerli grafik durumunda boyamayı ayarlar. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Konturu mevcut grafik durumunda ayarlar. |
| [SetTransform](../../aspose.page.eps/psdocument/settransform/)(Matrix) | Geçerli dönüşümü buna ayarlayın. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Mevcut grafik durumuna (mevcut matrisi kesme) kesme dönüşümü ekler. |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Geçerli grafik durumuna dönüşüm ekler (bu matrisi geçerli olanla birleştirir). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Geçerli grafik durumuna çeviri ekler (geçerli matrisi çevirir). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Geçerli grafik durumunun geri yüklenmesini yazar ("grestore" işlecindeki PostScript belirtimine bakın). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Geçerli grafik durumunun kaydedilmesini yazar ("gsave" işlecindeki PostScript belirtimine bakın). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Bitmap nesnesini EPS çıkış akışına kaydeder. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Bitmap nesnesini EPS dosyasına kaydeder. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | PNG/JPEG/TIFF/BMP/GIF/EMF görüntüsünü giriş akışından EPS çıkış akışına kaydeder. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | PNG/JPEG/TIFF/BMP/GIF/EMF görüntüsünü dosyadan EPS dosyasına kaydeder. |

### Ayrıca bakınız

* class [Document](../../aspose.page/document/)
* ad alanı [Aspose.Page.EPS](../../aspose.page.eps/)
* toplantı [Aspose.Page](../../)


