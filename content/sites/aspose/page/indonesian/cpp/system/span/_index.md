---
title: "Kelas System::Span"
linktitle: "Span"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Span. Mewakili wilayah memori berkelanjutan yang arbitrer serupa dengan std::span di C++20 dalam C++."
type: docs
weight: 5700
url: /id/cpp/system/span/
---
## Span class


Mewakili wilayah memori berkelanjutan yang arbitrer serupa dengan std::span milik C++20.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dalam span. Kelas ini menyediakan cara yang aman-jenis untuk bekerja dengan urutan berkelanjutan objek. Bisa digunakan untuk membungkus array, array stack, atau pointer mentah sambil mempertahankan pemeriksaan batas. [Span](./) tidak memiliki memori yang ditunjuknya - ia hanya merupakan tampilan ke memori yang sudah ada. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clear](./clear/)() const | Menghapus isi span dengan mengatur semua elemen ke nilai default. |
| [Fill](./fill/)(const T\&) const | Mengisi span dengan nilai yang ditentukan. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | Mengonversi array menjadi [Span](./). |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
