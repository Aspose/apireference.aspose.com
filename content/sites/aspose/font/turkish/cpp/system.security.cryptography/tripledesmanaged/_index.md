---
title: "System::Security::Cryptography::TripleDESManaged sınıfı"
linktitle: "TripleDESManaged"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::TripleDESManaged sınıfı. Yönetilen TripleDES uygulaması. Yalnızca ECB ve CFB modlarını None dolgu ile ve CBC modunu None, Zeros ve PKCS7 dolgularıyla destekler. Bu sınıfın nesneleri yalnızca System::MakeObject() fonksiyonu kullanılarak tahsis edilmelidir. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 5200
url: /tr/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Yönetilen [TripleDES](../tripledes/) uygulaması. Yalnızca ECB ve CFB modlarını None dolgu ile ve CBC modunu None, Zeros ve PKCS7 dolgularıyla destekler. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) fonksiyonu kullanılarak tahsis edilmelidir. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Açık parametrelerle deşifreleyici nesnesi oluşturur. |
| virtual [CreateDecryptor](./createdecryptor/)() | Algoritma nesnesi tarafından tanımlanan parametrelerle deşifreleyici nesnesi oluşturur. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Açık parametrelerle şifreleyici nesnesi oluşturur. |
| virtual [CreateEncryptor](./createencryptor/)() | Algoritma nesnesi tarafından tanımlanan parametrelerle şifreleyici nesnesi oluşturur. |
| [GenerateIV](./generateiv/)() override | Rastgele başlangıç değeri oluşturur ve algoritmanın iç yapısına kaydeder. |
| [GenerateKey](./generatekey/)() override | Rastgele anahtar oluşturur ve algoritmanın iç yapısına kaydeder. |
## Ayrıca Bakınız

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
