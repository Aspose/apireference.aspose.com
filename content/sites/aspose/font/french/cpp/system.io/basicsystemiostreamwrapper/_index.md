---
title: "System::IO::BasicSystemIOStreamWrapper class"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "Aspose.Font pour C++"
description: "System::IO::BasicSystemIOStreamWrapper class. Représente un wrapper de type std::iostream qui utilise BasicSystemIOStreamBuf comme tampon interne en C++."
type: docs
weight: 500
url: /fr/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


Représente un wrapper de type std::iostream qui utilise [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) comme tampon interne.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | Utilisé dans le constructeur de déplacement et l'opérateur d'affectation de déplacement pour réinitialiser les pointeurs et appeler [swap()](./swap/). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Construit une nouvelle instance de [BasicSystemIOStreamWrapper](./). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | Constructeur de copie. Supprimé. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | Constructeur de déplacement. |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | Opérateur d'affectation par copie. Supprimé. |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | Opérateur d'affectation par déplacement. |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | Appel à swap *this et **right**, s'ils ne sont pas égaux. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## Voir aussi

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
