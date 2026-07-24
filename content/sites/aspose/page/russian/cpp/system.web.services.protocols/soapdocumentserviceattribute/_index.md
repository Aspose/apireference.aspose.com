---
title: "Класс System::Web::Services::Protocols::SoapDocumentServiceAttribute"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Page для C++"
description: "Класс System::Web::Services::Protocols::SoapDocumentServiceAttribute. Устанавливает формат по умолчанию для SOAP‑запросов и ответов. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 500
url: /ru/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


Устанавливает формат по умолчанию для SOAP‑запросов и ответов. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | Информация RTTI. |
| [get_RoutingStyle](./get_routingstyle/)() | Получает значение, показывающее, как SOAP‑сообщения маршрутизируются к сервису. |
| [get_Use](./get_use/)() | Получает форматирование параметров. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Устанавливает значение, указывающее, инкапсулируются ли параметры в единственном XML‑элементе под элементом 'Body'. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | Устанавливает значение, показывающее, как SOAP‑сообщения маршрутизируются к сервису. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Устанавливает форматирование параметров. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | Создаёт новый экземпляр. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | Создаёт новый экземпляр. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | Создаёт новый экземпляр. |
## См. также

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
