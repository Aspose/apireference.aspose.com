---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute класс"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Font для C++"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute класс. Указывает, что все SOAP‑сообщения, передаваемые или возвращаемые методом, используют форматирование Document. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 400
url: /ru/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


Указывает, что все SOAP‑сообщения, передаваемые или возвращаемые методом, используют форматирование Document. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Action](./get_action/)() | Информация RTTI. |
| [get_Binding](./get_binding/)() | Получает привязку, для которой метод XML‑веб‑сервиса реализует операцию. |
| [get_OneWay](./get_oneway/)() | Получает значение, указывающее, не ждёт ли клиент завершения обработки метода сервером. |
| [get_ParameterStyle](./get_parameterstyle/)() | Получает значение, указывающее, инкапсулированы ли параметры в единственном XML‑элементе под элементом 'Body'. |
| [get_RequestElementName](./get_requestelementname/)() | Получает имя XML‑элемента, связанного с запросом SOAP, который определён в описании сервиса как операция. |
| [get_RequestNamespace](./get_requestnamespace/)() | Получает пространство имён, связанное с запросом SOAP. |
| [get_ResponseElementName](./get_responseelementname/)() | Получает имя XML‑элемента, связанного с ответом SOAP. |
| [get_ResponseNamespace](./get_responsenamespace/)() | Получает пространство имён, связанное с ответом SOAP. |
| [get_Use](./get_use/)() | Получает значение, определяющее метод кодирования сообщения. |
| [set_Action](./set_action/)(String) | Устанавливает значение атрибута 'SOAPAction'. |
| [set_Binding](./set_binding/)(String) | Устанавливает привязку, для которой метод XML веб‑сервиса реализует операцию. |
| [set_OneWay](./set_oneway/)(bool) | Устанавливает значение, указывающее, будет ли клиент ждать завершения обработки метода сервером. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Устанавливает значение, указывающее, инкапсулированы ли параметры в единственном XML‑элементе под элементом 'Body'. |
| [set_RequestElementName](./set_requestelementname/)(String) | Устанавливает имя XML‑элемента, связанного с SOAP‑запросом, определённого в описании сервиса как операция. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | Устанавливает пространство имён, связанное с SOAP‑запросом. |
| [set_ResponseElementName](./set_responseelementname/)(String) | Устанавливает имя XML‑элемента, связанного с SOAP‑ответом. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | Устанавливает пространство имён, связанное с SOAP‑ответом. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Устанавливает значение, определяющее метод кодирования сообщения. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | Создаёт новый экземпляр. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | Создаёт новый экземпляр. |
## См. также

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
