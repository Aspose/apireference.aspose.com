---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "Aspose.Font для C++"
description: "System::Web::Services::Protocols::SoapHeader class. Представляет содержимое SOAP‑заголовка. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента на C++."
type: docs
weight: 600
url: /ru/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


Представляет содержимое SOAP‑заголовка. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class SoapHeader : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Actor](./get_actor/)() | Возвращает URI получателя SOAP‑заголовка при использовании версии SOAP 1.1. |
| [get_DidUnderstand](./get_didunderstand/)() | Возвращает значение, указывающее, правильно ли обработан SOAP‑заголовок. |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | Возвращает значение атрибута 'mustUnderstand' при использовании версии SOAP 1.1. |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | Возвращает значение атрибута 'mustUnderstand' при использовании версии SOAP 1.2. |
| [get_EncodedRelay](./get_encodedrelay/)() | Получает строковое представление значения атрибута 'relay'. |
| [get_MustUnderstand](./get_mustunderstand/)() | Получает значение, указывающее, должен ли заголовок SOAP быть понят. |
| [get_Relay](./get_relay/)() | Получает значение атрибута 'relay'. |
| [get_Role](./get_role/)() | Получает URI получателя заголовка SOAP при использовании версии SOAP 1.2. |
| [set_Actor](./set_actor/)(String) | Устанавливает URI получателя заголовка SOAP при использовании версии SOAP 1.1. |
| [set_DidUnderstand](./set_didunderstand/)(bool) | Устанавливает значение, указывающее, правильно ли обработан заголовок SOAP. |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | Устанавливает значение атрибута 'mustUnderstand' при использовании версии SOAP 1.1. |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | Устанавливает значение атрибута 'mustUnderstand' при использовании версии SOAP 1.2. |
| [set_EncodedRelay](./set_encodedrelay/)(String) | Устанавливает строковое представление значения атрибута 'relay'. |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | Устанавливает значение, указывающее, должен ли заголовок SOAP быть понят. |
| [set_Relay](./set_relay/)(bool) | Устанавливает значение атрибута 'relay'. |
| [set_Role](./set_role/)(String) | Устанавливает URI получателя заголовка SOAP при использовании версии SOAP 1.2. |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | Создаёт новый экземпляр. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
