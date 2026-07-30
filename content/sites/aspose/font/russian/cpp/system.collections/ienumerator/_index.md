---
title: "Класс System::Collections::IEnumerator"
linktitle: "IEnumerator"
second_title: "Aspose.Font для C++"
description: "Класс System::Collections::IEnumerator. Интерфейс перечислителя, который может использоваться для перебора некоторых элементов. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 600
url: /ru/cpp/system.collections/ienumerator/
---
## IEnumerator class


Интерфейс перечислителя, который может использоваться для перебора некоторых элементов. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Параметр | Описание |
| --- | --- |
| T | Тип элемента. |
## Методы

| Метод | Описание |
| --- | --- |
| virtual [Current](./current/)() const | Получает текущий элемент. |
| virtual [get_Current](./get_current/)() const | Получает текущий элемент. |
| virtual [MoveNext](./movenext/)() | Перемещает перечислитель к следующему элементу. Если ранее ни один элемент не был выбран, устанавливает ссылку на первый доступный элемент. Если достигнут конец контейнера, ничего не делает. |
| virtual [Reset](./reset/)() | Сбрасывает перечислитель в позицию перед первым элементом. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [ValueType](./valuetype/) | Информация RTTI. |

## См. также

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
