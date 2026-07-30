---
title: "Класс System::Xml::XmlSecureResolver"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Font для C++"
description: "Класс System::Xml::XmlSecureResolver. Помогает защитить другую реализацию XmlResolver, оборачивая объект XmlResolver и ограничивая ресурсы, к которым имеет доступ базовый XmlResolver, в C++."
type: docs
weight: 3600
url: /ru/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


Помогает защитить другую реализацию [XmlResolver](../xmlresolver/), оборачивая объект [XmlResolver](../xmlresolver/) и ограничивая ресурсы, к которым имеет доступ базовый [XmlResolver](../xmlresolver/).

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## Методы

| Метод | Описание |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Отображает URI на объект, содержащий фактический ресурс. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Разрешает абсолютный URI из базового и относительных URI, вызывая **ResolveUri** у базового [XmlResolver](../xmlresolver/). |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Устанавливает учетные данные, используемые для аутентификации веб‑запросов. |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | Инициализирует новый экземпляр класса [XmlSecureResolver](./) с указанными [XmlResolver](../xmlresolver/) и URL. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
