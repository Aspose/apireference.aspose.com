---
title: "System::Security::Cryptography::MD5 class"
linktitle: "MD5"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::MD5 sınıfı. MD5 özetleme algoritması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığında veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirin."
type: docs
weight: 2300
url: /tr/cpp/system.security.cryptography/md5/
---
## MD5 class


[MD5](./) hashing algorithm. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class MD5 : public System::Security::Cryptography::HashAlgorithm
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)() | [MD5](./) algoritmasını oluşturur. |
| static [Create](./create/)(const String\&) | [MD5](./) algoritmasını oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ptr](./ptr/) | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
