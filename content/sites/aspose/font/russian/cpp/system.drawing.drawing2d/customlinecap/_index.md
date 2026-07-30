---
title: "System::Drawing::Drawing2D::CustomLineCap класс"
linktitle: "CustomLineCap"
second_title: "Aspose.Font для C++"
description: "System::Drawing::Drawing2D::CustomLineCap класс. Представляет пользовательский конечный элемент линии. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 400
url: /ru/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Представляет пользовательский конечный элемент линии. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class CustomLineCap : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Clone](./clone/)() | Возвращает копию текущего объекта. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Создаёт новый экземпляр класса [CustomLineCap](./), представляющего пользовательский конечный элемент линии с указанными свойствами. |
| [Dispose](./dispose/)() | Освобождает все ресурсы операционной системы, захваченные текущим объектом. |
| [get_BaseCap](./get_basecap/)() const | Возвращает базовый конечный элемент линии, из которого создан этот пользовательский элемент. |
| [get_BaseInset](./get_baseinset/)() const | Возвращает расстояние между линией и элементом. |
| [get_StrokeJoin](./get_strokejoin/)() const | Возвращает значение [LineJoin](../linejoin/), определяющее, как соединяются линии этого пользовательского элемента. |
| [get_WidthScale](./get_widthscale/)() const | Возвращает масштаб этого пользовательского элемента. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Получает начальные и конечные элементы линии пользовательского элемента, представленного текущим объектом. |
| [set_BaseCap](./set_basecap/)(LineCap) | Устанавливает значение базового конечного элемента линии для этого пользовательского элемента. |
| [set_BaseInset](./set_baseinset/)(float) | Устанавливает расстояние между линией и элементом. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Устанавливает значение [LineJoin](../linejoin/), определяющее, как соединяются линии этого пользовательского элемента. |
| [set_WidthScale](./set_widthscale/)(float) | Устанавливает значение масштаба этого пользовательского элемента. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Устанавливает начальные и конечные элементы линии пользовательского элемента, представленного текущим объектом. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
