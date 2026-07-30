---
title: "classe System::Drawing::RectangleF"
linktitle: "RectangleF"
second_title: "Aspose.Font pour C++"
description: "classe System::Drawing::RectangleF. Représente une zone rectangulaire d'une image définie par des coordonnées X et Y à virgule flottante simple précision de son coin supérieur gauche ainsi que sa largeur et sa hauteur. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 2000
url: /fr/cpp/system.drawing/rectanglef/
---
## RectangleF class


Représente une zone rectangulaire d'une image définie par des coordonnées X et Y à virgule flottante simple précision de son coin supérieur gauche ainsi que sa largeur et sa hauteur. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../../system/smartptr/) pour gérer les objets de ce type.

```cpp
class RectangleF
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Contains](./contains/)(float, float) | Détermine si le point spécifié se trouve à l'intérieur du rectangle représenté par l'objet actuel. |
| [Contains](./contains/)(const PointF\&) | Détermine si le point spécifié se trouve à l'intérieur du rectangle représenté par l'objet actuel. |
| [Contains](./contains/)(const RectangleF\&) | Détermine si le rectangle spécifié est situé à l'intérieur du rectangle représenté par l'objet actuel. |
| [Equals](./equals/)(const RectangleF\&) const | Détermine si les rectangles représentés par l'objet actuel et l'objet spécifié sont identiques. |
| static [FromLTRB](./fromltrb/)(float, float, float, float) | Construit un nouvel objet [RectangleF](./) qui représente un rectangle avec les emplacements de bord spécifiés. |
| [get_Bottom](./get_bottom/)() const | Renvoie la coordonnée y du bord inférieur du rectangle représenté par l'objet actuel. |
| [get_Height](./get_height/)() const | Renvoie la hauteur du rectangle représenté par l'objet actuel. |
| [get_IsEmpty](./get_isempty/)() const | Détermine si les coordonnées X et Y du coin supérieur gauche du rectangle représenté par l'objet actuel ainsi que sa largeur et sa hauteur ont des valeurs de 0. |
| [get_Left](./get_left/)() const | Renvoie la coordonnée X du bord gauche du rectangle représenté par l'objet actuel. |
| [get_Location](./get_location/)() const | Renvoie une instance de la classe [PointF](../pointf/) qui spécifie l'emplacement du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [get_Right](./get_right/)() const | Renvoie la coordonnée X du bord droit du rectangle représenté par l'objet actuel. |
| [get_Size](./get_size/)() const | Renvoie une instance de la classe [SizeF](../sizef/) qui spécifie la largeur et la hauteur du rectangle représenté par l'objet actuel. |
| [get_Top](./get_top/)() const | Renvoie la coordonnée Y du bord supérieur du rectangle représenté par l'objet actuel. |
| [get_Width](./get_width/)() const | Renvoie la largeur du rectangle représenté par l'objet actuel. |
| [get_X](./get_x/)() const | Renvoie la coordonnée X du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [get_Y](./get_y/)() const | Renvoie la coordonnée Y du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage de l'objet actuel. |
| [Inflate](./inflate/)(float, float) | Augmente la largeur et la hauteur du rectangle représenté par l'objet actuel, en conservant la position du centre géométrique du rectangle. La largeur et la hauteur sont augmentées dans les deux sens des quantités spécifiées. |
| [Inflate](./inflate/)(const SizeF\&) | Augmente la largeur et la hauteur du rectangle représenté par l'objet actuel, en conservant la position du centre géométrique du rectangle. La largeur et la hauteur sont augmentées dans les deux sens des quantités spécifiées par les valeurs de largeur et de hauteur de l'objet taille spécifié, respectivement. |
| static [Inflate](./inflate/)(const RectangleF\&, float, float) | Augmente la largeur et la hauteur du rectangle représenté par l'objet spécifié, en conservant la position du centre géométrique du rectangle. La largeur et la hauteur sont augmentées dans les deux sens des quantités spécifiées. |
| [Intersect](./intersect/)(const RectangleF\&) | Remplace le rectangle représenté par l'objet actuel par le rectangle résultant de son intersection avec le rectangle représenté par l'objet spécifié. |
| static [Intersect](./intersect/)(const RectangleF\&, const RectangleF\&) | Renvoie un rectangle qui est le résultat de l'intersection des rectangles spécifiés. |
| [IntersectsWith](./intersectswith/)(const RectangleF\&) | Détermine si les rectangles représentés par l'objet actuel et les objets spécifiés s'intersectent. |
| [Offset](./offset/)(const PointF\&) | Décale la position du rectangle représenté par l'objet actuel des quantités spécifiées. |
| [Offset](./offset/)(float, float) | Décale la position du rectangle représenté par l'objet actuel des quantités spécifiées. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Retourne toujours vrai. |
| [operator==](./operator==/)(std::nullptr_t) const | Retourne toujours false. |
| [RectangleF](./rectanglef/)() | Construit une nouvelle instance de l'objet [RectangleF](./) qui représente un rectangle avec les coordonnées X et Y ainsi que les valeurs de largeur et de hauteur réglées à 0. |
| [RectangleF](./rectanglef/)(float, float, float, float) | Construit une nouvelle instance de l'objet [RectangleF](./) qui représente un rectangle avec les coordonnées spécifiées de son coin supérieur gauche ainsi que la largeur et la hauteur. |
| [RectangleF](./rectanglef/)(const PointF\&, const SizeF\&) | Construit une nouvelle instance de l'objet [RectangleF](./) qui représente un rectangle avec les coordonnées de son coin supérieur gauche spécifiées comme une instance de la classe [PointF](../pointf/) et sa largeur et sa hauteur comme une instance de la classe [SizeF](../sizef/). |
| explicit [RectangleF](./rectanglef/)(const Rectangle\&) | Construit une nouvelle instance de l'objet [RectangleF](./) qui représente le rectangle équivalent à celui spécifié. |
| [set_Height](./set_height/)(float) | Définit la hauteur du rectangle représenté par l'objet actuel. |
| [set_Location](./set_location/)(PointF) | Définit la position du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [set_Size](./set_size/)(SizeF) | Définit la largeur et la hauteur du rectangle représenté par l'objet actuel. |
| [set_Width](./set_width/)(float) | Définit la largeur du rectangle représenté par l'objet actuel. |
| [set_X](./set_x/)(float) | Définit la coordonnée X du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [set_Y](./set_y/)(float) | Définit la coordonnée Y du coin supérieur gauche du rectangle représenté par l'objet actuel. |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de caractères de l'objet actuel. |
| static [Union](./union/)(const RectangleF\&, const RectangleF\&) | Renvoie un rectangle qui est le résultat de l'union des rectangles spécifiés. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](./empty/) | Un rectangle vide, c’est‑à‑dire un rectangle dont les valeurs de position et de taille sont nulles. |
## Voir aussi

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
