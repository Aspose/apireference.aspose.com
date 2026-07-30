---
title: "System::IO::BasicSystemIStreamWrapper classe"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Font per C++"
description: "System::IO::BasicSystemIStreamWrapper classe. Rappresenta un wrapper simile a std::istream che utilizza BasicSystemIOStreamBuf come buffer interno in C++."
type: docs
weight: 600
url: /it/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


Rappresenta un wrapper simile a std::istream che utilizza [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) come buffer interno.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | Usato nel costruttore di spostamento e nell'operatore di assegnazione di spostamento per reimpostare i puntatori e chiamare [swap()](./swap/). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Costruisce una nuova istanza di [BasicSystemIStreamWrapper](./). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | Costruttore di copia. Eliminato. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | Costruttore di spostamento. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | Operatore di assegnazione di copia. Eliminato. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | Operatore di assegnazione di spostamento. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | Chiamata per scambiare *this e **right**, se non sono uguali. |
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
