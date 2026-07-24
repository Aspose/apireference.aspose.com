---
title: "kelas System::Xml::Schema::ValidationEventArgs"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::Schema::ValidationEventArgs. Mengembalikan informasi terperinci terkait dengan ValidationEventHandler dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


Mengembalikan informasi terperinci terkait dengan [ValidationEventHandler](../validationeventhandler/).

```cpp
class ValidationEventArgs : public System::EventArgs
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Exception](./get_exception/)() | Mengembalikan [XmlSchemaException](../xmlschemaexception/) yang terkait dengan peristiwa validasi. |
| [get_Message](./get_message/)() | Mengembalikan deskripsi teks yang sesuai dengan peristiwa validasi. |
| [get_Severity](./get_severity/)() | Mengembalikan tingkat keparahan peristiwa validasi. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Anggota statis yang mewakili sebuah [EventArgs](../../system/eventargs/) pointer bersama "kosong" (null-pointer). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
