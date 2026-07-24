---
title: "Kelas System::ExceptionWrapper"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ExceptionWrapper. Template yang mewakili pembungkus pengecualian yang diturunkan dari kelas Exception di C++."
type: docs
weight: 2600
url: /id/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


Templat yang mewakili pembungkus pengecualian yang diturunkan dari kelas [Exception](../exception/).

```cpp
template<typename T>class ExceptionWrapper
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | Membuat sebuah instance null dari kelas [ExceptionWrapper](./) yang tidak mewakili pengecualian apa pun. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Membuat sebuah instance dari kelas [ExceptionWrapper](./) yang berisi pointer yang diberikan. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Konstruktor penyalinan. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Konstruktor pemindahan. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | Konstruktor yang meneruskan parameter ke konstruktor kelas [Exception](../exception/) dan membuat smart pointer yang menyimpan instance baru kelas [Exception](../exception/). |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | Operator cast implisit ke [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | Memungkinkan mengakses anggota objek [Exception](../exception/). |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Operator penugasan. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Operator penugasan pindah. |
| static [Type](./type/)() | Jalan pintas untuk mendapatkan objek [System::TypeInfo](../typeinfo/) untuk tipe [Exception](../exception/). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Digunakan untuk fungsi casting. |
## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
