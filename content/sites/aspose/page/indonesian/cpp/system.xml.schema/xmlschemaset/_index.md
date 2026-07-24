---
title: "System::Xml::Schema::XmlSchemaSet class"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaSet class. Berisi cache skema bahasa definisi XML Schema (XSD) dalam C++."
type: docs
weight: 5800
url: /id/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


Berisi cache skema bahasa definisi XML [Schema](../) (XSD).

```cpp
class XmlSchemaSet : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(String, const String\&) | Menambahkan skema bahasa definisi XML [Schema](../) (XSD) pada URL yang ditentukan ke [XmlSchemaSet](./). |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | Menambahkan skema bahasa definisi XML [Schema](../) (XSD) yang terdapat dalam [XmlReader](../../system.xml/xmlreader/) ke [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | Menambahkan semua skema bahasa definisi XML [Schema](../) (XSD) dalam [XmlSchemaSet](./) yang diberikan ke [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Menambahkan [XmlSchema](../xmlschema/) yang diberikan ke [XmlSchemaSet](./). |
| [Compile](./compile/)() | Mengkompilasi skema bahasa definisi XML [Schema](../) (XSD) yang ditambahkan ke [XmlSchemaSet](./) menjadi satu skema logis. |
| [Contains](./contains/)(String) | Menunjukkan apakah ada skema bahasa definisi XML [Schema](../) (XSD) dengan namespace target URI yang ditentukan di dalam [XmlSchemaSet](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Menunjukkan apakah objek [XmlSchema](../xmlschema/) XML [Schema](../) bahasa definisi (XSD) yang ditentukan berada di dalam [XmlSchemaSet](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Menyalin semua objek [XmlSchema](../xmlschema/) dari [XmlSchemaSet](./) ke array yang diberikan, mulai dari indeks yang diberikan. |
| [get_CompilationSettings](./get_compilationsettings/)() | Mengembalikan [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) untuk [XmlSchemaSet](./). |
| [get_Count](./get_count/)() | Mengembalikan jumlah skema XML logis [Schema](../) bahasa definisi (XSD) dalam [XmlSchemaSet](./). |
| [get_GlobalAttributes](./get_globalattributes/)() | Mengembalikan semua atribut global dalam semua skema XML [Schema](../) bahasa definisi (XSD) dalam [XmlSchemaSet](./). |
| [get_GlobalElements](./get_globalelements/)() | Mengembalikan semua elemen global dalam semua skema XML [Schema](../) bahasa definisi (XSD) dalam [XmlSchemaSet](./). |
| [get_GlobalTypes](./get_globaltypes/)() | Mengembalikan semua tipe sederhana dan kompleks global dalam semua skema XML [Schema](../) bahasa definisi (XSD) dalam [XmlSchemaSet](./). |
| [get_IsCompiled](./get_iscompiled/)() | Mengembalikan nilai yang menunjukkan apakah skema XML [Schema](../) bahasa definisi (XSD) dalam [XmlSchemaSet](./) telah dikompilasi. |
| [get_NameTable](./get_nametable/)() | Mengembalikan [XmlNameTable](../../system.xml/xmlnametable/) default yang digunakan oleh [XmlSchemaSet](./) saat memuat skema XML [Schema](../) bahasa definisi (XSD) baru. |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | Menghapus skema XML [Schema](../) bahasa definisi (XSD) yang ditentukan dari [XmlSchemaSet](./). |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | Menghapus skema XML [Schema](../) bahasa definisi (XSD) yang ditentukan serta semua skema yang diimpornya dari [XmlSchemaSet](./). |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | Memproses ulang skema XML [Schema](../) bahasa definisi (XSD) yang sudah ada dalam [XmlSchemaSet](./). |
| [Schemas](./schemas/)() | Mengembalikan koleksi semua skema XML [Schema](../) bahasa definisi (XSD) dalam [XmlSchemaSet](./). |
| [Schemas](./schemas/)(String) | Mengembalikan koleksi semua skema XML [Schema](../) bahasa definisi (XSD) dalam [XmlSchemaSet](./) yang termasuk dalam ruang nama yang diberikan. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | Mengatur [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) untuk [XmlSchemaSet](./). |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengatur [XmlResolver](../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan ruang nama atau lokasi yang dirujuk dalam elemen include dan import dari sebuah skema. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Menambahkan penangan peristiwa untuk menerima informasi tentang kesalahan validasi skema XML [Schema](../) bahasa definisi (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Menghapus penangan peristiwa untuk menerima informasi tentang kesalahan validasi skema XML [Schema](../) bahasa definisi (XSD). |
| [XmlSchemaSet](./xmlschemaset/)() | Menginisialisasi instance baru dari kelas [XmlSchemaSet](./). |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlSchemaSet](./) dengan [XmlNameTable](../../system.xml/xmlnametable/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
