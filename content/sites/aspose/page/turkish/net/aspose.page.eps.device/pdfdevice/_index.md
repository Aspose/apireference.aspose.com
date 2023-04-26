---
title: Class PdfDevice
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.EPS.Device.PdfDevice sınıf. Bu sınıf belgenin PDFe dönüştürülmesini kapsar.
type: docs
weight: 60
url: /tr/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Bu sınıf, belgenin PDF'e dönüştürülmesini kapsar.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Yeni örneğini başlatır`PdfDevice` çıkış akışı ile. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Yeni örneğini başlatır`PdfDevice` çıktı akışı ve belirtilen sayfa boyutuyla. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Sayfanın geçerli arka planını döndürür veya belirtir. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Geçerli karakterleri döndürür veya belirtir transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Ortaya çıkan aygıt çıktısının yaratıcısını döndürür veya belirtir. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Geçerli sayfa numarası. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | Geçerli yazı tipini belirtir. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Cihazın doğrudan RGB modunu, yani RGB'yi kullanıp kullanmadığını gösterir. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Aspose.Page kitaplığının bu örneğinin lisanslı olup olmadığını gösterir. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Geçerli opaklığı döndürür veya belirtir. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Geçerli opaklık maskesini döndürür veya belirtir. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Bir çıkış akışı belirtir veya döndürür. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | Mevcut boyayı döndürür veya belirtir. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Meta veriler dahil olmak üzere cihaz özellikleri. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | İşleme sürecini yönetmek için seçenekler. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Sayfanın boyutunu döndürür veya belirtir. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | Mevcut konturu döndürür veya belirtir. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Geçerli metin oluşturma modunu döndürür veya belirtir. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Geçerli metin kontur genişliğini döndürür veya belirtir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Sayfa oluşturulduktan sonra cihazın gerekli hazırlığını yapar. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | Bu cihazın bir kopyasını oluşturur. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | Grafik bağlamını ortadan kaldırır. Oluşturma sırasında restoreOnDispose doğruysa, writeGraphicsRestore() çağrılacaktır. |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | Bir yol çizer. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Bir yay çizer. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | Atanmış dönüşüm ve arka plana sahip bir görüntü çizer. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Bir doğru parçası çizer. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Bir oval çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Bir çokgen çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Bir çokgen çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Bir dikdörtgen çizer. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Yuvarlak bir dikdörtgen çizer. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | Belirtilen noktada bir dizi çizer. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | Belge oluşturulduktan sonra cihazın gerekli hazırlığını yapar. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | Bir yolu doldurur. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Bir yayı doldurur. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Bir ovali doldurur. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Bir çokgeni doldurur. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Bir çokgeni doldurur. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Bir dikdörtgeni doldurur. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Yuvarlak bir dikdörtgeni doldurur. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | String özelliğinin değerini alır. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Bir renk özelliği değeri alır. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Double özelliğinin değerini alır. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Tamsayı özelliğinin değerini alır. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Bir marj özelliği değeri alır. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Dikdörtgen özelliğinin değerini alır. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Size özelliğinin bir değerini alır. |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | Geçerli dönüşümü alır. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | Cihazın klibini başlatır. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Çıktı alınacak sayfa sayısını başlatır. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Bir boole özelliği değeri alır. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Sayfa oluşturmadan önce cihazın gerekli hazırlığını yapar. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Her sayfa işlemeden önce cihazın gerekli hazırlığını yapar. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | Tüm belge için cihazı başlangıç durumuna sıfırlayın. Çıkış akışını sıfırlamak için kullanılır. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | Sayfa cihazı parametreleri ayarlanacaksa, bu yöntem yazma akışını sayfanın başına geri döndürmeye izin verir. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Geçerli dönüşümü Z ekseni üzerinde döndürün. writeTransform(Transform). öğesini çağırır Pozitif teta açısıyla döndürmek, pozitif x ekseni üzerindeki noktaları pozitif y eksenine doğru döndürür. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Geçerli dönüşüm matrisini bir nokta etrafında döndürün. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | Mevcut dönüştürme matrisini ölçeklendirir. writeTransform(Transform). çağrıları |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | Cihazın klibini belirtir. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | Geçerli dönüşümü belirtir. Çoğu çıktı formatı bu işlevi uygulamadığından, the currentTransform'un ters dönüşümü hesaplanır ve ayarlanacak dönüşümü ile çarpılır. Sonuç daha sonra bir call tarafından writeTransform(Transform). 'a iletilir |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | Mevcut dönüşüm matrisini yayar. writeTransform(Transform). çağrıları |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | Belgenin işlenmesine başlamadan önce cihazın gerekli hazırlığını yapar. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Aygıt türünün adını döndürür. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | Geçerli dönüştürme matrisini dönüştürür. writeTransform(Transform) çağrıları |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | Geçerli dönüşüm matrisini çevirir. writeTransform(Transform). çağrıları |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Diğer çok sayfalı cihazdan sayfa parametrelerini günceller. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | Bir yorum yazar. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | "Yazar" özellik değeri. |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | "Arka plan" özellik anahtarı. |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | "Arka plan rengi" özellik anahtarı. |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | "Sıkıştır" özellik anahtarı. |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | "Yazı tipini belgeye göm" özellik anahtarı. |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | "Gömme için hangi yazı tipi kullanılır" özellik anahtarı. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | "Hata yayma" özellik değeri. |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | "Uyarı gönder" özellik değeri. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | "İçeriği sayfaya sığdır" özellik anahtarı. |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | "Anahtar kelimeler" özellik değeri. |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | "Yönlendirme" özellik anahtarı. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | "Sayfa kenar boşlukları" özellik anahtarı. |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | "Sayfa boyutu" özellik anahtarı. |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | "Konu" özellik değeri. |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | "Başlık" özellik değeri. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | "Şeffaf" özellik anahtarı. |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | "Sürüm" özellik anahtarı. |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | "Adobe Acrobat Reader Sürümü" özellik değeri. |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | "Görüntü biçimi" özellik anahtarı. |

### Ayrıca bakınız

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* ad alanı [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* toplantı [Aspose.Page](../../)


