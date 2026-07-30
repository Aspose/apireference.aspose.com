---
title: "System::Collections::Generic::ISet sınıfı"
linktitle: "ISet"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::ISet sınıfı. Benzersiz öğeler kümesini içeren bir koleksiyonun arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2700
url: /tr/cpp/system.collections.generic/iset/
---
## ISet class


Benzersiz öğeler kümesini içeren bir koleksiyonun arayüzü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | Öğeler grubunu kaldırır. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | Farklı konteynerde bulunmayan öğeleri kaldırır. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | Geçerli kümenin diğer konteynerin katı bir alt kümesi olup olmadığını denetler. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | Geçerli kümenin diğer konteynerin katı bir üst kümesi olup olmadığını denetler. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | Geçerli kümenin diğer konteynerin alt kümesi olup olmadığını denetler. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | Geçerli kümenin diğer konteynerin üst kümesi olup olmadığını denetler. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | Kümenin diğer konteynerle çakışıp çakışmadığını denetler. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | Kümenin ve konteynerin aynı öğeleri içerip içermediğini denetler. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | İki konteynerin simetrik farkını hesaplar. Her iki konteynerde de bulunan tüm öğeleri kaldırır, ancak aynı zamanda **other** içinde bulunan ancak geçerli kümede olmayan tüm öğeleri ekler. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | Henüz geçerli kümede bulunmayan, belirtilen koleksiyondan öğeleri ekler. |
| virtual [~ISet](./~iset/)() | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | RTTI bilgisi. |

## Ayrıca Bakınız

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
