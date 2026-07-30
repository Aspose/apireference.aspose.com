---
title: "System::Collections::Generic::Dictionary::Enumerator sınıfı"
linktitle: "İteratör"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::Dictionary::Enumerator sınıfı. Sözlüğün üzerinden yineleme yapmayı sağlayan bir enumerator. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini asla yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1000
url: /tr/cpp/system.collections.generic/dictionary/enumerator/
---
## Enumerator class


[Enumerator](./) that allows iterating through the dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | RTTI bilgisi. |
| [Enumerator](./enumerator/)(Ptr) | Sayacı oluşturur. |
## Ayrıca Bakınız

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
