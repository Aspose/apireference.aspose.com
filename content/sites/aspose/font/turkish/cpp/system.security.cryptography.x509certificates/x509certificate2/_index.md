---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 sınıf"
linktitle: "X509Certificate2"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 sınıf. X509 sertifikasını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün bir örneğini yığıt üzerinde ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 400
url: /tr/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


X509 sertifikasını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün bir örneğini yığıt üzerinde ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Archived](./get_archived/)() const | Sertifikanın arşivlenmiş olduğunu gösteren bir değer alır. |
| [get_Extensions](./get_extensions/)() const | Sertifikayla ilişkili uzantı nesnelerinin koleksiyonunu alır. |
| [get_FriendlyName](./get_friendlyname/)() const | Sertifikanın dostça adını alır. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | Sertifikanın özel anahtarı olup olmadığını denetler. |
| [get_IssuerName](./get_issuername/)() const | Sertifikayı veren tarafın adını alır. |
| [get_NotAfter](./get_notafter/)() const | Sertifikanın artık geçerli olmadığı yerel tarih ve saati alır. |
| [get_NotBefore](./get_notbefore/)() const | Sertifikanın geçerli olduğu yerel tarih ve saati alır. |
| [get_PrivateKey](./get_privatekey/)() const | Sertifikayla ilişkili özel anahtarı alır. |
| [get_PublicKey](./get_publickey/)() const | Bir sertifikanın [PublicKey](../publickey/) nesnesini alır. |
| [get_RawData](./get_rawdata/)() const | Sertifikanın ham verisini alır. |
| [get_SerialNumber](./get_serialnumber/)() const | Bir sertifikanın seri numarasını alır. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | Sertifikanın imzasını oluşturmak için kullanılan algoritmayı alır. |
| [get_SubjectName](./get_subjectname/)() const | Bir sertifikadan konu adını alır. |
| [get_Thumbprint](./get_thumbprint/)() const | Sertifikanın parmak izini alır. |
| [get_Version](./get_version/)() const | Sertifika format sürümünü alır. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | Belirtilen bayt dizisinde bulunan sertifika türünü alır. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | Belirtilen dosyada bulunan sertifika türünü alır. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | [RSA](../../system.security.cryptography/rsa/) özel anahtarını alır. |
| [GetDSAPublicKey](./getdsapublickey/)() const | [RSA](../../system.security.cryptography/rsa/) genel anahtarını alır. |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | [RSA](../../system.security.cryptography/rsa/) özel anahtarını alır. |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | [RSA](../../system.security.cryptography/rsa/) genel anahtarını alır. |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | Sertifikadan konu ya da yayıncı adını alır. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | [RSA](../../system.security.cryptography/rsa/) özel anahtarını alır. |
| [GetRSAPublicKey](./getrsapublickey/)() const | [RSA](../../system.security.cryptography/rsa/) genel anahtarını alır. |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Belirtilen sertifika dosyasından bilgileri içe aktarır. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | Belirtilen sertifika dosyasından bilgileri içe aktarır. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Belirtilen sertifika verisinden bilgileri içe aktarır. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | Belirtilen sertifika verisinden bilgileri içe aktarır. |
| [Import](./import/)(const String\&) override | Belirtilen sertifika dosyasından bilgileri içe aktarır. |
| [Import](./import/)(const ByteArrayPtr\&) override | Belirtilen sertifika verisinden bilgileri içe aktarır. |
| [Reset](./reset/)() override | Sertifika durumunu sıfırlar. |
| [set_Archived](./set_archived/)(bool) const | Sertifikanın arşivlendiğini gösteren bir değeri ayarlar. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Sertifikanın dostça adını ayarlar. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | Sertifikayla ilişkili özel anahtarı ayarlar veya temizler. |
| [ToString](./tostring/)(bool) const override | Sertifika bilgisini metin biçiminde döndürür. |
| [ToString](./tostring/)() const override | Sertifika bilgisini metin biçiminde döndürür. |
| [Verify](./verify/)() const | Sertifika zincirini doğrular. |
| [X509Certificate2](./x509certificate2/)() | Boş bir [X509Certificate2](./) oluşturur. |
| [X509Certificate2](./x509certificate2/)(const String\&) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Yapıcı. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Yapıcı. |
## Ayrıca Bakınız

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
