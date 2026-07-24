---
title: "Aspose::Page::Plugins::PsConverterOptions kelas"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::Plugins::PsConverterOptions kelas. Mewakili opsi untuk plugin PsConverter di C++."
type: docs
weight: 1200
url: /id/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Mewakili opsi untuk plugin [PsConverter](../psconverter/).

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Menambahkan sumber data baru ke koleksi data plugin [PsConverter](../psconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Menambahkan sumber data baru ke koleksi data plugin [PsConverterOptions](./). |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Menentukan folder tambahan tempat konverter harus menemukan font untuk dokumen masukan. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal. |
| [get_DataCollection](./get_datacollection/)() override | Mengembalikan koleksi data plugin [PsConverterOptions](./). |
| virtual [get_Debug](./get_debug/)() | Menentukan apakah informasi debug harus dicetak ke aliran output standar atau tidak. |
| virtual [get_Exceptions](./get_exceptions/)() | Mengembalikan daftar kesalahan konversi yang ditekan jika [SuppressErrors](../) bernilai true. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Kategori Quality menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
| virtual [get_OperationName](./get_operationname/)() | Mengembalikan nama operasi. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Mendapatkan koleksi target yang ditambahkan untuk menyimpan hasil operasi. |
| [get_SupressErrors](./get_supresserrors/)() const | Menentukan apakah kesalahan harus ditekan atau tidak. Jika true, kesalahan yang ditekan akan ditambahkan ke daftar [Exceptions](../). Jika false, kesalahan pertama akan menghentikan program. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Menentukan folder tambahan tempat konverter harus menemukan font untuk dokumen masukan. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal. |
| virtual [set_Debug](./set_debug/)(bool) | Menentukan apakah informasi debug harus dicetak ke aliran output standar atau tidak. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Mengembalikan daftar kesalahan konversi yang ditekan jika [SuppressErrors](../) bernilai true. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Kategori Quality menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Menentukan apakah kesalahan harus ditekan atau tidak. Jika true, kesalahan yang ditekan akan ditambahkan ke daftar [Exceptions](../). Jika false, kesalahan pertama akan menghentikan program. |
## Lihat Juga

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
