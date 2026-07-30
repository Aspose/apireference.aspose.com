---
title: "Класс System::Drawing::Imaging::ImageFormat"
linktitle: "ImageFormat"
second_title: "Aspose.Font для C++"
description: "Класс System::Drawing::Imaging::ImageFormat. Представляет файловый формат изображения. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1100
url: /ru/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Представляет файловый формат изображения. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class ImageFormat : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Определяет, равны ли форматы изображений, представленные текущим и указанным объектами. |
| static [get_Bmp](./get_bmp/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат растрового изображения. |
| static [get_Emf](./get_emf/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат улучшенного метафайла. |
| static [get_Exif](./get_exif/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат Exchangeable [Image](../../system.drawing/image/) File (Exif). |
| static [get_Gif](./get_gif/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат изображения [Graphics](../../system.drawing/graphics/) Interchange Format (GIF). |
| [get_Guid](./get_guid/)() const | Возвращает GUID, связанный с форматом изображения, представленного текущим объектом. |
| static [get_Icon](./get_icon/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат значка [Windows](../../system.windows/). |
| static [get_Jpeg](./get_jpeg/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат изображения Joint Photographic Experts Group (JPEG). |
| static [get_MemoryBmp](./get_memorybmp/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат растрового изображения в памяти. |
| static [get_Png](./get_png/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат изображения W3C Portable Network [Graphics](../../system.drawing/graphics/) (PNG). |
| static [get_Tiff](./get_tiff/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат Tagged [Image](../../system.drawing/image/) File Format (TIFF). |
| static [get_Wmf](./get_wmf/)() | Возвращает разделяемый указатель на объект [ImageFormat](./), представляющий формат метафайла [Windows](../../system.windows/) (WMF). |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Создаёт экземпляр класса [ImageFormat](./), представляющего формат изображения, связанный с указанным GUID. |
| virtual [ToString](./tostring/)() const | Преобразует этот объект [ImageFormat](./) в читаемую человеком строку. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
