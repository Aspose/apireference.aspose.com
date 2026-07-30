---
title: "Classe System::Console"
linktitle: "Console"
second_title: "Aspose.Font pour C++"
description: "Classe System::Console. Fournit des méthodes pour afficher des données sur le flux de sortie standard. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celle-ci par quelque moyen que ce soit en C++."
type: docs
weight: 1400
url: /fr/cpp/system/console/
---
## Console class


Fournit des méthodes pour écrire des données vers le flux de sortie standard. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit.

```cpp
class Console
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Beep](./beep/)() | NON IMPLEMENTÉ. |
| static [get_Error](./get_error/)() | Renvoie un pointeur partagé pointant vers l'objet qui représente le flux d'erreur standard. |
| static [get_In](./get_in/)() | Renvoie un pointeur partagé pointant vers l'objet qui représente le flux d'entrée standard. |
| static [get_Out](./get_out/)() | Renvoie un pointeur partagé pointant vers l'objet qui représente le flux de sortie standard. |
| static [Mute](./mute/)(bool) | Met en sourdine ou réactive le flux de sortie standard. |
| static [ReadKey](./readkey/)() | NON IMPLEMENTÉ. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Assigne l'objet spécifié à la propriété Error de la classe. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | Définit la propriété In avec l'objet TextReader spécifié. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Assigne l'objet spécifié à la propriété Out de la classe. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Affiche la représentation sous forme de chaîne de l'objet spécifié sur le flux de sortie standard. |
| static [Write](./write/)(bool) | Affiche la représentation sous forme de chaîne de la valeur booléenne sur le flux de sortie standard. |
| static [Write](./write/)(char_t) | Affiche la valeur de caractère spécifiée sur le flux de sortie standard. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Affiche la représentation sous forme de chaîne du tableau de caractères spécifié sur le flux de sortie standard. |
| static [Write](./write/)(const Decimal\&) | Affiche la représentation sous forme de chaîne de la valeur [Decimal](../decimal/) sur le flux de sortie standard. |
| static [Write](./write/)(double) | Affiche la représentation sous forme de chaîne de la valeur à virgule flottante double précision sur le flux de sortie standard. |
| static [Write](./write/)(float) | Affiche la représentation sous forme de chaîne de la valeur à virgule flottante simple précision sur le flux de sortie standard. |
| static [Write](./write/)(int32_t) | Affiche la représentation sous forme de chaîne de la valeur entière 32 bits sur le flux de sortie standard. |
| static [Write](./write/)(int64_t) | Affiche la représentation sous forme de chaîne de la valeur entière 64 bits sur le flux de sortie standard. |
| static [Write](./write/)(const String\&) | Affiche l'objet chaîne spécifié sur le flux de sortie standard. |
| static [Write](./write/)(const char_t *) | Affiche la chaîne C spécifiée sur le flux de sortie standard. |
| static [Write](./write/)(const TypeInfo\&) | Affiche la représentation sous forme de chaîne de la valeur [TypeInfo](../typeinfo/) sur le flux de sortie standard. |
| static [Write](./write/)(uint32_t) | Affiche la représentation sous forme de chaîne de la valeur entière non signée 32 bits sur le flux de sortie standard. |
| static [Write](./write/)(uint64_t) | Affiche la représentation sous forme de chaîne de la valeur entière non signée 64 bits sur le flux de sortie standard. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Affiche la représentation sous forme de chaîne de la plage spécifiée du tableau de caractères spécifié vers le flux de sortie standard. |
| static [Write](./write/)(const String\&, Args\&&...) | Affiche la représentation sous forme de chaîne des arguments spécifiés formatés selon le format spécifié vers le flux de sortie standard. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Affiche le séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Affiche la représentation sous forme de chaîne de l'objet spécifié suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(bool) | Affiche la représentation sous forme de chaîne de la valeur booléenne suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(char_t) | Affiche la valeur de caractère spécifiée suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Affiche la représentation sous forme de chaîne du tableau de caractères spécifié suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const Decimal\&) | Affiche la représentation sous forme de chaîne de la valeur [Decimal](../decimal/) suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(double) | Affiche la représentation sous forme de chaîne de la valeur à virgule flottante double précision suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(float) | Affiche la représentation sous forme de chaîne de la valeur à virgule flottante simple précision suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(int32_t) | Affiche la représentation sous forme de chaîne de la valeur entière 32 bits suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(int64_t) | Affiche la représentation sous forme de chaîne de la valeur entière 64 bits suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const String\&) | Affiche l'objet chaîne spécifié suivi du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const char_t *) | Affiche la chaîne C spécifiée suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Affiche la représentation sous forme de chaîne de la valeur [TypeInfo](../typeinfo/) suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(uint32_t) | Affiche la représentation sous forme de chaîne de la valeur entière non signée 32 bits suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(uint64_t) | Affiche la représentation sous forme de chaîne de la valeur entière non signée 64 bits suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Affiche la représentation sous forme de chaîne de la plage spécifiée du tableau de caractères spécifié suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const Exception\&) | Affiche la représentation sous forme de chaîne de l'objet [Exception](../exception/) spécifié suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Affiche la représentation sous forme de chaîne des arguments spécifiés formatés selon le format spécifié suivie du séparateur de ligne actuel vers le flux de sortie standard. |
| static [WriteLine](./writeline/)(const char *) |  |
## Remarques



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Affiche le message de bonjour.
  Console::WriteLine(u"Hello, world!");

  // Crée une instance de la classe 'std::array'.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // Affiche les éléments du tableau.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
