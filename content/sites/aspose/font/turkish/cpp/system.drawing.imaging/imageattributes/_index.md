---
title: "System::Drawing::Imaging::ImageAttributes sınıfı"
linktitle: "ImageAttributes"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::ImageAttributes sınıfı. Görüntü renklerinin işleme sırasında nasıl değiştirildiği hakkında bilgi temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Görüntü renklerinin işleme sırasında nasıl değiştirildiği hakkında bilgi temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ImageAttributes : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | UYGULANMADI. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | UYGULANMADI. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | UYGULANMADI. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | UYGULANMADI. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | UYGULANMADI. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | UYGULANMADI. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | UYGULANMADI. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | UYGULANMADI. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | UYGULANMADI. |
| [Clone](./clone/)() | Geçerli nesnenin bir kopyasını oluşturur. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | UYGULANMADI. |
| [ImageAttributes](./imageattributes/)() | Varsayılan yapıcı. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | UYGULANMADI. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | UYGULANMADI. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | UYGULANMADI. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Renk ayarlama matrisini ayarlar. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | UYGULANMADI. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | UYGULANMADI. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | UYGULANMADI. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | UYGULANMADI. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | UYGULANMADI. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | UYGULANMADI. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Bir şekil üzerinde veya şekil sınırlarında bir dokunun nasıl döşeneceğine karar vermek için kullanılan sarma modunu ve rengi ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
