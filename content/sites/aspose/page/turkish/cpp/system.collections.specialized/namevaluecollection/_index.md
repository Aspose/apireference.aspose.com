---
title: "System::Collections::Specialized::NameValueCollection sınıfı"
linktitle: "NameValueCollection"
second_title: "Aspose.Page için C++"
description: "System::Collections::Specialized::NameValueCollection sınıfı. C++'da anahtar veya indeks ile erişilebilen ilişkili String anahtarları ve String değerlerinden oluşan koleksiyon."
type: docs
weight: 200
url: /tr/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


Anahtar veya indeks ile erişilebilen ilişkili [String](../../system/string/) anahtarları ve [String](../../system/string/) değerlerinden oluşan koleksiyon.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const String\&) override | [ICollection](../../system.collections/icollection/) yöntemini geçersiz kıl - uygulanmadı. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | Belirtilen [NameValueCollection](./) içindeki girişleri geçerli olanına kopyalar. |
| virtual [Add](./add/)(const String\&, const String\&) | Belirtilen ad ve değerle bir giriş ekler. |
| [Clear](./clear/)() override | Tüm öğeleri siler. |
| [Contains](./contains/)(const String\&) const override | Öğenin koleksiyonda bulunup bulunmadığını denetler. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | Koleksiyon öğelerini mevcut dizi öğelerine kopyalar. |
| virtual [Get](./get/)(const String\&) | Belirtilen anahtarla ilişkili değerleri alır. |
| virtual [get_AllKeys](./get_allkeys/)() | Tüm anahtarları alır. |
| [get_Count](./get_count/)() const override | Anahtar/değer çiftlerinin sayısını alır. |
| virtual [get_Keys](./get_keys/)() | Tüm anahtarları alır. |
| [GetEnumerator](./getenumerator/)() override | Koleksiyon içinde yineleme yapmak için enumeratörü alır. |
| virtual [GetValues](./getvalues/)(const String\&) | Belirtilen anahtarla ilişkili değerleri alır. |
| [HasKeys](./haskeys/)() | [NameValueCollection](./) içinde null olmayan anahtarların bulunup bulunmadığını gösteren bir değeri alır. |
| [idx_get](./idx_get/)(const String\&) | Belirtilen indeksteki değeri alır. |
| [idx_set](./idx_set/)(const String\&, const String\&) | Bir girdinin değerini ayarlar. |
| [NameValueCollection](./namevaluecollection/)() | Boş olan [NameValueCollection](./) sınıfının yeni bir örneğini başlatır. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | Belirtilen [NameValueCollection](./) içindeki girdileri yeni bir [NameValueCollection](./) içine kopyalar. |
| [Remove](./remove/)(const String\&) override | Belirli öğeyi kaldırır. |
| virtual [Set](./set/)(const String\&, const String\&) | Bir girdinin değerini ayarlar. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Ayrıca Bakınız

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
