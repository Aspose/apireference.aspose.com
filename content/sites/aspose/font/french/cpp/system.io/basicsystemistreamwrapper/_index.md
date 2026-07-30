---
title: "Classe System::IO::BasicSystemIStreamWrapper"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::BasicSystemIStreamWrapper. Représente un wrapper de type std::istream qui utilise BasicSystemIOStreamBuf comme tampon interne en C++."
type: docs
weight: 600
url: /fr/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


Représente un wrapper de type std::istream qui utilise [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) comme tampon interne.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | Utilisé dans le constructeur de déplacement et l'opérateur d'affectation de déplacement pour réinitialiser les pointeurs et appeler [swap()](./swap/). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Construit une nouvelle instance de [BasicSystemIStreamWrapper](./). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | Constructeur de copie. Supprimé. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | Constructeur de déplacement. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | Opérateur d'affectation par copie. Supprimé. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | Opérateur d'affectation par déplacement. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | Appel à swap *this et **right**, s'ils ne sont pas égaux. |
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
