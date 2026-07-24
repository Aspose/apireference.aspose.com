---
title: "Kelas System::Xml::Schema::XmlSchemaCollectionEnumerator"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaCollectionEnumerator. Mendukung iterasi sederhana atas sebuah koleksi. Kelas ini tidak dapat diwarisi dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


Mendukung iterasi sederhana atas sebuah koleksi. Kelas ini tidak dapat diwariskan.

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mengkloning iterator saat ini. |
| [Dispose](./dispose/)() override | Tidak melakukan apa-apa. |
| [get_Current](./get_current/)() const override | Mengembalikan [XmlSchema](../xmlschema/) saat ini dalam koleksi. |
| [MoveNext](./movenext/)() override | Meneruskan enumerator ke skema berikutnya dalam koleksi. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
