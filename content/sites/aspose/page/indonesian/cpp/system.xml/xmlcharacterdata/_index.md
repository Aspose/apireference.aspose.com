---
title: "System::Xml::XmlCharacterData class"
linktitle: "XmlCharacterData"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlCharacterData class. Menyediakan metode manipulasi teks yang digunakan oleh beberapa kelas dalam C++."
type: docs
weight: 900
url: /id/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


Menyediakan metode manipulasi teks yang digunakan oleh beberapa kelas.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | Menambahkan string yang ditentukan ke akhir data karakter node. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | Menghapus rentang karakter dari node. |
| virtual [get_Data](./get_data/)() | Mengembalikan data node. |
| [get_InnerText](./get_innertext/)() override | Mengembalikan nilai yang digabungkan dari node dan semua anak node tersebut. |
| virtual [get_Length](./get_length/)() | Mengembalikan panjang data, dalam karakter. |
| [get_Value](./get_value/)() override | Mengembalikan nilai dari node. |
| virtual [InsertData](./insertdata/)(int32_t, String) | Menyisipkan string yang ditentukan pada offset karakter yang ditentukan. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | Mengganti sejumlah karakter yang ditentukan mulai dari offset yang ditentukan dengan string yang ditentukan. |
| virtual [set_Data](./set_data/)(String) | Mengatur data node. |
| [set_InnerText](./set_innertext/)(String) override | Mengatur nilai yang digabungkan dari node dan semua anak node. |
| [set_Value](./set_value/)(String) override | Mengatur nilai dari node. |
| virtual [Substring](./substring/)(int32_t, int32_t) | Mengambil substring dari string lengkap dalam rentang yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
