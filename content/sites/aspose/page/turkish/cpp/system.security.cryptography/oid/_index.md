---
title: "System::Security::Cryptography::Oid class"
linktitle: "Oid"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::Oid sınıfı. Kriptografik nesne tanımlayıcısı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2500
url: /tr/cpp/system.security.cryptography/oid/
---
## Oid class


Kriptografik nesne tanımlayıcısı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Oid : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Belirtilen OID dostane adından OID nesnesi oluşturur. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Belirtilen OID değerinden OID nesnesi oluşturur. |
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
* Library [Aspose.Page for C++](../../)
