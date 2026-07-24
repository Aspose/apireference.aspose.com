---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. Valores válidos de la propiedad FillRule del elemento PathGeometry en C++."
type: docs
weight: 4900
url: /es/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


Valores válidos de la propiedad FillRule del elemento PathGeometry.

```cpp
enum class XpsFillRule
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| EvenOdd | 0 | Esta regla determina la “interioridad” de un punto en el lienzo al dibujar un rayo desde el punto hasta el infinito en cualquier dirección y contar el número de segmentos de la forma dada que el rayo cruza. Si este número es impar, el punto está dentro; si es par, el punto está fuera. |
| NonZero | 1 | Esta regla determina la “interioridad” de un punto en el lienzo dibujando un rayo desde el punto hasta el infinito en cualquier dirección y luego examinando los lugares donde un segmento de la forma cruza el rayo. Comenzando con un recuento de cero, se suma uno cada vez que un segmento cruza el rayo de izquierda a derecha y se resta uno cada vez que un segmento del trazado cruza el rayo de derecha a izquierda. Después de contar los cruces, si el resultado es cero, el punto está fuera del trazado; de lo contrario, está dentro. |

## Ver también

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
