---
title: "Aspose::Page::EPS::XMP::XmpMetadata sınıfı"
linktitle: "XmpMetadata"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata sınıfı. C++'ta XMP meta veri akışına erişim sağlar."
type: docs
weight: 200
url: /tr/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


[XMP](../) meta veri akışına erişim sağlar.

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Meta veriye değer ekler. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Meta veriye değer ekler. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Sözlüğe anahtar ve değer çifti ekler. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Bir diziye değer ekler. Değer dizinin sonuna eklenecektir. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Belirtilen indeksle bir diziye değer ekler. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Yapıya adlandırılmış değer ekler. |
| [Clear](./clear/)() override | Meta veriyi temizler. |
| [Contains](./contains/)(const System::String\&) const | Anahtarın meta veride bulunup bulunmadığını denetler. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Belirtilen anahtar-değer çiftinin sözlükte bulunup bulunmadığını denetler. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Bu sözlüğün belirtilen anahtarı içerip içermediğini belirler. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Koleksiyonun öğelerini diziye kopyalar. |
| [get_Count](./get_count/)() const override | Koleksiyondaki öğe sayısını alır. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Koleksiyonun sabit boyuta sahip olup olmadığını denetler. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Koleksiyonun yalnızca okunur olup olmadığını denetler. |
| [get_IsSynchronized](./get_issynchronized/)() | Koleksiyonun senkronize olup olmadığını denetler. |
| [get_Keys](./get_keys/)() const override | Meta veri anahtarlarının koleksiyonunu alır. |
| [get_NamespaceManager](./get_namespacemanager/)() | Ad alanı yöneticisini alır. |
| [get_SyncRoot](./get_syncroot/)() const | Koleksiyon senkronizasyon nesnesini alır. |
| [get_Values](./get_values/)() const override | Meta verideki değerleri alır. |
| [GetEnumerator](./getenumerator/)() override | Sözlük yineleyicisini döndürür. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Önek ile ad alanı URI'sini döndürür. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Namespace URI'sine göre önek döndürür. |
| [idx_get](./idx_get/)(const System::String\&) const override | Meta veriden veri alır. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Meta veriden veri ayarlar. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Namespace URI'sini kaydeder. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Namespace URI'sini kaydeder. |
| [Remove](./remove/)(const System::String\&) override | Meta veriden girişi kaldırır. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Koleksiyondan anahtar/değer çiftini kaldırır. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Bir dizide değeri ayarlar. Önceki değer yeniyle değiştirilecektir. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Yapıya adlandırılmış bir değer ayarlar. Önceden var olan aynı adlandırılmış değer yeniyle değiştirilecektir. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Sözlükte anahtarı bulmaya çalışır ve bulunursa değeri getirir. |
## Ayrıca Bakınız

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
