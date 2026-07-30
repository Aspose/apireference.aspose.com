---
title: "Classe System::Random"
linktitle: "Random"
second_title: "Aspose.Font pour C++"
description: "Classe System::Random. Représente un générateur de nombres pseudo-aléatoires. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() fonction. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 5200
url: /fr/cpp/system/random/
---
## Random class


Représente un générateur de nombres pseudo-aléatoires. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Random : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [IsNull](./isnull/)() const | Retourne toujours false. |
| virtual [Next](./next/)() | Renvoie un nombre aléatoire non négatif inférieur à la valeur maximale int32. |
| virtual [Next](./next/)(int32_t) | Renvoie un nombre aléatoire non négatif inférieur au maximum spécifié. |
| virtual [Next](./next/)(int32_t, int32_t) | Renvoie un nombre aléatoire dans la plage spécifiée. |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | Remplit les éléments du tableau d'octets spécifié avec des nombres aléatoires. |
| virtual [NextDouble](./nextdouble/)() | Renvoie un nombre aléatoire compris entre 0.0 et 1.0. |
| [Random](./random/)() | Initialise une nouvelle instance en utilisant une valeur de graine par défaut dépendante du temps. |
| [Random](./random/)(int32_t) | Initialise une nouvelle instance de la classe [System.Random](./) en utilisant la valeur de graine spécifiée. |
## Remarques



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // Obtenez un numéro de mois aléatoire et affichez-le.
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // Remplissez le tableau avec des nombres aléatoires.
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // Affichez le tableau.
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
