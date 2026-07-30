---
title: "Класс System::Data::IDataRecord"
linktitle: "IDataRecord"
second_title: "Aspose.Font для C++"
description: "Класс System::Data::IDataRecord. Интерфейс к записи с колонками. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1300
url: /ru/cpp/system.data/idatarecord/
---
## IDataRecord class


Интерфейс к записи с колонками. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class IDataRecord : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | Информация RTTI. |
| virtual [GetName](./getname/)(const int32_t) | Получает имя поля в указанной позиции. |
| virtual [idx_get](./idx_get/)(const int32_t) | Получает значение по указанному индексу. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
