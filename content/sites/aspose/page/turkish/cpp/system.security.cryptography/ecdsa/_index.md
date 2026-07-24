---
title: "System::Security::Cryptography::ECDsa sınıfı"
linktitle: "ECDsa"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::ECDsa sınıfı. ECDsa algoritmasının uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1300
url: /tr/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


[ECDsa](./) algoritmasının uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)() | Varsayılan ECDSA algoritması uygulamasını oluşturur. |
| static [Create](./create/)(const ECCurve\&) | Belirtilen eğri üzerinde yeni oluşturulan anahtar ile varsayılan ECDSA algoritması uygulamasını oluşturur. |
| static [Create](./create/)(const ECParameters\&) | Belirtilen parametreleri kullanarak varsayılan ECDSA algoritması uygulamasını oluşturur. |
| static [Create](./create/)(const String\&) | Belirtilen ECDSA algoritması uygulamasını oluşturur. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Açık parametreleri dışa aktarır. |
| virtual [ExportParameters](./exportparameters/)(bool) | Adlandırılmış veya açık parametreleri dışa aktarır. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Belirtilen eğri için yeni bir genel/özel anahtar çifti oluşturur. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI bilgisi. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Kullanılacak imza algoritmasını alır. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Veri yapısından tüm parametreleri içe aktarır. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen veri dizisinin hash değerini belirtilen hash algoritmasıyla hesaplar ve sonucu imzalar. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Belirtilen veri dizisinin hash değerini belirtilen hash algoritmasıyla hesaplar ve sonucu imzalar. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Belirtilen ikili akışın hash değerini belirtilen hash algoritmasıyla hesaplar ve sonucu imzalar. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | Belirtilen girdi değerinin imzasını hesaplar. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen ikili akışın imzasının geçerli olduğunu doğrular. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | Veri imzasını kontrol eder. |
## Ayrıca Bakınız

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
