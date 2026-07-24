---
title: "System::Xml::XmlValidatingReader::ReadContentAsBase64 metode"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlValidatingReader::ReadContentAsBase64 metode. Membaca konten dan mengembalikan byte biner yang didekodekan Base64 dalam C++."
type: docs
weight: 4100
url: /id/cpp/system.xml/xmlvalidatingreader/readcontentasbase64/
---
## XmlValidatingReader::ReadContentAsBase64 method


Membaca konten dan mengembalikan byte biner yang didekodekan Base64.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
