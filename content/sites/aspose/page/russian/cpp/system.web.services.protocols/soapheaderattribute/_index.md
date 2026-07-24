---
title: "System::Web::Services::Protocols::SoapHeaderAttribute класс"
linktitle: "SoapHeaderAttribute"
second_title: "Aspose.Page для C++"
description: "System::Web::Services::Protocols::SoapHeaderAttribute класс. Указывает SOAP‑заголовок, который может обрабатывать метод XML‑веб‑службы или клиент XML‑веб‑службы. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 700
url: /ru/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


Указывает SOAP‑заголовок, который может обрабатывать метод XML‑службы [Web](../../system.web/) или клиент XML‑службы [Web](../../system.web/). Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Direction](./get_direction/)() | Информация RTTI. |
| [get_MemberName](./get_membername/)() | Получает имя переменной-члена XML‑SOAP‑службы, используемой для получения содержимого SOAP‑заголовка. |
| [get_Required](./get_required/)() | Получает значение, указывающее, должен ли получатель XML‑службы [Web](../../system.web/) или клиент XML‑службы [Web](../../system.web/) понять и обработать SOAP‑заголовок. |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | Устанавливает направление SOAP‑заголовка. |
| [set_MemberName](./set_membername/)(String) | Устанавливает имя переменной-члена XML‑SOAP‑службы, используемой для получения содержимого SOAP‑заголовка. |
| [set_Required](./set_required/)(bool) | Устанавливает значение, указывающее, должен ли получатель XML‑службы [Web](../../system.web/) или клиент XML‑службы [Web](../../system.web/) понять и обработать SOAP‑заголовок. |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | Создаёт новый экземпляр. |
## См. также

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
