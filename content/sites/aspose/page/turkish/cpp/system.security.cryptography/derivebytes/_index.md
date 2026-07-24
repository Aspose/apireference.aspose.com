---
title: "System::Security::Cryptography::DeriveBytes sınıfı"
linktitle: "DeriveBytes"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::DeriveBytes sınıfı. Belirli bir uzunlukta bayt dizileri türeten tüm sınıfların kalıtım aldığı soyut sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin."
type: docs
weight: 800
url: /tr/cpp/system.security.cryptography/derivebytes/
---
## DeriveBytes class


Abstract class from which all classes that derive byte sequences of a specified length inherit. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DeriveBytes : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetBytes](./getbytes/)(int32_t) | RTTI bilgisi. |
| virtual [Reset](./reset/)() |  |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
