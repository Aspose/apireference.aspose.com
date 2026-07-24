---
title: "System::Collections::Generic::LinkedList sınıfı"
linktitle: "LinkedList"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::LinkedList sınıfı. C++'ta LinkedList ileri bildirimidir."
type: docs
weight: 3100
url: /tr/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| Parameter | Açıklama |
| --- | --- |
| T | İçerilen değer türü. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const T\&) override | Liste sonuna **element** ekler. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Liste içinde **node**'dan sonra **element** ekler. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Liste içinde **node**'dan sonra **newNode** ekler. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Liste içinde **node**'dan önce **element** ekler. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Liste içinde **node**'dan önce **newNode** ekler. |
| [AddFirst](./addfirst/)(const T\&) | Liste başına **element** ekler. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Liste başına **newNode** ekler. |
| [AddLast](./addlast/)(const T\&) | Liste sonuna **element** ekler. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Liste sonuna **newNode** ekler. |
| [begin](./begin/)() | Koleksiyonun ilk öğesine bir yineleyici alır. |
| [begin](./begin/)() const | Sabit nitelikli koleksiyonun ilk elemanına bir yineleyici (iterator) alır. |
| [cbegin](./cbegin/)() const | Koleksiyonun ilk const-nitelikli öğesine yineleyici alır. |
| [cend](./cend/)() const | Koleksiyonun sonundan sonraki mevcut olmayan const-nitelikli öğe için yineleyici alır. |
| [Clear](./clear/)() override | Listedeki tüm öğeleri siler. |
| [Contains](./contains/)(const T\&) const override | **element** öğesinin listede bulunup bulunmadığını kontrol eder. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Konteyner verilerini mevcut dizi öğelerine kopyalar. |
| [crbegin](./crbegin/)() const | Koleksiyonun son const nitelikli öğesine (ters yönde ilk) ters bir yineleyici al. |
| [crend](./crend/)() const | Koleksiyonun başlangıcından önceki var olmayan const nitelikli öğe için ters bir yineleyici al. |
| [end](./end/)() | Koleksiyonun sonundan sonraki mevcut olmayan öğe için yineleyici alır. |
| [end](./end/)() const | Const-nitelikli koleksiyonun sonundan sonraki mevcut olmayan öğe için yineleyici alır. |
| [Find](./find/)(const T\&) const | Listede bir **element** öğesini ileri yönde arar. |
| [FindLast](./findlast/)(const T\&) const | Listede bir **element** öğesini ters yönde arar. |
| [get_Count](./get_count/)() const override | Listedeki öğe sayısını alır. |
| [get_First](./get_first/)() const | Listede ilk öğeye işaretçiyi alır. |
| [get_Last](./get_last/)() const | Listede son öğeye işaretçiyi alır. |
| [GetEnumerator](./getenumerator/)() override | Mevcut [LinkedList](./) üzerinden yineleme yapmak için bir enumerator alır. |
| [LinkedList](./linkedlist/)() | Boş bir [LinkedList](./) oluşturur. |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Kopya yapıcı. |
| [rbegin](./rbegin/)() | Koleksiyonun son öğesine (ters yönde ilk) bir ters yineleyici alır. |
| [rbegin](./rbegin/)() const | Const nitelikli koleksiyonun son öğesine (ters yönde ilk) bir ters yineleyici alır. |
| [Remove](./remove/)(const T\&) override | Belirtilen **element** öğesinin listeden ilk oluşumunu kaldırır. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Düğümü listeden kaldırır. |
| [RemoveFirst](./removefirst/)() | Listeden ilk düğümü kaldırır. |
| [RemoveLast](./removelast/)() | Listeden son düğümü kaldırır. |
| [rend](./rend/)() | Koleksiyonun başlangıcından önceki mevcut olmayan bir öğe için ters yineleyici alır. |
| [rend](./rend/)() const | Const nitelikli koleksiyonun başlangıcından önceki mevcut olmayan bir öğe için ters yineleyici alır. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Sabit yineleyici türü. |
| [const_reverse_iterator](./const_reverse_iterator/) | Sabit ters yineleyici türü. |
| [iterator](./iterator/) | Yineleyici türü. |
| [list_t](./list_t/) | Temel veri tipi. |
| [reverse_iterator](./reverse_iterator/) | Ters yineleyici türü. |
## Açıklamalar


Bağlantılı liste konteyneri. std::list üzerinde bir sarmalayıcı uygular. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tip bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // LinkedList sınıfının bir örneğini oluştur.
  auto list = MakeObject<LinkedList<int>>();

  // Bağlantılı listeyi doldur.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // Bağlantılı listedeki öğeleri yazdır.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
