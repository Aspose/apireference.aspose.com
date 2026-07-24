---
title: "Kelas System::Xml::XmlReaderSettings"
linktitle: "XmlReaderSettings"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlReaderSettings. Menentukan sekumpulan fitur untuk didukung pada objek XmlReader yang dibuat oleh metode XmlReader::Create dalam C++."
type: docs
weight: 3400
url: /id/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


Menentukan sekumpulan fitur untuk didukung pada objek [XmlReader](../xmlreader/) yang dibuat oleh metode [XmlReader::Create](../xmlreader/create/).

```cpp
class XmlReaderSettings : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | Membuat salinan dari instance [XmlReaderSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | Mengembalikan nilai yang menunjukkan apakah melakukan pemeriksaan karakter. |
| [get_CloseInput](./get_closeinput/)() | Mengembalikan nilai yang menunjukkan apakah aliran dasar atau TextReader harus ditutup ketika pembaca ditutup. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Mengembalikan tingkat kepatuhan yang akan dipatuhi oleh [XmlReader](../xmlreader/). |
| [get_DtdProcessing](./get_dtdprocessing/)() | Mengembalikan nilai yang menentukan pemrosesan DTD. |
| [get_IgnoreComments](./get_ignorecomments/)() | Mengembalikan nilai yang menunjukkan apakah mengabaikan komentar. |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | Mengembalikan nilai yang menunjukkan apakah mengabaikan instruksi pemrosesan. |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | Mengembalikan nilai yang menunjukkan apakah mengabaikan spasi putih yang tidak signifikan. |
| [get_LineNumberOffset](./get_linenumberoffset/)() | Mengembalikan offset nomor baris dari objek [XmlReader](../xmlreader/). |
| [get_LinePositionOffset](./get_linepositionoffset/)() | Mengembalikan offset posisi baris dari objek [XmlReader](../xmlreader/). |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | Mengembalikan nilai yang menunjukkan jumlah maksimum karakter yang diizinkan dalam dokumen yang dihasilkan dari memperluas entitas. |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | Mengembalikan nilai yang menunjukkan jumlah karakter maksimum yang diizinkan dalam dokumen XML. Nilai nol (0) berarti tidak ada batasan ukuran dokumen XML. Nilai non-nol menentukan ukuran maksimum, dalam karakter. |
| [get_NameTable](./get_nametable/)() | Mengembalikan [XmlNameTable](../xmlnametable/) yang digunakan untuk perbandingan string yang diatomisasi. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Mengembalikan nilai yang menunjukkan apakah harus melarang pemrosesan definisi tipe dokumen (DTD). |
| [get_Schemas](./get_schemas/)() | Mengembalikan XmlSchemaSet yang digunakan saat melakukan validasi skema. |
| [get_ValidationFlags](./get_validationflags/)() | Mengembalikan nilai yang menunjukkan pengaturan validasi skema. Pengaturan ini berlaku untuk objek [XmlReader](../xmlreader/) yang memvalidasi skema (nilai [XmlReaderSettings::get_ValidationType](./get_validationtype/) adalah [ValidationType::Schema](../validationtype/)). |
| [get_ValidationType](./get_validationtype/)() | Mengembalikan nilai yang menunjukkan apakah [XmlReader](../xmlreader/) akan melakukan validasi atau penetapan tipe saat membaca. |
| [Reset](./reset/)() | Mengatur ulang anggota kelas pengaturan ke nilai default mereka. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Mengatur nilai yang menunjukkan apakah akan melakukan pemeriksaan karakter. |
| [set_CloseInput](./set_closeinput/)(bool) | Mengatur nilai yang menunjukkan apakah aliran dasar atau TextReader harus ditutup ketika pembaca ditutup. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Mengatur tingkat kepatuhan yang akan dipatuhi oleh [XmlReader](../xmlreader/). |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Mengatur nilai yang menentukan pemrosesan DTD. |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | Mengatur nilai yang menunjukkan apakah akan mengabaikan komentar. |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | Mengatur nilai yang menunjukkan apakah akan mengabaikan instruksi pemrosesan. |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | Mengatur nilai yang menunjukkan apakah akan mengabaikan spasi putih yang tidak signifikan. |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | Mengatur offset nomor baris dari objek [XmlReader](../xmlreader/). |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | Mengatur offset posisi baris dari objek [XmlReader](../xmlreader/). |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | Mengatur nilai yang menunjukkan jumlah karakter maksimum yang diizinkan dalam dokumen yang dihasilkan dari memperluas entitas. |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | Mengatur nilai yang menunjukkan jumlah karakter maksimum yang diizinkan dalam dokumen XML. Nilai nol (0) berarti tidak ada batasan ukuran dokumen XML. Nilai non-nol menentukan ukuran maksimum, dalam karakter. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Mengatur [XmlNameTable](../xmlnametable/) yang digunakan untuk perbandingan string yang diatomisasi. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Mengatur nilai yang menunjukkan apakah harus melarang pemrosesan definisi tipe dokumen (DTD). |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Mengatur XmlSchemaSet yang digunakan saat melakukan validasi skema. |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | Mengatur nilai yang menunjukkan pengaturan validasi skema. Pengaturan ini berlaku untuk objek [XmlReader](../xmlreader/) yang memvalidasi skema (nilai [XmlReaderSettings::get_ValidationType](./get_validationtype/) adalah [ValidationType::Schema](../validationtype/)). |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Mengatur nilai yang menunjukkan apakah [XmlReader](../xmlreader/) akan melakukan validasi atau penetapan tipe saat membaca. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengatur [XmlResolver](../xmlresolver/) yang digunakan untuk mengakses dokumen eksternal. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Menambahkan penangan peristiwa yang terjadi ketika pembaca menemukan kesalahan validasi. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Menghapus penangan peristiwa yang terjadi ketika pembaca menemukan kesalahan validasi. |
| [XmlReaderSettings](./xmlreadersettings/)() | Menginisialisasi instance baru dari kelas [XmlReaderSettings](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
