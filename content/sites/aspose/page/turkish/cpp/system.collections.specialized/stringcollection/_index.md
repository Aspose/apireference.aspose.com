---
title: "System::Collections::Specialized::StringCollection sınıfı."
linktitle: "StringCollection"
second_title: "Aspose.Page için C++"
description: "System::Collections::Specialized::StringCollection sınıfı. Dize (string) indeksli listesi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


String'lerin indeksli listesi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const System::String\&) | Değeri listenin sonuna ekler. |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | Elemanları konteynere ekle. |
| [begin](./begin/)() | Konteynerin ilk elemanına bir yineleyici döndürür. Konteyner boşsa, döndürülen yineleyici [end()](./end/) ile eşit olur. |
| [begin](./begin/)() const | Const nitelikli konteynerin ilk elemanına bir yineleyici döndürür. Konteyner boşsa, döndürülen yineleyici [end()](./end/) ile eşit olur. |
| [cbegin](./cbegin/)() const | Konteynerin ilk const-nitelikli elemanına bir yineleyici döndürür. Konteyner boşsa, döndürülen yineleyici [cend()](./cend/) ile eşit olur. |
| [cend](./cend/)() const | Konteynerin son elemanını takiben gelen elemana bir yineleyici döndürür. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [Clear](./clear/)() | Tüm öğeleri siler. |
| [Contains](./contains/)(const System::String\&) const | Belirli bir string'in konteynerde bulunup bulunmadığını kontrol eder. |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | Elemanları mevcut dizi elemanlarına kopyalar. |
| [crbegin](./crbegin/)() const | Ters çevrilmiş konteynerin ilk elemanına bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin son elemanına karşılık gelir. Konteyner boşsa, döndürülen yineleyici [crend()](./crend/) ile eşit olur. |
| [crend](./crend/)() const | Ters çevrilmiş konteynerin son elemanını takiben gelen elemana bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin ilk elemanından önceki elemana karşılık gelir. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [data](./data/)() | Dahili veri yapısı erişicisi. |
| [data](./data/)() const | Dahili veri yapısı erişicisi. |
| [end](./end/)() | Konteynerin son elemanını takiben gelen elemana bir yineleyici döndürür. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [end](./end/)() const | Const-nitelikli konteynerin son elemanını takiben gelen elemana bir yineleyici döndürür. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [get_Count](./get_count/)() const | Koleksiyondaki eleman sayısını alır. |
| [GetEnumerator](./getenumerator/)() override | Mevcut koleksiyon üzerinden yineleme yapan enumeratörü alır. |
| [idx_get](./idx_get/)(int) const | Belirtilen konumdaki değeri alır. |
| [idx_set](./idx_set/)(int, const System::String\&) | Belirtilen konumdaki değeri ayarlar. |
| [IndexOf](./indexof/)(const System::String\&) const | Konteyner içinde belirli bir dizeyi arar. |
| [Insert](./insert/)(int, const System::String\&) | Belirli bir değeri konteynere ekler. |
| [operator[]](./operator[]/)(int) | Erişimci işlev. |
| [rbegin](./rbegin/)() | Ters çevrilmiş konteynerin ilk öğesine bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin son öğesine karşılık gelir. Eğer konteyner boşsa, döndürülen yineleyici [rend()](./rend/) ile eşittir. |
| [rbegin](./rbegin/)() const | Ters çevrilmiş konteynerin ilk öğesine bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin son öğesine karşılık gelir. Eğer konteyner boşsa, döndürülen yineleyici [rend()](./rend/) ile eşittir. |
| [Remove](./remove/)(const System::String\&) | Belirtilen dizenin ilk oluşumunu kaldırır. |
| [RemoveAt](./removeat/)(int) | Belirtilen konumdaki öğeyi kaldırır. |
| [rend](./rend/)() | Ters çevrilmiş konteynerin son elemanını takiben gelen elemana bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin ilk elemanından önceki elemana karşılık gelir. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [rend](./rend/)() const | Ters çevrilmiş konteynerin son elemanını takiben gelen elemana bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin ilk elemanından önceki elemana karşılık gelir. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [StringCollection](./stringcollection/)() | Boş bir dize koleksiyonu oluşturur. |
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
| [reverse_iterator](./reverse_iterator/) | Ters yineleyici türü. |
## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
