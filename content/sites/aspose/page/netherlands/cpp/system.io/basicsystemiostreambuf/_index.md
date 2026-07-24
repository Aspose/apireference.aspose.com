---
title: "System::IO::BasicSystemIOStreamBuf class"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSystemIOStreamBuf class. Representeert een buffer die System::IO::Stream-achtige streams omsluit en toestaat ze te gebruiken als een interne buffer voor std::iostream-achtige streams in C++."
type: docs
weight: 400
url: /nl/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


Representeert een buffer die [System::IO::Stream](../stream/)-achtige streams omsluit en toestaat ze te gebruiken als een interne buffer voor std::iostream-achtige streams.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | Gebruikt in de move-constructor en move-toewijzingsoperator om pointers te resetten en [swap()](./swap/) aan te roepen. |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | Construeert een nieuw exemplaar van de [BasicSystemIOStreamBuf](./). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | Construeert een nieuw exemplaar van de [BasicSystemIOStreamBuf](./). |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | Copy‑constructor. Verwijderd. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | Move-constructor. |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | Copy‑toewijzingsoperator. Verwijderd. |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | Verplaatsings-toewijzingsoperator. |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | Aanroep van swap *this en right, als ze niet gelijk zijn. |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | Destructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## Zie ook

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
