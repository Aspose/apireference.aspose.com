---
title: "System::IO::BasicSystemOStreamWrapper class"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSystemOStreamWrapper class. Representeert een std::ostream-achtige wrapper die BasicSystemIOStreamBuf gebruikte als interne buffer in C++."
type: docs
weight: 700
url: /nl/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


Representeert een std::ostream-achtige wrapper die [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) gebruikte als interne buffer.

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | Gebruikt in de move-constructor en move-toewijzingsoperator om pointers te resetten en [swap()](./swap/) aan te roepen. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Construeert een nieuw exemplaar van de [BasicSystemOStreamWrapper](./). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | Copy‑constructor. Verwijderd. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | Move-constructor. |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | Copy‑toewijzingsoperator. Verwijderd. |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | Verplaatsings-toewijzingsoperator. |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | Aanroep om *this en **right** te verwisselen, als ze niet gelijk zijn. |
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
