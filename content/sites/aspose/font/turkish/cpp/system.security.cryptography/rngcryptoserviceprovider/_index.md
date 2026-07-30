---
title: "System::Security::Cryptography::RNGCryptoServiceProvider class"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RNGCryptoServiceProvider sınıfı. CSP kavramına uyan rastgele sayı üreteci. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığında veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirin."
type: docs
weight: 3300
url: /tr/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


CSP kavramına uyan rastgele sayı üreteci. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığında veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | Mevcut dizi öğelerini rastgele baytlarla doldurur. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | Mevcut dizi görünümü öğelerini rastgele baytlarla doldurur. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | Mevcut dizi öğelerini sıfır olmayan rastgele baytlarla doldurur. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | Mevcut dizi görünümü öğelerini sıfır olmayan rastgele baytlarla doldurur. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | Yapıcı. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
