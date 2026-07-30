---
title: "System::IO::BasicSystemOStreamWrapper Klasse"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Font für C++"
description: "System::IO::BasicSystemOStreamWrapper Klasse. Stellt einen std::ostream-ähnlichen Wrapper dar, der BasicSystemIOStreamBuf als internen Puffer in C++ verwendet."
type: docs
weight: 700
url: /de/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


Stellt einen std::ostream-ähnlichen Wrapper dar, der [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) als internen Puffer verwendet.

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | Wird im Move-Konstruktor und Move-Zuweisungsoperator verwendet, um Zeiger zurückzusetzen und [swap()](./swap/) aufzurufen. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Konstruiert eine neue Instanz des [BasicSystemOStreamWrapper](./). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | Kopierkonstruktor. Gelöscht. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | Move-Konstruktor. |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | Kopierzuweisungsoperator. Gelöscht. |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | Move-Zuweisungsoperator. |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | Aufruf zum Tauschen von *this und **right**, falls sie nicht gleich sind. |
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
