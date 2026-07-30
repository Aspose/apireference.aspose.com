---
title: "System::Security::Cryptography::ICspAsymmetricAlgorithm sınıfı"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::ICspAsymmetricAlgorithm sınıfı. Asimetrik algoritma temel sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve C++'da işlevlere argüman olarak bu işaretçiyi geçirin."
type: docs
weight: 2100
url: /tr/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


Asimetrik algoritma temel sınıfı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | Anahtar bilgileri içeren blob'u dışa aktarır. |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | RTTI bilgisi. |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | Veri blob'undan anahtar bilgilerini içe aktarır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
