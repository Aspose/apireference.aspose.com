---
title: "System::Collections::Generic::SimpleEnumerator sınıfı"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::SimpleEnumerator sınıfı. rbegin() ve rend() işlevlerini doğrudan kullanan basit kapsayıcılarda öğeleri tutan yineleyici sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3900
url: /tr/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


rbegin() ve rend() işlevlerini doğrudan kullanan basit kapsayıcılarda öğeleri tutan yineleyici sınıfı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parametre | Açıklama |
| --- | --- |
| Container | İterasyon yapılacak konteyner türü. |
| Element | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi klonlar. |
| [get_Current](./get_current/)() const override | 'current' öğesini alır. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Basit bir yineleyici oluşturur. |

## Ayrıca Bakınız

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
