---
title: "System::Security::Cryptography::X509Certificates::PublicKey sınıfı"
linktitle: "PublicKey"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::X509Certificates::PublicKey sınıfı. Bir X509 sertifikasının genel anahtar bilgilerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


Bir X509 sertifikasının genel anahtar bilgilerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class PublicKey : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | ASN.1 kodlu genel anahtar değerini alır. |
| [get_EncodedParameters](./get_encodedparameters/)() const | ASN.1 kodlu genel anahtar parametrelerini alır. |
| [get_Key](./get_key/)() const | Bir [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) veya [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/) alır. |
| [get_Oid](./get_oid/)() const | Genel anahtarın tanımlayıcısını (OID) alır. |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | Yapıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
