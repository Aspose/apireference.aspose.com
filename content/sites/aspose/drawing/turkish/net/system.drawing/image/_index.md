---
title: Image
second_title: Aspose.Drawing for .NET API Referansı
description: Bitmap ve Metafile kökenli sınıflar için işlevsellik sağlayan soyut bir temel sınıf.
type: docs
weight: 580
url: /tr/net/system.drawing/image/
---
## Image class

Bitmap ve Metafile kökenli sınıflar için işlevsellik sağlayan soyut bir temel sınıf.

```csharp
public abstract class Image : IDisposable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Image](image)() | Yeni bir örneğini başlatır[`Image`](../image) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Aşağıdakilerin bit düzeyinde bir kombinasyonunu temsil eden tamsayıyı alır:[`ImageFlags`](../../system.drawing.imaging/imageflags) bu Resim için. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist) { get; } | Bu çerçeve içindeki çerçevelerin boyutlarını temsil eden bir dizi GUID alır.Image . |
| abstract [Height](../../system.drawing/image/height) { get; } | Bunun piksel cinsinden yüksekliğini alırImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Bunun inç başına piksel cinsinden yatay çözünürlüğünü alır.Image . |
| abstract [Palette](../../system.drawing/image/palette) { get; set; } | Bunun için kullanılan renk paletini alır veya ayarlarImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Bu görüntünün genişliğini ve yüksekliğini alır. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat) { get; } | Bunun için piksel biçimini alırImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist) { get; } | Bu dosyada depolanan özellik öğelerinin kimliklerini alırImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems) { get; } | Bu dosyada depolanan tüm özellik öğelerini (meta veri parçaları) alırImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat) { get; } | Bunun dosya biçimini alırImage . |
| [Size](../../system.drawing/image/size) { get; } | Bu görüntünün piksel cinsinden genişliğini ve yüksekliğini alır. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Görüntü hakkında ek veri sağlayan bir nesne alır veya ayarlar. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Bunun inç başına piksel cinsinden dikey çözünürlüğünü alır.Image . |
| abstract [Width](../../system.drawing/image/width) { get; } | Bunun piksel cinsinden genişliğini alırImage . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile)(string) | BirImage belirtilen dosyadan. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream)(Stream) | BirImagebelirtilen veri akışından. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream_1)(Stream, bool) | BirImage belirtilen veri akışından, isteğe bağlı olarak o akışta gömülü renk yönetimi bilgilerini kullanarak. |
| [Clone](../../system.drawing/image/clone)() | Bunun tam bir kopyasını oluştururImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Bu Resim tarafından kullanılan tüm kaynakları serbest bırakır. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Belirtilen birimde görüntünün sınırlarını alır. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Belirtilen boyutun çerçeve sayısını döndürür. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem)(int) | Bundan belirtilen özellik öğesini alırImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Bunun için bir küçük resim döndürürImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem)(int) | Belirtilen özellik öğesini bundan kaldırırImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip)(RotateFlipType) | Bu yöntem döndürür, çevirir veya döndürür veImage . |
| [Save](../../system.drawing/image/save#save_2)(string) | Bunu kaydederImagebelirtilen dosyaya veya akışa. |
| [Save](../../system.drawing/image/save#save_1)(Stream, ImageFormat) | Bu görüntüyü belirtilen akışa belirtilen biçimde kaydeder. |
| [Save](../../system.drawing/image/save#save_4)(string, ImageFormat) | Bunu kaydederImage belirtilen dosyaya belirtilen biçimde. |
| [Save](../../system.drawing/image/save#save)(Stream, ImageCodecInfo, EncoderParameters) | Bu görüntüyü belirtilen kodlayıcı ve görüntü kodlayıcı parametreleriyle belirtilen akışa kaydeder. |
| [Save](../../system.drawing/image/save#save_3)(string, ImageCodecInfo, EncoderParameters) | Bunu kaydederImage belirtilen kodlayıcı ve görüntü kodlayıcı parametreleriyle belirtilen dosyaya. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd_1)(EncoderParameters) | Görüntü.Kaydet(...) yöntemlerinden birine yapılan önceki çağrıda belirtilen dosyaya veya akışa bir çerçeve ekler. Çok çerçeveli bir görüntüden başka bir çok çerçeveli görüntüye seçilen çerçeveleri kaydetmek için bu yöntemi kullanın. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd)(Image, EncoderParameters) | Image.Save(...) yöntemlerinden birine yapılan önceki çağrıda belirtilen dosyaya veya akışa bir çerçeve ekler. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Boyut ve dizin tarafından belirtilen çerçeveyi seçer. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem)(PropertyItem) | Bu dosyada bir özellik öğesi (meta veri parçası) depolarImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap)(IntPtr) | BirBitmap tanıtıcıdan GDI bitmap'e. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize)(PixelFormat) | Belirtilen piksel biçiminin piksel başına bit sayısı olarak renk derinliğini verir. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat)(PixelFormat) | Bunun için piksel biçiminin olup olmadığını gösteren bir değer döndürür.Image alfa bilgisi içerir. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort) | Ne zaman olacağını belirlemek için bir geri arama yöntemi sağlar.[`GetThumbnailImage`](./getthumbnailimage) yöntem yürütmeyi zamanından önce iptal etmelidir. |

### Ayrıca bakınız

* ad alanı [System.Drawing](../../system.drawing)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
