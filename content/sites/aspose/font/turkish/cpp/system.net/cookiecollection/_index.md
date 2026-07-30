---
title: "System::Net::CookieCollection class"
linktitle: "CookieCollection"
second_title: "Aspose.Font için C++"
description: "System::Net::CookieCollection class. Sıralanmış çerezlerin bir listesini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve C++'ta fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 200
url: /tr/cpp/system.net/cookiecollection/
---
## CookieCollection class


Sıralanmış çerezlerin bir listesini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| Enum | Açıklama |
| --- | --- |
| [Stamp](./stamp/) | RTTI bilgisi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | Koleksiyona bir çerez ekler. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Belirtilen koleksiyondan çerezleri mevcut koleksiyona ekler. |
| [Clear](./clear/)() override | Koleksiyondaki tüm çerezleri kaldırır. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | Koleksiyonun belirtilen çerezi içerip içermediğini kontrol eder. |
| [CookieCollection](./cookiecollection/)() | Yeni bir örnek oluşturur. |
| [get_Count](./get_count/)() const override | Koleksiyondaki eleman sayısını alır. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | Koleksiyonun, sürümü [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/) ile eşit olmayan bir çerez içerip içermediğini gösteren bir değer döndürür. |
| [GetEnumerator](./getenumerator/)() override | Yineleyiciyi alır. |
| [idx_get](./idx_get/)(int32_t) | Belirtilen indeksteki çerez koleksiyonundan bir çerez döndürür. |
| [idx_get](./idx_get/)(String) | Belirtilen adla çerez koleksiyonundan bir çerez döndürür. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | Belirtilen çerezin indeksini döndürür. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | Belirtilen çerezi koleksiyona ekler. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | Belirtilen çerezi koleksiyondan kaldırır. |
| [RemoveAt](./removeat/)(int32_t) | Belirtilen indeksteki bir çerezi kaldırır. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | Belirtilen senaryoya göre zaman damgasını günceller ve yeni bir değer döndürür. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Ayrıca Bakınız

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
