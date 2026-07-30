---
title: "System::IO::StringReader classe"
linktitle: "StringReader"
second_title: "Aspose.Font pour C++"
description: "System::IO::StringReader classe. Représente un lecteur qui lit des caractères à partir d'une chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2400
url: /fr/cpp/system.io/stringreader/
---
## StringReader class


Représente un lecteur qui lit des caractères à partir d'une chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class StringReader : public System::IO::TextReader
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Ferme le flux. |
| [Dispose](./dispose/)() override | Ne fait rien. |
| [Dispose](./dispose/)(bool) override | Ne fait rien. |
| [Peek](./peek/)() override | Lit un seul caractère du flux sans changer la position du flux. |
| [Read](./read/)() override | Lit un caractère unique du flux. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Lit le nombre spécifié de caractères du flux vers le tableau de caractères spécifié en commençant à la position indiquée. |
| [ReadLine](./readline/)() override | Lit les caractères du flux jusqu'à la fin de la ligne actuelle. |
| [ReadToEnd](./readtoend/)() override | Lit les caractères du flux jusqu'à la fin du flux. |
| [StringReader](./stringreader/)(const String\&) | Construit une nouvelle instance de la classe [StringReader](./) qui lit des caractères à partir de la chaîne spécifiée. |
## Voir aussi

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
