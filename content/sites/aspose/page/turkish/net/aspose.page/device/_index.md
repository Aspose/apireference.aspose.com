---
title: Device
second_title: Aspose.Page for .NET API Referansı
description: Bu sınıf belgenin soyut aygıta işlenmesini kapsar. Belgenin işlenmesi sayfa sayfa gerçekleştirilir.
type: docs
weight: 20
url: /tr/net/aspose.page/device/
---
## Device class

Bu sınıf, belgenin soyut aygıta işlenmesini kapsar. Belgenin işlenmesi sayfa sayfa gerçekleştirilir.

```csharp
public abstract class Device
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Device](device)(Size) | Başlatıyor[`Device`](../device) bir sayfa boyutunda. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [Background](../../aspose.page/device/background) { get; set; } | Sayfanın geçerli arka planını döndürür veya belirtir. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Geçerli karakterlerin dönüşümünü döndürür veya belirtir. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Ortaya çıkan cihaz çıktısının yaratıcısını döndürür veya belirtir. |
| virtual [Font](../../aspose.page/device/font) { get; set; } | Geçerli yazı tipini döndürür veya belirtir. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Aygıtın doğrudan RGB modunu, yani RGB'yi kullanıp kullanmadığını gösterir. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Aspose.Page kitaplığının bu örneğinin lisanslı olup olmadığını gösterir. |
| virtual [Opacity](../../aspose.page/device/opacity) { get; set; } | Geçerli opaklığı döndürür veya belirtir. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Geçerli opaklık maskesini döndürür veya belirtir. |
| virtual [Paint](../../aspose.page/device/paint) { get; set; } | Geçerli boyayı döndürür veya belirtir. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Meta veriler dahil cihaz özellikleri. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions) { set; } | Oluşturma sürecini yönetme seçenekleri. |
| virtual [Size](../../aspose.page/device/size) { get; set; } | Sayfanın boyutunu döndürür veya belirtir. |
| virtual [Stroke](../../aspose.page/device/stroke) { get; set; } | Geçerli konturu döndürür veya belirtir. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Geçerli metin oluşturma modunu döndürür veya belirtir. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Geçerli metin kontur genişliğini döndürür veya belirtir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [Create](../../aspose.page/device/create)() | Bu cihazın bir kopyasını oluşturur. |
| virtual [Dispose](../../aspose.page/device/dispose)() | Aygıtı atar. |
| virtual [Draw](../../aspose.page/device/draw)(GraphicsPath) | Bir yol çizer. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Bir yay çizer. |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | Atanmış dönüştürme ve arka plana sahip bir görüntü çizer. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Bir çizgi parçası çizer. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Bir oval çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon)(double[], double[], int) | Bir poligon çizer. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon_1)(int[], int[], int) | Bir çokgen çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline)(double[], double[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline_1)(int[], int[], int) | Bir çoklu çizgi çizer. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Bir dikdörtgen çizer. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Yuvarlak bir dikdörtgen çizer. |
| virtual [DrawString](../../aspose.page/device/drawstring)(string, double, double) | Verilen noktada bir dize çizer. |
| virtual [EndDocument](../../aspose.page/device/enddocument)() | Belge oluşturulduktan sonra cihazın gerekli hazırlığını yapar. |
| virtual [Fill](../../aspose.page/device/fill)(GraphicsPath) | Bir yolu doldurur. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Bir yayı doldurur. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Bir ovali doldurur. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon)(double[], double[], int) | Bir poligon doldurur. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon_1)(int[], int[], int) | Bir poligon doldurur. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Bir dikdörtgeni doldurur. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Yuvarlak bir dikdörtgeni doldurur. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | Dize özelliğinin bir değerini alır. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | Bir renk özelliği değeri alır. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | Çift özellik değeri alır. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | Tamsayı özelliğinin bir değerini alır. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | Bir kenar boşluğu özelliği değeri alır. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | Dikdörtgen özelliğinin bir değerini alır. |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Boyut özelliğinin bir değerini alır. |
| virtual [GetTransform](../../aspose.page/device/gettransform)() | Geçerli dönüşümü alır. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Cihazın klibini başlatır. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Boole özelliğinin değerini alır. |
| virtual [ReNew](../../aspose.page/device/renew)() | Tüm belge için cihazı başlangıç durumuna sıfırlayın. Çıkış akışını sıfırlamak için kullanılır. |
| virtual [Reset](../../aspose.page/device/reset)() | Bir sayfa için cihazı başlangıç durumuna sıfırlayın. |
| virtual [Rotate](../../aspose.page/device/rotate#rotate)(double) | Geçerli dönüştürme matrisini döndürün. writeTransform(Transform) işlevini çağırır. Pozitif açı teta ile döndürme, pozitif x ekseni üzerindeki noktaları pozitif y eksenine doğru döndürür. |
| virtual [Rotate](../../aspose.page/device/rotate#rotate_1)(double, double, double) | Geçerli dönüştürme matrisini bir nokta etrafında döndürün. |
| virtual [Scale](../../aspose.page/device/scale)(double, double) | Geçerli dönüştürme matrisini ölçekler. writeTransform(Transform) öğesini çağırır. |
| virtual [SetClip](../../aspose.page/device/setclip)(GraphicsPath) | Aygıtın klibini belirtir. |
| virtual [SetTransform](../../aspose.page/device/settransform)(Matrix) | Geçerli dönüşümü belirtir. |
| virtual [Shear](../../aspose.page/device/shear)(double, double) | Geçerli dönüşüm matrisini yayar. writeTransform(Transform) öğesini çağırır. |
| virtual [StartDocument](../../aspose.page/device/startdocument)() | Belgenin oluşturulmasına başlamadan önce cihazın gerekli hazırlığını yapar. |
| override [ToString](../../aspose.page/device/tostring)() | Aygıt türünün adını döndürür. |
| virtual [Transform](../../aspose.page/device/transform)(Matrix) | Geçerli dönüştürme matrisini dönüştürür. writeTransform(Transform) öğesini çağırır |
| virtual [Translate](../../aspose.page/device/translate)(double, double) | Geçerli dönüştürme matrisini çevirir. writeTransform(Transform) öğesini çağırır. |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | Bir yorum yazar. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| static [VERSION](../../aspose.page/device/version) | Geçerli cihaz sürümü. |

### Ayrıca bakınız

* ad alanı [Aspose.Page](../../aspose.page)
* toplantı [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
