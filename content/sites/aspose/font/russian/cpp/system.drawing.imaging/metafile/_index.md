---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Font для C++"
description: "System::Drawing::Imaging::Metafile class. Представляет графический метафайл. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1200
url: /ru/cpp/system.drawing.imaging/metafile/
---
## Metafile class


Представляет графический метафайл. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Metafile : public System::Drawing::Image
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() override | Возвращает копию текущего объекта. |
| [get_Height](./get_height/)() const override | Возвращает высоту изображения в пикселях. |
| [get_PixelFormat](./get_pixelformat/)() const override | Возвращает значение, указывающее формат пикселей. |
| [get_RawFormat](./get_rawformat/)() const override | Возвращает значение, указывающее формат изображения. |
| [get_Width](./get_width/)() const override | Возвращает ширину изображения в пикселях. |
| [GetHenhmetafile](./gethenhmetafile/)() | НЕ РЕАЛИЗОВАНО. |
| [GetMetafileHeader](./getmetafileheader/)() | Возвращает заголовок, связанный с текущим объектом. |
| [Metafile](./metafile/)(const System::String\&) | НЕ РЕАЛИЗОВАНО. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | НЕ РЕАЛИЗОВАНО. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | НЕ РЕАЛИЗОВАНО. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | НЕ РЕАЛИЗОВАНО. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | НЕ РЕАЛИЗОВАНО. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | НЕ РЕАЛИЗОВАНО. |
| [Metafile](./metafile/)(IntPtr, EmfType) | НЕ РЕАЛИЗОВАНО. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | НЕ РЕАЛИЗОВАНО. |
| virtual [~Metafile](./~metafile/)() | Деструктор. |
## См. также

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
