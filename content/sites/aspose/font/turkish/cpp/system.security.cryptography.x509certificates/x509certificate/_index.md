---
title: "System::Security::Cryptography::X509Certificates::X509Certificate class"
linktitle: "X509Certificate"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate sınıfı. X.509 v.3 sertifikası. Şifreli sertifikalar desteklenmez. Yalnızca X509KeyStorageFlags::DefaultKeySet bayrağı desteklenir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


X.509 v.3 sertifikası. Şifreli sertifikalar desteklenmez. Yalnızca [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) bayrağı desteklenir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | Belirtilen PKCS7 dosyasından sertifika oluşturur. |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | Belirtilen imzalı dosyadan sertifika oluşturur. |
| [Dispose](./dispose/)() override | Hiçbir şey yapmaz. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | İki sertifikayı karşılaştırır. |
| virtual [Export](./export/)(X509ContentType) const | Geçerli nesneyi belirtilen formatı kullanarak bayt dizisine dışa aktarır. IMPLEMENTED DEĞİL. |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | Geçerli nesneyi belirtilen formatı kullanarak bayt dizisine dışa aktarır. IMPLEMENTED DEĞİL. |
| virtual [Export](./export/)(X509ContentType, const String\&) const | Geçerli nesneyi belirtilen formatı kullanarak bayt dizisine dışa aktarır. IMPLEMENTED DEĞİL. |
| [get_Handle](./get_handle/)() const | Microsoft Cryptographic API sertifika bağlamına bir tutamaç alır. |
| [get_Issuer](./get_issuer/)() const | X.509v3 sertifikasını veren sertifika otoritesinin adını alır. |
| [get_Subject](./get_subject/)() const | Sertifikadan konu ayırt edici adını alır. |
| virtual [GetCertHash](./getcerthash/)() const | Geçerli nesne için hash'i bayt dizisi olarak alır. |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | Geçerli nesne için hash'i bayt dizisi olarak alır. |
| virtual [GetCertHashString](./getcerthashstring/)() const | Geçerli nesne için [SHA1](../../system.security.cryptography/sha1/) hash'ini onaltılık dize olarak alır. |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | Geçerli nesne için [SHA1](../../system.security.cryptography/sha1/) hash'ini onaltılık dize olarak alır. |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | Mevcut sertificate'ın geçerli tarihini alır. |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | Mevcut sertificate'ın son kullanım tarihini alır. |
| virtual [GetFormat](./getformat/)() const | Sertifika formatının adını alır. |
| [GetHashCode](./gethashcode/)() const override | Sertifika karma kodunu alır. |
| virtual [GetIssuerName](./getissuername/)() const | Mevcut sertifikayı veren sertifikasyon otoritesinin adını alır. |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | Mevcut sertifika için anahtar bilgisini dize olarak alır. |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | Mevcut sertifika için anahtar bilgisini bayt dizisi olarak alır. |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | Mevcut sertifika için anahtar bilgisini onaltılık dize olarak alır. |
| virtual [GetName](./getname/)() const | Mevcut sertificate'ın verildiği ana kişi witch'in adını alır. |
| virtual [GetPublicKey](./getpublickey/)() const | Sertifikadan genel anahtarı bayt dizisi olarak alır. |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | Sertifikadan genel anahtarı onaltılık dize olarak alır. |
| virtual [GetRawCertData](./getrawcertdata/)() const | Sertifikadan ham veriyi bayt dizisi olarak alır. |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | Sertifikadan ham veriyi onaltılık dize olarak alır. |
| virtual [GetSerialNumber](./getserialnumber/)() const | Sertifikadan seri numarasını bayt dizisi olarak alır. |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | Sertifikadan seri numarasını onaltılık dize olarak alır. |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Belirtilen sertifika dosyasından bilgileri içe aktarır. NOT IMPLEMENTED. |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | Belirtilen sertifika dosyasından bilgileri içe aktarır. NOT IMPLEMENTED. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Belirtilen sertifika verisinden bilgileri içe aktarır. NOT IMPLEMENTED. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Belirtilen sertifika verisinden bilgileri içe aktarır. NOT IMPLEMENTED. |
| virtual [Import](./import/)(const String\&) | Belirtilen sertifika dosyasından bilgileri içe aktarır. NOT IMPLEMENTED. |
| virtual [Import](./import/)(const ByteArrayPtr\&) | Belirtilen sertifika verisinden bilgileri içe aktarır. NOT IMPLEMENTED. |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | Sertifika durumunu sıfırlar. |
| virtual [ToString](./tostring/)(bool) const | Sertifika bilgisini metin biçiminde döndürür. |
| [ToString](./tostring/)() const override | Sertifika bilgisini metin biçiminde döndürür. |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | Yapıcı. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const String\&) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Yapıcı. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Yapıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | İşaretçi türü. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
