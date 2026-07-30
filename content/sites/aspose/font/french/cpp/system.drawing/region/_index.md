---
title: "System::Drawing::Region classe"
linktitle: "Region"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Region classe. Représente l'intérieur d'une forme graphique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2100
url: /fr/cpp/system.drawing/region/
---
## Region class


Représente l'intérieur d'une forme graphique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class Region : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() const | Renvoie une copie de l'objet actuel. |
| [Complement](./complement/)(const RectangleF\&) | Remplace la région représentée par l'objet actuel par la partie de la région définie par le rectangle spécifié qui n'intersecte pas cette région. |
| [Complement](./complement/)(const Rectangle\&) | Remplace la région représentée par l'objet actuel par la partie de la région définie par le rectangle spécifié qui n'intersecte pas cette région. |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Remplace la région représentée par l'objet actuel par la partie de la région définie par le chemin spécifié qui n'intersecte pas cette région. |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | Remplace la région représentée par l'objet actuel par la partie de la région spécifiée qui n'intersecte pas cette région. |
| [Dispose](./dispose/)() | Libère toutes les ressources du système d'exploitation acquises par l'objet actuel. |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | Détermine si la région spécifiée est identique à la région représentée par l'objet actuel sur la surface de dessin spécifiée. |
| [Exclude](./exclude/)(const RectangleF\&) | Remplace la région représentée par l'objet actuel par le résultat de l'exclusion de la région définie par le rectangle spécifié. |
| [Exclude](./exclude/)(const Rectangle\&) | Remplace la région représentée par l'objet actuel par le résultat de l'exclusion de la région définie par le rectangle spécifié. |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Remplace la région représentée par l'objet actuel par le résultat de l'exclusion de la région définie par le chemin spécifié. |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | Remplace la région représentée par l'objet actuel par le résultat de l'exclusion de la région spécifiée. |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | Obtient une structure [RectangleF](../rectanglef/) qui représente un rectangle englobant ce [Region](./) sur la surface de dessin d'un objet [Graphics](../graphics/). |
| [GetRegionData](./getregiondata/)() const | Renvoie un objet RegionData contenant les données qui définissent la région représentée par l'objet actuel. |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | Renvoie un tableau de structures [RectangleF](../rectanglef/) qui approximent ce [Region](./) après l'application de la transformation matricielle spécifiée. |
| [Intersect](./intersect/)(const RectangleF\&) | Remplace la région représentée par l'objet actuel par le résultat de l'intersection de cette région avec une région définie par le rectangle spécifié. |
| [Intersect](./intersect/)(const Rectangle\&) | Remplace la région représentée par l'objet actuel par le résultat de l'intersection de cette région avec une région définie par le rectangle spécifié. |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Remplace la région représentée par l'objet actuel par le résultat de l'intersection de cette région et d'une région définie par le chemin spécifié. |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | Remplace la région représentée par l'objet actuel par le résultat de l'intersection de cette région et de la région spécifiée. |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | Détermine si la région représentée par l'objet actuel a un intérieur vide sur la surface de dessin spécifiée. |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | Détermine si la région représentée par l'objet actuel a un intérieur infini sur la surface de dessin spécifiée. |
| [IsVisible](./isvisible/)(const Point\&) const | Détermine si le point spécifié est contenu dans la région représentée par l'objet actuel. |
| [IsVisible](./isvisible/)(const PointF\&) const | Détermine si le point spécifié est contenu dans la région représentée par l'objet actuel. |
| [IsVisible](./isvisible/)(const Rectangle\&) | Détermine si une partie du rectangle spécifié est contenue dans la région représentée par l'objet actuel. |
| [IsVisible](./isvisible/)(const RectangleF\&) | Détermine si une partie du rectangle spécifié est contenue dans la région représentée par l'objet actuel. |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | Détermine si le point spécifié est contenu dans la région représentée par l'objet actuel en utilisant les graphiques spécifiés. |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | Détermine si le point spécifié est contenu dans la région représentée par l'objet actuel en utilisant les graphiques spécifiés. |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | Détermine si une partie du rectangle spécifié est contenue dans la région représentée par l'objet actuel en utilisant les graphiques spécifiés. |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | Détermine si une partie du rectangle spécifié est contenue dans la région représentée par l'objet actuel en utilisant les graphiques spécifiés. |
| [IsVisible](./isvisible/)(float, float) const | Détermine si le point spécifié est contenu dans la région représentée par l'objet actuel. |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | Détermine si le point spécifié est contenu dans la région représentée par l'objet actuel en utilisant les graphiques spécifiés. |
| [MakeEmpty](./makeempty/)() | Initialise l'objet actuel avec un intérieur vide. |
| [MakeInfinite](./makeinfinite/)() | Initialise cet objet région avec un intérieur infini. |
| [Region](./region/)() | Construit une nouvelle instance de la classe [Region](./). |
| [Region](./region/)(const RectangleF\&) | Construit une nouvelle instance de la classe [Region](./) qui représente une région définie par le rectangle spécifié. |
| [Region](./region/)(const Rectangle\&) | Construit une nouvelle instance de la classe [Region](./) qui représente une région définie par le rectangle spécifié. |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Construit une nouvelle instance de la classe [Region](./) qui représente une région définie par le chemin spécifié. |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | Construit une nouvelle instance de la classe [Region](./) qui représente une région définie par l'objet RegionData spécifié. |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Transforme cette région par la matrice spécifiée. |
| [Transform](./transform/)(const SkMatrix\&) | Transforme cette région par la matrice spécifiée. |
| [Translate](./translate/)(int, int) | Déplace les coordonnées de la région de la valeur spécifiée. |
| [Translate](./translate/)(float, float) | Déplace les coordonnées de la région de la valeur spécifiée. |
| [Union](./union/)(const RectangleF\&) | Remplace la région représentée par l'objet actuel par le résultat de l'opération d'union de cette région et d'une région définie par le rectangle spécifié. |
| [Union](./union/)(const Rectangle\&) | Remplace la région représentée par l'objet actuel par le résultat de l'union de cette région et d'une région définie par le rectangle spécifié. |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Remplace la région représentée par l'objet actuel par le résultat de l'union de cette région et d'une région définie par le chemin spécifié. |
| [Union](./union/)(const SharedPtr\<Region\>\&) | Remplace la région représentée par l'objet actuel par le résultat de l'union de cette région et de la région spécifiée. |
| [Xor](./xor/)(const RectangleF\&) | Remplace la région représentée par l'objet actuel par les parties de cette région et de la région définie par le rectangle spécifié qui ne s'intersectent pas. |
| [Xor](./xor/)(const Rectangle\&) | Remplace la région représentée par l'objet actuel par les parties de cette région et de la région définie par le rectangle spécifié qui ne s'intersectent pas. |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Remplace la région représentée par l'objet actuel par les parties de cette région et de la région définie par le chemin spécifié qui ne s'intersectent pas. |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | Remplace la région représentée par l'objet actuel par les parties de cette région et de la région spécifiée qui ne s'intersectent pas. |
| virtual [~Region](./~region/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
