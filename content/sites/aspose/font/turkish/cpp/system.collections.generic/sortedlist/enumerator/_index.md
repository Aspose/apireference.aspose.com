---
title: "System::Collections::Generic::SortedList::Enumerator sınıfı"
linktitle: "İteratör"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::SortedList::Enumerator sınıfı. Liste üzerinden yineleme yapmak için Enumerator sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini asla yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2600
url: /tr/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Belirli bir sözlük üzerinden yineleme yapan enumerator oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) tip takma adı. |
## Ayrıca Bakınız

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
