---
title: "System::Security::Cryptography::RSA class"
linktitle: "RSA"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSA sınıfı. RSA algoritması uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3400
url: /tr/cpp/system.security.cryptography/rsa/
---
## RSA class


RSA algoritması uygulamaları için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)() | Varsayılan [RSA](./) algoritma uygulamasını oluşturur. |
| static [Create](./create/)(const String\&) | Varsayılan [RSA](./) algoritma uygulamasını oluşturur. |
| static [Create](./create/)(int32_t) | Belirtilen anahtar boyutuyla varsayılan [RSA](./) algoritma uygulamasını oluşturur. |
| static [Create](./create/)(const RSAParameters\&) | Belirtilen parametrelerle varsayılan [RSA](./) algoritma uygulamasını oluşturur. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Belirtilen XML kodlu parametrelerle varsayılan [RSA](./) algoritma uygulamasını oluşturur. |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Belirtilen dolgu modunu kullanarak girdi verilerini çözer. |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | Özel anahtarı kullanarak değeri çözer. |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Belirtilen dolgu modunu kullanarak girdi verilerini şifreler. |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | Özel anahtarı kullanarak değeri şifreler. |
| virtual [ExportParameters](./exportparameters/)(bool) | Tüm parametreleri dışa aktarır. |
| [FromXmlString](./fromxmlstring/)(String) override | XML kodlu parametreleri kullanarak nesneyi başlatır. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI bilgisi. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | CSP nesnesiyle ilişkili imza algoritmasını alır. |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | Veri yapısından tüm parametreleri içe aktarır. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Belirtilen veri dizisinin hash değerini belirtilen hash algoritması ve dolgu kullanarak hesaplar ve sonucu imzalar. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Belirtilen veri dizisinin hash değerini belirtilen hash algoritması ve dolgu kullanarak hesaplar ve sonucu imzalar. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Belirtilen ikili akışın hash değerini belirtilen hash algoritması ve dolgu kullanarak hesaplar ve sonucu imzalar. |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | Belirtilen hash değeri için imzayı hesaplar. |
| [ToXmlString](./toxmlstring/)(bool) override | Tüm parametreleri XML biçiminde dışa aktarır. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Belirtilen ikili akışın imzasının geçerli olduğunu doğrular. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | Belirtilen hash'in imzasının geçerli olduğunu doğrular. |
## Ayrıca Bakınız

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
