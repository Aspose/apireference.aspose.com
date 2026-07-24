---
title: "System::IO::BasicSystemIOStreamBuf class"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Page untuk C++"
description: "System::IO::BasicSystemIOStreamBuf class. Mewakili buffer yang membungkus aliran mirip System::IO::Stream dan memungkinkan mereka digunakan sebagai buffer internal aliran mirip std::iostream dalam C++."
type: docs
weight: 400
url: /id/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


Mewakili buffer yang membungkus aliran mirip [System::IO::Stream](../stream/)-like streams dan memungkinkan mereka digunakan sebagai buffer internal aliran mirip std::iostream.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | Digunakan dalam konstruktor pindah dan operator penugasan pindah untuk menyetel ulang pointer dan memanggil [swap()](./swap/). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | Membuat instance baru dari [BasicSystemIOStreamBuf](./). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | Membuat instance baru dari [BasicSystemIOStreamBuf](./). |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | Konstruktor penyalin. Dihapus. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | Konstruktor pemindahan. |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | Operator penugasan penyalin. Dihapus. |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | Operator penugasan pindah. |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | Panggilan untuk menukar *this dan right, jika keduanya tidak sama. |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | Destruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## Lihat Juga

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
