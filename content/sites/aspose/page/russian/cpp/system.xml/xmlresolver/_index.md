---
title: "System::Xml::XmlResolver класс"
linktitle: "XmlResolver"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlResolver класс. Разрешает внешние XML‑ресурсы, указанные Универсальным Идентификатором Ресурса (URI) в C++."
type: docs
weight: 3500
url: /ru/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Разрешает внешние XML‑ресурсы, указанные унифицированным идентификатором ресурса (URI).

```cpp
class XmlResolver : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | Когда переопределяется в производном классе, сопоставляет URI с объектом, содержащим фактический ресурс. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | Когда переопределяется в производном классе, разрешает абсолютный URI из базового и относительных URI. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | Когда переопределяется в производном классе, задаёт учётные данные, используемые для аутентификации веб‑запросов. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | Позволяет разрешателю возвращать типы, отличные от Stream. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
