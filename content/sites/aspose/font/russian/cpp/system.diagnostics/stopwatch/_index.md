---
title: "Класс System::Diagnostics::Stopwatch"
linktitle: "Stopwatch"
second_title: "Aspose.Font для C++"
description: "Класс System::Diagnostics::Stopwatch. Позволяет измерять время. Объекты этого класса должны выделяться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 700
url: /ru/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


Позволяет измерять время. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Stopwatch : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | Возвращает общее прошедшее время, измеренное текущим экземпляром. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | Возвращает общее прошедшее время, измеренное текущим экземпляром, в миллисекундах. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | Возвращает общее прошедшее время, измеренное текущим экземпляром, в тиках таймера. |
| [get_IsRunning](./get_isrunning/)() const | Проверяет, работает ли секундомер. |
| [Reset](./reset/)() | Останавливает измерение времени, устанавливает измеренный интервал в ноль. |
| [Restart](./restart/)() | Устанавливает измеренный интервал в ноль, затем начинает измерение времени. |
| [Start](./start/)() | Начинает измерение времени. |
| static [StartNew](./startnew/)() | Создаёт новый объект [Stopwatch](./) и начинает измерение. |
| [Stop](./stop/)() | Останавливает измерение времени. |
| [Stopwatch](./stopwatch/)() | Информация RTTI. |
| virtual [~Stopwatch](./~stopwatch/)() | Деструктор. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
