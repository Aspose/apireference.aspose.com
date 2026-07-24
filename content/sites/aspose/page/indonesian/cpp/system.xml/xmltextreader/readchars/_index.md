---
title: "System::Xml::XmlTextReader::ReadChars metode"
linktitle: "ReadChars"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlTextReader::ReadChars metode. Membaca isi teks dari sebuah elemen ke dalam buffer karakter. Metode ini dirancang untuk membaca aliran teks tertanam yang besar dengan memanggilnya secara berurutan dalam C++."
type: docs
weight: 4600
url: /id/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


Membaca isi teks elemen ke dalam buffer karakter. Metode ini dirancang untuk membaca aliran teks tersemat yang besar dengan memanggilnya secara berurutan.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<char16_t\>\& | Array karakter yang berfungsi sebagai buffer tempat isi teks ditulis. |
| indeks | int32_t | Posisi dalam **buffer** di mana metode dapat mulai menulis isi teks. |
| count | int32_t | Jumlah karakter yang akan ditulis ke dalam **buffer**. |

### ReturnValue

Jumlah karakter yang dibaca. Nilai ini dapat 0 jika pembaca tidak berada pada elemen atau jika tidak ada lagi isi teks yang dapat dikembalikan dalam konteks saat ini.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
