---
title: Bitmap
second_title: Справочник по API Aspose.Drawing для .NET
description: Инкапсулирует растровое изображение состоящее из данных пикселей для графического изображения и его атрибутов. ABitmap./bitmap объект используемый для работы с изображениями определенными пиксельными данными.
type: docs
weight: 40
url: /ru/net/system.drawing/bitmap/
---
## Bitmap class

Инкапсулирует растровое изображение, состоящее из данных пикселей для графического изображения и его атрибутов. A[`Bitmap`](../bitmap) объект, используемый для работы с изображениями, определенными пиксельными данными.

```csharp
public class Bitmap : Image
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Bitmap](bitmap#constructor_3)(Image) | Инициализирует новый экземпляр[`Bitmap`](../bitmap) класс из указанного существующего образа. |
| [Bitmap](bitmap#constructor_6)(Stream) | Инициализирует новый экземпляр[`Bitmap`](../bitmap) класс из указанного потока данных. |
| [Bitmap](bitmap#constructor_8)(string) | Инициализирует новый экземпляр[`Bitmap`](../bitmap) класс из указанного файла. |
| [Bitmap](bitmap#constructor_5)(Image, Size) | Инициализирует новый экземпляр[`Bitmap`](../bitmap)класс из указанного существующего изображения, масштабированного до указанного размера. |
| [Bitmap](bitmap#constructor)(int, int) | Инициализирует новый экземпляр[`Bitmap`](../bitmap) класс с указанным размером. |
| [Bitmap](bitmap#constructor_7)(Stream, bool) | Инициализирует новый экземпляр[`Bitmap`](../bitmap) класс из указанного потока данных. |
| [Bitmap](bitmap#constructor_9)(string, bool) | Инициализирует новый экземпляр[`Bitmap`](../bitmap) класс из указанного файла. |
| [Bitmap](bitmap#constructor_4)(Image, int, int) | Инициализирует новый экземпляр[`Bitmap`](../bitmap) класс из указанного существующего изображения, масштабируется до указанного размера. |
| [Bitmap](bitmap#constructor_2)(int, int, PixelFormat) | Инициализирует новый экземпляр[`Bitmap`](../bitmap) класс с указанным размером и форматом. |
| [Bitmap](bitmap#constructor_1)(int, int, int, PixelFormat, int[]) | Инициализирует новый экземпляр[`Bitmap`](../bitmap) класс с указанным размером и данными в пикселях. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Получает целое число, представляющее побитовую комбинацию[`ImageFlags`](../../system.drawing.imaging/imageflags) для этого изображения. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | Получает массив идентификаторов GUID, представляющих размеры кадров в этомImage . |
| override [Height](../../system.drawing/bitmap/height) { get; } | Получает высоту в пикселях этого растрового изображения. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Получает горизонтальное разрешение в пикселях на дюйм этогоImage . |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | Получает или задает цветовую палитру, используемую для этогоImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Получает ширину и высоту этого изображения. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | Получает формат пикселей для этогоImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | Получает идентификаторы элементов свойств, хранящихся в этомImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | Получает все элементы свойств (фрагменты метаданных), хранящиеся в этомImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | Получает формат файла этогоImage . |
| [Size](../../system.drawing/image/size) { get; } | Получает ширину и высоту этого изображения в пикселях. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Получает или задает объект, предоставляющий дополнительные данные об изображении. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Получает разрешение по вертикали в пикселях на дюйм этогоImage . |
| override [Width](../../system.drawing/bitmap/width) { get; } | Получает ширину в пикселях этого растрового изображения. |

## Методы

| Имя | Описание |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Создает точную копию этогоImage . |
| [Clone](../../system.drawing/bitmap/clone#clone)(Rectangle, PixelFormat) | Создает копию раздела этогоBitmap определяетсяRectangle Structure и с указаннымPixelFormat перечисление. |
| [Clone](../../system.drawing/bitmap/clone#clone_1)(RectangleF, PixelFormat) | Создает копию раздела этогоBitmap определяется с указаннымPixelFormat перечисление. |
| virtual [Dispose](../../system.drawing/image/dispose)() | Освобождает все ресурсы, используемые этим образом. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Получает границы изображения в указанных единицах измерения. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Возвращает количество кадров указанного измерения. |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | Получает цвет указанного пикселя в этомBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | Получает указанный элемент свойства из этогоImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Возвращает миниатюру для этогоImage . |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | БлокируетBitmap в системную память. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent)() | Делает указанный цвет прозрачным для этогоBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent_1)(Color) | Делает указанный цвет прозрачным для этогоBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | Считывает пиксели растрового изображения в формате ARGB32 в заданный массив. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | Удаляет указанный элемент свойства из этогоImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | Этот метод вращает, переворачивает или вращает и переворачиваетImage . |
| [Save](../../system.drawing/image/save)(string) | Сохраняет этоImageв указанный файл или поток. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Сохраняет это изображение в указанный поток в указанном формате. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Сохраняет этоImage в указанный файл в указанном формате. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Сохраняет это изображение в указанный поток с указанными параметрами кодировщика и кодировщика изображения. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Сохраняет этоImage в указанный файл с указанными параметрами кодировщика и кодировщика изображений. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Добавляет кадр в файл или поток, указанные в предыдущем вызове одного из методов Image.Save(...). Используйте этот метод для сохранения выбранных кадров из многокадрового изображения в другое многокадровое изображение. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Добавляет кадр в файл или поток, указанный в предыдущем вызове одного из методов Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Выбирает кадр, заданный размером и индексом. |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | Устанавливает цвет указанного пикселя в этомBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | Сохраняет элемент свойства (часть метаданных) в этомImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | Устанавливает разрешение для этогоBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | Разблокирует этоBitmap из системной памяти. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | Записывает пиксели в растровое изображение. |

### Смотрите также

* class [Image](../image)
* пространство имен [System.Drawing](../../system.drawing)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
