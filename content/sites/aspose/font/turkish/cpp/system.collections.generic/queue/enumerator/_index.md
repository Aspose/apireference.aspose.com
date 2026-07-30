---
title: "System::Collections::Generic::Queue::Enumerator sınıfı"
linktitle: "İteratör"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::Queue::Enumerator sınıfı. Kuyruğu yinelemek için kullanılan Enumerator. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini asla yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1800
url: /tr/cpp/system.collections.generic/queue/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through queue. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<queue_t>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | Belirli bir kuyruğa işaret eden enumerator'ı oluşturur. |
## Ayrıca Bakınız

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Queue](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
