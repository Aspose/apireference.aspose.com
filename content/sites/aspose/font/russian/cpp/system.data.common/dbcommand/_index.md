---
title: "System::Data::Common::DbCommand class"
linktitle: "DbCommand"
second_title: "Aspose.Font для C++"
description: "Класс System::Data::Common::DbCommand. Команда базы данных. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 100
url: /ru/cpp/system.data.common/dbcommand/
---
## DbCommand class


Команда базы данных. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class DbCommand : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | Выполняет команду без запроса. |
| virtual [ExecuteReader](./executereader/)() | Выполняет команду запроса. |
| virtual [get_CommandText](./get_commandtext/)() const | Информация RTTI. |
| virtual [get_Connection](./get_connection/)() const | Получает соединение с базой данных, связанное с командой. |
| virtual [set_CommandText](./set_commandtext/)(String) const | Устанавливает текст команды БД. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | Получает соединение с базой данных, связанное с командой. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
