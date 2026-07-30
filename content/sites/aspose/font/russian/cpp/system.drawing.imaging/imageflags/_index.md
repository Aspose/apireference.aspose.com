---
title: "System::Drawing::Imaging::ImageFlags enum"
linktitle: "ImageFlags"
second_title: "Aspose.Font для C++"
description: "System::Drawing::Imaging::ImageFlags enum. Представляет атрибуты данных пикселей, представленных объектом [Image](../../system.drawing/image/) в C++."
type: docs
weight: 2200
url: /ru/cpp/system.drawing.imaging/imageflags/
---
## ImageFlags enum


Представляет атрибуты данных пикселей, представленных объектом [Image](../../system.drawing/image/).

```cpp
enum class ImageFlags
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Нет | 0 |  |
| Масштабируемый | 1 | Масштабируемый. |
| HasAlpha | 2 | Содержит информацию об альфа-канале. |
| HasTranslucent | 4 | Существует альфа-значения больше 0 и меньше 255. |
| PartiallyScalable | 8 |  |
| ColorSpaceRgb | 16 | Данные пикселей представлены в цветовом пространстве RGB. |
| ColorSpaceCmyk | 32 | Данные пикселей представлены в цветовом пространстве CMYK. |
| ColorSpaceGray | 64 | Данные пикселей находятся в градациях серого. |
| ColorSpaceYcbcr | 128 | Данные пикселей представлены в цветовом пространстве YCBCR. |
| ColorSpaceYcck | 256 | Данные пикселей представлены в цветовом пространстве YCCK. |
| HasRealDpi | 4096 | Информация о DPI хранится в изображении. |
| HasRealPixelSize | 8192 | Размер пикселя хранится в изображении. |
| ReadOnly | 65536 | Данные пикселей только для чтения. |
| Caching | 131072 | Можно кэшировать для более быстрого доступа. |

## См. также

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
