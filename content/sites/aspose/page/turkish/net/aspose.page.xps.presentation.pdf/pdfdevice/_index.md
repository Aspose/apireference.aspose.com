---
title: Class PdfDevice
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.Presentation.Pdf.PdfDevice sınıf. Sınıf kapsüllü görüntü oluşturma cihazı.
type: docs
weight: 410
url: /tr/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Sınıf kapsüllü görüntü oluşturma cihazı.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Yeni örneği oluşturur. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Belirtilen ortam boyutuyla yeni örneği oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background/) { get; set; } | Arka plan rengini alır/ayarlar. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Geçerli karakterleri döndürür veya belirtir transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Ortaya çıkan aygıt çıktısının yaratıcısını döndürür veya belirtir. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber/) { get; } | Belgedeki mevcut sayfanın mutlak sayısını verir. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber/) { get; } | Geçerli bölümdeki geçerli sayfanın numarasını döndürür. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font/) { get; set; } | Geçerli yazı tipini alır/ayarlar. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Cihazın doğrudan RGB modunu, yani RGB'yi kullanıp kullanmadığını gösterir. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Aspose.Page kitaplığının bu örneğinin lisanslı olup olmadığını gösterir. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity/) { get; set; } | Opaklığı alır/ayarlar. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask/) { get; set; } | Opaklık maskesi için fırçayı alır/ayarlar. Maske, Paint veya Strike. üzerine uygulanır. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint/) { get; set; } | Yolları doldurmak için fırçayı alır/ayarlar. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Meta veriler dahil olmak üzere cihaz özellikleri. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions/) { set; } | Kaydetme seçeneklerini başlatır. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size/) { get; set; } | Cihazın medya boyutunu alır/ayarlar. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke/) { get; set; } | Çizim yolları için konturu alır/ayarlar. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Geçerli metin oluşturma modunu döndürür veya belirtir. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Geçerli metin kontur genişliğini döndürür veya belirtir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline)(int, string) | Hedefi son nesne olan bir ana hat öğesi ekler. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline_1)(PointF, int, string) | Başlangıç noktasının hedefi olduğu bir ana hat öğesi ekler. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage/)() | Sayfayı tamamlar. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition/)() | Belge bölümü tamamlandı. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create/)() | Bu cihaz örneğine dayalı olarak cihazın yeni bir örneğini oluşturur. Bu cihazın grafik durumunu yazar, yani oluştururApsCanvas örnek(ler) , karşılık gelen RenderTransform ve Clip özellikleriyle. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose/)() | Bu aygıt örneğini ortadan kaldırır. Bu cihaz örneği grafik durumunu sonlandırır, yani APS oluşturma bağlamınıApsCanvas this aygıtının grafik durumundan daha yüksek düzeydeApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw/)(GraphicsPath) | Belirtilen yolu çizer. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Bir yay çizer. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Atanmış dönüşüm ve arka plana sahip bir görüntü çizer. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Bir doğru parçası çizer. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Bir oval çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Bir çokgen çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Bir çokgen çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Bir dikdörtgen çizer. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Yuvarlak bir dikdörtgen çizer. |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring/)(string, double, double) | Belirtilen konumda bir dizi çizer. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument/)() | Belgeyi yerine getirir. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill/)(GraphicsPath) | Belirtilen yolu doldurur. |
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
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform/)() | Geçerli dönüştürme matrisini döndürür. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Cihazın klibini başlatır. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers/)() | Çıktı alınacak sayfa sayısını başlatır. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Bir boole özelliği değeri alır. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage_1)(string) | Belirtilen başlıkla yeni bir sayfa başlatır. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage)(float, float) | Belirtilen genişlik ve yükseklikte yeni bir sayfa başlatır. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition/)() | Yeni bir belge bölümü başlatır. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew/)() | Cihazları başlangıç durumuna ayarlar. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset/)() | Cihazı sıfırlar. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate/#rotate)(double) | Geçerli dönüşüm matrisine orijin etrafında saat yönünde döndürme uygular. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Geçerli dönüşüm matrisini bir nokta etrafında döndürün. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale/)(double, double) | Belirtilen ölçek vektörünü geçerli dönüştürme matrisine uygular. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip/)(GraphicsPath) | Belirtilen yolu geçerli klip yoluna ekler. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget)(int) | Hedefi olarak bir sayfa numarasına sahip köprüyü ayarlar. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget_1)(string) | Hedefi olarak harici bir URI ile köprüyü ayarlar. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform/)(Matrix) | Geçerli dönüştürme matrisini ayarlar. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear/)(double, double) | Belirtilen kesme vektörünü mevcut dönüşüm matrisine uygular. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument/)() | Belgeyi başlatır. |
| override [ToString](../../aspose.page/device/tostring/)() | Aygıt türünün adını döndürür. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform/)(Matrix) | Geçerli dönüşüm matrisini belirtilenle çarparMatrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate/)(double, double) | Belirtilen öteleme vektörünü geçerli dönüştürme matrisine uygular. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Geçerli sayfa parametrelerini günceller. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Bir yorum yazar. |

### Ayrıca bakınız

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* ad alanı [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* toplantı [Aspose.Page](../../)


