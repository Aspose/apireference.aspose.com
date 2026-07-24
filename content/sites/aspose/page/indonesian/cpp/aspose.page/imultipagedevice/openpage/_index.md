---
title: "Metode Aspose::Page::IMultiPageDevice::OpenPage"
linktitle: "OpenPage"
second_title: "Aspose.Page untuk C++"
description: "Metode Aspose::Page::IMultiPageDevice::OpenPage. Melakukan persiapan yang diperlukan pada perangkat sebelum setiap proses rendering halaman dalam C++."
type: docs
weight: 400
url: /id/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Melakukan persiapan yang diperlukan pada perangkat sebelum perenderan setiap halaman.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| width | float | Lebar halaman. |
| height | float | Tinggi halaman. |

### ReturnValue

Mengembalikan true jika halaman yang dibuka memiliki nomor yang berada dalam rentang nomor halaman yang dipilih dan false sebaliknya.

## Lihat Juga

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Melakukan persiapan yang diperlukan pada perangkat sebelum perenderan halaman.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| judul | System::String | Judul halaman. |

### ReturnValue

True jika halaman berada dalam rentang yang diminta, jika tidak false. Digunakan pada perangkat yang dapat merender array nomor halaman yang ditentukan.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
