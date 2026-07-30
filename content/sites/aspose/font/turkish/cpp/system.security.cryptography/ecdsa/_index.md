---
title: "System::Security::Cryptography::ECDsa sınıfı"
linktitle: "ECDsa"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::ECDsa sınıfı. ECDsa algoritması uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın C++'ta."
type: docs
weight: 1300
url: /tr/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


[ECDsa](./) algoritması uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)() | Varsayılan ECDSA algoritma uygulamasını oluşturur. |
| static [Create](./create/)(const ECCurve\&) | Belirtilen eğri üzerinde yeni oluşturulmuş anahtar ile varsayılan ECDSA algoritma uygulamasını oluşturur. |
| static [Create](./create/)(const ECParameters\&) | Belirtilen parametreleri kullanarak varsayılan ECDSA algoritma uygulamasını oluşturur. |
| static [Create](./create/)(const String\&) | Belirtilen ECDSA algoritma uygulamasını oluşturur. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Açık parametreleri dışa aktarır. |
| virtual [ExportParameters](./exportparameters/)(bool) | Adlandırılmış veya açık parametreleri dışa aktarır. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Belirtilen eğri için yeni bir genel/özel anahtar çifti üretir. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI bilgisi. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Kullanılacak imza algoritmasını alır. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Veri yapısından tüm parametreleri içe aktarır. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen hash algoritması kullanılarak belirtilen veri dizisinin hash değerini hesaplar ve sonucu imzalar. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Belirtilen hash algoritması kullanılarak belirtilen veri dizisinin hash değerini hesaplar ve sonucu imzalar. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Belirtilen hash algoritması kullanılarak belirtilen ikili akışın hash değerini hesaplar ve sonucu imzalar. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | Belirtilen giriş değerinin imzasını hesaplar. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen ikili akışın imzasının geçerli olduğunu doğrular. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | Veri imzasını kontrol eder. |
## Ayrıca Bakınız

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
