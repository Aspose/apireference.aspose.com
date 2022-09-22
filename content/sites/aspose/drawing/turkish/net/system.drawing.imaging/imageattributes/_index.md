---
title: ImageAttributes
second_title: Aspose.Drawing for .NET API Referansı
description: Oluşturma sırasında bitmap ve meta dosyası renklerinin nasıl değiştirildiği hakkında bilgi içerir.
type: docs
weight: 740
url: /tr/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Oluşturma sırasında bitmap ve meta dosyası renklerinin nasıl değiştirildiği hakkında bilgi içerir.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [ImageAttributes](imageattributes)() | Yeni bir örneğini başlatır[`ImageAttributes`](../imageattributes) sınıf. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | Bunun fırça rengi yeniden eşleme tablosunu temizlerImageAttributes nesne. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey)() | Varsayılan kategori için renk anahtarını (saydamlık aralığı) temizler. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey_1)(ColorAdjustType) | Belirtilen kategori için renk anahtarını (saydamlık aralığı) temizler. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix)() | Varsayılan kategori için renk ayarlama matrisini temizler. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix_1)(ColorAdjustType) | Belirtilen kategori için renk ayarlama matrisini temizler. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma)() | Varsayılan kategori için gama düzeltmesini devre dışı bırakır. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma_1)(ColorAdjustType) | Belirtilen kategori için gama düzeltmesini devre dışı bırakır. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop)() | Varsayılan kategori için NoOp ayarını temizler. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop_1)(ColorAdjustType) | Belirtilen kategori için NoOp ayarını temizler. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel)() | Varsayılan kategori için CMYK (camgöbeği-macenta-sarı-siyah) çıkış kanalı ayarını temizler. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel_1)(ColorAdjustType) | Belirtilen kategori için (camgöbeği-macenta-sarı-siyah) çıkış kanalı ayarını temizler. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile)() | Varsayılan kategori için çıktı kanalı renk profili ayarını temizler. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Belirtilen kategori için çıktı kanalı renk profili ayarını temizler. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable)() | Varsayılan kategori için renk yeniden eşleme tablosunu temizler. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable_1)(ColorAdjustType) | Belirtilen kategori için renk yeniden eşleme tablosunu temizler. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold)() | Varsayılan kategori için eşik değerini temizler. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold_1)(ColorAdjustType) | Belirtilen kategori için eşik değerini temizler. |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | Bunun tam bir kopyasını oluştururImageAttributes nesne. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | Bunun kullandığı tüm kaynakları serbest bırakırImageAttributes nesne. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | Belirtilen kategorinin ayarlama ayarlarına göre bir paletteki renkleri ayarlar. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | Fırça kategorisi için renk yeniden eşleme tablosunu ayarlar. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey)(Color, Color) | Varsayılan kategori için renk anahtarını ayarlar. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey_1)(Color, Color, ColorAdjustType) | Belirtilen kategori için renk anahtarını (saydamlık aralığı) ayarlar. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices)(ColorMatrix, ColorMatrix) | Varsayılan kategori için renk ayar matrisini ve gri tonlamalı ayar matrisini ayarlar. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Varsayılan kategori için renk ayar matrisini ve gri tonlamalı ayar matrisini ayarlar. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Belirtilen kategori için renk ayarlama matrisini ve gri tonlama ayarlama matrisini ayarlar. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix)(ColorMatrix) | Varsayılan kategori için renk ayarlama matrisini ayarlar. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Varsayılan kategori için renk ayarlama matrisini ayarlar. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Belirtilen kategori için renk ayarlama matrisini ayarlar. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma)(float) | Varsayılan kategori için gama değerini ayarlar. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma_1)(float, ColorAdjustType) | Belirtilen kategori için gama değerini ayarlar. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop)() | Varsayılan kategori için renk ayarını kapatır. [`ClearNoOp`](./clearnoop) çağrı 'den önce geçerli olan renk ayarlama ayarlarını yeniden başlatma yöntemi [`SetNoOp`](./setnoop) yöntem. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop_1)(ColorAdjustType) | Belirtilen kategori için renk ayarını kapatır. arayabilirsin[`ClearNoOp`](./clearnoop) çağrısından önce geçerli olan renk ayarlama ayarlarını eski haline getirmek için yöntemi[`SetNoOp`](./setnoop) yöntem. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel)(ColorChannelFlag) | Varsayılan kategori için CMYK (camgöbeği-macenta-sarı-siyah) çıkış kanalını ayarlar. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Belirtilen kategori için CMYK (camgöbeği-macenta-sarı-siyah) çıkış kanalını ayarlar. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile)(string) | Varsayılan kategori için çıktı kanalı renk profili dosyasını ayarlar. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Belirtilen kategori için çıktı kanalı renk profili dosyasını ayarlar. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable)(ColorMap[]) | Varsayılan kategori için renk yeniden eşleme tablosunu ayarlar. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable_1)(ColorMap[], ColorAdjustType) | Belirtilen kategori için renk yeniden eşleme tablosunu ayarlar. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold)(float) | Varsayılan kategori için eşiği (saydamlık aralığı) ayarlar. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold_1)(float, ColorAdjustType) | Belirtilen kategori için eşiği (saydamlık aralığı) ayarlar. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode)(WrapMode) | Bir dokunun bir şekilde veya şekil sınırlarında nasıl döşeneceğine karar vermek için kullanılan sarma modunu ayarlar. Doku, doldurduğu şekilden daha küçük olduğunda doldurmak için bir şekle döşenir. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_1)(WrapMode, Color) | Bir dokunun bir şekilde veya şekil sınırlarında nasıl döşeneceğine karar vermek için kullanılan sarma modunu ve rengi ayarlar. Doku, doldurduğu şekilden daha küçük olduğunda doldurmak için bir şekle döşenir. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_2)(WrapMode, Color, bool) | Bir dokunun bir şekilde veya şekil sınırlarında nasıl döşeneceğine karar vermek için kullanılan sarma modunu ve rengi ayarlar. Doku, doldurduğu şekilden daha küçük olduğunda doldurmak için bir şekle döşenir. |

### Ayrıca bakınız

* ad alanı [System.Drawing.Imaging](../../system.drawing.imaging)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
