---
title: "Enumeración Aspose::Page::XPS::XpsModel::XpsTileMode"
linktitle: "XpsTileMode"
second_title: "Aspose.Page para C++"
description: "Enumeración Aspose::Page::XPS::XpsModel::XpsTileMode. Valores válidos de la propiedad TileMode de los pinceles de mosaico en C++."
type: docs
weight: 5500
url: /es/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


Valores válidos de la propiedad TileMode de los pinceles de mosaico.

```cpp
enum class XpsTileMode
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| None | 0 | En este modo, solo se dibuja la única tesela base. El área restante se deja transparente. |
| Tile | 1 | En este modo, la tesela base se dibuja y el área restante se rellena repitiendo la tesela base de modo que el borde derecho de cada tesela toque el borde izquierdo de la siguiente, y el borde inferior de cada tesela toque el borde superior de la siguiente. |
| FlipX | 2 | La disposición de teselas es similar al modo de mosaico Tile, pero las columnas alternas de teselas se invierten horizontalmente. La tesela base se posiciona según lo especificado por la ventana de visualización. Las teselas en las columnas a la izquierda y a la derecha de esta tesela se invierten horizontalmente. |
| FlipY | 3 | La disposición de teselas es similar al modo de mosaico Tile, pero las filas alternas de teselas se invierten verticalmente. La tesela base se posiciona según lo especificado por la ventana de visualización. Las filas superiores e inferiores se invierten verticalmente. |
| FlipXY | 4 | La disposición de los mosaicos es similar al modo Tile tile, pero las columnas alternas de mosaicos se invierten horizontalmente y las filas alternas de mosaicos se invierten verticalmente. El mosaico base se posiciona según lo especificado por el viewport. |

## Ver también

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
