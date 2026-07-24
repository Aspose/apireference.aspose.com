---
title: "Класс System::Drawing::Text::FontCollection"
linktitle: "FontCollection"
second_title: "Aspose.Page для C++"
description: "Класс System::Drawing::Text::FontCollection. Базовый класс для установленных и частных коллекций шрифтов. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 100
url: /ru/cpp/system.drawing.text/fontcollection/
---
## FontCollection class


Базовый класс для установленных и частных коллекций шрифтов. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class FontCollection : public System::IDisposable
```

## Методы

| Метод | Описание |
| --- | --- |
| [Dispose](./dispose/)() override | Освобождает ресурсы операционной системы, полученные текущим объектом. |
| virtual [get_Families](./get_families/)() | Возвращает массив объектов [FontFamily](../../system.drawing/fontfamily/), связанных с коллекцией шрифтов, представленной текущим объектом. |
## См. также

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
