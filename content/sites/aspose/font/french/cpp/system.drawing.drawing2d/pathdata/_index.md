---
title: "System::Drawing::Drawing2D::PathData classe"
linktitle: "PathData"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Drawing2D::PathData classe. Contient les données graphiques qui représentent un chemin. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.drawing.drawing2d/pathdata/
---
## PathData class


Contient les données graphiques qui représentent un chemin. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class PathData : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Points](./get_points/)() | Renvoie un tableau contenant les points qui composent un chemin. |
| [get_Types](./get_types/)() | Renvoie un tableau contenant les valeurs qui spécifient les types des points correspondants dans le tableau **Points**. |
| [PathData](./pathdata/)() | Construit un objet [PathData](./) vide. |
| [set_Points](./set_points/)(const ArrayPtr\<PointF\>\&) | Définit un tableau contenant les points qui composent un chemin. |
| [set_Types](./set_types/)(const ArrayPtr\<uint8_t\>\&) | Définit un tableau contenant les valeurs qui spécifient les types des points correspondants dans le tableau **Points**. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
