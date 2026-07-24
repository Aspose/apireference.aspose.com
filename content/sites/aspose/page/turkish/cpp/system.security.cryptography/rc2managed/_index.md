---
title: "System::Security::Cryptography::RC2Managed sınıfı"
linktitle: "RC2Managed"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RC2Managed sınıfı. Yönetilen RC2 algoritması. Yalnızca ECB, CFB ve CBC şifreleme modları desteklenir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++ içinde fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2800
url: /tr/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


Yönetilen [RC2](../rc2/) algoritması. Yalnızca ECB, CFB ve CBC şifreleme modları desteklenir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Açık parametrelerle decryptor nesnesi oluşturur. |
| virtual [CreateDecryptor](./createdecryptor/)() | Algoritma nesnesi tarafından tanımlanan parametrelerle decryptor nesnesi oluşturur. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Açık parametrelerle encryptor nesnesi oluşturur. |
| virtual [CreateEncryptor](./createencryptor/)() | Algoritma nesnesi tarafından tanımlanan parametrelerle encryptor nesnesi oluşturur. |
| [GenerateIV](./generateiv/)() override | Rastgele bir başlangıç değeri oluşturur ve bunu algoritmanın iç yapısına kaydeder. |
| [GenerateKey](./generatekey/)() override | Rastgele bir anahtar oluşturur ve bunu algoritmanın iç yapısına kaydeder. |
## Ayrıca Bakınız

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
