---
title: "System::Drawing::Drawing2D::ColorBlend classe"
linktitle: "ColorBlend"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Drawing2D::ColorBlend class. Contient des tableaux de couleurs et de positions utilisés pour interpoler le mélange de couleurs dans un dégradé multicolore. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.drawing.drawing2d/colorblend/
---
## ColorBlend class


Contient des tableaux de couleurs et de positions utilisés pour interpoler le mélange de couleurs dans un dégradé multicolore. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class ColorBlend : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ColorBlend](./colorblend/)() | Construit une nouvelle instance de la classe [ColorBlend](./). |
| [ColorBlend](./colorblend/)(int) | Construit une nouvelle instance de la classe [Blend](../blend/). |
| [get_Colors](./get_colors/)() | Renvoie un tableau de couleurs à utiliser aux positions correspondantes le long d'un dégradé. |
| [get_Positions](./get_positions/)() | Renvoie le tableau des positions de mélange le long d'un dégradé. |
| [set_Colors](./set_colors/)(const ArrayPtr\<Color\>\&) | Définit un tableau de couleurs à utiliser aux positions correspondantes le long d'un dégradé. |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | Définit le tableau des positions de mélange le long d'un dégradé. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
