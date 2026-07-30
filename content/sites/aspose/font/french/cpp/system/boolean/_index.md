---
title: "classe System::Boolean"
linktitle: "Boolean"
second_title: "Aspose.Font pour C++"
description: "classe System::Boolean. Classe qui conserve les membres statiques du type .Net System.Boolean en C++."
type: docs
weight: 600
url: /fr/cpp/system/boolean/
---
## Boolean class


Classe qui conserve les membres statiques du type [System.Boolean](./) .[Net](../../system.net/).

```cpp
class Boolean
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Convertit la chaîne spécifiée en une valeur de type bool. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Convertit la chaîne spécifiée en une valeur de type bool. |
## Champs

| Champ | Description |
| --- | --- |
| static [FalseString](./falsestring/) | Représentation [String](../string/) de la valeur booléenne 'false'. |
| static [TrueString](./truestring/) | Représentation [String](../string/) de la valeur booléenne 'true'. |
## Remarques



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Crée la variable booléenne.
  bool isWeekend = false;

  // Analyse la chaîne d'entrée et affiche le résultat.
  if (Boolean::TryParse(u"True", isWeekend))
  {
    std::cout << "Is weekend: " << (isWeekend ? "Yes" : "No");
  }
  else
  {
    std::cerr << "Something went wrong" << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
Is weekend: Yes
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
