---
title: "Classe System::IO::BasicSystemOStreamWrapper"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Font per C++"
description: "Classe System::IO::BasicSystemOStreamWrapper. Rappresenta un wrapper simile a std::ostream che utilizza BasicSystemIOStreamBuf come buffer interno in C++."
type: docs
weight: 700
url: /it/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


Rappresenta un wrapper simile a std::ostream che utilizza [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) come buffer interno.

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | Usato nel costruttore di spostamento e nell'operatore di assegnazione di spostamento per reimpostare i puntatori e chiamare [swap()](./swap/). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Crea una nuova istanza di [BasicSystemOStreamWrapper](./). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | Costruttore di copia. Eliminato. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | Costruttore di spostamento. |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | Operatore di assegnazione di copia. Eliminato. |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | Operatore di assegnazione di spostamento. |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | Chiamata per scambiare *this e **right**, se non sono uguali. |
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
