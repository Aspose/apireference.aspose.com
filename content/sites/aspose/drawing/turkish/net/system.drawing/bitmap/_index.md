---
title: Bitmap
second_title: Aspose.Drawing for .NET API Referansı
description: Bir grafik görüntüsü için piksel verilerinden ve özniteliklerinden oluşan bir bit eşlemi kapsüller. ABitmap./bitmap piksel verileriyle tanımlanan resimlerle çalışmak için kullanılan bir nesnedir.
type: docs
weight: 40
url: /tr/net/system.drawing/bitmap/
---
## Bitmap class

Bir grafik görüntüsü için piksel verilerinden ve özniteliklerinden oluşan bir bit eşlemi kapsüller. A[`Bitmap`](../bitmap) piksel verileriyle tanımlanan resimlerle çalışmak için kullanılan bir nesnedir.

```csharp
public class Bitmap : Image
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Bitmap](bitmap#constructor_3)(Image) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap) belirtilen mevcut görüntüden sınıf. |
| [Bitmap](bitmap#constructor_6)(Stream) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap) belirtilen veri akışından sınıf. |
| [Bitmap](bitmap#constructor_8)(string) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap) belirtilen dosyadan sınıf. |
| [Bitmap](bitmap#constructor_5)(Image, Size) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap)belirtilen boyuta ölçeklenmiş, belirtilen mevcut görüntüden sınıf. |
| [Bitmap](bitmap#constructor)(int, int) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap) belirtilen boyuta sahip sınıf. |
| [Bitmap](bitmap#constructor_7)(Stream, bool) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap) belirtilen veri akışından sınıf. |
| [Bitmap](bitmap#constructor_9)(string, bool) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap) belirtilen dosyadan sınıf. |
| [Bitmap](bitmap#constructor_4)(Image, int, int) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap) belirtilen mevcut görüntüden sınıf, belirtilen boyuta ölçeklendi. |
| [Bitmap](bitmap#constructor_2)(int, int, PixelFormat) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap) belirtilen boyut ve biçime sahip sınıf. |
| [Bitmap](bitmap#constructor_1)(int, int, int, PixelFormat, int[]) | Yeni bir örneğini başlatır[`Bitmap`](../bitmap) belirtilen boyut ve piksel verisine sahip sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Aşağıdakilerin bit düzeyinde bir kombinasyonunu temsil eden tamsayıyı alır:[`ImageFlags`](../../system.drawing.imaging/imageflags) bu Resim için. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | Bu çerçeve içindeki çerçevelerin boyutlarını temsil eden bir dizi GUID alır.Image . |
| override [Height](../../system.drawing/bitmap/height) { get; } | Bu Bitmap'in piksel cinsinden yüksekliğini alır. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Bunun inç başına piksel cinsinden yatay çözünürlüğünü alır.Image . |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | Bunun için kullanılan renk paletini alır veya ayarlarImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Bu görüntünün genişliğini ve yüksekliğini alır. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | Bunun için piksel biçimini alırImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | Bu dosyada depolanan özellik öğelerinin kimliklerini alırImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | Bu dosyada depolanan tüm özellik öğelerini (meta veri parçaları) alırImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | Bunun dosya biçimini alırImage . |
| [Size](../../system.drawing/image/size) { get; } | Bu görüntünün piksel cinsinden genişliğini ve yüksekliğini alır. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Görüntü hakkında ek veri sağlayan bir nesne alır veya ayarlar. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Bunun inç başına piksel cinsinden dikey çözünürlüğünü alır.Image . |
| override [Width](../../system.drawing/bitmap/width) { get; } | Bu Bitmap'in piksel cinsinden genişliğini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Bunun tam bir kopyasını oluştururImage . |
| [Clone](../../system.drawing/bitmap/clone#clone)(Rectangle, PixelFormat) | Bunun bölümünün bir kopyasını oluştururBitmap tarafından tanımlananRectangle Structure ve belirtilen birPixelFormat numaralandırma. |
| [Clone](../../system.drawing/bitmap/clone#clone_1)(RectangleF, PixelFormat) | Bunun bölümünün bir kopyasını oluştururBitmap belirli bir tanımlaPixelFormat numaralandırma. |
| virtual [Dispose](../../system.drawing/image/dispose)() | Bu Resim tarafından kullanılan tüm kaynakları serbest bırakır. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Belirtilen birimde görüntünün sınırlarını alır. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Belirtilen boyutun çerçeve sayısını döndürür. |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | Burada belirtilen pikselin rengini alırBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | Bundan belirtilen özellik öğesini alırImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Bunun için bir küçük resim döndürürImage . |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | a'yı kilitlerBitmap sistem belleğine. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent)() | Bunun için belirtilen rengi şeffaf yaparBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent_1)(Color) | Bunun için belirtilen rengi şeffaf yaparBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | ARGB32 biçimindeki bitmap piksellerini verilen diziye okur. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | Belirtilen özellik öğesini bundan kaldırırImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | Bu yöntem döndürür, çevirir veya döndürür veImage . |
| [Save](../../system.drawing/image/save)(string) | Bunu kaydederImagebelirtilen dosyaya veya akışa. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Bu görüntüyü belirtilen akışa belirtilen biçimde kaydeder. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Bunu kaydederImage belirtilen dosyaya belirtilen biçimde. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Bu görüntüyü belirtilen kodlayıcı ve görüntü kodlayıcı parametreleriyle belirtilen akışa kaydeder. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Bunu kaydederImage belirtilen kodlayıcı ve görüntü kodlayıcı parametreleriyle belirtilen dosyaya. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Görüntü.Kaydet(...) yöntemlerinden birine yapılan önceki çağrıda belirtilen dosyaya veya akışa bir çerçeve ekler. Çok çerçeveli bir görüntüden başka bir çok çerçeveli görüntüye seçilen çerçeveleri kaydetmek için bu yöntemi kullanın. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Image.Save(...) yöntemlerinden birine yapılan önceki çağrıda belirtilen dosyaya veya akışa bir çerçeve ekler. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Boyut ve dizin tarafından belirtilen çerçeveyi seçer. |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | Burada belirtilen pikselin rengini ayarlar.Bitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | Bu dosyada bir özellik öğesi (meta veri parçası) depolarImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | Bunun için çözünürlüğü ayarlarBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | Bunun kilidini açarBitmap sistem belleğinden. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | Bitmap'e piksel yazar. |

### Ayrıca bakınız

* class [Image](../image)
* ad alanı [System.Drawing](../../system.drawing)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
