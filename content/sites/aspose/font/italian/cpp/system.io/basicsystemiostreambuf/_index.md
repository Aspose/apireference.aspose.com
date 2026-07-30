---
title: "System::IO::BasicSystemIOStreamBuf class"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Font per C++"
description: "System::IO::BasicSystemIOStreamBuf class. Rappresenta un buffer che avvolge flussi simili a System::IO::Stream e consente di usarli come buffer interno di flussi simili a std::iostream in C++."
type: docs
weight: 400
url: /it/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


Rappresenta un buffer che avvolge i flussi [System::IO::Stream](../stream/)-like e consente di usarli come buffer interno di flussi simili a std::iostream.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | Usato nel costruttore di spostamento e nell'operatore di assegnazione di spostamento per reimpostare i puntatori e chiamare [swap()](./swap/). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | Costruisce una nuova istanza di [BasicSystemIOStreamBuf](./). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | Costruisce una nuova istanza di [BasicSystemIOStreamBuf](./). |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | Costruttore di copia. Eliminato. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | Costruttore di spostamento. |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | Operatore di assegnazione di copia. Eliminato. |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | Operatore di assegnazione di spostamento. |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | Chiamata a swap *this e right, se non sono uguali. |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | Distruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## Vedi anche

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
