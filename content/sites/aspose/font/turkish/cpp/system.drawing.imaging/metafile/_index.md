---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::Metafile sınıfı. Grafik bir metafile'i temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr göstericisine sarın ve bu göstericiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1200
url: /tr/cpp/system.drawing.imaging/metafile/
---
## Metafile class


Grafik bir metafile'i temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Metafile : public System::Drawing::Image
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Geçerli nesnenin bir kopyasını döndürür. |
| [get_Height](./get_height/)() const override | Görüntünün yüksekliğini piksel cinsinden döndürür. |
| [get_PixelFormat](./get_pixelformat/)() const override | Piksel biçimini gösteren bir değeri döndürür. |
| [get_RawFormat](./get_rawformat/)() const override | Görüntü biçimini gösteren bir değeri döndürür. |
| [get_Width](./get_width/)() const override | Görüntünün genişliğini piksel olarak döndürür. |
| [GetHenhmetafile](./gethenhmetafile/)() | UYGULANMADI. |
| [GetMetafileHeader](./getmetafileheader/)() | Geçerli nesneyle ilişkili bir başlığı döndürür. |
| [Metafile](./metafile/)(const System::String\&) | UYGULANMADI. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | UYGULANMADI. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | UYGULANMADI. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | UYGULANMADI. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | UYGULANMADI. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | UYGULANMADI. |
| [Metafile](./metafile/)(IntPtr, EmfType) | UYGULANMADI. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | UYGULANMADI. |
| virtual [~Metafile](./~metafile/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
