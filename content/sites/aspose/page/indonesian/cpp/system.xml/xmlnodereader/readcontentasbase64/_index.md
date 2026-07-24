---
title: "System::Xml::XmlNodeReader::ReadContentAsBase64 metode"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNodeReader::ReadContentAsBase64 metode. Membaca konten dan mengembalikan byte biner yang didekodekan Base64 dalam C++."
type: docs
weight: 3200
url: /id/cpp/system.xml/xmlnodereader/readcontentasbase64/
---
## XmlNodeReader::ReadContentAsBase64 method


Membaca konten dan mengembalikan byte biner yang didekodekan Base64.

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | ArrayPtr\<uint8_t\> | Buffer tempat menyalin teks hasil. Nilai ini tidak boleh **nullptr**. |
| indeks | int32_t | Offset dalam buffer tempat memulai penyalinan hasil. |
| count | int32_t | Jumlah maksimum byte yang akan disalin ke dalam buffer. Jumlah byte yang sebenarnya disalin dikembalikan oleh metode ini. |

### ReturnValue

Jumlah byte yang ditulis ke dalam buffer.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
