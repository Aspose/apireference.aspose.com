---
title: "System::Net::IWebProxy class"
linktitle: "IWebProxy"
second_title: "Aspose.Font для C++"
description: "Класс System::Net::IWebProxy. Этот интерфейс используется для реализации доступа к прокси для класса WebRequest. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2700
url: /ru/cpp/system.net/iwebproxy/
---
## IWebProxy class


Этот интерфейс используется для реализации доступа к прокси для класса [WebRequest](../webrequest/). Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class IWebProxy : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | Информация RTTI. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Возвращает URI прокси. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Возвращает значение, указывающее, должен ли прокси не использоваться для указанного хоста. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Устанавливает учётные данные для аутентификации на прокси‑сервере. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
