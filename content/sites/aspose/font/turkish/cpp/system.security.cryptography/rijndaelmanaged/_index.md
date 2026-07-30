---
title: "System::Security::Cryptography::RijndaelManaged sınıfı"
linktitle: "RijndaelManaged"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RijndaelManaged sınıfı. Yönetilen Rijndael algoritması. Yalnızca None doldurma ile ECB ve CFB modlarını ve None ve Zeros doldurmalarıyla CBC modunu destekler. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) veya operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3100
url: /tr/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


Yönetilen [Rijndael](../rijndael/) algoritması. Yalnızca None doldurma ile ECB ve CFB modlarını ve None ve Zeros doldurmalarıyla CBC modunu destekler. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) veya operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
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

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
