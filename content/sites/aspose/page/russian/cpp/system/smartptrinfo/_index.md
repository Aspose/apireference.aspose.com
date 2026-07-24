---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page для C++"
description: "System::SmartPtrInfo class. Сервисный класс для тестирования и изменения содержимого SmartPtr'' без знания конечного типа. Используется для сборки мусора и обнаружения циклических ссылок и т.д. Можно рассматривать его как ''указатель на указатель''. Мы не можем использовать базовый тип SmartPtr'' так как он отсутствует; вместо этого мы используем этот ''info'' класс в C++."
type: docs
weight: 5600
url: /ru/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Сервисный класс для тестирования и изменения содержимого [SmartPtr](../smartptr/), без знания конечного типа. Используется для сборки мусора и обнаружения циклических ссылок и т.д. Можно рассматривать его как 'указатель на указатель'. Мы не можем использовать базовый тип [SmartPtr](../smartptr/), так как он отсутствует; вместо этого мы используем этот 'info' класс.

```cpp
class SmartPtrInfo
```

## Методы

| Метод | Описание |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Получает объект, на который указывает указатель на сырой объект. |
| [getObject](./getobject/)() const | Получает объект, на который указывает указатель, ссылающийся на объект. |
| [getOwned](./getowned/)() const | Получает указатель, владеющий объектом. |
| [operator bool](./operatorbool/)() const | Проверяет, указывает ли объект info на ненулевой указатель. |
| [operator!](./operator!/)() const | Проверяет, не указывает ли объект info на ненулевой указатель. |
| [operator->](./operator-_/)() const | Позволяет вызывать методы [Object](../object/), на который указывает ссылочный указатель. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Сравнивает меньшие значения указателей, на которые ссылаются два объекта info. |
| [SmartPtrInfo](./smartptrinfo/)() | Создаёт пустой объект [SmartPtrInfo](./). |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Создаёт объект [SmartPtrInfo](./) с информацией о конкретном умном указателе. |
## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
