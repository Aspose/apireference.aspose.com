---
title: "System::Security::Cryptography::HMACSHA512 sınıfı"
linktitle: "HMACSHA512"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::HMACSHA512 sınıfı. SHA512 hash işlevini kullanan hash tabanlı Mesaj Kimlik Doğrulama Kodu. Kısmen uygulanmıştır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1900
url: /tr/cpp/system.security.cryptography/hmacsha512/
---
## HMACSHA512 class


Hash tabanlı Mesaj [Authentication](../../system.security.authentication/) Kodu, [SHA512](../sha512/) hash işlevini kullanır. Kısmen uygulanmıştır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class HMACSHA512 : public System::Security::Cryptography::HashAlgorithm
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | [HMAC](../hmac/) hesaplar. |
| [HMACSHA512](./hmacsha512/)() | Yapıcı. |
| [HMACSHA512](./hmacsha512/)(const System::ArrayPtr\<uint8_t\>\&) | Yapıcı. |
## Ayrıca Bakınız

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
