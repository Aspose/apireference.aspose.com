---
title: "Clase Aspose::Page::XPS::XpsModel::XpsTransformableBrush"
linktitle: "XpsTransformableBrush"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::XPS::XpsModel::XpsTransformableBrush. Clase que encapsula características comunes de los elementos de pinceles transformables (todos excepto SolidColorBrush) en C++."
type: docs
weight: 4300
url: /es/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


Clase que encapsula características comunes de los elementos de pinceles transformables (todos excepto SolidColorBrush).

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Transform](./get_transform/)() override | Devuelve/establece la transformación matricial aplicada al espacio de coordenadas del pincel. La propiedad Transform se concatena con la transformación de renderizado efectiva actual para producir una transformación de renderizado efectiva local al pincel. El viewport del pincel se transforma usando la transformación de renderizado efectiva local. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Devuelve/establece la transformación matricial aplicada al espacio de coordenadas del pincel. La propiedad Transform se concatena con la transformación de renderizado efectiva actual para producir una transformación de renderizado efectiva local al pincel. El viewport del pincel se transforma usando la transformación de renderizado efectiva local. |
## Ver también

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
