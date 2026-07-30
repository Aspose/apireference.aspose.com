---
title: "System::Security::Cryptography::Oid класс"
linktitle: "Oid"
second_title: "Aspose.Font для C++"
description: "Класс System::Security::Cryptography::Oid. Криптографический идентификатор объекта. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2500
url: /ru/cpp/system.security.cryptography/oid/
---
## Oid class


Криптографический идентификатор объекта. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Oid : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Создайте объект OID из указанного удобочитаемого имени OID. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Создайте объект OID из указанного значения OID. |
| [get_FriendlyName](./get_friendlyname/)() const | Получает удобочитаемое имя объекта. |
| [get_Value](./get_value/)() const | Получает строку идентификатора объекта. |
| [Oid](./oid/)() | Информация RTTI. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | Конструктор копирования. |
| [Oid](./oid/)(const String\&) | Конструктор. |
| [Oid](./oid/)(const String\&, const String\&) | Конструктор. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Устанавливает удобочитаемое имя объекта. |
| [set_Value](./set_value/)(const String\&) | Устанавливает строку идентификатора объекта. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
