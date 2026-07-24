---
title: "Класс Aspose::Page::EPS::GradientBrush"
linktitle: "GradientBrush"
second_title: "Aspose.Page для C++"
description: "Класс Aspose::Page::EPS::GradientBrush. Этот класс используется для инкапсуляции LinearGradientBrush и PathGradientBrush с возможностью установить режим обёртки в clamp. Нативные градиентные кисти всегда бросают исключение, когда кто‑то пытается установить свойство WrapMode в WrapMode.Clamp в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


Этот класс используется для инкапсуляции LinearGradientBrush и PathGradientBrush с возможностью установить режим обтекания в clamp. Нативные градиентные кисти всегда генерируют исключение, когда кто‑то пытается установить свойство WrapMode в WrapMode.Clamp.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() override | Клонирует эту кисть. |
| [Dispose](./dispose/)() override | Освобождает все ресурсы, используемые этим объектом [T:Aspose::Page::EPS::GradientBrush](../). |
| [get_Bounds](./get_bounds/)() const | Возвращает или задаёт границы для этой градиентной кисти. |
| [get_NativeBrush](./get_nativebrush/)() const | Возвращает нативную градиентную кисть. |
| [get_WrapMode](./get_wrapmode/)() const | Возвращает или задаёт режим обёртки для этой градиентной кисти. Он может быть WrapMode.Clamp, что приводит к выбросу исключения в нативных градиентных кистях. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Создаёт новый экземпляр [GradientBrush](./). |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Возвращает или задаёт границы для этой градиентной кисти. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Возвращает или задаёт режим обёртки для этой градиентной кисти. Он может быть WrapMode.Clamp, что приводит к выбросу исключения в нативных градиентных кистях. |
## См. также

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
