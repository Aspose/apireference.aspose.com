---
title: "System::Security::Cryptography::DSA sınıfı"
linktitle: "DSA"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::DSA sınıfı. DSA algoritması uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve C++'da fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 900
url: /tr/cpp/system.security.cryptography/dsa/
---
## DSA class


[DSA](./) algoritması uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

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
| [FromXmlString](./fromxmlstring/)(String) override | XML kodlu parametreleri kullanarak nesneyi başlatır. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | Veri yapısından tüm parametreleri içe aktarır. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen veri dizisinin hash değerini belirtilen hash algoritmasıyla hesaplar ve sonucu imzalar. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Belirtilen veri dizisinin hash değerini belirtilen hash algoritmasıyla hesaplar ve sonucu imzalar. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Belirtilen ikili akışın hash değerini belirtilen hash algoritmasıyla hesaplar ve sonucu imzalar. |
| [ToXmlString](./toxmlstring/)(bool) override | Tüm parametreleri XML biçiminde dışa aktarır. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen ikili akışın imzasının geçerli olduğunu doğrular. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | Belirtilen veri için [DSA](./) imzasını doğrular. |
## Ayrıca Bakınız

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
