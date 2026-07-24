---
title: "enumeración System::Drawing::Imaging::PixelFormat"
linktitle: "PixelFormat"
second_title: "Aspose.Page para C++"
description: "enumeración System::Drawing::Imaging::PixelFormat. Especifica el formato de datos de color de un píxel en C++."
type: docs
weight: 2600
url: /es/cpp/system.drawing.imaging/pixelformat/
---
## PixelFormat enum


Especifica el formato de datos de color de un píxel.

```cpp
enum class PixelFormat
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Indexed | 65536 | Especifica que los datos del píxel contienen valores de color indexados, lo que significa que son un índice a los colores en la tabla de colores del sistema. |
| Gdi | 131072 | Especifica que los datos del píxel contienen colores GDI. |
| Alpha | 262144 | Especifica que los datos del píxel contienen valores alfa que no están pre-multiplicados. |
| PAlpha | 524288 | Especifica que los datos del píxel contienen valores alfa pre-multiplicados. |
| Extendido | 1048576 | Reservado. |
| Canónico | 2097152 | Especifica el formato de píxel de 32 bits por píxel con una profundidad de color de 24 bits y un canal alfa de 8 bits. |
| Indefinido | 0 | Especifica que el formato de píxel es indefinido. |
| NoImporta | 0 | El formato de píxel no está especificado. |
| Format1bppIndexed | n/a | Especifica que el formato de píxel es de 1 bit por píxel con color indexado. |
| Format4bppIndexed | n/a | Especifica que el formato de píxel es de 4 bits por píxel con color indexado. |
| Format8bppIndexed | n/a | Especifica que el formato de píxel es de 8 bits por píxel con color indexado. |
| Format16bppGrayScale | n/a | Especifica que el formato de píxel es de 16 bits por píxel. La información de color especifica 65536 tonos de gris. |
| Format16bppRgb555 | n/a | Especifica que el formato de píxel es de 16 bits por píxel con 5 bits para cada uno de los componentes rojo, verde y azul y el bit restante no se usa. |
| Format16bppRgb565 | n/a | Especifica que el formato de píxel es de 16 bits por píxel con 5 bits para el rojo, 6 bits para el verde y 5 bits para el azul. |
| Format16bppArgb1555 | n/a | Especifica que el formato de píxel es de 16 bits por píxel con 5 bits para cada uno de los componentes rojo, verde y azul y 1 bit para alfa. |
| Format24bppRgb | n/a | Especifica que el formato de píxel es de 24 bits por píxel con 8 bits para cada uno de los componentes rojo, verde y azul. |
| Format32bppRgb | n/a | Especifica que el formato de píxel es de 32 bits por píxel con 8 bits para cada uno de los componentes rojo, verde y azul y los 8 bits restantes no se usan. |
| Format32bppArgb | n/a | Especifica que el formato de píxel es de 32 bits por píxel con 8 bits para cada uno de los componentes rojo, verde y azul y 8 bits para alfa. |
| Format32bppPArgb | n/a | Especifica que el formato de píxel es de 32 bits por píxel con 8 bits para cada uno de los componentes rojo, verde y azul y 8 bits para alfa. Los componentes rojo, verde y azul están pre-multiplicados según el valor del componente alfa. |
| Format48bppRgb | n/a | Especifica que el formato de píxel es de 48 bits por píxel con 16 bits para cada uno de los componentes rojo, verde y azul. |
| Format64bppArgb | n/a | Especifica que el formato de píxel es de 64 bits por píxel con 16 bits para cada uno de los componentes rojo, verde y azul y 16 bits para alfa. |
| Format64bppPArgb | n/a | Especifica que el formato de píxel es de 64 bits por píxel con 16 bits para cada uno de los componentes rojo, verde y azul y 16 bits para alfa. Los componentes rojo, verde y azul están pre-multiplicados según el valor del componente alfa. |
| Format32bppCMYK | n/a | Especifica que el formato de píxel es de 32 bits por píxel con 8 bits para cada uno de los componentes cian, magenta, amarillo y clave. |
| Max | 16 | El valor máximo de este enumerado. |

## Ver también

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
