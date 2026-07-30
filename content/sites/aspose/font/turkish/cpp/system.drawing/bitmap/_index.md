---
title: "System::Drawing::Bitmap sınıfı"
linktitle: "Bitmap"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Bitmap sınıfı. GDI+ bitmap görüntüsünü temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.drawing/bitmap/
---
## Bitmap class


GDI+ bitmap görüntüsünü temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class Bitmap : public System::Drawing::Image
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | Piksel işleme modunu etkinleştirir. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | Belirtilen mevcut görüntüden yeni bir [Bitmap](./) nesnesi oluşturur. |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | Belirtilen akıştan yeni bir [Bitmap](./) nesnesi oluşturur. |
| [Bitmap](./bitmap/)(const String\&) | Belirtilen dosyadan yeni bir [Bitmap](./) nesnesi oluşturur. |
| [Bitmap](./bitmap/)(const String\&, bool) | Belirtilen dosyadan yeni bir [Bitmap](./) nesnesi oluşturur. |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | Belirtilen genişlik, yükseklik, piksel biçimi ve piksel verileriyle bir bitmap görüntüsünü temsil eden yeni bir [Bitmap](./) nesnesi oluşturur. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | Belirtilen mevcut görüntüden, belirtilen boyuta ölçeklendirilmiş yeni bir [Bitmap](./) nesnesi oluşturur. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | Belirtilen mevcut görüntüden, genişlik ve yükseklik belirtilen değerlere ölçeklendirilmiş yeni bir [Bitmap](./) nesnesi oluşturur. |
| [Clone](./clone/)() override | Geçerli nesnenin bir kopyasını oluşturur. |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | Geçerli nesne tarafından temsil edilen bitmap görüntüsünün bir bölgesinin kopyasını temsil eden bir [Bitmap](./) nesnesi oluşturur. |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | Geçerli nesne tarafından temsil edilen bitmap görüntüsünün bir bölgesinin kopyasını temsil eden bir [Bitmap](./) nesnesi oluşturur. |
| [ComputeHash](./computehash/)() | SHA1 karma değerini hesaplar. |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | Belirtilen bitmap görüntüsünün piksel biçimi Format32bppArgb olarak değiştirilmiş bir kopyasını oluşturur. |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | Piksel işleme modunu devre dışı bırakır. |
| [get_Height](./get_height/)() const override | Görüntünün yüksekliğini piksel olarak döndürür. |
| [get_Palette](./get_palette/)() const override | Geçerli nesne tarafından temsil edilen görüntü tarafından kullanılan renk paletini döndürür. |
| [get_PixelFormat](./get_pixelformat/)() const override | Geçerli nesne tarafından temsil edilen görüntünün piksel biçimini döndürür. |
| [get_RawFormat](./get_rawformat/)() const override | Geçerli nesne tarafından temsil edilen görüntünün dosya biçimini döndürür. |
| [get_Width](./get_width/)() const override | Görüntünün genişliğini piksel olarak döndürür. |
| [GetHbitmap](./gethbitmap/)() | Geçerli nesne tarafından temsil edilen bitmap'ten bir GDI bitmap nesnesi oluşturur. |
| [GetPixel](./getpixel/)(int, int) | Belirtilen pikselin rengini döndürür. |
| [GetSkBitmap](./getskbitmap/)() const override | Temel SkBitmap nesnesine bir ham işaretçi döndürür. |
| [IsMultiImage](./ismultiimage/)() const override | Orijinal biçimin çoklu görüntü olup olmadığını döndürür. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | [Bitmap](./) nesnesini sistem belleğine kilitler. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | [Bitmap](./) nesnesini sistem belleğine kilitler. |
| [MakeTransparent](./maketransparent/)(Color) | Belirtilen renge sahip tüm piksellerin rengini şeffaf yapar. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | Geçerli nesne tarafından temsil edilen görüntünün piksellerinin renklerini ön çarpar. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | Görüntüyü 90 derecelik katlara döndürür ve çevirir. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | Mevcut nesne tarafından temsil edilen görüntü tarafından kullanılan renk paletini ayarlar. |
| [SetPixel](./setpixel/)(int, int, Color) | Geçerli nesne tarafından temsil edilen bitmap görüntüsündeki belirtilen pikselin rengini ayarlar. |
| [SetResolution](./setresolution/)(float, float) | Görüntünün çözünürlüğünü ayarlar. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | Belirtilen bitmap'i sistem belleğinden kilidini açar. |
## Ayrıca Bakınız

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
