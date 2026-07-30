---
title: "System::Collections::Generic::BaseSet::Enumerator class"
linktitle: "İteratör"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::BaseSet::Enumerator class. Enumerator sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini asla yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçmek için kullanın."
type: docs
weight: 2800
url: /tr/cpp/system.collections.generic/baseset/enumerator/
---
## Enumerator class


[Enumerator](./) class. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<set_t>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | **set** nesnesi üzerinde yineleme yapan enumerator oluşturur. |
## Ayrıca Bakınız

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [BaseSet](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
