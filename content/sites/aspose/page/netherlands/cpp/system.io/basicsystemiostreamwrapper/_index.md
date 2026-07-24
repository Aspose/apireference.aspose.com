---
title: "System::IO::BasicSystemIOStreamWrapper klasse"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSystemIOStreamWrapper klasse. Vertegenwoordigt een std::iostream-achtige wrapper die BasicSystemIOStreamBuf gebruikt als interne buffer in C++."
type: docs
weight: 500
url: /nl/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


Vertegenwoordigt een std::iostream-achtige wrapper die [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) gebruikt als interne buffer.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | Gebruikt in de move-constructor en move-toewijzingsoperator om pointers te resetten en [swap()](./swap/) aan te roepen. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Construeert een nieuw exemplaar van de [BasicSystemIOStreamWrapper](./). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | Copy‑constructor. Verwijderd. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | Move-constructor. |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | Copy‑toewijzingsoperator. Verwijderd. |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | Verplaatsings-toewijzingsoperator. |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | Aanroep om *this en **right** te verwisselen, als ze niet gelijk zijn. |
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
