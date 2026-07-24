---
title: "Kelas System::IO::BasicSystemOStreamWrapper"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::BasicSystemOStreamWrapper. Mewakili pembungkus mirip std::ostream yang menggunakan BasicSystemIOStreamBuf sebagai buffer internal dalam C++."
type: docs
weight: 700
url: /id/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


Mewakili pembungkus mirip std::ostream yang menggunakan [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) sebagai buffer internal.

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | Digunakan dalam konstruktor pindah dan operator penugasan pindah untuk menyetel ulang pointer dan memanggil [swap()](./swap/). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Membuat instance baru dari [BasicSystemOStreamWrapper](./). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | Konstruktor penyalin. Dihapus. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | Konstruktor pemindahan. |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | Operator penugasan penyalin. Dihapus. |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | Operator penugasan pindah. |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | Panggilan untuk menukar *this dan **right**, jika keduanya tidak sama. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## Lihat Juga

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
