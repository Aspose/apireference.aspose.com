---
title: "System::Drawing::Imaging::EncoderValue enum"
linktitle: "EncoderValue"
second_title: "Aspose.Page для C++"
description: "System::Drawing::Imaging::EncoderValue enum. Указывает значение параметра, передаваемого JPEG или TIFF кодировщику изображения в C++."
type: docs
weight: 2100
url: /ru/cpp/system.drawing.imaging/encodervalue/
---
## EncoderValue enum


Указывает значение параметра, передаваемого JPEG или TIFF кодировщику изображений.

```cpp
enum class EncoderValue
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| ColorTypeCMYK | 0 | Цветовое пространство CMYK. |
| ColorTypeYCCK | 1 | Цветовое пространство YCCK. |
| CompressionLZW | 2 | Метод сжатия LZW. |
| CompressionCCITT3 | 3 | Указывает метод сжатия CCITT3 для изображения TIFF. |
| CompressionCCITT4 | 4 | Указывает метод сжатия CCITT4 для изображения TIFF. |
| CompressionRle | 5 | Указывает метод сжатия RLE для изображения TIFF. |
| CompressionNone | 6 | Указывает отсутствие сжатия для изображения TIFF. |
| ScanMethodInterlaced | 7 | Режим чередования. |
| ScanMethodNonInterlaced | 8 | Режим без чередования. |
| VersionGif87 | 9 | Указывает версию 87 для изображения TIFF. |
| VersionGif89 | 10 | Указывает версию 89a для изображения GIF. |
| RenderProgressive | 11 | Прогрессивный режим. |
| RenderNonProgressive | 12 | Непрогрессивный режим. |
| TransformRotate90 | 13 | Указывает без потерь вращение на 90 градусов по часовой стрелке для изображения JPEG. |
| TransformRotate180 | 14 | Указывает без потерь поворот изображения JPEG на 180 градусов. |
| TransformRotate270 | 15 | Указывает без потерь поворот изображения JPEG на 270 градусов по часовой стрелке. |
| TransformFlipHorizontal | 16 | Указывает без потерь горизонтальное отражение изображения JPEG. |
| TransformFlipVertical | 17 | Указывает без потерь вертикальное отражение изображения JPEG. |
| MultiFrame | 18 | Кодирование многокадрового изображения. |
| LastFrame | 19 | Последний кадр многокадрового изображения. |
| Flush | 20 | Объект кодировщика должен быть закрыт. |
| FrameDimensionTime | 21 | Указывает размерность временного кадра для изображения GIF. |
| FrameDimensionResolution | 22 | Размерность кадра разрешения. |
| FrameDimensionPage | 23 | Указывает размерность кадра страницы для изображения TIFF. |

## См. также

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
