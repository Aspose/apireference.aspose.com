---
title: "Aspose::Page::EPS::PsDocument::Save metode"
linktitle: "Simpan"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::EPS::PsDocument::Save metode. Menyimpan PsDocument yang diberikan sebagai file PS atau EPS. Metode ini hanya digunakan ketika PsDocument dibuat dari awal dalam C++."
type: docs
weight: 4200
url: /id/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Menyimpan [PsDocument](../) yang diberikan sebagai file PS atau [EPS](../../). Metode ini hanya digunakan ketika [PsDocument](../) dibuat dari awal.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## Lihat Juga

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Menyimpan [PsDocument](../) yang diberikan ke aliran. Metode ini hanya digunakan setelah memperbarui metadata [XMP](../../../aspose.page.eps.xmp/). Ini menyimpan file [EPS](../../) awal dengan metadata yang ada yang diperbarui atau yang baru dibuat saat memanggil metode GetMetadata. Dalam kasus terakhir semua kode PostScript yang diperlukan dan komentar [EPS](../../) ditambahkan.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Aliran file [EPS](../../) output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Menyimpan [PsDocument](../) yang diberikan sebagai file [EPS](../../). Metode ini hanya digunakan setelah memperbarui metadata [XMP](../../../aspose.page.eps.xmp/). Ini menyimpan file [EPS](../../) awal dengan metadata yang ada yang diperbarui atau yang baru dibuat saat memanggil metode GetMetadata. Dalam kasus terakhir semua kode PostScript yang diperlukan dan komentar [EPS](../../) ditambahkan.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outEpsFilePath | System::String | Jalur file [EPS](../../) output. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
