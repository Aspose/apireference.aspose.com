---
title: "System::IO::BasicSystemIOStreamBuf classe"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Font pour C++"
description: "System::IO::BasicSystemIOStreamBuf classe. Représente un tampon qui encapsule des flux de type System::IO::Stream et permet de les utiliser comme tampon interne de flux de type std::iostream en C++."
type: docs
weight: 400
url: /fr/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


Représente un tampon qui encapsule des flux [System::IO::Stream](../stream/)-like et permet de les utiliser comme tampon interne de flux de type std::iostream.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | Utilisé dans le constructeur de déplacement et l'opérateur d'affectation de déplacement pour réinitialiser les pointeurs et appeler [swap()](./swap/). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | Construit une nouvelle instance de [BasicSystemIOStreamBuf](./). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | Construit une nouvelle instance de [BasicSystemIOStreamBuf](./). |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | Constructeur de copie. Supprimé. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | Constructeur de déplacement. |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | Opérateur d'affectation par copie. Supprimé. |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | Opérateur d'affectation par déplacement. |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | Appel à swap *this et right, s'ils ne sont pas égaux. |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | Destructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## Voir aussi

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
