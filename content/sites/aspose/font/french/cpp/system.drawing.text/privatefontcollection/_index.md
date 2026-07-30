---
title: "System::Drawing::Text::PrivateFontCollection classe"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Text::PrivateFontCollection classe. Représente une collection de familles de polices fournies par l'application cliente. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


Représente une collection de familles de polices fournies par l'application cliente. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | Ajoute la police spécifiée à la collection. |
| [AddFontFile](./addfontfile/)(const String\&) | Ajoute une police depuis le fichier spécifié à la collection. |
| [get_Families](./get_families/)() override | Renvoie un tableau d'objets [FontFamily](../../system.drawing/fontfamily/) associés à la collection de polices représentée par l'objet actuel. |
## Voir aussi

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Font for C++](../../)
