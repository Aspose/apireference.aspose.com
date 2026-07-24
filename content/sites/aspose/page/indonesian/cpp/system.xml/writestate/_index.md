---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Page untuk C++"
description: "enum System::Xml::WriteState. Menentukan keadaan XmlWriter dalam C++."
type: docs
weight: 5700
url: /id/cpp/system.xml/writestate/
---
## WriteState enum


Menentukan keadaan [XmlWriter](../xmlwriter/).

```cpp
enum class WriteState
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Mulai | 0 | Menunjukkan bahwa metode XmlWriter::Write belum dipanggil. |
| Prolog | 1 | Menunjukkan bahwa prolog sedang ditulis. |
| Element | 2 | Menunjukkan bahwa tag pembuka elemen sedang ditulis. |
| Attribute | 3 | Menunjukkan bahwa nilai atribut sedang ditulis. |
| Content | 4 | Menunjukkan bahwa konten elemen sedang ditulis. |
| Closed | 5 | Menunjukkan bahwa metode [XmlWriter::Close](../xmlwriter/close/) telah dipanggil. |
| Error | 6 | Sebuah pengecualian telah dilempar, yang menyebabkan [XmlWriter](../xmlwriter/) berada dalam keadaan tidak valid. Anda dapat memanggil metode [XmlWriter::Close](../xmlwriter/close/) untuk menempatkan [XmlWriter](../xmlwriter/) dalam keadaan [WriteState::Closed](./). Pemanggilan metode [XmlWriter](../xmlwriter/) lainnya akan menghasilkan InvalidOperationException. |

## Lihat Juga

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
