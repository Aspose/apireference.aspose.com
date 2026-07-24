---
title: "System::Xml::XmlDateTimeSerializationMode enum"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDateTimeSerializationMode enum. Menentukan bagaimana memperlakukan nilai waktu saat mengonversi antara string dan DateTime dalam C++."
type: docs
weight: 5800
url: /id/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


Menentukan bagaimana memperlakukan nilai waktu saat mengonversi antara string dan [DateTime](../../system/datetime/).

```cpp
enum class XmlDateTimeSerializationMode
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Local | 0 | Perlakukan sebagai waktu lokal. Jika objek [DateTime](../../system/datetime/) mewakili Coordinated Universal Time (UTC), maka akan dikonversi ke waktu lokal. |
| Utc | 1 | Perlakukan sebagai UTC. Jika objek [DateTime](../../system/datetime/) mewakili waktu lokal, maka akan dikonversi ke UTC. |
| Unspecified | 2 | Perlakukan sebagai waktu lokal jika [DateTime](../../system/datetime/) sedang dikonversi menjadi string. Jika sebuah string sedang dikonversi menjadi [DateTime](../../system/datetime/), konversikan ke waktu lokal jika zona waktu ditentukan. |
| RoundtripKind | 3 | Informasi zona waktu harus dipertahankan saat mengonversi. |

## Lihat Juga

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
