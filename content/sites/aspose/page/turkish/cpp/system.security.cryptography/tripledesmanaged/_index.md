---
title: "System::Security::Cryptography::TripleDESManaged sınıfı"
linktitle: "TripleDESManaged"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::TripleDESManaged sınıfı. Yönetilen TripleDES uygulaması. Yalnızca None dolgu ile ECB ve CFB modlarını ve None, Zeros ve PKCS7 dolgularıyla CBC modunu destekler. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 5200
url: /tr/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Yönetilen [TripleDES](../tripledes/) uygulaması. Yalnızca None dolgusu ile ECB ve CFB modlarını ve None, Zeros ve PKCS7 dolgularıyla CBC modunu destekler. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
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

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
