---
title: Metafile
second_title: Aspose.Drawing for .NET API Referansı
description: Bir grafik meta dosyası tanımlar. Bir meta dosyası kaydedilebilen oluşturulabilen ve oynatılabilen görüntülenebilen bir dizi grafik işlemi tanımlayan kayıtları içerir. Bu sınıf devralınamaz.
type: docs
weight: 800
url: /tr/net/system.drawing.imaging/metafile/
---
## Metafile class

Bir grafik meta dosyası tanımlar. Bir meta dosyası, kaydedilebilen (oluşturulabilen) ve oynatılabilen (görüntülenebilen) bir dizi grafik işlemi tanımlayan kayıtları içerir. Bu sınıf devralınamaz.

```csharp
public sealed class Metafile : Image
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Metafile](metafile#constructor_2)(Stream) | Yeni bir örneğini başlatır[`Metafile`](../metafile) belirtilen veri akışından sınıf. |
| [Metafile](metafile#constructor_6)(string) | Yeni bir örneğini başlatır[`Metafile`](../metafile) belirtilen dosya adından sınıf. |
| [Metafile](metafile#constructor)(IntPtr, bool) | Yeni bir örneğini başlatır[`Metafile`](../metafile) belirtilen tanıtıcıdan sınıf. |
| [Metafile](metafile#constructor_1)(IntPtr, EmfType) | Yeni bir örneğini başlatır[`Metafile`](../metafile) belirtilen tanıtıcıdan bir aygıt bağlamına ve birEmfTypebiçimini belirten numaralandırmaMetafile . |
| [Metafile](metafile#constructor_3)(Stream, IntPtr) | Yeni bir örneğini başlatır[`Metafile`](../metafile) Belirtilen veri akışından bir sınıf ve bir Windows tanıtıcısından bir aygıt bağlamına. /&gt;. |
| [Metafile](metafile#constructor_7)(string, IntPtr) | Yeni bir örneğini başlatır[`Metafile`](../metafile) belirtilen dosya adından sınıf. |
| [Metafile](metafile#constructor_4)(Stream, IntPtr, EmfType) | Yeni bir örneğini başlatır[`Metafile`](../metafile) Belirtilen veri akışından bir sınıf, bir aygıt bağlamına bir Windows tanıtıcısı ve birEmfType biçimini belirten numaralandırma Metafile . |
| [Metafile](metafile#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Yeni bir örneğini başlatır[`Metafile`](../metafile) Belirtilen veri akışından bir sınıf, bir aygıt bağlamına bir Windows tanıtıcısı ve birEmfType biçimini belirten numaralandırma Metafile . |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Aşağıdakilerin bit düzeyinde bir kombinasyonunu temsil eden tamsayıyı alır:[`ImageFlags`](../imageflags) bu Resim için. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist) { get; } | Bu çerçeve içindeki çerçevelerin boyutlarını temsil eden bir dizi GUID alır.Image . |
| override [Height](../../system.drawing.imaging/metafile/height) { get; } | Bunun piksel cinsinden yüksekliğini alırMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Bunun inç başına piksel cinsinden yatay çözünürlüğünü alır.Image . |
| override [Palette](../../system.drawing.imaging/metafile/palette) { get; set; } | Bunun için kullanılan renk paletini alır veya ayarlarImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Bu görüntünün genişliğini ve yüksekliğini alır. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat) { get; } | Bunun için piksel biçimini alırImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist) { get; } | Bu dosyada depolanan özellik öğelerinin kimliklerini alırImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems) { get; } | Bu dosyada depolanan tüm özellik öğelerini (meta veri parçaları) alırImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat) { get; } | Bunun dosya biçimini alırImage . |
| [Size](../../system.drawing/image/size) { get; } | Bu görüntünün piksel cinsinden genişliğini ve yüksekliğini alır. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Görüntü hakkında ek veri sağlayan bir nesne alır veya ayarlar. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Bunun inç başına piksel cinsinden dikey çözünürlüğünü alır.Image . |
| override [Width](../../system.drawing.imaging/metafile/width) { get; } | Bunun piksel cinsinden genişliğini alırMetafile . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Bunun tam bir kopyasını oluştururImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Bu Resim tarafından kullanılan tüm kaynakları serbest bırakır. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Belirtilen birimde görüntünün sınırlarını alır. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Belirtilen boyutun çerçeve sayısını döndürür. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile)() | Bir Windows tanıtıcısını gelişmiş birMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader)() | MetafileHeader bununla ilişkiliMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem)(int) | Bundan belirtilen özellik öğesini alırImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Bunun için bir küçük resim döndürürImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord)(EmfPlusRecordType, int, int, byte[]) | Tek bir meta dosyası kaydını oynatır. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem)(int) | Belirtilen özellik öğesini bundan kaldırırImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip)(RotateFlipType) | Bu yöntem döndürür, çevirir veya döndürür veImage . |
| [Save](../../system.drawing/image/save)(string) | Bunu kaydederImagebelirtilen dosyaya veya akışa. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Bu görüntüyü belirtilen akışa belirtilen biçimde kaydeder. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Bunu kaydederImage belirtilen dosyaya belirtilen biçimde. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Bu görüntüyü belirtilen kodlayıcı ve görüntü kodlayıcı parametreleriyle belirtilen akışa kaydeder. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Bunu kaydederImage belirtilen kodlayıcı ve görüntü kodlayıcı parametreleriyle belirtilen dosyaya. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Görüntü.Kaydet(...) yöntemlerinden birine yapılan önceki çağrıda belirtilen dosyaya veya akışa bir çerçeve ekler. Çok çerçeveli bir görüntüden başka bir çok çerçeveli görüntüye seçilen çerçeveleri kaydetmek için bu yöntemi kullanın. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Image.Save(...) yöntemlerinden birine yapılan önceki çağrıda belirtilen dosyaya veya akışa bir çerçeve ekler. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Boyut ve dizin tarafından belirtilen çerçeveyi seçer. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem)(PropertyItem) | Bu dosyada bir özellik öğesi (meta veri parçası) depolarImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader)(Stream) | MetafileHeader belirtilen ile ilişkiliMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader_1)(string) | MetafileHeader belirtilen ile ilişkiliMetafile . |

### Ayrıca bakınız

* class [Image](../../system.drawing/image)
* ad alanı [System.Drawing.Imaging](../../system.drawing.imaging)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
