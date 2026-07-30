---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName class"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName sınıfı. X509 sertifikasının ayırt edici adını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


X509 sertifikasının ayırt edici adını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | İsim, bayraklarla belirtilen parametreler kullanılarak çözümlenir. |
| [Format](./format/)(bool) const override | İsmi yazdırma için biçimlendirir. |
| [get_Name](./get_name/)() const | Sertifikanın ayırt edici adını alır. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI bilgisi. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | Yapıcı. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | Yapıcı. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | Kopya yapıcı. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | Yapıcı. |
## Ayrıca Bakınız

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
