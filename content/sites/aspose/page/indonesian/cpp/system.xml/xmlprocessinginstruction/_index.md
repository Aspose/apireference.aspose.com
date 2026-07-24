---
title: "Kelas System::Xml::XmlProcessingInstruction"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlProcessingInstruction. Mewakili sebuah processing instruction, yang didefinisikan XML untuk menyimpan informasi spesifik prosesor dalam teks dokumen dalam C++."
type: docs
weight: 3100
url: /id/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


Mewakili instruksi pemrosesan, yang didefinisikan oleh XML untuk menyimpan informasi spesifik prosesor dalam teks dokumen.

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| [get_Data](./get_data/)() | Mengembalikan konten dari processing instruction, tidak termasuk target. |
| [get_InnerText](./get_innertext/)() override | Mengembalikan nilai yang digabungkan dari node dan semua anaknya. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node. |
| [get_Name](./get_name/)() override | Mengembalikan nama lengkap dari node. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_Target](./get_target/)() | Mengembalikan target dari processing instruction. |
| [get_Value](./get_value/)() override | Mengembalikan nilai dari node. |
| [set_Data](./set_data/)(const String\&) | Mengatur konten dari processing instruction, tidak termasuk target. |
| [set_InnerText](./set_innertext/)(String) override | Mengatur nilai yang digabungkan dari node dan semua anaknya. |
| [set_Value](./set_value/)(String) override | Mengatur nilai dari node. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan semua anak node ke [XmlWriter](../xmlwriter/) yang ditentukan. Karena node ProcessingInstruction tidak memiliki anak, metode ini tidak berpengaruh. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan node ke [XmlWriter](../xmlwriter/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
