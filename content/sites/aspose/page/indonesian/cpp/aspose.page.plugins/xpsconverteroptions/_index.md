---
title: "Aspose::Page::Plugins::XpsConverterOptions kelas"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::Plugins::XpsConverterOptions kelas. Mewakili opsi untuk plugin XpsConverter dalam C++."
type: docs
weight: 2000
url: /id/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Mewakili opsi untuk plugin [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Menambahkan sumber data baru ke koleksi data plugin [XpsConverter](../xpsconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Menambahkan sumber data baru ke koleksi data plugin [XpsConverterOptions](./). |
| [get_DataCollection](./get_datacollection/)() override | Mengembalikan koleksi data plugin [XpsConverterOptions](./). |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Kategori Quality menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
| virtual [get_OperationName](./get_operationname/)() | Mengembalikan nama operasi. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Mendapatkan koleksi target yang ditambahkan untuk menyimpan hasil operasi. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Kategori Quality menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
## Lihat Juga

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
