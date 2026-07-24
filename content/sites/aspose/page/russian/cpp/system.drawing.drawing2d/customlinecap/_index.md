---
title: "Класс System::Drawing::Drawing2D::CustomLineCap"
linktitle: "CustomLineCap"
second_title: "Aspose.Page для C++"
description: "Класс System::Drawing::Drawing2D::CustomLineCap. Представляет пользовательскую заглушку линии. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с использованием оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 400
url: /ru/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Представляет пользовательскую заглушку линии. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с использованием оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class CustomLineCap : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Clone](./clone/)() | Возвращает копию текущего объекта. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Создаёт новый экземпляр класса [CustomLineCap](./), представляющий пользовательскую заглушку линии с указанными свойствами. |
| [Dispose](./dispose/)() | Освобождает все ресурсы операционной системы, полученные текущим объектом. |
| [get_BaseCap](./get_basecap/)() const | Возвращает базовую форму конца линии, из которой создаётся эта пользовательская форма конца. |
| [get_BaseInset](./get_baseinset/)() const | Возвращает расстояние между линией и концом. |
| [get_StrokeJoin](./get_strokejoin/)() const | Возвращает значение [LineJoin](../linejoin/), определяющее способ соединения линий этой пользовательской формы конца. |
| [get_WidthScale](./get_widthscale/)() const | Возвращает масштаб этой пользовательской формы конца. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Получает начальную и конечную формы конца линии пользовательской формы, представленной текущим объектом. |
| [set_BaseCap](./set_basecap/)(LineCap) | Устанавливает значение базовой формы конца линии для этой пользовательской формы конца. |
| [set_BaseInset](./set_baseinset/)(float) | Устанавливает расстояние между линией и концом. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Устанавливает значение [LineJoin](../linejoin/), определяющее способ соединения линий этой пользовательской формы конца. |
| [set_WidthScale](./set_widthscale/)(float) | Устанавливает значение масштаба этой пользовательской формы конца. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Устанавливает начальную и конечную формы конца линии пользовательской формы, представленной текущим объектом. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
