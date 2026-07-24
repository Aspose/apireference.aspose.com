---
title: "System::Diagnostics::PerformanceCounter class"
linktitle: "PerformanceCounter"
second_title: "Aspose.Page для C++"
description: "System::Diagnostics::PerformanceCounter class. Заглушка класса для использования PerformanceCounter в переведённом коде, чтобы он компилировался. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 200
url: /ru/cpp/system.diagnostics/performancecounter/
---
## PerformanceCounter class


Заглушка класса для использования PerformanceCounter в переведённом коде, чтобы он компилировался. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class PerformanceCounter : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [Close](./close/)() | Останавливает все операции подсчёта производительности. |
| [NextValue](./nextvalue/)() | Получает следующее измеренное значение. |
| [PerformanceCounter](./performancecounter/)() | Создаёт счётчик производительности. |
| [PerformanceCounter](./performancecounter/)(const String\&, const String\&) | Создаёт счётчик производительности для конкретной категории. |
| [PerformanceCounter](./performancecounter/)(const String\&, const String\&, const String\&, const String\&) | Создаёт счётчик производительности для конкретной категории и имени экземпляра. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
