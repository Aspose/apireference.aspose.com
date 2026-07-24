---
title: "System::Collections::Generic::ISet sınıfı"
linktitle: "ISet"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::ISet sınıfı. Benzersiz öğeler kümesini içeren bir koleksiyonun arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2700
url: /tr/cpp/system.collections.generic/iset/
---
## ISet class


Tekil öğeler kümesini içeren bir koleksiyonun arayüzü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | Öğeler grubunu kaldırır. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | Farklı bir kapsayıcıda bulunmayan öğeleri kaldırır. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | Mevcut kümenin diğer kapsayıcının katı alt kümesi olup olmadığını kontrol eder. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | Mevcut kümenin diğer kapsayıcının katı üst kümesi olup olmadığını kontrol eder. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | Mevcut kümenin diğer kapsayıcının alt kümesi olup olmadığını kontrol eder. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | Mevcut kümenin diğer kapsayıcının üst kümesi olup olmadığını kontrol eder. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | Kümenin diğer kapsayıcıyla kesişip kesişmediğini kontrol eder. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | Kümenin ve kapsayıcının aynı öğeleri içerip içermediğini kontrol eder. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | İki kapsayıcının simetrik farkını hesaplar. Her iki kapsayıcıda da bulunan tüm öğeleri kaldırır, ancak aynı zamanda **other** içinde bulunan ve mevcut kümede bulunmayan tüm öğeleri ekler. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | Belirtilen koleksiyondan, henüz mevcut kümede bulunmayan öğeleri ekler. |
| virtual [~ISet](./~iset/)() | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | RTTI bilgisi. |

## Ayrıca Bakınız

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
