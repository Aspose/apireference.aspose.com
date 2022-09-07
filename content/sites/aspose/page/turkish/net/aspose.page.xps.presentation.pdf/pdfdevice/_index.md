---
title: PdfDevice
second_title: Aspose.Page for .NET API Referansı
description: Sınıf kapsülleme görüntü oluşturma aygıtı.
type: docs
weight: 340
url: /tr/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Sınıf kapsülleme görüntü oluşturma aygıtı.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(Stream) | Yeni örneği oluşturur. |
| [PdfDevice](pdfdevice#constructor_1)(Stream, Size) | Belirtilen ortam boyutuyla yeni örneği oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background) { get; set; } | Arka plan rengini alır/ayarlar. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Geçerli karakterlerin dönüşümünü döndürür veya belirtir. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Ortaya çıkan cihaz çıktısının yaratıcısını döndürür veya belirtir. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber) { get; } | Belge içindeki geçerli sayfanın mutlak sayısını verir. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber) { get; } | Geçerli bölüm içindeki geçerli sayfanın numarasını döndürür. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font) { get; set; } | Geçerli yazı tipini alır/ayarlar. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Aygıtın doğrudan RGB modunu, yani RGB'yi kullanıp kullanmadığını gösterir. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Aspose.Page kitaplığının bu örneğinin lisanslı olup olmadığını gösterir. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity) { get; set; } | Opaklığı alır/ayarlar. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask) { get; set; } | Opaklık maskesi için fırçayı alır/ayarlar. Maske, Paint veya Strike üzerine uygulanır. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint) { get; set; } | Yolları doldurmak için fırçayı alır/ayarlar. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Meta veriler dahil cihaz özellikleri. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions) { set; } | Kaydetme seçeneklerini başlatır. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size) { get; set; } | Aygıt ortam boyutunu alır/ayarlar. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke) { get; set; } | Yol çizmenin konturunu alır/ayarlar. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Geçerli metin oluşturma modunu döndürür veya belirtir. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Geçerli metin kontur genişliğini döndürür veya belirtir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline)(int, string) | Hedefi son nesne olan bir anahat öğesi ekler. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline_1)(PointF, int, string) | Hedefi başlangıç noktası olan bir anahat öğesi ekler. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage)() | Sayfayı tamamlar. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition)() | Belge bölümü tamamlandı. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create)() | Bu aygıt örneğine dayalı olarak aygıtın yeni bir örneğini oluşturur. Bu aygıtın grafik durumunu yazar, yani oluştururApsCanvas ilgili RenderTransform ve Clip özelliklerine sahip instance(lar) . |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose)() | Bu cihaz örneğini atar. Bu aygıt örneği grafik durumunu sonlandırır, yani APS oluşturma bağlamınıApsCanvas this aygıtının grafik durumundan daha yüksek düzeydeApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw)(GraphicsPath) | Belirtilen yolu çizer. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Bir yay çizer. |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | Atanmış dönüştürme ve arka plana sahip bir görüntü çizer. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Bir çizgi parçası çizer. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Bir oval çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Bir poligon çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Bir çokgen çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Bir dikdörtgen çizer. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Yuvarlak bir dikdörtgen çizer. |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring)(string, double, double) | Belirtilen konumda bir dize çizer. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument)() | Belgeyi tamamlar. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill)(GraphicsPath) | Belirtilen yolu doldurur. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Bir yayı doldurur. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Bir ovali doldurur. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Bir poligon doldurur. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Bir poligon doldurur. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Bir dikdörtgeni doldurur. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Yuvarlak bir dikdörtgeni doldurur. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | Dize özelliğinin bir değerini alır. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | Bir renk özelliği değeri alır. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | Çift özellik değeri alır. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | Tamsayı özelliğinin bir değerini alır. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | Bir kenar boşluğu özelliği değeri alır. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | Dikdörtgen özelliğinin bir değerini alır. |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Boyut özelliğinin bir değerini alır. |
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform)() | Geçerli dönüştürme matrisini döndürür. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Cihazın klibini başlatır. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers)() | Çıktılanacak sayfaların sayısını başlatır. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Boole özelliğinin değerini alır. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage_1)(string) | Belirtilen başlık ile yeni bir sayfa başlatır. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage)(float, float) | Belirtilen genişlik ve yükseklikte yeni bir sayfa başlatır. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition)() | Yeni bir belge bölümü başlatır. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew)() | Aygıtları başlangıç durumuna ayarlar. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset)() | Cihazı sıfırlar. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate#rotate)(double) | Geçerli dönüşüm matrisine orijin etrafında saat yönünde bir dönüş uygular. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Geçerli dönüştürme matrisini bir nokta etrafında döndürün. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale)(double, double) | Belirtilen ölçek vektörünü geçerli dönüştürme matrisine uygular. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip)(GraphicsPath) | Belirtilen yolu geçerli klip yoluna ekler. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget)(int) | Hedefi olarak bir sayfa numarası olan köprüyü ayarlar. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget_1)(string) | Hedefi olarak harici bir URI içeren köprüyü ayarlar. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform)(Matrix) | Geçerli dönüştürme matrisini ayarlar. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear)(double, double) | Belirtilen kesme vektörünü geçerli dönüşüm matrisine uygular. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument)() | Belgeyi başlatır. |
| override [ToString](../../aspose.page/device/tostring)() | Aygıt türünün adını döndürür. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform)(Matrix) | Geçerli dönüştürme matrisini belirtilen değerle çarpar.Matrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate)(double, double) | Belirtilen çeviri vektörünü geçerli dönüştürme matrisine uygular. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters)(IMultiPageDevice) | Geçerli sayfa parametrelerini günceller. |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | Bir yorum yazar. |

### Ayrıca bakınız

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* ad alanı [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf)
* toplantı [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
