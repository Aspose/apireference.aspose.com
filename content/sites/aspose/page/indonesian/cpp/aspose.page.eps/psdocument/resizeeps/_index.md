---
title: "Aspose::Page::EPS::PsDocument::ResizeEps method"
linktitle: "ResizeEps"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps method. Mengubah ukuran PsDocument yang diberikan sebagai file EPS. Metode ini hanya digunakan setelah mengekstrak ukuran EPS. Ia menyimpan file EPS awal dengan %BoundingBox yang ada diperbarui atau yang baru akan dibuat. Matriks transformasi halaman juga akan diatur di C++."
type: docs
weight: 4000
url: /id/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Mengubah ukuran [PsDocument](../) menjadi file [EPS](../../). Metode ini hanya digunakan setelah mengekstrak ukuran [EPS](../../). Ini menyimpan file [EPS](../../) dengan %BoundingBox yang ada diperbarui atau yang baru akan dibuat. Matriks transformasi [Page](../../../aspose.page/) juga akan diatur.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Aliran file [EPS](../../) output. |
| newSizeInUnits | System::Drawing::SizeF | Ukuran baru gambar [EPS](../../) dalam satuan yang ditetapkan. |
| unit | Unit | Satuan dari ukuran baru. Bisa berupa poin, inci, milimeter, sentimeter, dan persentase dari ukuran awal. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Mengubah ukuran [PsDocument](../) menjadi file [EPS](../../). Metode ini hanya digunakan setelah mengekstrak ukuran [EPS](../../). Ini menyimpan file [EPS](../../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hDirektori output tempat file gambar akan disimpan.e dengan %BoundingBox yang ada diperbarui atau yang baru akan dibuat. Matriks transformasi [Page](../../../aspose.page/) juga akan diatur.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outEpsFilePath | System::String | Jalur file [EPS](../../) output. |
| newSizeInUnits | System::Drawing::SizeF | Ukuran baru gambar [EPS](../../) dalam satuan yang ditetapkan. |
| unit | Unit | Satuan dari ukuran baru. Bisa berupa poin, inci, milimeter, sentimeter, dan persentase dari ukuran awal. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
