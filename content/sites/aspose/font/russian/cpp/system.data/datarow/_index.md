---
title: "System::Data::DataRow класс"
linktitle: "DataRow"
second_title: "Aspose.Font для C++"
description: "System::Data::DataRow класс. Строка в наборе данных. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 500
url: /ru/cpp/system.data/datarow/
---
## DataRow class


Строка в наборе данных. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class DataRow : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Table](./get_table/)() | Получает строку таблицы, к которой она принадлежит. |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | Получает строки, которые считаются дочерними через указанную связь. |
| [idx_get](./idx_get/)(const int32_t) | Информация RTTI. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
