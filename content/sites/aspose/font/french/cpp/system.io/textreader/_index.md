---
title: "System::IO::TextReader class"
linktitle: "TextReader"
second_title: "Aspose.Font pour C++"
description: "System::IO::TextReader class. Une classe de base pour les classes qui représentent des lecteurs lisant des séquences de caractères à partir de différentes sources. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2600
url: /fr/cpp/system.io/textreader/
---
## TextReader class


Une classe de base pour les classes qui représentent des lecteurs lisant des séquences de caractères à partir de différentes sources. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class TextReader : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Close](./close/)() | Ferme le flux et libère les ressources acquises. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'objet actuel et ferme le flux sous-jacent. |
| virtual [Peek](./peek/)() | Lit un caractère unique du flux sans modifier le curseur de lecture du flux. |
| virtual [Read](./read/)() | Lit un caractère unique du flux. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Lit le nombre spécifié de caractères du flux et les écrit dans le tableau de caractères spécifié à partir de la position spécifiée. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | Lit le nombre maximal de caractères spécifié du lecteur de texte actuel et écrit les données dans un tampon, à partir de l'index spécifié. |
| virtual [ReadLine](./readline/)() | Lit les caractères du flux jusqu'à la fin de la ligne actuelle. |
| virtual [ReadToEnd](./readtoend/)() | Lit les caractères du flux jusqu'à la fin du flux. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
