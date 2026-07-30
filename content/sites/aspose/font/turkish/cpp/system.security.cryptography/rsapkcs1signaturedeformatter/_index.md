---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter sınıfı"
linktitle: "RSAPKCS1SignatureDeformatter"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter sınıfı. RSA PKCS # 1 v1.5 imzasını doğrulamak için sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3700
url: /tr/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/
---
## RSAPKCS1SignatureDeformatter class


[RSA](../rsa/) PKCS # 1 v1.5 imzasını doğrulamak için sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class RSAPKCS1SignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)() | RTTI bilgisi. |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Yapıcı. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Kullanılacak hash algoritmasını ayarlar. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Anahtar değerini ayarlar. Henüz uygulanmadı. |
| [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Veri karmasının imzasını doğrular. |
## Ayrıca Bakınız

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
