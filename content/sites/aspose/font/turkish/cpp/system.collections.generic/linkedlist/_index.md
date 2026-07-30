---
title: "System::Collections::Generic::LinkedList sınıfı"
linktitle: "LinkedList"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::LinkedList sınıfı. C++'ta LinkedList ileri bildirim."
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


| Parametre | Açıklama |
| --- | --- |
| T | İçerilen değer türü. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const T\&) override | Liste sonuna **element** ekler. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Liste **node**'dan sonra **element** ekler. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Liste **node**'dan sonra **newNode** ekler. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Liste **node**'dan önce **element** ekler. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Liste **node**'dan önce **newNode** ekler. |
| [AddFirst](./addfirst/)(const T\&) | Liste başına **element** ekler. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Liste başına **newNode** ekler. |
| [AddLast](./addlast/)(const T\&) | Liste sonuna **element** ekler. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Liste sonuna **newNode** ekler. |
| [begin](./begin/)() | Koleksiyonun ilk öğesine yineleyici alır. |
| [begin](./begin/)() const | const nitelikli koleksiyonun ilk öğesine bir yineleyici alır. |
| [cbegin](./cbegin/)() const | Koleksiyonun ilk const-nitelikli öğesine bir yineleyici alır. |
| [cend](./cend/)() const | Koleksiyonun sonundaki mevcut olmayan const-nitelikli bir öğe için yineleyici alır. |
| [Clear](./clear/)() override | Listedeki tüm elemanları siler. |
| [Contains](./contains/)(const T\&) const override | Liste içinde **element** bulunup bulunmadığını kontrol eder. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Konteyner verilerini mevcut dizi elemanlarına kopyalar. |
| [crbegin](./crbegin/)() const | Koleksiyonun son const-nitelikli elemanına (ters sırada ilk) bir ters yineleyici alır. |
| [crend](./crend/)() const | Koleksiyonun başlangıcından önceki mevcut olmayan const-nitelikli bir eleman için ters yineleyici alır. |
| [end](./end/)() | Koleksiyonun sonundaki mevcut olmayan bir öğe için yineleyici alır. |
| [end](./end/)() const | Const-nitelikli koleksiyonun sonundaki mevcut olmayan bir öğe için yineleyici alır. |
| [Find](./find/)(const T\&) const | Listedeki bir **element**'i ileri yönde arar. |
| [FindLast](./findlast/)(const T\&) const | Listedeki bir **element**'i ters yönde arar. |
| [get_Count](./get_count/)() const override | Listedeki eleman sayısını alır. |
| [get_First](./get_first/)() const | Listedeki ilk elemanın işaretçisini alır. |
| [get_Last](./get_last/)() const | Listedeki son elemanın işaretçisini alır. |
| [GetEnumerator](./getenumerator/)() override | Mevcut [LinkedList](./) içinde yinelemek için enumerator alır. |
| [LinkedList](./linkedlist/)() | Boş [LinkedList](./) oluşturur. |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Kopya yapıcı. |
| [rbegin](./rbegin/)() | Koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [rbegin](./rbegin/)() const | Const-nitelikli koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [Remove](./remove/)(const T\&) override | Listeden belirtilen **element**'in ilk oluşumunu kaldırır. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Listeden node'u kaldırır. |
| [RemoveFirst](./removefirst/)() | Listedeki ilk düğümü kaldırır. |
| [RemoveLast](./removelast/)() | Listedeki son düğümü kaldırır. |
| [rend](./rend/)() | Koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [rend](./rend/)() const | Const-nitelikli koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Const iterator türü. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse iterator türü. |
| [iterator](./iterator/) | Iterator türü. |
| [list_t](./list_t/) | Temel veri tipi. |
| [reverse_iterator](./reverse_iterator/) | Reverse iterator türü. |
## Açıklamalar


Bağlantılı liste konteyneri. std::list üzerine bir sarmalayıcı uygular. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.


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
* Library [Aspose.Font for C++](../../)
