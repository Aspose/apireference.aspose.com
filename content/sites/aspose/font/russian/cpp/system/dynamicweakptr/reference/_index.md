---
title: "System::DynamicWeakPtr::Reference class"
linktitle: "Reference"
second_title: "Aspose.Font для C++"
description: "System::DynamicWeakPtr::Reference class. Класс ссылки, который гарантирует вызов DynamicWeakPtr::Apply. Используется, если DynamicWeakPtr передаётся как параметр ссылки SmartPtr в функцию, которая может присвоить ему значение в C++."
type: docs
weight: 700
url: /ru/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## Методы

| Метод | Описание |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Оператор преобразования. Позволяет использовать [Reference](./) в контекстах, где требуется [DynamicWeakPtr_](../dynamicweakptr_/). |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Создаёт ссылку на умный указатель. |
| [Reference](./reference/)(Reference\&&) | Создаёт ссылку на умный указатель перемещением. |
| [~Reference](./~reference/)() | Уничтожает ссылку. Обеспечивает вызов Apply() у связанного умного указателя. |
## См. также

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
