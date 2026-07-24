---
title: "System::IO::BasicSystemIOStreamWrapper kelas"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "Aspose.Page untuk C++"
description: "System::IO::BasicSystemIOStreamWrapper class. Mewakili pembungkus mirip std::iostream yang menggunakan BasicSystemIOStreamBuf sebagai buffer internal dalam C++."
type: docs
weight: 500
url: /id/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


Mewakili pembungkus mirip std::iostream yang menggunakan [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) sebagai buffer internal.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | Digunakan dalam konstruktor pindah dan operator penugasan pindah untuk menyetel ulang pointer dan memanggil [swap()](./swap/). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Membuat instance baru dari [BasicSystemIOStreamWrapper](./). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | Konstruktor penyalin. Dihapus. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | Konstruktor pemindahan. |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | Operator penugasan penyalin. Dihapus. |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | Operator penugasan pindah. |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | Panggilan untuk menukar *this dan **right**, jika keduanya tidak sama. |
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
