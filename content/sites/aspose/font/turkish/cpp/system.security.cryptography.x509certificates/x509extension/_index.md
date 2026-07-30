---
title: "System::Security::Cryptography::X509Certificates::X509Extension sınıfı"
linktitle: "X509Extension"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::X509Certificates::X509Extension sınıfı. X.509 sertifikasıyla ilişkili ek bilgileri tutan uzantı nesnesi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 1200
url: /tr/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


X.509 sertifikasıyla ilişkili ek bilgileri tutan uzantı nesnesi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Uzantı verilerini başka bir nesneden kopyalar. |
| [get_Critical](./get_critical/)() const | Uzantının kritik olup olmadığını denetler. |
| [set_Critical](./set_critical/)(bool) | Uzantının kritik olup olmadığını tanımlar. |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | RTTI bilgisi. |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | Yapıcı. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | Yapıcı. |
## Ayrıca Bakınız

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
