---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter sınıfı"
linktitle: "AsymmetricSignatureFormatter"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter sınıfı. Asimetrik imza biçimleyicileri için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


Asimetrik imza biçimleyicileri için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde ya da new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | RTTI bilgisi. |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | Belirtilen hash değeri için imzayı oluşturur. |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Kullanılacak hash algoritmasını ayarlar. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | İmzayı hesaplarken kullanılacak asimetrik algoritmayı ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
