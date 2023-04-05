---
title: Class ImageDevice
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.EPS.Device.ImageDevice sınıf. Bu sınıf belgenin görüntüye dönüştürülmesini içerir.
type: docs
weight: 40
url: /tr/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Bu sınıf, belgenin görüntüye dönüştürülmesini içerir.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Yeni örneğini başlatır`ImageDevice` . |
| [ImageDevice](imagedevice/#constructor_1)(ImageFormat) | Yeni örneğini başlatır`ImageDevice` belirtilen görüntü formatıyla. |
| [ImageDevice](imagedevice/#constructor_2)(Size) | Yeni örneğini başlatır`ImageDevice` belirtilen boyutta bir sayfa ile. |
| [ImageDevice](imagedevice/#constructor_3)(Size, ImageFormat) | Yeni örneğini başlatır`ImageDevice` belirtilen sayfa boyutu ve resim formatı ile. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background/) { get; set; } | Cihazın doğrudan RGB modunu, yani RGB'yi kullanıp kullanmadığını gösterir. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm/) { get; set; } | Geçerli karakterleri döndürür veya belirtir transform. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator/) { get; set; } | Ortaya çıkan aygıt çıktısının yaratıcısını döndürür veya belirtir. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber/) { get; } | Geçerli sayfa numarası. |
| override [Font](../../aspose.page.eps.device/imagedevice/font/) { get; set; } | Geçerli yazı tipini döndürür veya belirtir. |
| [Format](../../aspose.page.eps.device/imagedevice/format/) { get; } | Görüntü formatı. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes/) { get; } | Sonuç görüntülerini bir sayfa için bir bayt dizisi olan bayt cinsinden döndürür. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb/) { get; } | Cihazın doğrudan RGB modunu, yani RGB'yi kullanıp kullanmadığını gösterir. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Aspose.Page kitaplığının bu örneğinin lisanslı olup olmadığını gösterir. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity/) { get; set; } | Sayfanın geçerli arka planını döndürür veya belirtir. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Geçerli opaklık maskesini döndürür veya belirtir. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint/) { get; set; } | Mevcut boyayı döndürür veya belirtir. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Meta veriler dahil olmak üzere cihaz özellikleri. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions/) { set; } | İşleme sürecini yönetmek için seçenekler. |
| override [Size](../../aspose.page.eps.device/imagedevice/size/) { get; set; } | Sayfanın boyutunu döndürür veya belirtir. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke/) { get; set; } | Mevcut konturu döndürür veya belirtir. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode/) { get; set; } | Geçerli metin oluşturma modunu döndürür veya belirtir. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth/) { get; set; } | Geçerli metin kontur genişliğini döndürür veya belirtir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage/)() | Sayfa oluşturulduktan sonra cihazın gerekli hazırlığını yapar. |
| override [Create](../../aspose.page.eps.device/imagedevice/create/)() | Bu cihazın bir kopyasını oluşturur. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose/)() | Aygıtı ortadan kaldırır. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw/)(GraphicsPath) | Bir yol çizer. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Bir yay çizer. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage/)(Bitmap, Matrix, Color) | Atanmış dönüşüm ve arka plana sahip bir görüntü çizer. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Bir doğru parçası çizer. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Bir oval çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Bir çokgen çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Bir çokgen çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Bir dikdörtgen çizer. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Yuvarlak bir dikdörtgen çizer. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring/)(string, double, double) | Belirtilen noktada bir dizi çizer. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument/)() | Belge oluşturulduktan sonra cihazın gerekli hazırlığını yapar. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill/)(GraphicsPath) | Bir yolu doldurur. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Bir yayı doldurur. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Bir ovali doldurur. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Bir çokgeni doldurur. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Bir çokgeni doldurur. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Bir dikdörtgeni doldurur. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Yuvarlak bir dikdörtgeni doldurur. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty/#getproperty)(string) | String özelliğinin değerini alır. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor/#getpropertycolor)(string) | Bir renk özelliği değeri alır. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble/#getpropertydouble)(string) | Double özelliğinin değerini alır. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint/#getpropertyint)(string) | Tamsayı özelliğinin değerini alır. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins/#getpropertymargins)(string) | Bir marj özelliği değeri alır. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle/#getpropertyrectangle)(string) | Dikdörtgen özelliğinin değerini alır. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize/#getpropertysize)(string) | Size özelliğinin bir değerini alır. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform/)() | Geçerli dönüşümü alır. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip/)() | Cihazın bir klibini başlatır. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers/)() | Çıktı alınacak sayfa sayısını başlatır. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty/#isproperty)(string) | Bir boole özelliği değeri alır. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage_1)(string) | Sayfa oluşturmadan önce cihazın gerekli hazırlığını yapar. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage)(float, float) | Her sayfa işlemeden önce cihazın gerekli hazırlığını yapar. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew/)() | Tüm belge için cihazı başlangıç durumuna sıfırlayın. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset/)() | Cihazı bir sayfa için başlangıç durumuna sıfırlayın. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate/#rotate)(double) | Geçerli dönüştürme matrisini Z ekseni üzerinde döndürün. writeTransform(Transform). öğesini çağırır Pozitif teta açısıyla döndürmek, pozitif x ekseni üzerindeki noktaları pozitif y eksenine doğru döndürür. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Geçerli dönüşüm matrisini bir nokta etrafında döndürün. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale/)(double, double) | Mevcut dönüştürme matrisini ölçeklendirir. writeTransform(Transform). çağrıları |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip/)(GraphicsPath) | Klipler şekli. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform/)(Matrix) | Geçerli dönüşümü belirtir. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear/)(double, double) | Mevcut dönüşüm matrisini yayar. writeTransform(Transform). çağrıları |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument/)() | Belgenin işlenmesine başlamadan önce cihazın gerekli hazırlığını yapar. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring/)() | Aygıt türünün adını döndürür. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform/)(Matrix) | Geçerli dönüştürme matrisini dönüştürür. writeTransform(Transform). çağrıları |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate/)(double, double) | Geçerli dönüşüm matrisini çevirir. writeTransform(Transform). çağrıları |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters/)(IMultiPageDevice) | Diğer çok sayfalı cihazdan sayfa parametrelerini günceller. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment/)(string) | Bir yorum yazar. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background/) | "Arka plan" özellik anahtarı. |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color/) | "Arka plan rengi" özellik anahtarı. |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts/) | "Yazı tipini belgeye göm" özellik anahtarı. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors/) | "Hata yayma" özellik değeri. |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings/) | "Uyarı gönder" özellik değeri. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page/) | "İçeriği sayfaya sığdır" özellik anahtarı. |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation/) | "Yönlendirme" özellik anahtarı. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins/) | "Sayfa kenar boşlukları" özellik anahtarı. |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size/) | "Sayfa boyutu" özellik anahtarı. |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer/) | "Üretici" özellik değeri. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent/) | "Şeffaf" özellik anahtarı. |

### Ayrıca bakınız

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* ad alanı [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* toplantı [Aspose.Page](../../)


