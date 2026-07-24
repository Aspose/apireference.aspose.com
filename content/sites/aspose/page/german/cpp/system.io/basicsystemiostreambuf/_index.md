---
title: "System::IO::BasicSystemIOStreamBuf Klasse"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Page für C++"
description: "System::IO::BasicSystemIOStreamBuf Klasse. Stellt einen Puffer dar, der [System::IO::Stream](../stream/)-ähnliche Streams einwickelt und es ermöglicht, sie als internen Puffer von std::iostream-ähnlichen Streams in C++ zu verwenden."
type: docs
weight: 400
url: /de/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


Stellt einen Puffer dar, der [System::IO::Stream](../stream/)-ähnliche Streams einwickelt und es ermöglicht, sie als internen Puffer von std::iostream-ähnlichen Streams zu verwenden.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | Wird im Move-Konstruktor und Move-Zuweisungsoperator verwendet, um Zeiger zurückzusetzen und [swap()](./swap/) aufzurufen. |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | Konstruiert eine neue Instanz von [BasicSystemIOStreamBuf](./). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | Konstruiert eine neue Instanz von [BasicSystemIOStreamBuf](./). |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | Kopierkonstruktor. Gelöscht. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | Move-Konstruktor. |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | Kopierzuweisungsoperator. Gelöscht. |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | Move-Zuweisungsoperator. |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | Aufruf zum Vertauschen von *this und right, falls sie nicht gleich sind. |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | Destruktor. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## Siehe auch

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
