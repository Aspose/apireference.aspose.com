---
title: "System::IO::BasicSystemOStreamWrapper classe"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Font pour C++"
description: "System::IO::BasicSystemOStreamWrapper classe. Représente un wrapper de type std::ostream qui utilise BasicSystemIOStreamBuf comme tampon interne en C++."
type: docs
weight: 700
url: /fr/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


Représente un wrapper de type std::ostream qui utilise [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) comme tampon interne.

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | Utilisé dans le constructeur de déplacement et l'opérateur d'affectation de déplacement pour réinitialiser les pointeurs et appeler [swap()](./swap/). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Construit une nouvelle instance de [BasicSystemOStreamWrapper](./). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | Constructeur de copie. Supprimé. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | Constructeur de déplacement. |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | Opérateur d'affectation par copie. Supprimé. |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | Opérateur d'affectation par déplacement. |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | Appel à swap *this et **right**, s'ils ne sont pas égaux. |
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
