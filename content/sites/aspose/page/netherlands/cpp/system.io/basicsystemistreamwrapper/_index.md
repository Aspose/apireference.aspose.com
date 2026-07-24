---
title: "System::IO::BasicSystemIStreamWrapper klasse"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSystemIStreamWrapper klasse. Vertegenwoordigt een std::istream-achtige wrapper die BasicSystemIOStreamBuf gebruikt als interne buffer in C++."
type: docs
weight: 600
url: /nl/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


Vertegenwoordigt een std::istream-achtige wrapper die [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) gebruikt als interne buffer.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | Gebruikt in de move-constructor en move-toewijzingsoperator om pointers te resetten en [swap()](./swap/) aan te roepen. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Construeert een nieuw exemplaar van de [BasicSystemIStreamWrapper](./). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | Copy‑constructor. Verwijderd. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | Move-constructor. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | Copy‑toewijzingsoperator. Verwijderd. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | Verplaatsings-toewijzingsoperator. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | Aanroep om *this en **right** te verwisselen, als ze niet gelijk zijn. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## Zie ook

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
