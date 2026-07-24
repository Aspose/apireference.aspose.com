---
title: "System::IO::BasicSystemIStreamWrapper kelas"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Page untuk C++"
description: "System::IO::BasicSystemIStreamWrapper kelas. Mewakili pembungkus mirip std::istream yang menggunakan BasicSystemIOStreamBuf sebagai buffer internal dalam C++."
type: docs
weight: 600
url: /id/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


Mewakili pembungkus mirip std::istream yang menggunakan [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) sebagai buffer internal.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | Digunakan dalam konstruktor pindah dan operator penugasan pindah untuk menyetel ulang pointer dan memanggil [swap()](./swap/). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Membuat instance baru dari [BasicSystemIStreamWrapper](./). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | Konstruktor penyalin. Dihapus. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | Konstruktor pemindahan. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | Operator penugasan penyalin. Dihapus. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | Operator penugasan pindah. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | Panggilan untuk menukar *this dan **right**, jika keduanya tidak sama. |
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
