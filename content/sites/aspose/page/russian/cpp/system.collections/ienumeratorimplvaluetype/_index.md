---
title: "System::Collections::IEnumeratorImplValueType класс"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Page для C++"
description: "System::Collections::IEnumeratorImplValueType класс. Обёртка, создающая негeneric‑реализацию IEnumerator поверх generic‑итератора IEnumeratorImplRefType — обёртка для типовых значений в C++."
type: docs
weight: 800
url: /ru/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Обёртка, создающая негeneric‑реализацию [IEnumerator](../ienumerator/) поверх generic‑итератора [IEnumeratorImplRefType](../ienumeratorimplreftype/) — обёртка для типовых значений.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Параметр | Описание |
| --- | --- |
| T | Тип элемента. |
## Методы

| Метод | Описание |
| --- | --- |
| [get_Current](./get_current/)() const override | Возвращает текущий элемент. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | конструктор обёртки |
| [MoveNext](./movenext/)() override | Перемещает перечислитель к следующему элементу. Если ранее ни один элемент не был выбран, устанавливает ссылку на первый доступный элемент. Если достигнут конец контейнера, ничего не делает. |

## См. также

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
