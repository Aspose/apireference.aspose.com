---
title: "Classe System::Drawing::PointF"
linktitle: "PointF"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::PointF. Représente une paire de coordonnées X et Y en virgule flottante simple précision d'un point sur un plan à deux dimensions. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 1800
url: /fr/cpp/system.drawing/pointf/
---
## PointF class


Représente une paire de coordonnées X et Y en virgule flottante simple précision d'un point sur un plan à deux dimensions. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../../system/smartptr/) pour gérer les objets de ce type.

```cpp
class PointF
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Add](./add/)(const PointF\&, const SizeF\&) | Ajoute les valeurs de largeur et de hauteur de l'objet [SizeF](../sizef/) spécifié aux valeurs des coordonnées X et Y de l'objet [PointF](./) spécifié, respectivement. |
| static [Add](./add/)(const PointF\&, const Size\&) | Ajoute les valeurs de largeur et de hauteur de l'objet [Size](../size/) spécifié aux valeurs des coordonnées X et Y de l'objet [PointF](./) spécifié, respectivement. |
| [Equals](./equals/)(const PointF\&) const | Détermine si l'objet actuel et l'objet spécifié sont égaux, c.-à-d. représentent la même paire de valeurs de coordonnées X et Y. |
| [get_IsEmpty](./get_isempty/)() const | Détermine si les valeurs des coordonnées X et Y sont toutes deux égales à 0. |
| [get_X](./get_x/)() const | Renvoie la valeur de la coordonnée X représentée par l'objet actuel. |
| [get_Y](./get_y/)() const | Renvoie la valeur de la coordonnée Y représentée par l'objet actuel. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage pour l'objet actuel. |
| [IsNull](./isnull/)() const | Retourne toujours false. |
| explicit [operator bool](./operatorbool/)() | Retourne toujours vrai. |
| [PointF](./pointf/)() | Construit un nouvel objet [PointF](./) et initialise ses valeurs de coordonnées X et Y à 0. |
| [PointF](./pointf/)(float, float) | Construit un nouvel objet [PointF](./) et l'initialise avec les valeurs spécifiées. |
| [PointF](./pointf/)(const SizeF\&) | Construit un nouvel objet [PointF](./) et initialise les valeurs de ses coordonnées X et Y avec les valeurs de largeur et de hauteur de l'objet [SizeF](../sizef/) spécifié, respectivement. |
| [set_X](./set_x/)(float) | Définit la valeur de la coordonnée X représentée par l'objet actuel. |
| [set_Y](./set_y/)(float) | Définit la valeur de la coordonnée Y représentée par l'objet actuel. |
| static [Subtract](./subtract/)(const PointF\&, const SizeF\&) | Soustrait les valeurs de largeur et de hauteur de l'objet [SizeF](../sizef/) spécifié des valeurs des coordonnées X et Y de l'objet [PointF](./) spécifié, respectivement. |
| static [Subtract](./subtract/)(const PointF\&, const Size\&) | Soustrait les valeurs de largeur et de hauteur de l'objet [Size](../size/) spécifié des valeurs des coordonnées X et Y de l'objet [PointF](./) spécifié, respectivement. |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de la paire de valeurs des coordonnées X et Y représentées par l'objet actuel. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](./empty/) | Une instance vide de la classe [PointF](./) dont les valeurs des coordonnées X et Y sont 0. |
## Voir aussi

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
