---
title: "System::Data::DataTable класс"
linktitle: "DataTable"
second_title: "Aspose.Font для C++"
description: "System::Data::DataTable класс. Данные структурированы в строках и столбцах. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 900
url: /ru/cpp/system.data/datatable/
---
## DataTable class


[Data](../) structured in rows and columns. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DataTable : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Columns](./get_columns/)() | Получает столбцы, присутствующие в таблице. |
| [get_DataSet](./get_dataset/)() | Получает набор данных, к которому принадлежит таблица. |
| [get_Rows](./get_rows/)() | Информация RTTI. |
| [get_TableName](./get_tablename/)() | Получает имя таблицы. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
