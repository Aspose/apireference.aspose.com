---
title: "Aspose::Page::EPS::PsDocument::PsDocument constructor"
linktitle: "PsDocument"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument constructor. Menginisialisasi PsDocument kosong. Konstruktor ini hanya digunakan untuk operasi tambahan yang tidak terkait dengan file PostScript, misalnya, mengonversi font dalam C++."
type: docs
weight: 100
url: /id/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Menginisialisasi [PsDocument](../) kosong. Konstruktor ini hanya digunakan untuk operasi tambahan yang tidak terkait dengan file PostScript, misalnya, mengonversi font.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## Lihat Juga

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Menginisialisasi [PsDocument](../) dengan aliran file PS/EPS.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Aliran masukan file PS/EPS. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Menginisialisasi [PsDocument](../) kosong dengan halaman yang diinisialisasi.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Aliran tempat menyimpan file PS/EPS. |
| opsi | System::SharedPtr\<Device::PsSaveOptions\> | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Menginisialisasi [PsDocument](../) kosong.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Aliran tempat menyimpan file PS/EPS. |
| opsi | System::SharedPtr\<Device::PsSaveOptions\> | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |
| berbanyak halaman | bool | Jika false halaman tidak akan diinisialisasi. Dalam kasus ini inisialisasi halaman harus dilakukan melalui pemanggilan eksplisit \"openPage(width, height) call |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Menginisialisasi [PsDocument](../) kosong ketika jumlah halaman dokumen [Postscript](../../../aspose.page.eps.postscript/) diketahui sebelumnya.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Aliran tempat menyimpan file PS/EPS. |
| opsi | System::SharedPtr\<Device::PsSaveOptions\> | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |
| numberOfPages | int32_t | Jumlah halaman dalam dokumen PostScript. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Menginisialisasi [PsDocument](../) kosong dengan halaman yang diinisialisasi.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsFilePath | System::String | Jalur file PS/EPS output. |
| opsi | System::SharedPtr\<Device::PsSaveOptions\> | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Menginisialisasi [PsDocument](../) kosong.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsFilePath | System::String | Jalur file PS/EPS output. |
| opsi | System::SharedPtr\<Device::PsSaveOptions\> | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |
| berbanyak halaman | bool | Jika false halaman tidak akan diinisialisasi. Dalam kasus ini inisialisasi halaman harus dilakukan melalui pemanggilan eksplisit \"openPage(width, height) call |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Menginisialisasi [PsDocument](../) kosong ketika jumlah halaman dokumen [Postscript](../../../aspose.page.eps.postscript/) diketahui sebelumnya.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsFilePath | System::String | Jalur file PS/EPS output. |
| opsi | System::SharedPtr\<Device::PsSaveOptions\> | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |
| numberOfPages | int32_t | Jumlah halaman dalam dokumen PostScript. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Menginisialisasi [PsDocument](../) dengan file PS/EPS input.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| psFilePath | System::String | Jalur file PS/EPS. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
