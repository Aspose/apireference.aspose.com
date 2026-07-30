---
title: "Classe System::Drawing::Rectangle"
linktitle: "Rectangle"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Rectangle. Représente une zone rectangulaire d'une image définie par les coordonnées entières X et Y de son coin supérieur gauche ainsi que sa largeur et sa hauteur. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 1900
url: /fr/cpp/system.drawing/rectangle/
---
## Rectangle class


Représente une zone rectangulaire d'une image définie par les coordonnées entières X et Y de son coin supérieur gauche ainsi que sa largeur et sa hauteur. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../../system/smartptr/) pour gérer les objets de ce type.

```cpp
class Rectangle
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Ceiling](./ceiling/)(const RectangleF\&) | Construit un objet [Rectangle](./) à partir de l'objet [RectangleF](../rectanglef/) spécifié en arrondissant les valeurs de position et de taille de l'objet [RectangleF](../rectanglef/) à l'entier supérieur suivant. |
| [Contains](./contains/)(int, int) const | Détermine si le point spécifié se trouve à l'intérieur du rectangle représenté par l'objet actuel. |
| [Contains](./contains/)(const Point\&) const | Détermine si le point spécifié se trouve à l'intérieur du rectangle représenté par l'objet actuel. |
| [Contains](./contains/)(const Rectangle\&) const | Détermine si le rectangle spécifié est situé à l'intérieur du rectangle représenté par l'objet actuel. |
| [Equals](./equals/)(const Rectangle\&) const | Détermine si les rectangles représentés par l'objet actuel et l'objet spécifié sont identiques. |
| static [FromLTRB](./fromltrb/)(int, int, int, int) | Construit un nouvel objet [Rectangle](./) qui représente un rectangle avec les emplacements de bord spécifiés. |
| [get_Bottom](./get_bottom/)() const | Renvoie la coordonnée y du bord inférieur du rectangle représenté par l'objet actuel. |
| [get_Height](./get_height/)() const | Renvoie la hauteur du rectangle représenté par l'objet actuel. |
| [get_IsEmpty](./get_isempty/)() const | Détermine si les coordonnées X et Y du coin supérieur gauche du rectangle représenté par l'objet actuel ainsi que sa largeur et sa hauteur ont des valeurs de 0. |
| [get_Left](./get_left/)() const | Renvoie la coordonnée X du bord gauche du rectangle représenté par l'objet actuel. |
| [get_Location](./get_location/)() const | Renvoie une instance de la classe [Point](../point/) qui indique l'emplacement du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [get_Right](./get_right/)() const | Renvoie la coordonnée X du bord droit du rectangle représenté par l'objet actuel. |
| [get_Size](./get_size/)() const | Renvoie une instance de la classe [Size](../size/) qui indique la largeur et la hauteur du rectangle représenté par l'objet actuel. |
| [get_Top](./get_top/)() const | Renvoie la coordonnée Y du bord supérieur du rectangle représenté par l'objet actuel. |
| [get_Width](./get_width/)() const | Renvoie la largeur du rectangle représenté par l'objet actuel. |
| [get_X](./get_x/)() const | Renvoie la coordonnée X du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [get_Y](./get_y/)() const | Renvoie la coordonnée Y du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage de l'objet actuel. |
| [Inflate](./inflate/)(int, int) | Augmente la largeur et la hauteur du rectangle représenté par l'objet actuel, en conservant la position du centre géométrique du rectangle. La largeur et la hauteur sont augmentées dans les deux sens des quantités spécifiées. |
| [Inflate](./inflate/)(const Size\&) | Augmente la largeur et la hauteur du rectangle représenté par l'objet actuel, en conservant la position du centre géométrique du rectangle. La largeur et la hauteur sont augmentées dans les deux sens des quantités spécifiées par les valeurs de largeur et de hauteur de l'objet taille spécifié, respectivement. |
| static [Inflate](./inflate/)(const Rectangle\&, int, int) | Augmente la largeur et la hauteur du rectangle représenté par l'objet spécifié, en conservant la position du centre géométrique du rectangle. La largeur et la hauteur sont augmentées dans les deux sens des quantités spécifiées. |
| [Intersect](./intersect/)(const Rectangle\&) | Remplace le rectangle représenté par l'objet actuel par le rectangle résultant de son intersection avec le rectangle représenté par l'objet spécifié. |
| static [Intersect](./intersect/)(const Rectangle\&, const Rectangle\&) | Renvoie un rectangle qui est le résultat de l'intersection des rectangles spécifiés. |
| [IntersectsWith](./intersectswith/)(const Rectangle\&) | Détermine si les rectangles représentés par l'objet actuel et les objets spécifiés s'intersectent. |
| [Offset](./offset/)(const Point\&) | Décale la position du rectangle représenté par l'objet actuel des quantités spécifiées. |
| [Offset](./offset/)(int, int) | Décale la position du rectangle représenté par l'objet actuel des quantités spécifiées. |
| [operator RectangleF](./operatorrectanglef/)() const | Renvoie un objet [RectangleF](../rectanglef/) qui représente un rectangle équivalent au rectangle représenté par l'objet actuel. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Retourne toujours vrai. |
| [operator==](./operator==/)(std::nullptr_t) const | Retourne toujours false. |
| [Rectangle](./rectangle/)() | Construit une nouvelle instance de l'objet [Rectangle](./) qui représente un rectangle avec les coordonnées X et Y ainsi que les valeurs de largeur et de hauteur réglées à 0. |
| [Rectangle](./rectangle/)(int, int, int, int) | Construit une nouvelle instance de l'objet [Rectangle](./) qui représente un rectangle avec les coordonnées spécifiées de son coin supérieur gauche ainsi que sa largeur et sa hauteur. |
| [Rectangle](./rectangle/)(const Point\&, const Size\&) | Construit une nouvelle instance de l'objet [Rectangle](./) qui représente un rectangle dont les coordonnées du coin supérieur gauche sont spécifiées comme une instance de la classe [Point](../point/) et dont la largeur et la hauteur sont spécifiées comme une instance de la classe [Size](../size/). |
| [Rectangle](./rectangle/)(const System::Windows::Forms::Screen::Rectangle_\&) | Construit une nouvelle instance de l'objet [Rectangle](./) qui représente le rectangle équivalent à celui spécifié. |
| static [Round](./round/)(const RectangleF\&) | Construit un objet [Rectangle](./) à partir de l'objet [RectangleF](../rectanglef/) spécifié en arrondissant les valeurs de position et de taille de l'objet [RectangleF](../rectanglef/) à l'entier le plus proche. |
| [set_Height](./set_height/)(int) | Définit la hauteur du rectangle représenté par l'objet actuel. |
| [set_Location](./set_location/)(Point) | Définit la position du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [set_Size](./set_size/)(Size) | Définit la largeur et la hauteur du rectangle représenté par l'objet actuel. |
| [set_Width](./set_width/)(int) | Définit la largeur du rectangle représenté par l'objet actuel. |
| [set_X](./set_x/)(int) | Définit la coordonnée X du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [set_Y](./set_y/)(int) | Définit la coordonnée Y du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de caractères de l'objet actuel. |
| static [Truncate](./truncate/)(const RectangleF\&) | Construit un objet [Rectangle](./) à partir de l'objet [RectangleF](../rectanglef/) spécifié en tronquant les valeurs de position et de taille de l'objet [RectangleF](../rectanglef/) à l'entier inférieur suivant. |
| static [Union](./union/)(const Rectangle\&, const Rectangle\&) | Renvoie un rectangle qui est le résultat de l'union des rectangles spécifiés. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](./empty/) | Un rectangle vide, c’est‑à‑dire un rectangle dont les valeurs de position et de taille sont nulles. |
## Voir aussi

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
