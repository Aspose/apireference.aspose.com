---
title: "Kelas System::Xml::Schema::XmlSchemaObjectCollection"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaObjectCollection. Sebuah koleksi XmlSchemaObjects dalam C++."
type: docs
weight: 5100
url: /id/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


Koleksi XmlSchemaObjects.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | Menambahkan sebuah [XmlSchemaObject](../xmlschemaobject/) ke [XmlSchemaObjectCollection](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | Menunjukkan apakah [XmlSchemaObject](../xmlschemaobject/) yang ditentukan berada dalam [XmlSchemaObjectCollection](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | Menyalin semua XmlSchemaObjects dari koleksi ke dalam array yang diberikan, mulai dari indeks yang diberikan. |
| [GetEnumerator](./getenumerator/)() override | Mengembalikan enumerator untuk mengiterasi XmlSchemaObjects yang terdapat dalam [XmlSchemaObjectCollection](./). |
| virtual [idx_get](./idx_get/)(int32_t) | Mengembalikan [XmlSchemaObject](../xmlschemaobject/) pada indeks yang ditentukan. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | Mengatur [XmlSchemaObject](../xmlschemaobject/) pada indeks yang ditentukan. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | Mengembalikan indeks koleksi yang sesuai dengan [XmlSchemaObject](../xmlschemaobject/) yang ditentukan. |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | Menyisipkan sebuah [XmlSchemaObject](../xmlschemaobject/) ke dalam [XmlSchemaObjectCollection](./). |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | Menghapus sebuah [XmlSchemaObject](../xmlschemaobject/) dari [XmlSchemaObjectCollection](./). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Atur argumen templat ke‑n menjadi pointer lemah (bukan berbagi). Memungkinkan penggantian pointer dalam kontainer ke mode lemah. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | Menginisialisasi instance baru dari kelas [XmlSchemaObjectCollection](./). |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | Menginisialisasi instance baru dari kelas [XmlSchemaObjectCollection](./) yang menerima sebuah [XmlSchemaObject](../xmlschemaobject/). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
