---
title: "System::Xml::XmlReader::ReadValueChunk metode"
linktitle: "ReadValueChunk"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::ReadValueChunk metode. Membaca aliran teks besar yang tertanam dalam dokumen XML dalam C++."
type: docs
weight: 7400
url: /id/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


Membaca aliran teks besar yang tertanam dalam dokumen XML.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | ArrayPtr\<char16_t\> | Array karakter yang berfungsi sebagai buffer tempat isi teks ditulis. Nilai ini tidak dapat berupa **nullptr**. |
| index | int32_t | Offset dalam buffer tempat [XmlReader](../) dapat mulai menyalin hasil. |
| count | int32_t | Jumlah maksimum karakter yang akan disalin ke dalam buffer. Jumlah sebenarnya karakter yang disalin dikembalikan oleh metode ini. |

### ReturnValue

Jumlah karakter yang dibaca ke dalam buffer. Nilai nol dikembalikan ketika tidak ada lagi isi teks.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
