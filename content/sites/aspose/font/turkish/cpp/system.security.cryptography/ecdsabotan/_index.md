---
title: "System::Security::Cryptography::ECDsaBotan class"
linktitle: "ECDsaBotan"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::ECDsaBotan sınıfı. Botan biçiminde ECDsa algoritması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1400
url: /tr/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | Yapıcı. Varsayılan parametreleri kullanır. |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | Yapıcı. |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | Yapıcı. |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | Yapıcı. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | Yapıcı. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | Yapıcı. |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | Açık parametreleri dışa aktarır. |
| [ExportParameters](./exportparameters/)(bool) override | Adlandırılmış veya açık parametreleri dışa aktarır. |
| [FromXmlString](./fromxmlstring/)(String) override | Nesneyi XML kodlu parametrelerle başlatır. Henüz uygulanmadı. |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | Nesneyi XML kodlu parametrelerle başlatır. Henüz uygulanmadı. |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | Belirtilen eğri için yeni bir genel/özel anahtar çifti üretir. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | Hash algoritmasını alır. |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | Belirtilen hash algoritması kullanılarak belirtilen veri dizisinin hash değerini hesaplar. |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | Belirtilen hash algoritması kullanılarak belirtilen ikili akışın hash değerini hesaplar. |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | Veri yapısından tüm parametreleri içe aktarır. |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | Hash algoritmasını ayarlar. |
| [set_KeySize](./set_keysize/)(int32_t) override | Anahtar boyutunu ayarlar. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Belirtilen veri dizisinin hash değerini hesaplar ve sonucu imzalar. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Belirtilen veri dizisinin hash değerini hesaplar ve sonucu imzalar. |
| [SignData](./signdata/)(const StreamPtr\&) | Belirtilen ikili akışın hash değerini hesaplar ve sonucu imzalar. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI bilgisi. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI bilgisi. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI bilgisi. |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | Belirtilen giriş değerinin imzasını hesaplar. |
| [ToXmlString](./toxmlstring/)(bool) override | Tüm parametreleri XML formatında dışa aktarır. Henüz uygulanmadı. |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | Tüm parametreleri XML formatında dışa aktarır. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | Belirtilen ikili akışın imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen verinin imzasının geçerli olduğunu doğrular. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Belirtilen ikili akışın imzasının geçerli olduğunu doğrular. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | Veri imzasını kontrol eder. |
## Ayrıca Bakınız

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
