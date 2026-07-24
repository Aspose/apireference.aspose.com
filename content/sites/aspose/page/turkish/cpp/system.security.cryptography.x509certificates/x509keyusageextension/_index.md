---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension sınıfı"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension sınıfı. Bir anahtarın kullanımına ilişkin ek bilgileri tutmak için uzantı nesnesi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için C++ içinde kullanın."
type: docs
weight: 1600
url: /tr/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Bir anahtarın kullanımına ilişkin ek bilgileri tutmak için uzantı nesnesi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Uzantı verilerini diğer nesneden kopyalar. |
| [get_KeyUsages](./get_keyusages/)() | Anahtar kullanımını alır. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | RTTI bilgisi. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Yapıcı. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Yapıcı. |
## Ayrıca Bakınız

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
