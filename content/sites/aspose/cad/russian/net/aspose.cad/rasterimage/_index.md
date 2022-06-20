---
title: RasterImage
second_title: Справочник по Aspose.CAD для .NET API
description: Представляет растровое изображение поддерживающее операции с растровой графикой.
type: docs
weight: 30230
url: /ru/net/aspose.cad/rasterimage/
---
## RasterImage class

Представляет растровое изображение, поддерживающее операции с растровой графикой.

```csharp
public abstract class RasterImage : Image, IRasterImageArgb32PixelLoader
```

## Характеристики

| Имя | Описание |
| --- | --- |
| abstract [BitsPerPixel](../../aspose.cad/rasterimage/bitsperpixel) { get; } | Получает количество бит изображения на пиксель. |
| [Bounds](../../aspose.cad/image/bounds) { get; } | Получает границы изображения. |
| [Container](../../aspose.cad/image/container) { get; } | Получает[`Image`](../image)контейнер. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer) { get; } |  |
| [Disposed](../../aspose.cad/disposableobject/disposed) { get; } |  |
| virtual [HasAlpha](../../aspose.cad/rasterimage/hasalpha) { get; } | Получает значение, указывающее, имеет ли этот экземпляр альфа-канал. |
| virtual [HasTransparentColor](../../aspose.cad/rasterimage/hastransparentcolor) { get; set; } | Получает значение, указывающее, имеет ли изображение прозрачный цвет. |
| abstract [Height](../../aspose.cad/image/height) { get; } | Получает высоту изображения. |
| virtual [HorizontalResolution](../../aspose.cad/rasterimage/horizontalresolution) { get; set; } | Получает или устанавливает горизонтальное разрешение в пикселях на дюйм для этого[`RasterImage`](../rasterimage). |
| abstract [IsCached](../../aspose.cad/datastreamsupporter/iscached) { get; } |  |
| [IsRawDataAvailable](../../aspose.cad/rasterimage/israwdataavailable) { get; } | Получает значение, указывающее, доступна ли загрузка необработанных данных. |
| [Palette](../../aspose.cad/image/palette) { get; set; } | Получает или задает цветовую палитру. |
| [RawCustomColorConverter](../../aspose.cad/rasterimage/rawcustomcolorconverter) { get; set; } | Получает или устанавливает пользовательский преобразователь цвета |
| virtual [RawDataFormat](../../aspose.cad/rasterimage/rawdataformat) { get; } | Получает формат необработанных данных. |
| [RawDataSettings](../../aspose.cad/rasterimage/rawdatasettings) { get; } | Получает текущие настройки необработанных данных. Обратите внимание, что при использовании этих настроек данные загружаются без преобразования. |
| [RawFallbackIndex](../../aspose.cad/rasterimage/rawfallbackindex) { get; set; } | Получает или задает резервный индекс для использования, когда индекс палитры выходит за пределы |
| [RawIndexedColorConverter](../../aspose.cad/rasterimage/rawindexedcolorconverter) { get; set; } | Получает или устанавливает преобразователь индексированных цветов |
| virtual [RawLineSize](../../aspose.cad/rasterimage/rawlinesize) { get; } | Получает необработанный размер строки в байтах. |
| [Size](../../aspose.cad/image/size) { get; } | Получает размер изображения. |
| virtual [TransparentColor](../../aspose.cad/rasterimage/transparentcolor) { get; set; } | Получает прозрачный цвет изображения. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype) { get; } | Предполагаемый тип юнита, когда для UnitType установлено значение Unitless |
| [UnitType](../../aspose.cad/image/unittype) { get; } | Получает тип текущего юнита. |
| virtual [VerticalResolution](../../aspose.cad/rasterimage/verticalresolution) { get; set; } | Получает или устанавливает вертикальное разрешение в пикселях на дюйм для этого[`RasterImage`](../rasterimage). |
| abstract [Width](../../aspose.cad/image/width) { get; } | Получает ширину изображения. |
| virtual [XmpData](../../aspose.cad/rasterimage/xmpdata) { get; set; } | Получает или задает метаданные XMP. |

## Методы

| Имя | Описание |
| --- | --- |
| abstract [AdjustBrightness](../../aspose.cad/rasterimage/adjustbrightness)(int) | Настройка яркости изображения. |
| abstract [AdjustContrast](../../aspose.cad/rasterimage/adjustcontrast)(float) | Контраст изображения |
| abstract [AdjustGamma](../../aspose.cad/rasterimage/adjustgamma#adjustgamma)(float) | Гамма-коррекция изображения. |
| abstract [AdjustGamma](../../aspose.cad/rasterimage/adjustgamma#adjustgamma_1)(float, float, float) | Гамма-коррекция изображения. |
| abstract [BinarizeBradley](../../aspose.cad/rasterimage/binarizebradley)(double) | Бинаризация изображения с использованием алгоритма адаптивной пороговой обработки Брэдли с использованием интегральной пороговой обработки изображения |
| abstract [BinarizeFixed](../../aspose.cad/rasterimage/binarizefixed)(byte) | Бинаризация изображения с заданным порогом |
| abstract [BinarizeOtsu](../../aspose.cad/rasterimage/binarizeotsu)() | Бинаризация изображения с порогом Оцу |
| abstract [CacheData](../../aspose.cad/datastreamsupporter/cachedata)() |  |
| [CanSave](../../aspose.cad/image/cansave)(ImageOptionsBase) | Определяет, можно ли сохранить изображение в указанный формат файла, представленный переданными параметрами сохранения. |
| abstract [Crop](../../aspose.cad/rasterimage/crop#crop)(Rectangle) | Обрезка изображения. |
| virtual [Crop](../../aspose.cad/rasterimage/crop#crop_1)(int, int, int, int) | Обрезать изображение со сдвигами. |
| [Dispose](../../aspose.cad/disposableobject/dispose)() |  |
| [Dither](../../aspose.cad/rasterimage/dither#dither)(DitheringMethod, int) | Выполняет сглаживание текущего изображения. |
| abstract [Dither](../../aspose.cad/rasterimage/dither#dither_1)(DitheringMethod, int, IColorPalette) | Выполняет сглаживание текущего изображения. |
| virtual [Filter](../../aspose.cad/rasterimage/filter)(Rectangle, FilterOptionsBase) | Фильтрует указанный прямоугольник. |
| [GetArgb32Pixel](../../aspose.cad/rasterimage/getargb32pixel)(int, int) | Получает изображение 32-битного пикселя ARGB. |
| [GetDefaultArgb32Pixels](../../aspose.cad/rasterimage/getdefaultargb32pixels)(Rectangle) | Получает массив 32-битных пикселей ARGB по умолчанию. |
| [GetDefaultPixels](../../aspose.cad/rasterimage/getdefaultpixels)(Rectangle, IPartialArgb32PixelLoader) | Получает массив пикселей по умолчанию с помощью частичной загрузки пикселей. |
| [GetDefaultRawData](../../aspose.cad/rasterimage/getdefaultrawdata#getdefaultrawdata)(Rectangle, RawDataSettings) | Получает массив необработанных данных по умолчанию. |
| [GetDefaultRawData](../../aspose.cad/rasterimage/getdefaultrawdata#getdefaultrawdata_1)(Rectangle, IPartialRawDataLoader, RawDataSettings) | Получает массив исходных данных по умолчанию с использованием частичной загрузки пикселей. |
| [GetPixel](../../aspose.cad/rasterimage/getpixel)(int, int) | Получает пиксель изображения. |
| virtual [GetStrings](../../aspose.cad/image/getstrings)() | Получает все строковые значения из изображения. |
| abstract [Grayscale](../../aspose.cad/rasterimage/grayscale)() | Преобразование изображения в его представление в градациях серого |
| [LoadArgb32Pixels](../../aspose.cad/rasterimage/loadargb32pixels)(Rectangle) | Загружает 32-битные пиксели ARGB. |
| [LoadCmykPixels](../../aspose.cad/rasterimage/loadcmykpixels)(Rectangle) | Загружает пиксели в формате CMYK. |
| [LoadPartialArgb32Pixels](../../aspose.cad/rasterimage/loadpartialargb32pixels)(Rectangle, IPartialArgb32PixelLoader) | Загружает 32-битные ARGB-пиксели частично пачками. |
| [LoadPartialPixels](../../aspose.cad/rasterimage/loadpartialpixels)(Rectangle, IPartialPixelLoader) | Загружает пиксели частично пачками. |
| [LoadPixels](../../aspose.cad/rasterimage/loadpixels)(Rectangle) | Загружает пиксели. |
| [LoadRawData](../../aspose.cad/rasterimage/loadrawdata)(Rectangle, RawDataSettings, IPartialRawDataLoader) | Загружает необработанные данные. |
| [ReadScanLine](../../aspose.cad/rasterimage/readscanline)(int) | Читает всю строку развертки по указанному индексу строки развертки. |
| [ReadScanLineArgb](../../aspose.cad/rasterimage/readscanlineargb)(int) | Читает всю строку развертки по указанному индексу строки развертки. |
| abstract [Resize](../../aspose.cad/rasterimage/resize#resize)(int, int, ImageResizeSettings) | Изменение размера изображения. |
| abstract [Resize](../../aspose.cad/rasterimage/resize#resize_1)(int, int, ResizeType) | Изменение размера изображения. |
| abstract [Rotate](../../aspose.cad/rasterimage/rotate)(float, bool, Color) | Повернуть изображение вокруг центра. |
| [Save](../../aspose.cad/image/save)() | Сохраняет данные изображения в основной поток. |
| [Save](../../aspose.cad/datastreamsupporter/save)(Stream) |  |
| virtual [Save](../../aspose.cad/datastreamsupporter/save)(string) |  |
| [Save](../../aspose.cad/image/save)(Stream, ImageOptionsBase) | Сохраняет данные изображения в указанный поток в указанном формате файла в соответствии с параметрами сохранения. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save)(string, bool) |  |
| virtual [Save](../../aspose.cad/image/save)(string, ImageOptionsBase) | Сохраняет данные объекта в указанном месте файла в указанном формате файла в соответствии с параметрами сохранения. |
| [SaveArgb32Pixels](../../aspose.cad/rasterimage/saveargb32pixels)(Rectangle, int[]) | Сохраняет 32-битные пиксели ARGB. |
| [SaveCmykPixels](../../aspose.cad/rasterimage/savecmykpixels)(Rectangle, CmykColor[]) | Сохраняет пиксели. |
| [SavePixels](../../aspose.cad/rasterimage/savepixels)(Rectangle, Color[]) | Сохраняет пиксели. |
| [SaveRawData](../../aspose.cad/rasterimage/saverawdata)(byte[], int, Rectangle, RawDataSettings) | Сохраняет необработанные данные. |
| [SetArgb32Pixel](../../aspose.cad/rasterimage/setargb32pixel)(int, int, int) | Устанавливает 32-битный пиксель изображения ARGB для указанной позиции. |
| virtual [SetPalette](../../aspose.cad/rasterimage/setpalette)(IColorPalette, bool) | Устанавливает палитру изображения. |
| [SetPixel](../../aspose.cad/rasterimage/setpixel)(int, int, Color) | Устанавливает пиксель изображения для указанной позиции. |
| virtual [SetResolution](../../aspose.cad/rasterimage/setresolution)(double, double) | Устанавливает разрешение для этого[`RasterImage`](../rasterimage). |
| [WriteScanLine](../../aspose.cad/rasterimage/writescanline#writescanline)(int, Color[]) | Записывает всю строку сканирования в указанный индекс строки сканирования. |
| [WriteScanLine](../../aspose.cad/rasterimage/writescanline#writescanline_1)(int, int[]) | Записывает всю строку сканирования в указанный индекс строки сканирования. |

### Смотрите также

* class [Image](../image)
* interface [IRasterImageArgb32PixelLoader](../irasterimageargb32pixelloader)
* пространство имен [Aspose.CAD](../../aspose.cad)
* сборка [Aspose.CAD](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
