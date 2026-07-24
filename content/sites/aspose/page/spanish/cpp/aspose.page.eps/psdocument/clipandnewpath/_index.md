---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method"
linktitle: "ClipAndNewPath"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method. Añade un recorte al estado gráfico actual y luego escribe el operador \"newpath\". Es necesario hacerlo para evitar la confluencia de este camino de recorte y algunos caminos posteriores, como los glifos delineados con el operador \"charpath\" en C++."
type: docs
weight: 300
url: /es/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


Añade recorte al estado gráfico actual y luego escribe el operador \"newpath\". Es necesario hacerlo para evitar la confluencia de esta ruta de recorte y algunas rutas posteriores, como los glifos delineados con el operador \"charpath\".

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | La ruta de recorte. |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
