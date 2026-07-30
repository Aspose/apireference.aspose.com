---
title: "Класс System::Web::Services::WebServiceBindingAttribute"
linktitle: "WebServiceBindingAttribute"
second_title: "Aspose.Font для C++"
description: "Класс System::Web::Services::WebServiceBindingAttribute. Используется для объявления привязки, определяющей один или несколько методов XML Web сервиса. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 400
url: /ru/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


Используется для объявления привязки, определяющей один или несколько методов XML [Web](../../system.web/) сервиса. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | Возвращает спецификацию WSI. |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | Возвращает значение, указывающее, отправляет ли привязка заявления о соответствии. |
| [get_Location](./get_location/)() | Информация RTTI. |
| [get_Name](./get_name/)() | Возвращает имя привязки. |
| [get_Namespace](./get_namespace/)() | Возвращает пространство имён, связанное с привязкой. |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | Устанавливает спецификацию WSI. |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | Устанавливает значение, указывающее, отправляет ли привязка заявления о соответствии. |
| [set_Location](./set_location/)(String) | Устанавливает расположение, где определена привязка. |
| [set_Name](./set_name/)(String) | Устанавливает имя привязки. |
| [set_Namespace](./set_namespace/)(String) | Устанавливает пространство имён, связанное с привязкой. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | Создаёт новый экземпляр. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | Создаёт новый экземпляр. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | Создаёт новый экземпляр. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | Создаёт новый экземпляр. |
## См. также

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Font for C++](../../)
