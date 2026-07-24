---
title: "System::Xml::XmlWriterSettings kelas"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlWriterSettings. Menentukan satu set fitur untuk didukung pada objek XmlWriter yang dibuat oleh metode XmlWriter::Create dalam C++."
type: docs
weight: 4500
url: /id/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


Menentukan satu set fitur untuk didukung pada objek [XmlWriter](../xmlwriter/) yang dibuat oleh metode [XmlWriter::Create](../xmlwriter/create/).

```cpp
class XmlWriterSettings : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Membuat salinan dari instance [XmlWriterSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | Mengembalikan nilai yang menunjukkan apakah penulis XML harus memeriksa untuk memastikan bahwa semua karakter dalam dokumen sesuai dengan bagian \"2.2 Characters\" dari [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) W3C. |
| [get_CloseOutput](./get_closeoutput/)() | Mengembalikan nilai yang menunjukkan apakah [XmlWriter](../xmlwriter/) juga harus menutup aliran dasar atau TextWriter ketika metode [XmlWriter::Close](../xmlwriter/close/) dipanggil. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Mengembalikan tingkat kepatuhan yang diperiksa penulis XML pada output XML. |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | Mengembalikan nilai yang menunjukkan apakah [XmlWriter](../xmlwriter/) tidak meloloskan (escape) atribut URI. |
| [get_Encoding](./get_encoding/)() | Mengembalikan jenis pengkodean teks yang akan digunakan. |
| [get_Indent](./get_indent/)() | Mengembalikan nilai yang menunjukkan apakah elemen harus diindentasi. |
| [get_IndentChars](./get_indentchars/)() | Mengembalikan string karakter yang digunakan saat mengindentasi. Pengaturan ini digunakan ketika nilai [XmlWriterSettings::set_Indent](./set_indent/) diatur ke **true**. |
| [get_NamespaceHandling](./get_namespacehandling/)() | Mengembalikan nilai yang menunjukkan apakah [XmlWriter](../xmlwriter/) harus menghapus deklarasi namespace duplikat saat menulis konten XML. Perilaku default adalah penulis mengeluarkan semua deklarasi namespace yang ada dalam resolver namespace penulis. |
| [get_NewLineChars](./get_newlinechars/)() | Mengembalikan string karakter yang digunakan untuk pemisah baris. |
| [get_NewLineHandling](./get_newlinehandling/)() | Mengembalikan nilai yang menunjukkan apakah pemisah baris harus dinormalisasi dalam output. |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | Mengembalikan nilai yang menunjukkan apakah atribut harus ditulis pada baris baru. |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | Mengembalikan nilai yang menunjukkan apakah deklarasi XML harus dihilangkan. |
| [get_OutputMethod](./get_outputmethod/)() | Mengembalikan metode yang digunakan untuk menyerialisasi output [XmlWriter](../xmlwriter/). |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | Mengembalikan nilai yang menunjukkan apakah [XmlWriter](../xmlwriter/) akan menambahkan tag penutup ke semua tag elemen yang belum ditutup ketika metode [XmlWriter::Close](../xmlwriter/close/) dipanggil. |
| [Reset](./reset/)() | Mengatur ulang anggota kelas pengaturan ke nilai default mereka. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Mengatur nilai yang menunjukkan apakah penulis XML harus memeriksa untuk memastikan semua karakter dalam dokumen sesuai dengan bagian \"2.2 Characters\" dari [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) W3C. |
| [set_CloseOutput](./set_closeoutput/)(bool) | Mengatur nilai yang menunjukkan apakah [XmlWriter](../xmlwriter/) juga harus menutup aliran dasar atau TextWriter ketika metode [XmlWriter::Close](../xmlwriter/close/) dipanggil. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Mengatur tingkat kepatuhan yang diperiksa penulis XML pada output XML. |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | Mengatur nilai yang menunjukkan apakah [XmlWriter](../xmlwriter/) tidak meloloskan (escape) atribut URI. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Mengatur jenis pengkodean teks yang akan digunakan. |
| [set_Indent](./set_indent/)(bool) | Mengatur nilai yang menunjukkan apakah elemen harus diindentasi. |
| [set_IndentChars](./set_indentchars/)(const String\&) | Mengatur string karakter yang digunakan saat mengindentasi. Pengaturan ini digunakan ketika nilai [XmlWriterSettings::set_Indent](./set_indent/) diatur ke **true**. |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | Mengatur nilai yang menunjukkan apakah [XmlWriter](../xmlwriter/) harus menghapus deklarasi namespace duplikat saat menulis konten XML. Perilaku default adalah penulis mengeluarkan semua deklarasi namespace yang ada di resolver namespace penulis. |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | Mengatur string karakter yang digunakan untuk pemisah baris. |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | Mengatur nilai yang menunjukkan apakah akan menormalkan pemisah baris dalam output. |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | Mengatur nilai yang menunjukkan apakah menulis atribut pada baris baru. |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | Mengatur nilai yang menunjukkan apakah menghilangkan deklarasi XML. |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | Mengatur nilai yang menunjukkan apakah [XmlWriter](../xmlwriter/) akan menambahkan tag penutup ke semua tag elemen yang belum ditutup ketika metode [XmlWriter::Close](../xmlwriter/close/) dipanggil. |
| [XmlWriterSettings](./xmlwritersettings/)() | Menginisialisasi instance baru dari kelas [XmlWriterSettings](./). |
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
