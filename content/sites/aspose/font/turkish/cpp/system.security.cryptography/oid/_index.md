---
title: "System::Security::Cryptography::Oid class"
linktitle: "Oid"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::Oid sınıfı. Kriptografik nesne tanımlayıcısı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 2500
url: /tr/cpp/system.security.cryptography/oid/
---
## Oid class


Kriptografik nesne tanımlayıcısı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class Oid : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Belirtilen OID kullanıcı dostu adından OID nesnesi oluştur. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Belirtilen OID değerinden OID nesnesi oluştur. |
| [get_FriendlyName](./get_friendlyname/)() const | Nesnenin kullanıcı dostu adını alır. |
| [get_Value](./get_value/)() const | Nesne tanımlayıcı dizesini alır. |
| [Oid](./oid/)() | RTTI bilgisi. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | Kopya yapıcı. |
| [Oid](./oid/)(const String\&) | Yapıcı. |
| [Oid](./oid/)(const String\&, const String\&) | Yapıcı. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Nesnenin kullanıcı dostu adını ayarlar. |
| [set_Value](./set_value/)(const String\&) | Nesne tanımlayıcı dizesini ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
