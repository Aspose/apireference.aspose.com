---
title: Metafile
second_title: Справочник по API Aspose.Drawing для .NET
description: Определяет графический метафайл. Метафайл содержит записи описывающие последовательность графических операций  которые можно записывать создавать и воспроизводить отображать. Этот класс не наследуется.
type: docs
weight: 800
url: /ru/net/system.drawing.imaging/metafile/
---
## Metafile class

Определяет графический метафайл. Метафайл содержит записи, описывающие последовательность графических операций , которые можно записывать (создавать) и воспроизводить (отображать). Этот класс не наследуется.

```csharp
public sealed class Metafile : Image
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Metafile](metafile#constructor_2)(Stream) | Инициализирует новый экземпляр[`Metafile`](../metafile) класс из указанного потока данных. |
| [Metafile](metafile#constructor_6)(string) | Инициализирует новый экземпляр[`Metafile`](../metafile) класс из указанного имени файла. |
| [Metafile](metafile#constructor)(IntPtr, bool) | Инициализирует новый экземпляр[`Metafile`](../metafile) класс из указанного дескриптора. |
| [Metafile](metafile#constructor_1)(IntPtr, EmfType) | Инициализирует новый экземпляр[`Metafile`](../metafile) класс из указанного дескриптора в контекст устройства иEmfTypeперечисление, определяющее форматMetafile . |
| [Metafile](metafile#constructor_3)(Stream, IntPtr) | Инициализирует новый экземпляр[`Metafile`](../metafile) class из потока данных selected и дескриптор Windows в контекст устройства. /&gt;. |
| [Metafile](metafile#constructor_7)(string, IntPtr) | Инициализирует новый экземпляр[`Metafile`](../metafile) класс из указанного имени файла. |
| [Metafile](metafile#constructor_4)(Stream, IntPtr, EmfType) | Инициализирует новый экземпляр[`Metafile`](../metafile) класс из потока данных selected , дескриптор Windows для контекста устройства иEmfType enumeration , указывающий форматMetafile . |
| [Metafile](metafile#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Инициализирует новый экземпляр[`Metafile`](../metafile) класс из потока данных selected , дескриптор Windows для контекста устройства иEmfType enumeration , указывающий форматMetafile . |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Получает целое число, представляющее побитовую комбинацию[`ImageFlags`](../imageflags) для этого изображения. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist) { get; } | Получает массив идентификаторов GUID, представляющих размеры кадров в этомImage . |
| override [Height](../../system.drawing.imaging/metafile/height) { get; } | Получает высоту в пикселях этогоMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Получает горизонтальное разрешение в пикселях на дюйм этогоImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette) { get; set; } | Получает или задает цветовую палитру, используемую для этогоImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Получает ширину и высоту этого изображения. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat) { get; } | Получает формат пикселей для этогоImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist) { get; } | Получает идентификаторы элементов свойств, хранящихся в этомImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems) { get; } | Получает все элементы свойств (фрагменты метаданных), хранящиеся в этомImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat) { get; } | Получает формат файла этогоImage . |
| [Size](../../system.drawing/image/size) { get; } | Получает ширину и высоту этого изображения в пикселях. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Получает или задает объект, предоставляющий дополнительные данные об изображении. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Получает разрешение по вертикали в пикселях на дюйм этогоImage . |
| override [Width](../../system.drawing.imaging/metafile/width) { get; } | Получает ширину в пикселях этогоMetafile . |

## Методы

| Имя | Описание |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Создает точную копию этогоImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Освобождает все ресурсы, используемые этим образом. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Получает границы изображения в указанных единицах измерения. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Возвращает количество кадров указанного измерения. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile)() | Возвращает дескриптор Windows расширенномуMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader)() | ВозвращаетMetafileHeader связанные с этимMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem)(int) | Получает указанный элемент свойства из этогоImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Возвращает миниатюру для этогоImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord)(EmfPlusRecordType, int, int, byte[]) | Воспроизведение отдельной записи метафайла. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem)(int) | Удаляет указанный элемент свойства из этогоImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip)(RotateFlipType) | Этот метод вращает, переворачивает или вращает и переворачиваетImage . |
| [Save](../../system.drawing/image/save)(string) | Сохраняет этоImageв указанный файл или поток. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Сохраняет это изображение в указанный поток в указанном формате. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Сохраняет этоImage в указанный файл в указанном формате. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Сохраняет это изображение в указанный поток с указанными параметрами кодировщика и кодировщика изображения. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Сохраняет этоImage в указанный файл с указанными параметрами кодировщика и кодировщика изображений. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Добавляет кадр в файл или поток, указанные в предыдущем вызове одного из методов Image.Save(...). Используйте этот метод для сохранения выбранных кадров из многокадрового изображения в другое многокадровое изображение. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Добавляет кадр в файл или поток, указанный в предыдущем вызове одного из методов Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Выбирает кадр, заданный размером и индексом. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem)(PropertyItem) | Сохраняет элемент свойства (часть метаданных) в этомImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader)(Stream) | ВозвращаетMetafileHeader связанный с указаннымMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader_1)(string) | ВозвращаетMetafileHeader связанный с указаннымMetafile . |

### Смотрите также

* class [Image](../../system.drawing/image)
* пространство имен [System.Drawing.Imaging](../../system.drawing.imaging)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
