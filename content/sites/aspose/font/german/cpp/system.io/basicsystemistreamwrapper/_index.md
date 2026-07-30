---
title: "System::IO::BasicSystemIStreamWrapper Klasse"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Font für C++"
description: "System::IO::BasicSystemIStreamWrapper Klasse. Stellt einen std::istream‑ähnlichen Wrapper dar, der BasicSystemIOStreamBuf als internen Puffer in C++ verwendet."
type: docs
weight: 600
url: /de/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


Stellt einen std::istream‑ähnlichen Wrapper dar, der [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) als internen Puffer verwendet.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | Wird im Move-Konstruktor und Move-Zuweisungsoperator verwendet, um Zeiger zurückzusetzen und [swap()](./swap/) aufzurufen. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Konstruiert eine neue Instanz von [BasicSystemIStreamWrapper](./). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | Kopierkonstruktor. Gelöscht. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | Move-Konstruktor. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | Kopierzuweisungsoperator. Gelöscht. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | Move-Zuweisungsoperator. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | Aufruf zum Tauschen von *this und **right**, falls sie nicht gleich sind. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## Siehe auch

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
