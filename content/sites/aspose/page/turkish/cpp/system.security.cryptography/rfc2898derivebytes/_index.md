---
title: "System::Security::Cryptography::Rfc2898DeriveBytes class"
linktitle: "Rfc2898DeriveBytes"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::Rfc2898DeriveBytes sınıfı. Şifre tabanlı anahtar türetmesini, PBKDF2'yi uygular. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tür bir örnek hiçbir zaman yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2900
url: /tr/cpp/system.security.cryptography/rfc2898derivebytes/
---
## Rfc2898DeriveBytes class


Şifre tabanlı anahtar türetmesini, PBKDF2'yi uygular. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Rfc2898DeriveBytes : public System::Security::Cryptography::DeriveBytes
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [GetBytes](./getbytes/)(int32_t) override | Mevcut dizi elemanlarını sahte rastgele anahtar baytlarıyla doldurur. |
| [Reset](./reset/)() override |  |
| [Rfc2898DeriveBytes](./rfc2898derivebytes/)(ArrayPtr\<uint8_t\>, ArrayPtr\<uint8_t\>, int32_t) | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [DeriveBytes](../derivebytes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
