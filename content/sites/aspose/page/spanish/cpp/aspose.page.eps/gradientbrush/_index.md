---
title: "Clase Aspose::Page::EPS::GradientBrush"
linktitle: "GradientBrush"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::EPS::GradientBrush. Esta clase se utiliza para encapsular LinearGradientBrush y PathGradientBrush con la posibilidad de establecer el modo de ajuste a clamp. Los pinceles de degradado nativos siempre lanzan una excepción cuando alguien intenta establecer la propiedad WrapMode a WrapMode.Clamp en C++."
type: docs
weight: 300
url: /es/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


Esta clase se utiliza para encapsular LinearGradientBrush y PathGradientBrush con la posibilidad de establecer el modo de ajuste a clamp. Los pinceles de degradado nativos siempre lanzan una excepción cuando alguien intenta establecer la propiedad WrapMode a WrapMode.Clamp.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() override | Clona este pincel. |
| [Dispose](./dispose/)() override | Libera todos los recursos utilizados por este objeto [T:Aspose::Page::EPS::GradientBrush](../). |
| [get_Bounds](./get_bounds/)() const | Devuelve o especifica los límites para este pincel de degradado. |
| [get_NativeBrush](./get_nativebrush/)() const | Devuelve el pincel de degradado nativo. |
| [get_WrapMode](./get_wrapmode/)() const | Devuelve o especifica el modo de ajuste para este pincel de degradado. Puede ser WrapMode.Clamp, lo que provoca una excepción en los pinceles de degradado nativos. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Crea una nueva instancia de [GradientBrush](./). |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Devuelve o especifica los límites para este pincel de degradado. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Devuelve o especifica el modo de ajuste para este pincel de degradado. Puede ser WrapMode.Clamp, lo que provoca una excepción en los pinceles de degradado nativos. |
## Ver también

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
