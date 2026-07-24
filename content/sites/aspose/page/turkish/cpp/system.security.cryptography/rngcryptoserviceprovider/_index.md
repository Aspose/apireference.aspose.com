---
title: "System::Security::Cryptography::RNGCryptoServiceProvider sınıfı"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RNGCryptoServiceProvider sınıfı. CSP kavramına uyan rastgele sayı üreteci. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3300
url: /tr/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


Rastgele sayı üreteci CSP kavramına uyar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | Mevcut dizi elemanlarını rastgele baytlarla doldurur. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | Mevcut dizi görünümü elemanlarını rastgele baytlarla doldurur. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | Mevcut dizi elemanlarını sıfır olmayan rastgele baytlarla doldurur. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | Mevcut dizi görünümü elemanlarını sıfır olmayan rastgele baytlarla doldurur. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | Yapıcı. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
