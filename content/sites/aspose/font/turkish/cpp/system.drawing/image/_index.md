---
title: "System::Drawing::Image sınıfı"
linktitle: "Görüntü"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Image sınıfı. System::Drawing::Bitmap ve System::Drawing::Metafile sınıfları için temel işlevsellik sağlayan bir temel sınıftır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1200
url: /tr/cpp/system.drawing/image/
---
## Image class


Temel işlevsellik sağlayan [System::Drawing::Bitmap](../bitmap/) ve System::Drawing::Metafile sınıfları için bir temel sınıftır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Image : public virtual System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Clone](./clone/)() | Geçerli nesnenin bir kopyasını oluşturur. |
| [Dispose](./dispose/)() override | Geçerli nesne tarafından edinilen tüm kaynakları serbest bırakır. |
| static [FromFile](./fromfile/)(const String\&, bool) | Belirtilen dosyadan bir [Image](./) nesnesi oluşturur. |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | Belirtilen GDI bitmap'inden bir [Bitmap](../bitmap/) nesnesi oluşturur. |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | Belirtilen akıştan bir [Image](./) nesnesi oluşturur. |
| virtual [get_Flags](./get_flags/)() const | Görüntünün özelliklerini temsil eden ImageFlags enum değerlerinin bit düzeyinde bir kombinasyonunu döndürür. |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | Geçerli nesne tarafından temsil edilen görüntü içindeki çerçevelerin boyutlarını temsil eden GUID'lerin bir dizisini döndürür. |
| virtual [get_Height](./get_height/)() const | Görüntünün yüksekliğini piksel olarak döndürür. |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | Geçerli nesne tarafından temsil edilen görüntünün yatay çözünürlüğünü inç başına piksel olarak döndürür. |
| virtual [get_Palette](./get_palette/)() const | Geçerli nesne tarafından temsil edilen görüntü tarafından kullanılan renk paletini döndürür. |
| virtual [get_PixelFormat](./get_pixelformat/)() const | Geçerli nesne tarafından temsil edilen görüntünün piksel biçimini döndürür. |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | Bu görüntüde depolanan özellik öğelerinin kimliklerini alır. |
| virtual [get_PropertyItems](./get_propertyitems/)() const | Bu görüntüde depolanan tüm özellik öğelerini (meta veri parçalarını) alır. |
| virtual [get_RawFormat](./get_rawformat/)() const | Geçerli nesne tarafından temsil edilen görüntünün dosya biçimini döndürür. |
| [get_Size](./get_size/)() const | Görüntünün genişliğini ve yüksekliğini piksel olarak temsil eden bir [Size](../size/) nesnesini döndürür. |
| virtual [get_Tag](./get_tag/)() const | Görüntü hakkında ek veri sağlayan bir nesneyi alır. |
| [get_VerticalResolution](./get_verticalresolution/)() const | Geçerli nesne tarafından temsil edilen görüntünün dikey çözünürlüğünü inç başına piksel olarak döndürür. |
| virtual [get_Width](./get_width/)() const | Görüntünün genişliğini piksel olarak döndürür. |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | Belirtilen ölçü birimlerinde görüntünün sınırlarını döndürür. |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | Belirtilen çerçeve boyutunun çerçeve sayısını döndürür. |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | Belirtilen piksel biçiminde renk derinliğini temsil etmek için kullanılan bit sayısını döndürür. |
| virtual [GetSkBitmap](./getskbitmap/)() const | Temel bir SkBitmap nesnesini döndürür. |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | Bu [System::Drawing::Image](./) nesnesi için bir küçük resim alır. |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | Belirtilen piksel biçiminin alfa bilgisi içerip içermediğini belirler. |
| virtual [IsMultiImage](./ismultiimage/)() const | Orijinal biçimin çoklu görüntü olup olmadığını döndürür. |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | Görüntüyü 90 derecelik katlara döndür ve çevir. |
| [Save](./save/)(const String\&) | Geçerli nesne tarafından temsil edilen görüntüyü belirtilen dosyaya PNG biçiminde kaydeder. |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | Geçerli nesne tarafından temsil edilen görüntüyü belirtilen dosyaya belirtilen biçimde kaydeder. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | Geçerli nesne tarafından temsil edilen görüntüyü belirtilen akışa belirtilen biçimde kaydeder. |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Geçerli nesne tarafından temsil edilen görüntüyü belirtilen kodlayıcı ve kodlayıcı parametrelerini kullanarak belirtilen dosyaya kaydeder. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Mevcut nesne tarafından temsil edilen görüntüyü, belirtilen kodlayıcı ve kodlayıcı parametrelerini kullanarak belirtilen akışa kaydeder. |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | Önceki bir [Save()](./save/) yöntemi çağrısında belirtilen dosya veya akışa bir çerçeve ekler. |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | Önceki bir [Save()](./save/) yöntemi çağrısında belirtilen dosya veya akışa bir çerçeve ekler. |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | Belirtilen çerçeveyi seçer. |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | Mevcut nesne tarafından temsil edilen görüntü tarafından kullanılan renk paletini ayarlar. |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | Görüntü hakkında ek veri sağlayan bir nesneyi ayarlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | GetThumbnailImage yürütmesini iptal etmek için bir geri çağırma. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
