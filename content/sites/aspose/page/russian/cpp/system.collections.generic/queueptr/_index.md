---
title: "System::Collections::Generic::QueuePtr класс"
linktitle: "QueuePtr"
second_title: "Aspose.Page для C++"
description: "System::Collections::Generic::QueuePtr класс. Указатель на очередь. Этот тип представляет собой указатель для управления удалением других объектов. Его следует размещать в стеке и передавать в функции либо по значению, либо по константной ссылке в C++."
type: docs
weight: 3700
url: /ru/cpp/system.collections.generic/queueptr/
---
## QueuePtr class


[Queue](../queue/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class QueuePtr : public System::SmartPtr<Queue<T>>
```

## Методы

| Метод | Описание |
| --- | --- |
| [QueuePtr](./queueptr/)() | Создаёт нулевой указатель. |
| [QueuePtr](./queueptr/)(const SharedPtr\<Queue\<T\>\>\&) | Создаёт указатель на конкретную очередь. |

## См. также

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
