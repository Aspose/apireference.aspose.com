---
title: "System::Net::PathList sınıfı"
linktitle: "PathList"
second_title: "Aspose.Page için C++"
description: "System::Net::PathList sınıfı. CookieCollection sınıfı örneklerinin listesini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3000
url: /tr/cpp/system.net/pathlist/
---
## PathList class


[CookieCollection](../cookiecollection/) sınıfı örneklerinin listesini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class PathList : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)() | Yeni bir örnek oluşturur. |
| [get_Count](./get_count/)() const | Öğelerin sayısını döndürür. |
| [get_SyncRoot](./get_syncroot/)() const | Koleksiyonun senkronize edildiği nesneyi döndürür. |
| [GetCookiesCount](./getcookiescount/)() | Tüm koleksiyon öğelerinin çerez sayısını döndürür. |
| [GetEnumerator](./getenumerator/)() | Mevcut koleksiyon için yineleyiciyi döndürür. |
| [idx_get](./idx_get/)(String) | Belirtilen yola göre çerez koleksiyonunu alır. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Belirtilen yola göre çerez koleksiyonunu ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
