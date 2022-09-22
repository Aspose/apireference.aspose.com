---
title: Image
second_title: Справочник по API Aspose.Drawing для .NET
description: Абстрактный базовый класс предоставляющий функциональные возможности для классовпотомков Bitmap и Metafile.
type: docs
weight: 580
url: /ru/net/system.drawing/image/
---
## Image class

Абстрактный базовый класс, предоставляющий функциональные возможности для классов-потомков Bitmap и Metafile.

```csharp
public abstract class Image : IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Image](image)() | Инициализирует новый экземпляр[`Image`](../image) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Получает целое число, представляющее побитовую комбинацию[`ImageFlags`](../../system.drawing.imaging/imageflags) для этого изображения. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist) { get; } | Получает массив идентификаторов GUID, представляющих размеры кадров в этомImage . |
| abstract [Height](../../system.drawing/image/height) { get; } | Получает высоту в пикселях этогоImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Получает горизонтальное разрешение в пикселях на дюйм этогоImage . |
| abstract [Palette](../../system.drawing/image/palette) { get; set; } | Получает или задает цветовую палитру, используемую для этогоImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Получает ширину и высоту этого изображения. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat) { get; } | Получает формат пикселей для этогоImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist) { get; } | Получает идентификаторы элементов свойств, хранящихся в этомImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems) { get; } | Получает все элементы свойств (фрагменты метаданных), хранящиеся в этомImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat) { get; } | Получает формат файла этогоImage . |
| [Size](../../system.drawing/image/size) { get; } | Получает ширину и высоту этого изображения в пикселях. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Получает или задает объект, предоставляющий дополнительные данные об изображении. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Получает разрешение по вертикали в пикселях на дюйм этогоImage . |
| abstract [Width](../../system.drawing/image/width) { get; } | Получает ширину в пикселях этогоImage . |

## Методы

| Имя | Описание |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile)(string) | СоздаетImage из указанного файла. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream)(Stream) | СоздаетImageиз указанного потока данных. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream_1)(Stream, bool) | СоздаетImage из указанного потока данных, при необходимости используя информацию об управлении цветом embedded в этом потоке. |
| [Clone](../../system.drawing/image/clone)() | Создает точную копию этогоImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Освобождает все ресурсы, используемые этим образом. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Получает границы изображения в указанных единицах измерения. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Возвращает количество кадров указанного измерения. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem)(int) | Получает указанный элемент свойства из этогоImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Возвращает миниатюру для этогоImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem)(int) | Удаляет указанный элемент свойства из этогоImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip)(RotateFlipType) | Этот метод вращает, переворачивает или вращает и переворачиваетImage . |
| [Save](../../system.drawing/image/save#save_2)(string) | Сохраняет этоImageв указанный файл или поток. |
| [Save](../../system.drawing/image/save#save_1)(Stream, ImageFormat) | Сохраняет это изображение в указанный поток в указанном формате. |
| [Save](../../system.drawing/image/save#save_4)(string, ImageFormat) | Сохраняет этоImage в указанный файл в указанном формате. |
| [Save](../../system.drawing/image/save#save)(Stream, ImageCodecInfo, EncoderParameters) | Сохраняет это изображение в указанный поток с указанными параметрами кодировщика и кодировщика изображения. |
| [Save](../../system.drawing/image/save#save_3)(string, ImageCodecInfo, EncoderParameters) | Сохраняет этоImage в указанный файл с указанными параметрами кодировщика и кодировщика изображений. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd_1)(EncoderParameters) | Добавляет кадр в файл или поток, указанные в предыдущем вызове одного из методов Image.Save(...). Используйте этот метод для сохранения выбранных кадров из многокадрового изображения в другое многокадровое изображение. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd)(Image, EncoderParameters) | Добавляет кадр в файл или поток, указанный в предыдущем вызове одного из методов Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Выбирает кадр, заданный размером и индексом. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem)(PropertyItem) | Сохраняет элемент свойства (часть метаданных) в этомImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap)(IntPtr) | СоздаетBitmap от дескриптора к растровому изображению GDI. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize)(PixelFormat) | Возвращает глубину цвета в битах на пиксель указанного формата пикселей. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat)(PixelFormat) | Возвращает значение, указывающее, является ли формат пикселей для этогоImage содержит альфа-информацию. |

## Другие члены

| Имя | Описание |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort) | Предоставляет метод обратного вызова для определения, когда[`GetThumbnailImage`](./getthumbnailimage) метод должен преждевременно отменить выполнение. |

### Смотрите также

* пространство имен [System.Drawing](../../system.drawing)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
