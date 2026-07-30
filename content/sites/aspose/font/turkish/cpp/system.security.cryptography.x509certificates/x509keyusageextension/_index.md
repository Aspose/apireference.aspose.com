---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension sınıfı"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension sınıfı. Bir anahtarın kullanımına ilişkin ek bilgileri tutan uzantı nesnesi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 1600
url: /tr/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Bir anahtarın kullanımına ilişkin ek bilgileri tutan uzantı nesnesi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Uzantı verilerini başka bir nesneden kopyalar. |
| [get_KeyUsages](./get_keyusages/)() | Anahtar kullanımını alır. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | RTTI bilgisi. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Yapıcı. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Yapıcı. |
## Ayrıca Bakınız

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
