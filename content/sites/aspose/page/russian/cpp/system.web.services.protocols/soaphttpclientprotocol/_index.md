---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol класс"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Page для C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol класс. Службы клиентского прокси должны наследовать этот класс, когда используется SOAP. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 900
url: /ru/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


Службы клиентского прокси должны наследовать этот класс, когда используется SOAP. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## Методы

| Метод | Описание |
| --- | --- |
| [Discover](./discover/)() | Привязывает текущий экземпляр к XML‑службе [Web](../../system.web/). |
| [get_SoapVersion](./get_soapversion/)() | Получает версию SOAP. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | Инициализирует внутренние поля. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | Устанавливает версию SOAP. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | Создаёт новый экземпляр. |
## См. также

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
