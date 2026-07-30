---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter sınıfı"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter sınıfı. Asimetrik imza deformatörleri için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 300
url: /tr/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


Asimetrik imza deformatörleri için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | RTTI bilgisi. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Algoritma ile kullanılacak anahtarı ayarlar. |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Veri üzerindeki imzayı doğrular. |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | Veri üzerindeki imzayı doğrular. Henüz uygulanmadı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
