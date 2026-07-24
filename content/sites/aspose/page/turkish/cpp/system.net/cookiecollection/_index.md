---
title: "System::Net::CookieCollection sınıfı"
linktitle: "CookieCollection"
second_title: "Aspose.Page için C++"
description: "System::Net::CookieCollection sınıfı. Sıralı çerezlerin bir listesini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.net/cookiecollection/
---
## CookieCollection class


Sıralı çerezlerin bir listesini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

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
| [Clear](./clear/)() override | Koleksiyondan tüm çerezleri kaldırır. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | Koleksiyonun belirtilen çerezi içerip içermediğini denetler. |
| [CookieCollection](./cookiecollection/)() | Yeni bir örnek oluşturur. |
| [get_Count](./get_count/)() const override | Koleksiyondaki eleman sayısını alır. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | Koleksiyonun, [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/) değerine eşit olmayan bir sürüme sahip çerez içerip içermediğini gösteren bir değeri döndürür. |
| [GetEnumerator](./getenumerator/)() override | İteratörü alır. |
| [idx_get](./idx_get/)(int32_t) | Belirtilen indeksteki çerez koleksiyonundan bir çerez döndürür. |
| [idx_get](./idx_get/)(String) | Belirtilen ada göre çerez koleksiyonundan bir çerez döndürür. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | Belirtilen çerezin bir dizinini döndürür. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | Belirtilen çerezi koleksiyona ekler. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | Belirtilen çerezi koleksiyondan kaldırır. |
| [RemoveAt](./removeat/)(int32_t) | Belirtilen dizindeki çerezi kaldırır. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | Belirtilen senaryoya göre zaman damgasını günceller ve yeni bir değer döndürür. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Ayrıca Bakınız

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
