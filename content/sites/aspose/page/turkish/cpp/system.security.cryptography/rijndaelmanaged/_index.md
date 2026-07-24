---
title: "System::Security::Cryptography::RijndaelManaged class"
linktitle: "RijndaelManaged"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RijndaelManaged sınıfı. Yönetilen Rijndael algoritması. Yalnızca None dolgu ile ECB ve CFB modlarını ve None ve Zeros dolgularıyla CBC modunu destekler. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3100
url: /tr/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


Yönetilen [Rijndael](../rijndael/) algoritması. Yalnızca None dolgu ile ECB ve CFB modlarını ve None ve Zeros dolgularıyla CBC modunu destekler. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
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

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
