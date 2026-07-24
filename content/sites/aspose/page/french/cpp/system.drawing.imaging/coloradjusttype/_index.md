---
title: "System::Drawing::Imaging::ColorAdjustType énum"
linktitle: "ColorAdjustType"
second_title: "Aspose.Page pour C++"
description: "System::Drawing::Imaging::ColorAdjustType énum. Spécifie quels objets utilisent les informations d'ajustement des couleurs en C++."
type: docs
weight: 1500
url: /fr/cpp/system.drawing.imaging/coloradjusttype/
---
## ColorAdjustType enum


Spécifie quels objets utilisent les informations d'ajustement des couleurs. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
enum class ColorAdjustType
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Default | 0 | Définit les informations d'ajustement des couleurs utilisées par tous les objets qui n'ont pas leurs propres informations d'ajustement des couleurs. |
| Bitmap | 1 | Définit les informations d'ajustement des couleurs pour les objets [Bitmap](../../system.drawing/bitmap/). |
| Brush | 2 | Définit les informations d'ajustement des couleurs pour les objets [Brush](../../system.drawing/brush/). |
| Pen | 3 | Définit les informations d'ajustement des couleurs pour les objets [Pen](../../system.drawing/pen/). |
| Text | 4 | Définit les informations d'ajustement des couleurs pour le texte. |
| Nombre | 5 | Spécifie le nombre de types spécifiés. |
| Tout | 6 | Spécifie le nombre de types spécifiés. |

## Voir aussi

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
