---
title: "System::Xml::Schema::XmlSeverityType enum"
linktitle: "XmlSeverityType"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSeverityType enum. Mewakili tingkat keparahan peristiwa validasi dalam C++."
type: docs
weight: 8100
url: /id/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


Mewakili tingkat keparahan peristiwa validasi.

```cpp
enum class XmlSeverityType
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Error | 0 | Menunjukkan bahwa terjadi kesalahan validasi saat memvalidasi dokumen instance. Ini berlaku untuk definisi tipe dokumen (DTD) dan skema definisi bahasa XML [Schema](../) (XSD). Kendala validitas World Wide [Web](../../system.web/) Consortium (W3C) dianggap sebagai kesalahan. Jika tidak ada penangan peristiwa validasi yang dibuat, kesalahan akan melemparkan pengecualian. |
| Warning | 1 | Menunjukkan bahwa peristiwa validasi terjadi yang bukan merupakan kesalahan. Peringatan biasanya dikeluarkan ketika tidak ada DTD, atau XML [Schema](../) untuk memvalidasi elemen atau atribut tertentu. Tidak seperti kesalahan, peringatan tidak melemparkan pengecualian jika tidak ada penangan peristiwa validasi. |

## Lihat Juga

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
