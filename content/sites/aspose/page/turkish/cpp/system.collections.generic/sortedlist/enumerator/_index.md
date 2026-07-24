---
title: "System::Collections::Generic::SortedList::Enumerator sınıfı"
linktitle: "Enumerator"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::SortedList::Enumerator sınıfı. Liste içinde yineleme yapmak için sayıcı sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneği yığına (stack) ya da operator new ile oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
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
| [Enumerator](./enumerator/)(const Ptr\&) | Belirli bir sözlükte yineleme yapan sayıcı oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) tip takma adı. |
## Ayrıca Bakınız

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
