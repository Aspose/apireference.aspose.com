---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption kelas"
linktitle: "InputBinOption"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption kelas. Menjelaskan opsi fitur JobInputBin, DocumentInputBin, dan PageInputBin dalam C++."
type: docs
weight: 700
url: /id/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Menjelaskan opsi fitur [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/), dan [PageInputBin](../../pageinputbin/).

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Menambahkan array [IInputBinOptionItem](../iinputbinoptionitem/) instance ke opsi. |
| [Clone](./clone/)() | Menggandakan instance opsi ini. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Membuat instance baru. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [AutoSelect](./autoselect/) | Perangkat akan secara otomatis memilih opsi terbaik berdasarkan konfigurasi. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Baki masukan perangkat untuk printer inkjet. |
| static [Cassette](./cassette/) | Menentukan bahwa baki umpan adalah kaset. |
| static [Manual](./manual/) | Menentukan baki umpan manual default. |
| static [Tractor](./tractor/) | Menentukan bahwa baki umpan adalah traktor. |
## Lihat Juga

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
