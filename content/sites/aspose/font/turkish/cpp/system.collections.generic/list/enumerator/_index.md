---
title: "System::Collections::Generic::List::Enumerator sınıfı"
linktitle: "İteratör"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::List::Enumerator sınıfı. Liste öğeleri üzerinde yineleme yapmak için kullanılan bir enumeratördür. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 6100
url: /tr/cpp/system.collections.generic/list/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through list elements. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<vector_t>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | Belirli bir liste üzerinde yineleme yapan enumeratör oluşturur. |
## Ayrıca Bakınız

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
