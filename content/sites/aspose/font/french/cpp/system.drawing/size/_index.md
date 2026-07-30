---
title: "Classe System::Drawing::Size"
linktitle: "Taille"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Size. Représente une paire de valeurs entières qui correspondent à la largeur et à la hauteur d'une image. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer des objets de ce type en C++."
type: docs
weight: 2200
url: /fr/cpp/system.drawing/size/
---
## Size class


Représente une paire de valeurs entières qui correspondent à la largeur et à la hauteur d'une image. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../../system/smartptr/) pour gérer des objets de ce type.

```cpp
class Size
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Add](./add/)(const Size\&, const Size\&) | Renvoie un nouvel objet [Size](./) qui est la somme de l'objet [Size](./) spécifié, c'est‑à‑dire dont la valeur de largeur est égale à la somme des largeurs des objets spécifiés et dont la valeur de hauteur est égale à la somme des hauteurs des objets spécifiés. |
| static [Ceiling](./ceiling/)(const SizeF\&) | Construit un objet [Size](./) à partir de l'objet [SizeF](../sizef/) spécifié en arrondissant les valeurs de largeur et de hauteur de l'objet [SizeF](../sizef/) à l'entier supérieur le plus proche. |
| [Equals](./equals/)(const Size\&) const | Détermine si l'objet actuel et l'objet spécifié sont égaux, c'est‑à‑dire représentent la même paire de valeurs de largeur et de hauteur. |
| [get_Height](./get_height/)() const | Renvoie la valeur de hauteur représentée par l'objet actuel. |
| [get_IsEmpty](./get_isempty/)() const | Détermine si les valeurs de largeur et de hauteur sont toutes deux égales à 0. |
| [get_Width](./get_width/)() const | Renvoie la valeur de largeur représentée par l'objet actuel. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage pour l'objet actuel. |
| [operator Point](./operatorpoint/)() const | Construit une instance de l'objet [Point](../point/) et initialise ses coordonnées X et Y avec les valeurs de largeur et de hauteur de l'objet actuel respectivement. |
| [operator SizeF](./operatorsizef/)() const | Construit une instance de l'objet [SizeF](../sizef/) et l'initialise avec les valeurs de largeur et de hauteur de l'objet [Size](./) actuel. |
| static [Round](./round/)(const SizeF\&) | Construit un objet [Size](./) à partir de l'objet [SizeF](../sizef/) spécifié en arrondissant les valeurs de largeur et de hauteur de l'objet [SizeF](../sizef/) à l'entier le plus proche. |
| [set_Height](./set_height/)(int) | Définit la valeur de hauteur représentée par l'objet actuel. |
| [set_Width](./set_width/)(int) | Définit la valeur de largeur représentée par l'objet actuel. |
| [Size](./size/)() | Construit un nouvel objet [Size](./) et initialise ses valeurs de largeur et de hauteur à 0. |
| [Size](./size/)(const Point\&) | Construit un nouvel objet [Size](./) et initialise ses valeurs de largeur et de hauteur avec les valeurs des coordonnées X et Y du point spécifié respectivement. |
| [Size](./size/)(int, int) | Construit un nouvel objet [Size](./) et l'initialise avec la valeur spécifiée. |
| static [Subtract](./subtract/)(const Size\&, const Size\&) | Renvoie un nouvel objet [Size](./) qui est le résultat de la soustraction de **size2** à partir de **size1**, c'est‑à‑dire dont la valeur de largeur est le résultat de la soustraction de la largeur de **size2's** à la largeur de **size1's** et dont la valeur de hauteur est le résultat de la soustraction de la hauteur de **size2's** à la hauteur de **size1's**. |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de la paire de valeurs de largeur et de hauteur représentées par l'objet actuel. |
| static [Truncate](./truncate/)(const SizeF\&) | Construit un objet [Size](./) à partir de l'objet [SizeF](../sizef/) spécifié en tronquant les valeurs de largeur et de hauteur de l'objet [SizeF](../sizef/) à l'entier inférieur le plus proche. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](./empty/) | Une instance vide de la classe [Size](./) dont les valeurs de largeur et de hauteur sont 0. |
## Voir aussi

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
