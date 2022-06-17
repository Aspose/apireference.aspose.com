---
title: PixelDataFormat
second_title: Справочник по Aspose.CAD для .NET API
description: Формат данных пикселей.
type: docs
weight: 30180
url: /ru/net/aspose.cad/pixeldataformat/
---
## PixelDataFormat class

Формат данных пикселей.

```csharp
public class PixelDataFormat
```

## Характеристики

| Имя | Описание |
| --- | --- |
| static [Cmyk](../../aspose.cad/pixeldataformat/cmyk) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определено для 32 бит на пиксель с 8 битами для каждого из голубого, пурпурного, желтого и черный. |
| static [Grayscale](../../aspose.cad/pixeldataformat/grayscale) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определенный для 8 бит на пиксель с 8 битами, представляющими интенсивность оттенков серого в интервале 0-255 . |
| static [GrayscaleAlpha](../../aspose.cad/pixeldataformat/grayscalealpha) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определенный для 16 бит на пиксель с 8 битами, представляющими интенсивность оттенков серого в интервале 0-255 и дополнительный 8-битный альфа-компонент. |
| static [Rgb16Bpp555](../../aspose.cad/pixeldataformat/rgb16bpp555) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определенный для 16 бит на пиксель с 5 битами для каждого из красного, зеленого и синего , альфа не определена. |
| static [Rgb24Bpp](../../aspose.cad/pixeldataformat/rgb24bpp) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определено для 24 бит на пиксель с 8 битами для каждого из альфа, красного, зеленого и синий, альфа не определен. |
| static [Rgb24BppPng](../../aspose.cad/pixeldataformat/rgb24bpppng) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определено для 24 бит на пиксель с 8 битами для каждого из альфа, красного, зеленого и синий, альфа не определен. |
| static [Rgb32Bpp](../../aspose.cad/pixeldataformat/rgb32bpp) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определено для 32 бит на пиксель с 8 битами для каждого из альфа, красного, зеленого и синий. |
| static [Rgba32Bpp](../../aspose.cad/pixeldataformat/rgba32bpp) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определено для 32 бит на пиксель с 8 битами для каждого из альфа, красного, зеленого и синий. |
| static [RgbIndexed1Bpp](../../aspose.cad/pixeldataformat/rgbindexed1bpp) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определенный для индексированного 1 бита на цвет. Хранилище данных индексированных пикселей предназначено для хранения и извлечения данных везде, где используется цветовая палитра. Используйте с осторожностью, поскольку может потребоваться преобразование из одной палитры в другую или из RGBA в индексированную цветовую модель. |
| static [RgbIndexed2Bpp](../../aspose.cad/pixeldataformat/rgbindexed2bpp) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определенный для индексированного 2 бита на цвет. Хранилище данных индексированных пикселей предназначено для хранения и извлечения данных везде, где используется цветовая палитра. Используйте с осторожностью, поскольку может потребоваться преобразование из одной палитры в другую или из RGBA в индексированную цветовую модель. |
| static [RgbIndexed4Bpp](../../aspose.cad/pixeldataformat/rgbindexed4bpp) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определенный для индексированных 4 бит на цвет. Хранилище данных индексированных пикселей предназначено для хранения и извлечения данных везде, где используется цветовая палитра. Используйте с осторожностью, поскольку может потребоваться преобразование из одной палитры в другую или из RGBA в индексированную цветовую модель. |
| static [RgbIndexed8Bpp](../../aspose.cad/pixeldataformat/rgbindexed8bpp) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определенный для индексированных 8 бит на цвет. Хранилище данных индексированных пикселей предназначено для хранения и извлечения данных везде, где используется цветовая палитра. Используйте с осторожностью, поскольку может потребоваться преобразование из одной палитры в другую или из RGBA в индексированную цветовую модель. |
| static [YCbCr](../../aspose.cad/pixeldataformat/ycbcr) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определено для 24 бит на пиксель с 8 битами для каждой яркости, синего различия и красно-разностные компоненты цветности. |
| static [Ycck](../../aspose.cad/pixeldataformat/ycck) { get; } | Получает[`PixelDataFormat`](../pixeldataformat)определено для 32 бит на пиксель с 8 битами для каждой яркости, синего различия , красноразностная и черная компоненты цветности. |
| [BitsPerPixel](../../aspose.cad/pixeldataformat/bitsperpixel) { get; } | Получает биты на пиксель. |
| [ChannelBits](../../aspose.cad/pixeldataformat/channelbits) { get; } | Получает количество битов для каждого канала. |
| [ChannelsCount](../../aspose.cad/pixeldataformat/channelscount) { get; } | Получает количество каналов. |
| [PixelFormat](../../aspose.cad/pixeldataformat/pixelformat) { get; } | Получает формат пикселей. |

## Методы

| Имя | Описание |
| --- | --- |
| override [Equals](../../aspose.cad/pixeldataformat/equals)(object) | Определяет, равен ли указанныйObjectэтому экземпляру. |
| override [GetHashCode](../../aspose.cad/pixeldataformat/gethashcode)() | Возвращает хэш-код для данного экземпляра. |
| override [ToString](../../aspose.cad/pixeldataformat/tostring)() | ВозвращаетString, который представляет этот экземпляр. |
| [operator ==](../../aspose.cad/pixeldataformat/op_equality) | Возвращает результат равенства двух[`PixelDataFormat`](../pixeldataformat)классов. |
| [operator !=](../../aspose.cad/pixeldataformat/op_inequality) | Возвращает результат неравенства для двух[`PixelDataFormat`](../pixeldataformat)классов. |

### Смотрите также

* пространство имен [Aspose.CAD](../../aspose.cad)
* сборка [Aspose.CAD](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
