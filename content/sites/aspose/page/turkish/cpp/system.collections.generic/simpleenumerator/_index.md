---
title: "System::Collections::Generic::SimpleEnumerator sınıfı"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::SimpleEnumerator sınıfı. rbegin() ve rend() işlevlerini kullanarak öğeleri doğrudan tutan basit kapsayıcılar için yineleyici sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt (stack) üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 3900
url: /tr/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


rbegin() ve rend() işlevlerini kullanarak öğeleri doğrudan tutan basit kapsayıcılar için yineleyici sınıfı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parameter | Açıklama |
| --- | --- |
| Kapsayıcı | Üzerinde yineleme yapılacak kapsayıcı türü. |
| Element | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi kopyalar. |
| [get_Current](./get_current/)() const override | 'current' öğesini alır. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Basit yineleyici oluşturur. |

## Ayrıca Bakınız

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
