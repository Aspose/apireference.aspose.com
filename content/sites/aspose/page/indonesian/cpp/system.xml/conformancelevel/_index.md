---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::ConformanceLevel enum. Menentukan jumlah pemeriksaan input atau output yang dilakukan oleh objek XmlReader dan XmlWriter dalam C++."
type: docs
weight: 4600
url: /id/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Menentukan jumlah pemeriksaan input atau output yang dilakukan oleh objek [XmlReader](../xmlreader/) dan [XmlWriter](../xmlwriter/).

```cpp
enum class ConformanceLevel
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Auto | 0 | Objek [XmlReader](../xmlreader/) atau [XmlWriter](../xmlwriter/) secara otomatis mendeteksi apakah pemeriksaan tingkat dokumen atau tingkat fragmen yang harus dilakukan, dan melakukan pemeriksaan yang sesuai. Jika Anda membungkus objek [XmlReader](../xmlreader/) atau [XmlWriter](../xmlwriter/) lain, objek luar tidak melakukan pemeriksaan kepatuhan tambahan. Pemeriksaan kepatuhan diserahkan kepada objek yang mendasarinya. |
| Fragment | 1 | Data XML adalah [fragmen XML yang terstruktur dengan baik](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), sebagaimana didefinisikan oleh W3C. Tingkat kepatuhan ini mewakili dokumen XML yang mungkin tidak memiliki elemen akar tetapi tetap terstruktur dengan baik. Tingkat pemeriksaan ini memastikan bahwa aliran yang dibaca atau ditulis dapat diproses oleh siapa pun sebagai [entitas terurai eksternal XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | Data XML mematuhi aturan untuk [dokumen XML 1.0 yang terstruktur dengan baik](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), sebagaimana didefinisikan oleh W3C. Tingkat pemeriksaan ini memastikan bahwa aliran yang dibaca atau ditulis dapat diproses oleh siapa pun sebagai [dokumen XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## Lihat Juga

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
