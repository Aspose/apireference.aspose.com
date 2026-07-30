---
title: "System::Collections::Generic::Stack::Enumerator class"
linktitle: "İteratör"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::Stack::Enumerator class. Yığıt içinde yineleme yapmak için enumeratör. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin bir örneğini yığıt üzerinde ya da operator new kullanarak asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2000
url: /tr/cpp/system.collections.generic/stack/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through stack. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::ReverseEnumerator<stack_t>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | Verilen yığıt üzerinden yineleme yapan enumeratörü oluşturur. |
## Ayrıca Bakınız

* Class [ReverseEnumerator](../../reverseenumerator/)
* Class [Stack](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
