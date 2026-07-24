---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::ValidationType enum. Menentukan jenis validasi yang akan dilakukan dalam C++."
type: docs
weight: 5500
url: /id/cpp/system.xml/validationtype/
---
## ValidationType enum


Menentukan jenis validasi yang akan dilakukan.

```cpp
enum class ValidationType
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| None | 0 | Tidak ada validasi yang dilakukan, dan tidak ada kesalahan validasi yang dilemparkan. Pengaturan ini membuat parser non-validasi yang mematuhi XML 1.0. |
| Otomatis | 1 | Memvalidasi jika informasi DTD atau skema ditemukan. |
| DTD | 2 | Memvalidasi sesuai dengan DTD. |
| XDR | 3 | Validasi sesuai dengan skema XML-Data Reduced (XDR), termasuk skema XDR inline. Skema XDR dikenali menggunakan prefiks namespace **x-schema** atau nilai [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/). |
| Schema | 4 | Validasi sesuai dengan skema definisi bahasa XML [Schema](../../system.xml.schema/) (XSD), termasuk XML Schema inline. XML Schema dikaitkan dengan URI namespace baik dengan menggunakan atribut **schemaLocation** atau **Schemas** yang disediakan. |

## Lihat Juga

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
