---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter sınıfı"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter sınıfı. Verileri RSA PKCS # 1 v1.5 imzası ile imzalar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3800
url: /tr/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


Verileri [RSA](../rsa/) PKCS # 1 v1.5 imzası ile imzalar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | Verileri imzalar. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | RTTI bilgisi. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Yapıcı. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Kullanılacak hash algoritmasını ayarlar. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Anahtar değerini ayarlar. Henüz uygulanmadı. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
