---
title: "System::Security::Cryptography::RSACryptoServiceProvider sınıfı"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider sınıfı. CSP biçiminde RSA algoritması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) veya operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3500
url: /tr/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | Mesajı çözer. Henüz uygulanmadı. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Belirtilen dolgu (padding) modunu kullanarak giriş verisini çözer. |
| [Dispose](./dispose/)() override | Nesneyle ilişkili verileri serbest bırakır. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | Mesajı şifreler. Henüz uygulanmadı. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Belirtilen dolgu (padding) modunu kullanarak giriş verisini şifreler. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Anahtar bilgilerini içeren blob'u dışa aktarır. Henüz uygulanmadı. |
| [ExportParameters](./exportparameters/)(bool) override | CSP parametrelerini dışa aktarır. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | [CspKeyContainerInfo](../cspkeycontainerinfo/) nesnesini alır. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Nesneyle ilişkili anahtar değişim algoritmasını kontrol eder. |
| [get_KeySize](./get_keysize/)() override | Algoritma tarafından kullanılan anahtar boyutunu alır. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Anahtarın CSP nesnesinde kalıcı olup olmadığını kontrol eder. |
| [get_PublicOnly](./get_publiconly/)() const | CSP nesnesinde yalnızca açık anahtarın bulunup bulunmadığını kontrol eder. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | CSP nesnesiyle ilişkili imza algoritmasını alır. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Anahtarın kullanıcı deposu yerine makine deposunda kalıcı olup olmadığını kontrol eder. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Anahtar bilgilerini içeren blob'u içe aktarır. Henüz uygulanmadı. |
| [ImportParameters](./importparameters/)(RSAParameters) override | CSP parametrelerini içe aktarır. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | RTTI bilgisi. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Yapıcı. Henüz uygulanmadı. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | Yapıcı. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | Yapıcı. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Yapıcı. Henüz uygulanmadı. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Anahtarın CSP nesnesinde kalıcı olup olmadığını tanımlar. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Anahtarın kullanıcı deposu yerine makine deposunda kalıcı olup olmadığını tanımlar. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | Belirtilen giriş değerinin imzasını hesaplar. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | Belirtilen giriş değerinin imzasını hesaplar. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | Belirtilen giriş değerinin imzasını hesaplar. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | Belirtilen hash değeri için imzayı hesaplar. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Belirtilen giriş değerinin imzasını hesaplar. Henüz uygulanmadı. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | Veri imzasını kontrol eder. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Veri imzasını kontrol eder. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | Belirtilen hash'in imzasının geçerli olduğunu doğrular. |
## Ayrıca Bakınız

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
