---
title: "System::Boolean classe"
linktitle: "Booléen"
second_title: "Aspose.Page pour C++"
description: "System::Boolean classe. Classe qui conserve les membres statiques du type System.Boolean .Net en C++."
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
  // Créez la variable booléenne.
  bool isWeekend = false;

  // Analysez la chaîne d'entrée et affichez le résultat.
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
* Library [Aspose.Page for C++](../../)
