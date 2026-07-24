---
title: "Kelas System::ReadOnlySpan"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ReadOnlySpan. Forward untuk digunakan dalam kelas Span di C++."
type: docs
weight: 5300
url: /id/cpp/system/readonlyspan/
---
## ReadOnlySpan class


Forward untuk digunakan dalam kelas [Span](../span/).

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dalam span. Kelas ini menyediakan cara yang aman tipe untuk bekerja dengan urutan berkelanjutan objek secara read‑only. Itu dapat digunakan untuk membungkus array, array stack, atau pointer mentah sambil mempertahankan pemeriksaan batas. [ReadOnlySpan](./) tidak memiliki memori yang ditunjuknya—itu hanya tampilan ke memori yang ada. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | Membuat span read-only dari span biasa. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | Mengonversi array menjadi [ReadOnlySpan](./). |
## Catatan


Mewakili wilayah berkelanjutan read-only dari memori sewenang-wenang.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
