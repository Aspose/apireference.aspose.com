---
title: "System::Xml::XmlText class"
linktitle: "XmlText"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlText class. Mewakili konten teks dari sebuah elemen atau atribut dalam C++."
type: docs
weight: 3800
url: /id/cpp/system.xml/xmltext/
---
## XmlText class


Mewakili konten teks dari sebuah elemen atau atribut.

```cpp
class XmlText : public System::Xml::XmlCharacterData
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node. |
| [get_Name](./get_name/)() override | Mengembalikan nama lengkap dari node. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_PreviousText](./get_previoustext/)() override | Mengembalikan node teks yang langsung mendahului node ini. |
| [get_Value](./get_value/)() override | Mengembalikan nilai dari node. |
| [set_Value](./set_value/)(String) override | Mengatur nilai dari node. |
| virtual [SplitText](./splittext/)(int32_t) | Membagi node menjadi dua node pada offset yang ditentukan, menjaga keduanya tetap berada di dalam pohon sebagai saudara. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan semua anak node ke [XmlWriter](../xmlwriter/) yang ditentukan. Node [XmlText](./) tidak memiliki anak, sehingga metode ini tidak berpengaruh. |
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
