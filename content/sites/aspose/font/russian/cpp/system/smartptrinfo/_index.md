---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Font для C++"
description: "System::SmartPtrInfo class. Сервисный класс для тестирования и изменения содержимого SmartPtr''s без знания конечного типа. Используется для сборки мусора и обнаружения циклических ссылок и т.д. Считайте его «указателем на указатель». Мы не можем использовать базовый тип SmartPtr''s, так как его нет; вместо этого мы используем этот класс ''info'' в C++."
type: docs
weight: 5600
url: /ru/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Сервисный класс для тестирования и изменения содержимого [SmartPtr](../smartptr/)'s без знания конечного типа. Используется для сборки мусора и обнаружения циклических ссылок и т.д. Считайте его «указателем на указатель». Мы не можем использовать базовый тип [SmartPtr](../smartptr/)'s, так как его нет; вместо этого мы используем этот класс 'info'.

```cpp
class SmartPtrInfo
```

## Методы

| Метод | Описание |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Получает объект, на который указывает указатель сырого объекта. |
| [getObject](./getobject/)() const | Получает объект, на который указывает указатель ссылки. |
| [getOwned](./getowned/)() const | Получает указатель, владеющий объектом. |
| [operator bool](./operatorbool/)() const | Проверяет, указывает ли объект info на ненулевой указатель. |
| [operator!](./operator!/)() const | Проверяет, не указывает ли объект info на ненулевой указатель. |
| [operator->](./operator-_/)() const | Позволяет вызывать методы [Object](../object/), на который указывает ссылочный указатель. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Сравнивает значения указателей, на которые ссылаются два объекта info, используя оператор <. |
| [SmartPtrInfo](./smartptrinfo/)() | Создаёт пустой объект [SmartPtrInfo](./). |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Создаёт объект [SmartPtrInfo](./) с информацией о конкретном умном указателе. |
## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
