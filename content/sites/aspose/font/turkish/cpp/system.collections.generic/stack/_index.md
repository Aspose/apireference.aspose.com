---
title: "System::Collections::Generic::Stack sınıfı"
linktitle: "Stack"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::Stack sınıfı. C++'da Stack sınıfının ileri bildirimi."
type: docs
weight: 4600
url: /tr/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | Öğeleri yığına ekler. |
| virtual [Clear](./clear/)() | Yığından tüm öğeleri siler. |
| virtual [Contains](./contains/)(const T\&) const | Belirli bir öğenin konteynerde bulunup bulunmadığını kontrol eder; karşılaştırma için == operatörünü kullanır. |
| [data](./data/)() | Dahili veri yapısı erişicisi. |
| [data](./data/)() const | Dahili veri yapısı erişicisi. |
| virtual [get_Count](./get_count/)() const | Yığındaki öğe sayısını alır. |
| [GetEnumerator](./getenumerator/)() override | Mevcut yığını yinelemek için bir enumerator alır. |
| [Peek](./peek/)() | Yığının tepesindeki öğeyi alır, ancak yığında tutar. |
| [Pop](./pop/)() | Yığının tepesindeki öğeyi alır. |
| [Push](./push/)(const T\&) | Yığının tepesindeki öğeyi ekler. |
| [Stack](./stack/)() | Boş bir yığın oluşturur. |
| [Stack](./stack/)(int) | Boş bir yığın oluşturur. |
| [Stack](./stack/)(IEnumerablePtr) | Kopya yapıcı. |
| virtual [ToArray](./toarray/)() | Yığını diziye dönüştürür. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Aynı türde öğeler içeren koleksiyon. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) türü. |
| [stack_t](./stack_t/) | RTTI bilgisi. |
| [ValueType](./valuetype/) | Değer türü. |
## Açıklamalar


[Stack](./) class wrapping std::list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/stack.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &stack)
{
  for (const auto item: stack)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Stack-class örneğini oluştur.
  auto stack = MakeObject<Stack<int>>();

  // Yığını doldur.
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // Yığının son öğesini yazdır. Peek yöntemi, yığından bir öğeyi kaldırmaz.
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // Yığının son öğesini yazdır. Pop yöntemi, yığından bir öğeyi kaldırır.
  std::cout << stack->Pop() << std::endl;
  PrintItems(stack);

  return 0;
}
/*
This code example produces the following output:
3
3 2 1
3
2 1
*/
```

## Ayrıca Bakınız

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
