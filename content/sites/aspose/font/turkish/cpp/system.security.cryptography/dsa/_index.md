---
title: "System::Security::Cryptography::DSA sınıfı"
linktitle: "DSA"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::DSA sınıfı. DSA algoritması uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve C++'da işlevlere argüman olarak bu işaretçiyi geçirin."
type: docs
weight: 900
url: /tr/cpp/system.security.cryptography/dsa/
---
## DSA class


[DSA](./) algoritması uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)() | Varsayılan [DSA](./) algoritma uygulamasını oluşturur. |
| static [Create](./create/)(const String\&) | Varsayılan [DSA](./) algoritma uygulamasını oluşturur. |
| static [Create](./create/)(int32_t) | Belirtilen anahtar boyutuyla varsayılan [DSA](./) algoritma uygulamasını oluşturur. |
| static [Create](./create/)(const DSAParameters\&) | Belirtilen parametrelerle varsayılan [DSA](./) algoritma uygulamasını oluşturur. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Belirtilen XML kodlu parametrelerle varsayılan [DSA](./) algoritma uygulamasını oluşturur. |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | RTTI bilgisi. |
| virtual [ExportParameters](./exportparameters/)(bool) | Tüm parametreleri dışa aktarır. |
| [FromXmlString](./fromxmlstring/)(String) override | Nesneyi XML kodlu parametrelerle başlatır. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | Veri yapısından tüm parametreleri içe aktarır. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen hash algoritması kullanılarak belirtilen veri dizisinin hash değerini hesaplar ve sonucu imzalar. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Belirtilen hash algoritması kullanılarak belirtilen veri dizisinin hash değerini hesaplar ve sonucu imzalar. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Belirtilen hash algoritması kullanılarak belirtilen ikili akışın hash değerini hesaplar ve sonucu imzalar. |
| [ToXmlString](./toxmlstring/)(bool) override | Tüm parametreleri XML formatında dışa aktarır. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen ikili akışın imzasının geçerli olduğunu doğrular. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | Belirtilen veri için [DSA](./) imzasını doğrula. |
## Ayrıca Bakınız

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
