---
title: "Metode Aspose::Page::EPS::PsDocument::ExtractText"
linktitle: "ExtractText"
second_title: "Aspose.Page untuk C++"
description: "Metode Aspose::Page::EPS::PsDocument::ExtractText. Mengekstrak teks dari file PS. Teks dapat diekstrak hanya jika ditulis dengan font Type 42 (TrueType) atau font Type 0 dengan font Type 42 dalam Vector Map-nya dalam C++."
type: docs
weight: 2300
url: /id/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Mengekstrak teks dari file PS. Teks hanya dapat diekstrak jika ditulis dengan font Type 42 (**TrueType**) atau font Type 0 dengan font Type 42 dalam Peta Vektornya.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| opsi | System::SharedPtr\<SaveOptions\> | Opsi penyimpanan. |
| startPage | int32_t | Halaman dari mana memulai mengekstrak teks. Parameter ini berguna untuk dokumen multi-halaman. |
| endPage | int32_t | Halaman hingga mana mengekstrak teks selesai. Parameter ini berguna untuk dokumen multi-halaman. |

### ReturnValue

Teks yang diekstrak.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
