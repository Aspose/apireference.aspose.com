---
title: "System::Collections::Generic::SortedDictionary::Enumerator sınıfı"
linktitle: "İteratör"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::SortedDictionary::Enumerator sınıfı. Sözlüğü yinelemek için kullanılan Enumerator türü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneği yığına (stack) ya da operator new ile asla oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr göstericisine sarın ve bu göstericiyi C++'ta işlevlere argüman olarak geçmek için kullanın."
type: docs
weight: 2100
url: /tr/cpp/system.collections.generic/sorteddictionary/enumerator/
---
## Enumerator class


[Enumerator](./) type to iterate through dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Belirli bir sözlük üzerinde yineleyici oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) tip takma adı. |
## Ayrıca Bakınız

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
