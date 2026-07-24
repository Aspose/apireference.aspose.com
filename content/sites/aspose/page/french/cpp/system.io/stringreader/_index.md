---
title: "System::IO::StringReader classe"
linktitle: "StringReader"
second_title: "Aspose.Page pour C++"
description: "System::IO::StringReader classe. Représente un lecteur qui lit des caractères à partir d'une chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 2400
url: /fr/cpp/system.io/stringreader/
---
## StringReader class


Représente un lecteur qui lit des caractères à partir d'une chaîne. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Lit le nombre spécifié de caractères du flux dans le tableau de caractères spécifié en commençant à la position spécifiée. |
| [ReadLine](./readline/)() override | Lit les caractères du flux jusqu'à la fin de la ligne actuelle. |
| [ReadToEnd](./readtoend/)() override | Lit les caractères du flux jusqu'à la fin du flux. |
| [StringReader](./stringreader/)(const String\&) | Construit une nouvelle instance de la classe [StringReader](./) qui lit des caractères à partir de la chaîne spécifiée. |
## Voir aussi

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
