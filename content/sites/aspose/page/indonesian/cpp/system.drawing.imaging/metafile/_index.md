---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Imaging::Metafile class. Mewakili sebuah metafile grafis. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.drawing.imaging/metafile/
---
## Metafile class


Mewakili sebuah metafile grafis. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class Metafile : public System::Drawing::Image
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Mengembalikan salinan objek saat ini. |
| [get_Height](./get_height/)() const override | Mengembalikan tinggi gambar dalam piksel. |
| [get_PixelFormat](./get_pixelformat/)() const override | Mengembalikan nilai yang menunjukkan format piksel. |
| [get_RawFormat](./get_rawformat/)() const override | Mengembalikan nilai yang menunjukkan format gambar. |
| [get_Width](./get_width/)() const override | Mengembalikan lebar gambar dalam piksel. |
| [GetHenhmetafile](./gethenhmetafile/)() | BELUM DIIMPLEMENTASIKAN. |
| [GetMetafileHeader](./getmetafileheader/)() | Mengembalikan header yang terkait dengan objek saat ini. |
| [Metafile](./metafile/)(const System::String\&) | BELUM DIIMPLEMENTASIKAN. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | BELUM DIIMPLEMENTASIKAN. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | BELUM DIIMPLEMENTASIKAN. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | BELUM DIIMPLEMENTASIKAN. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | BELUM DIIMPLEMENTASIKAN. |
| [Metafile](./metafile/)(IntPtr, EmfType) | BELUM DIIMPLEMENTASIKAN. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | BELUM DIIMPLEMENTASIKAN. |
| virtual [~Metafile](./~metafile/)() | Destruktor. |
## Lihat Juga

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
