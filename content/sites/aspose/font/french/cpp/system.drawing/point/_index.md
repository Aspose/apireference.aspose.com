---
title: "Classe System::Drawing::Point"
linktitle: "Point"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Point. Représente une paire de coordonnées entières X et Y d'un point sur un plan à deux dimensions. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 1700
url: /fr/cpp/system.drawing/point/
---
## Point class


Représente une paire de coordonnées entières X et Y d'un point sur un plan à deux dimensions. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../../system/smartptr/) pour gérer les objets de ce type.

```cpp
class Point
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Add](./add/)(const Point\&, const Size\&) | Ajoute les valeurs de largeur et de hauteur de l'objet [Size](../size/) spécifié aux valeurs des coordonnées X et Y de l'objet [Point](./) spécifié de manière correspondante. |
| static [Ceiling](./ceiling/)(const PointF\&) | Construit un objet [Point](./) à partir de l'objet [PointF](../pointf/) spécifié en arrondissant les valeurs des coordonnées X et Y de l'objet [PointF](../pointf/) à l'entier supérieur suivant. |
| [Equals](./equals/)(const Point\&) const | Détermine si l'objet actuel et l'objet spécifié sont égaux, c.-à-d. représentent la même paire de valeurs de coordonnées X et Y. |
| [get_IsEmpty](./get_isempty/)() const | Détermine si les valeurs des coordonnées X et Y sont toutes deux égales à 0. |
| [get_X](./get_x/)() const | Renvoie la valeur de la coordonnée X représentée par l'objet actuel. |
| [get_Y](./get_y/)() const | Renvoie la valeur de la coordonnée Y représentée par l'objet actuel. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage pour l'objet actuel. |
| [getStdHash](./getstdhash/)() const | Renvoie une valeur de hachage pour l'objet actuel. |
| [IsNull](./isnull/)() const | Retourne toujours false. |
| [Offset](./offset/)(int, int) | Décale les valeurs des coordonnées X et Y représentées par l'objet actuel des valeurs spécifiées. |
| [Offset](./offset/)(Point) | Décale les coordonnées X et Y représentées par l'objet actuel des valeurs des coordonnées X et Y représentées par l'objet [Point](./) spécifié de manière correspondante. |
| [operator PointF](./operatorpointf/)() const | Construit une instance de l'objet [PointF](../pointf/) et l'initialise avec les valeurs des coordonnées X et Y de l'objet [Point](./) actuel. |
| [operator Size](./operatorsize/)() const | Construit une instance de l'objet [Size](../size/) et initialise ses valeurs de largeur et de hauteur avec les valeurs des coordonnées X et Y représentées par l'objet actuel de manière correspondante. |
| [Point](./point/)() | Construit un nouvel objet [Point](./) et initialise ses valeurs de coordonnées X et Y à 0. |
| [Point](./point/)(int, int) | Construit un nouvel objet [Point](./) et l'initialise avec les valeurs spécifiées. |
| [Point](./point/)(const Size\&) | Construit un nouvel objet [Point](./) et initialise ses valeurs de coordonnées X et Y avec les valeurs de largeur et de hauteur de l'objet [SizeF](../sizef/) spécifié de manière correspondante. |
| [Point](./point/)(int) | Construit un nouvel objet [Point](./) et initialise sa valeur de coordonnée X avec une valeur formée par les 16 bits supérieurs de l'entier 32 bits spécifié, et sa valeur de coordonnée Y avec une valeur formée par les 16 bits inférieurs de la même valeur entière 32 bits. |
| static [Round](./round/)(const PointF\&) | Construit un objet [Point](./) à partir de l'objet [PointF](../pointf/) spécifié en arrondissant les valeurs des coordonnées X et Y de l'objet [PointF](../pointf/) à l'entier le plus proche. |
| [set_X](./set_x/)(int) | Définit la valeur de la coordonnée X représentée par l'objet actuel. |
| [set_Y](./set_y/)(int) | Définit la valeur de la coordonnée Y représentée par l'objet actuel. |
| static [Subtract](./subtract/)(const Point\&, const Size\&) | Soustrait les valeurs de largeur et de hauteur de l'objet [Size](../size/) spécifié des valeurs des coordonnées X et Y de l'objet [Point](./) spécifié de manière correspondante. |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de la paire de valeurs des coordonnées X et Y représentées par l'objet actuel. |
| static [Truncate](./truncate/)(const PointF\&) | Construit un objet [Point](./) à partir de l'objet [PointF](../pointf/) spécifié en tronquant les valeurs des coordonnées X et Y de l'objet [PointF](../pointf/) à l'entier inférieur suivant. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](./empty/) | Une instance vide de la classe [Point](./) dont les valeurs des coordonnées X et Y sont 0. |
## Voir aussi

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
