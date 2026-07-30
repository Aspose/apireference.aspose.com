---
title: "Класс System::Drawing::Icon"
linktitle: "Icon"
second_title: "Aspose.Font для C++"
description: "Класс System::Drawing::Icon. Представляет иконку Windows. Объекты этого класса должны быть выделены только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1100
url: /ru/cpp/system.drawing/icon/
---
## Icon class


Представляет иконку [Windows](../../system.windows/). Объекты этого класса должны быть выделены только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Icon : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Height](./get_height/)() const | Возвращает высоту иконки. |
| [get_Width](./get_width/)() const | Возвращает ширину иконки. |
| [Icon](./icon/)(const String\&) | Создаёт новый экземпляр класса [Icon](./), представляющий иконку из указанного файла. |
| [ToBitmap](./tobitmap/)() | Преобразует текущий объект в объект [Bitmap](../bitmap/). |
| virtual [~Icon](./~icon/)() | Деструктор. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
