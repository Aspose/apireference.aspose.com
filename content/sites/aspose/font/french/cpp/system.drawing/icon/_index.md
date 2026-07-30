---
title: "Classe System::Drawing::Icon"
linktitle: "Icône"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Icon. Représente une icône Windows. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.drawing/icon/
---
## Icon class


Représente une icône [Windows](../../system.windows/) . Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class Icon : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Height](./get_height/)() const | Renvoie la hauteur de l'icône. |
| [get_Width](./get_width/)() const | Renvoie la largeur de l'icône. |
| [Icon](./icon/)(const String\&) | Construit une nouvelle instance de la classe [Icon](./) qui représente une icône à partir du fichier spécifié. |
| [ToBitmap](./tobitmap/)() | Convertit l'objet actuel en un objet [Bitmap](../bitmap/). |
| virtual [~Icon](./~icon/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
