---
title: ImageDevice
second_title: Aspose.TeX for .NET API Referansı
description: Görüntülere metin ve grafik içerik çıktısı almak için arabirimi uygular.
type: docs
weight: 300
url: /tr/net/aspose.tex.presentation.image/imagedevice/
---
## ImageDevice class

Görüntülere metin ve grafik içerik çıktısı almak için arabirimi uygular.

```csharp
public class ImageDevice : Device
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [ImageDevice](imagedevice)(bool) | Yeni örnek oluşturur. Çıktı dosyası, iş adını dosya adı olarak alarak work dizinine yazılır. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [DestinationName](../../aspose.tex.presentation.image/imagedevice/destinationname) { get; } | Hedef adını alır: çıktı dosyası adı veya cihaz açıklaması. |
| override [Fill](../../aspose.tex.presentation.image/imagedevice/fill) { get; set; } | Geçerli dolguyu alır/ayarlar. |
| override [FillOpacity](../../aspose.tex.presentation.image/imagedevice/fillopacity) { get; set; } | Geçerli dolgu opaklığını alır/ayarlar. |
| override [IsReady](../../aspose.tex.presentation.image/imagedevice/isready) { get; } | Cihazın çıktıya hazır olup olmadığını gösterir. |
| override [PageCount](../../aspose.tex.presentation.image/imagedevice/pagecount) { get; } | Sayfa sayısını alır. |
| [Result](../../aspose.tex.presentation.image/imagedevice/result) { get; } | Elde edilen görüntülerin bayt dizilerini döndürür. İlk boyut iç belgeler içindir ve ikincisi iç belgeler içindeki sayfalar içindir. |
| override [Stroke](../../aspose.tex.presentation.image/imagedevice/stroke) { get; set; } | Geçerli konturu alır/ayarlar. |
| override [StrokeOpacity](../../aspose.tex.presentation.image/imagedevice/strokeopacity) { get; set; } | Geçerli kontur opaklığını alır/ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [AddHyperlink](../../aspose.tex.presentation.image/imagedevice/addhyperlink)(RectangleF, Pen, string) | Hedefi bir URI olan köprüyü ayarlayın. |
| override [Create](../../aspose.tex.presentation.image/imagedevice/create)() | Bu cihazın bir kopyasını oluşturur. |
| override [Dispose](../../aspose.tex.presentation.image/imagedevice/dispose)() | Bu cihaz örneğini atar. Bu aygıt örneği grafik durumunu sonlandırır, yani, oluşturma bağlamını bu aygıtın grafik durumundan daha yüksek bir düzeye geçirir. |
| override [DrawPath](../../aspose.tex.presentation.image/imagedevice/drawpath)(GraphicsPath) | Bir yol çizer. |
| override [DrawString](../../aspose.tex.presentation.image/imagedevice/drawstring)(string, float, float, List&lt;GlyphData&gt;) | Bir metin dizesi çizer. |
| override [EndDocument](../../aspose.tex.presentation.image/imagedevice/enddocument)() | Tüm belgeyi sonlandırır. |
| override [EndPage](../../aspose.tex.presentation.image/imagedevice/endpage)() | Bir sayfayı sonlandırır. |
| override [FillPath](../../aspose.tex.presentation.image/imagedevice/fillpath)(GraphicsPath) | Bir yol doldurun. |
| override [Init](../../aspose.tex.presentation.image/imagedevice/init)() | Cihazı başlatır. |
| override [SetClip](../../aspose.tex.presentation.image/imagedevice/setclip)(GraphicsPath) | Geçerli klip yolunu ayarlar. |
| override [SetTransform](../../aspose.tex.presentation.image/imagedevice/settransform)(Matrix) | Geçerli koordinat alanı dönüşümünü ayarlar. |
| override [ShowImage](../../aspose.tex.presentation.image/imagedevice/showimage)(PointF, SizeF, byte[]) | Bir tarama görüntüsü gösterir. |
| override [StartDocument](../../aspose.tex.presentation.image/imagedevice/startdocument)() | Tüm belgeyi başlatır. |
| override [StartPage](../../aspose.tex.presentation.image/imagedevice/startpage)(float, float) | Yeni bir sayfa başlatır. |

### Ayrıca bakınız

* class [Device](../../aspose.tex.presentation/device)
* ad alanı [Aspose.TeX.Presentation.Image](../../aspose.tex.presentation.image)
* toplantı [Aspose.TeX](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.TeX.dll -->
