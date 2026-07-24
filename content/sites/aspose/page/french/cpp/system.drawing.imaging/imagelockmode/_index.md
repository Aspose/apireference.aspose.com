---
title: "System::Drawing::Imaging::ImageLockMode enum"
linktitle: "ImageLockMode"
second_title: "Aspose.Page pour C++"
description: "System::Drawing::Imaging::ImageLockMode enum. Spécifie les propriétés de la région d'une image verrouillée en C++."
type: docs
weight: 2300
url: /fr/cpp/system.drawing.imaging/imagelockmode/
---
## ImageLockMode enum


Spécifie les propriétés de la région d'une image verrouillée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
enum class ImageLockMode
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| ReadOnly | 1 | La région est verrouillée uniquement en lecture. |
| WriteOnly | 2 | La région est verrouillée uniquement en écriture. |
| ReadWrite | n/a | La région est verrouillée à la fois en lecture et en écriture. |
| UserInputBuffer | 4 | L'image se trouve dans un tampon d'entrée utilisateur, dont l'accès est contrôlé par l'utilisateur. |

## Voir aussi

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
