---
title: "System::DynamicWeakPtr::Reference класс"
linktitle: "Reference"
second_title: "Aspose.Page для C++"
description: "System::DynamicWeakPtr::Reference класс. Класс ссылки, который гарантирует вызов DynamicWeakPtr::Apply. Используется, если DynamicWeakPtr передаётся как параметр ссылки SmartPtr в функцию, которая может присваивать его в C++."
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
| [Reference](./reference/)(Reference\&&) | Перемещающее конструирование ссылки на умный указатель. |
| [~Reference](./~reference/)() | Уничтожает ссылку. Обеспечивает вызов Apply() у ссылочного умного указателя. |
## См. также

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
