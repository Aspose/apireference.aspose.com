---
title: "System::IO::BasicSystemIOStreamWrapper classe"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "Aspose.Font per C++"
description: "System::IO::BasicSystemIOStreamWrapper classe. Rappresenta un wrapper simile a std::iostream che utilizza BasicSystemIOStreamBuf come buffer interno in C++."
type: docs
weight: 500
url: /it/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


Rappresenta un wrapper simile a std::iostream che utilizza [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) come buffer interno.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | Usato nel costruttore di spostamento e nell'operatore di assegnazione di spostamento per reimpostare i puntatori e chiamare [swap()](./swap/). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Costruisce una nuova istanza di [BasicSystemIOStreamWrapper](./). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | Costruttore di copia. Eliminato. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | Costruttore di spostamento. |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | Operatore di assegnazione di copia. Eliminato. |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | Operatore di assegnazione di spostamento. |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | Chiamata per scambiare *this e **right**, se non sono uguali. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## Vedi anche

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
