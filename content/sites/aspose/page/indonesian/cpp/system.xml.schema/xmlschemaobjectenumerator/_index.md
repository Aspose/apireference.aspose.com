---
title: "Kelas System::Xml::Schema::XmlSchemaObjectEnumerator"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaObjectEnumerator. Mewakili enumerator untuk XmlSchemaObjectCollection dalam C++."
type: docs
weight: 5200
url: /id/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


Mewakili enumerator untuk [XmlSchemaObjectCollection](../xmlschemaobjectcollection/).

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mengkloning iterator saat ini. |
| [Dispose](./dispose/)() override | Tidak melakukan apa-apa. |
| [get_Current](./get_current/)() const override | Mengembalikan [XmlSchemaObject](../xmlschemaobject/) saat ini dalam koleksi. |
| [MoveNext](./movenext/)() override | Berpindah ke item berikutnya dalam koleksi. |
| [Reset](./reset/)() override | Mengatur ulang enumerator ke awal koleksi. |
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
