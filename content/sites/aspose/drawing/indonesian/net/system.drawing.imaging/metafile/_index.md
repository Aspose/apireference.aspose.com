---
title: Class Metafile
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Imaging.Metafile kelas. Mendefinisikan grafik metafile. Sebuah metafile berisi catatan yang menggambarkan urutan operasi grafik yang dapat direkam dibangun dan diputar ulang ditampilkan. Kelas ini tidak dapat diwariskan.
type: docs
weight: 800
url: /id/net/system.drawing.imaging/metafile/
---
## Metafile class

Mendefinisikan grafik metafile. Sebuah metafile berisi catatan yang menggambarkan urutan operasi grafik yang dapat direkam (dibangun) dan diputar ulang (ditampilkan). Kelas ini tidak dapat diwariskan.

```csharp
public sealed class Metafile : Image
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Metafile](metafile/#constructor_2)(Stream) | Menginisialisasi instance baru dari`Metafile` kelas dari aliran data yang ditentukan. |
| [Metafile](metafile/#constructor_6)(string) | Menginisialisasi instance baru dari`Metafile` kelas dari nama file yang ditentukan. |
| [Metafile](metafile/#constructor)(IntPtr, bool) | Menginisialisasi instance baru dari`Metafile` kelas dari pegangan yang ditentukan. |
| [Metafile](metafile/#constructor_1)(IntPtr, EmfType) | Menginisialisasi instance baru dari`Metafile` kelas dari pegangan yang ditentukan ke konteks perangkat danEmfTypepencacahan yang menentukan format dariMetafile . |
| [Metafile](metafile/#constructor_3)(Stream, IntPtr) | Menginisialisasi instance baru dari`Metafile` kelas dari aliran data yang ditentukan dan pegangan Windows ke konteks perangkat. /&gt;. |
| [Metafile](metafile/#constructor_7)(string, IntPtr) | Menginisialisasi instance baru dari`Metafile` kelas dari nama file yang ditentukan. |
| [Metafile](metafile/#constructor_4)(Stream, IntPtr, EmfType) | Menginisialisasi instance baru dari`Metafile` kelas dari aliran data yang ditentukan , pegangan Windows ke konteks perangkat, danEmfType enumeration yang menentukan format fileMetafile . |
| [Metafile](metafile/#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Menginisialisasi instance baru dari`Metafile` kelas dari aliran data yang ditentukan , pegangan Windows ke konteks perangkat, danEmfType enumeration yang menentukan format fileMetafile . |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Mendapat bilangan bulat yang mewakili kombinasi bitwise dari[`ImageFlags`](../imageflags/) untuk Gambar ini. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist/) { get; } | Mendapat larik GUID yang mewakili dimensi bingkai di dalamnyaImage . |
| override [Height](../../system.drawing.imaging/metafile/height/) { get; } | Mendapat tinggi, dalam piksel, dari iniMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Mendapat resolusi horizontal, dalam piksel per inci, dari iniImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette/) { get; set; } | Mendapatkan atau menyetel palet warna yang digunakan untuk iniImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Mendapatkan lebar dan tinggi gambar ini. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat/) { get; } | Mendapatkan format piksel untuk iniImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist/) { get; } | Mendapat ID dari item properti yang disimpan di siniImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems/) { get; } | Mendapat semua item properti (bagian dari metadata) yang disimpan di siniImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat/) { get; } | Mendapat format file iniImage . |
| [Size](../../system.drawing/image/size/) { get; } | Mendapatkan lebar dan tinggi, dalam piksel, dari gambar ini. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Mendapat atau menyetel objek yang menyediakan data tambahan tentang gambar. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Mendapatkan resolusi vertikal, dalam piksel per inci, dari iniImage . |
| override [Width](../../system.drawing.imaging/metafile/width/) { get; } | Mendapat lebar, dalam piksel, dari iniMetafile . |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | Membuat salinan persis dari iniImage . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Merilis semua sumber daya yang digunakan oleh Gambar ini. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Mendapatkan batas gambar dalam unit yang ditentukan. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Mengembalikan jumlah bingkai dari dimensi yang ditentukan. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile/)() | Mengembalikan pegangan Windows ke yang disempurnakanMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/)() | MengembalikanMetafileHeader terkait dengan iniMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem/)(int) | Mendapat item properti yang ditentukan dari siniImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Mengembalikan thumbnail untuk iniImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord/)(EmfPlusRecordType, int, int, byte[]) | Memutar rekaman metafile individual. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem/)(int) | Menghapus item properti yang ditentukan dari iniImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip/)(RotateFlipType) | Metode ini memutar, membalik, atau memutar dan membalikImage . |
| [Save](../../system.drawing/image/save/)(string) | Simpan iniImageke file atau streaming yang ditentukan. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | Menyimpan gambar ini ke aliran yang ditentukan dalam format yang ditentukan. |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | Simpan iniImage ke file yang ditentukan dalam format yang ditentukan. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | Menyimpan gambar ini ke aliran yang ditentukan, dengan parameter encoder dan encoder gambar yang ditentukan. |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | Simpan iniImage ke file yang ditentukan, dengan parameter encoder dan image-encoder yang ditentukan. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Menambahkan bingkai ke file atau aliran yang ditentukan dalam panggilan sebelumnya ke salah satu metode Image.Save(...) . Gunakan metode ini untuk menyimpan bingkai yang dipilih dari gambar multi-bingkai ke gambar multi-bingkai lainnya. |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Menambahkan bingkai ke file atau aliran yang ditentukan dalam panggilan sebelumnya ke salah satu metode Image.Save(...) . |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Memilih bingkai yang ditentukan oleh dimensi dan indeks. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem/)(PropertyItem) | Menyimpan item properti (bagian dari metadata) di siniImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader)(Stream) | MengembalikanMetafileHeader terkait dengan yang ditentukanMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader_1)(string) | MengembalikanMetafileHeader terkait dengan yang ditentukanMetafile . |

### Lihat juga

* class [Image](../../system.drawing/image/)
* ruang nama [System.Drawing.Imaging](../../system.drawing.imaging/)
* perakitan [Aspose.Drawing](../../)


