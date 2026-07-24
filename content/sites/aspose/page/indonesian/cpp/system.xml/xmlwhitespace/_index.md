---
title: "Kelas System::Xml::XmlWhitespace"
linktitle: "XmlWhitespace"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlWhitespace. Mewakili spasi putih dalam konten elemen di C++."
type: docs
weight: 4300
url: /id/cpp/system.xml/xmlwhitespace/
---
## XmlWhitespace class


Mewakili spasi putih dalam konten elemen.

```cpp
class XmlWhitespace : public System::Xml::XmlCharacterData
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node. |
| [get_Name](./get_name/)() override | Mengembalikan nama lengkap dari node. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node. |
| [get_PreviousText](./get_previoustext/)() override | Mengembalikan node teks yang langsung mendahului node ini. |
| [get_Value](./get_value/)() override | Mengembalikan nilai dari node. |
| [set_Value](./set_value/)(String) override | Mengatur nilai dari node. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan semua anak node ke [XmlWriter](../xmlwriter/) yang ditentukan. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan node ke [XmlWriter](../xmlwriter/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
