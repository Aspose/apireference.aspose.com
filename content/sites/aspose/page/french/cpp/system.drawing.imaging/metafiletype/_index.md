---
title: "System::Drawing::Imaging::MetafileType enum"
linktitle: "MetafileType"
second_title: "Aspose.Page pour C++"
description: "System::Drawing::Imaging::MetafileType enum. Représente un type de métafichier graphique en C++."
type: docs
weight: 2500
url: /fr/cpp/system.drawing.imaging/metafiletype/
---
## MetafileType enum


Représente un type de métafichier graphique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
enum class MetafileType
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Invalide | 0 | Métafichier invalide. |
| Wmf | 1 | WMF standard. |
| WmfPlaceable | 2 | Format [Metafile](../metafile/) placable. |
| Emf | 3 | EMF (pas EMF+). |
| EmfPlusOnly | 4 | EMF+ sans dual, enregistrements de niveau inférieur. |
| EmfPlusDual | 5 | EMF+ avec dual, enregistrements de niveau inférieur. |

## Voir aussi

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
