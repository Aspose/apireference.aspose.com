---
title: "classe System::Drawing::Drawing2D::GraphicsPath"
linktitle: "GraphicsPath"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Drawing2D::GraphicsPath. Représente un ensemble de lignes et de courbes connectées. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


Représente un ensemble de lignes et de courbes connectées. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class GraphicsPath : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | Ajoute l'arc elliptique spécifié au chemin représenté par l'objet actuel. |
| [AddArc](./addarc/)(int, int, int, int, float, float) | Ajoute l'arc elliptique spécifié au chemin représenté par l'objet actuel. |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | Ajoute l'arc elliptique spécifié au chemin représenté par l'objet actuel. |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | Ajoute l'arc elliptique spécifié au chemin représenté par l'objet actuel. |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | Ajoute la courbe de Bézier cubique spécifiée au chemin représenté par l'objet actuel. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | Ajoute la courbe de Bézier cubique spécifiée au chemin représenté par l'objet actuel. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | Ajoute la courbe de Bézier cubique spécifiée au chemin représenté par l'objet actuel. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | Ajoute la courbe de Bézier cubique spécifiée au chemin représenté par l'objet actuel. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | Ajoute une séquence de courbes de Bézier cubiques connectées à la figure actuelle. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | Ajoute une séquence de courbes de Bézier cubiques connectées à la figure actuelle. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | Ajoute la courbe fermée spécifiée au chemin représenté par l'objet actuel. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | Ajoute la courbe fermée spécifiée au chemin représenté par l'objet actuel. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | Ajoute la courbe spécifiée au chemin représenté par l'objet actuel. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | Ajoute la courbe spécifiée au chemin représenté par l'objet actuel. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | Ajoute la courbe spécifiée au chemin représenté par l'objet actuel. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | Ajoute la courbe spécifiée au chemin représenté par l'objet actuel. |
| [AddEllipse](./addellipse/)(float, float, float, float) | Ajoute l'ellipse spécifiée au chemin représenté par l'objet actuel. |
| [AddEllipse](./addellipse/)(int, int, int, int) | Ajoute l'ellipse spécifiée au chemin représenté par l'objet actuel. |
| [AddEllipse](./addellipse/)(const RectangleF\&) | Ajoute l'ellipse spécifiée au chemin représenté par l'objet actuel. |
| [AddEllipse](./addellipse/)(const Rectangle\&) | Ajoute l'ellipse spécifiée au chemin représenté par l'objet actuel. |
| [AddLine](./addline/)(const Point\&, const Point\&) | Ajoute la ligne spécifiée au chemin représenté par l'objet actuel. |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | Ajoute la ligne spécifiée au chemin représenté par l'objet actuel. |
| [AddLine](./addline/)(int, int, int, int) | Ajoute la ligne spécifiée au chemin représenté par l'objet actuel. |
| [AddLine](./addline/)(float, float, float, float) | Ajoute la ligne spécifiée au chemin représenté par l'objet actuel. |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | Ajoute la série de segments de ligne connectés spécifiée au chemin représenté par l'objet actuel. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | Ajoute la série de segments de ligne connectés spécifiée au chemin représenté par l'objet actuel. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | Ajoute le chemin spécifié au chemin représenté par l'objet actuel. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | Ajoute le contour spécifié de la forme en secteur au chemin représenté par l'objet actuel. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | Ajoute le contour spécifié de la forme en secteur au chemin représenté par l'objet actuel. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | Ajoute le contour spécifié de la forme en secteur au chemin représenté par l'objet actuel. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | Ajoute le polygone spécifié au chemin représenté par l'objet actuel. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | Ajoute le polygone spécifié au chemin représenté par l'objet actuel. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | Ajoute le rectangle spécifié au chemin représenté par l'objet actuel. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | Ajoute le rectangle spécifié au chemin représenté par l'objet actuel. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | Ajoute la série de rectangles spécifiée au chemin représenté par l'objet actuel. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | Ajoute la série de rectangles spécifiée au chemin représenté par l'objet actuel. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | Ajoute une chaîne de texte au chemin représenté par l'objet actuel. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | Ajoute une chaîne de texte au chemin représenté par l'objet actuel. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | Ajoute une chaîne de texte au chemin représenté par l'objet actuel. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | Ajoute une chaîne de texte au chemin représenté par l'objet actuel. |
| virtual [Clone](./clone/)() | Crée une copie de l'objet actuel. |
| [CloseAllFigures](./closeallfigures/)() | Ferme toutes les figures ouvertes et en démarre une nouvelle. |
| [CloseFigure](./closefigure/)() | Ferme la figure actuelle et en démarre une nouvelle. |
| [Dispose](./dispose/)() | Libère toutes les ressources du système d'exploitation acquises par l'objet actuel. |
| [Flatten](./flatten/)() | Aplati chaque courbe du chemin en les convertissant en une série de lignes connectées. La valeur de platitude de 0.25 est utilisée. |
| [Flatten](./flatten/)(const MatrixPtr\&) | Aplati chaque courbe du chemin en les convertissant en une série de lignes connectées. La valeur de platitude de 0.25 est utilisée. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | Aplati chaque courbe du chemin en les convertissant en une série de lignes connectées. |
| [get_FillMode](./get_fillmode/)() | Renvoie le mode de remplissage de l'objet actuel. |
| [get_PathData](./get_pathdata/)() | Renvoie un objet [PathData](../pathdata/) contenant les points qui composent le chemin représenté par l'objet actuel ainsi que leurs types. |
| [get_PathPoints](./get_pathpoints/)() const | Renvoie un tableau contenant les points qui composent le chemin représenté par l'objet actuel. |
| [get_PathTypes](./get_pathtypes/)() const | Renvoie un tableau contenant des valeurs indiquant les types des points qui composent un chemin représenté par l'objet actuel. |
| [get_PointCount](./get_pointcount/)() const | Renvoie le nombre de points du chemin représenté par l'objet actuel. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | Renvoie un objet [RectangleF](../../system.drawing/rectanglef/) qui représente un rectangle englobant le chemin représenté par l'objet actuel lorsqu'il est transformé avec la matrice spécifiée. |
| [GetFigureFlags](./getfigureflags/)() | Renvoie une valeur qui est une combinaison binaire des valeurs Detail::FigureType indiquant quels types de figures sont contenus dans le chemin représenté par l'objet actuel. |
| [GetLastPoint](./getlastpoint/)() const | Renvoie un objet [PointF](../../system.drawing/pointf/) représentant le dernier point du chemin. |
| [GraphicsPath](./graphicspath/)(FillMode) | Construit une nouvelle instance de la classe [GraphicsPath](./) avec le mode de remplissage spécifié. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Construit une nouvelle instance de l'objet [GraphicsPath](./) qui représente le chemin spécifié. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Construit une nouvelle instance de l'objet [GraphicsPath](./) qui représente le chemin spécifié. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | Indique si le point spécifié est contenu à l'intérieur (ou sous) du contour de ce [GraphicsPath](./) lorsqu'il est dessiné avec le [Pen](../../system.drawing/pen/) spécifié. NON IMPLEMENTÉ. |
| [IsVisible](./isvisible/)(const PointF\&) | Détermine si le point spécifié est contenu dans le chemin représenté par l'objet actuel. |
| [IsVisible](./isvisible/)(float, float) | Détermine si le point spécifié est contenu dans le chemin représenté par l'objet actuel. |
| [Reset](./reset/)() | Vide le chemin en supprimant tous les points qu'il contient. |
| [Reverse](./reverse/)() | Inverse l'ordre des points dans le tableau PathPoints de ce [GraphicsPath](./). |
| [set_FillMode](./set_fillmode/)(FillMode) | Définit le mode de remplissage de l'objet actuel. |
| [SetMarkers](./setmarkers/)() | NON IMPLEMENTÉ. |
| [StartFigure](./startfigure/)() | Démarre une nouvelle figure. |
| [Transform](./transform/)(const MatrixPtr\&) | Transforme le chemin représenté par l'objet actuel en appliquant la matrice de transformation spécifiée. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | Remplace ce chemin par un contour autour du chemin original. |
| [~GraphicsPath](./~graphicspath/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
