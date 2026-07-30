---
title: "System::Drawing::Drawing2D::HatchBrush класс"
linktitle: "HatchBrush"
second_title: "Aspose.Font для C++"
description: "System::Drawing::Drawing2D::HatchBrush класс. Представляет прямоугольную кисть с штриховым стилем, цветом переднего плана и цветом фона. Объекты этого класса должны выделяться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 800
url: /ru/cpp/system.drawing.drawing2d/hatchbrush/
---
## HatchBrush class


Представляет прямоугольную кисть с штриховым стилем, цветом переднего плана и цветом фона. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class HatchBrush : public System::Drawing::Brush
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() override | Создаёт точную копию текущего объекта. |
| [get_BackgroundColor](./get_backgroundcolor/)() const | Возвращает значение, указывающее цвет фона этой кисти. |
| [get_ForegroundColor](./get_foregroundcolor/)() const | Возвращает значение, указывающее цвет переднего плана этой кисти. |
| [get_HatchStyle](./get_hatchstyle/)() const | Возвращает значение, указывающее штриховый стиль этой кисти. |
| [HatchBrush](./hatchbrush/)(HatchStyle, Color, Color) | Информация RTTI. |
## См. также

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
