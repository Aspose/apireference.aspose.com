---
title: "Aspose::Font::RenderingPath::IPathSegment classe"
linktitle: "IPathSegment"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::RenderingPath::IPathSegment classe. Représente l'interface de tout segment de chemin en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.font.renderingpath/ipathsegment/
---
## IPathSegment class


Représente l'interface de tout segment de chemin.

```cpp
class IPathSegment : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<IPathSegment\>) |  |
| virtual [Copy](./copy/)() | Crée une copie de l'objet segment. |
| virtual [Shift](./shift/)(double, double) | Effectue un décalage selon les coordonnées x et y. |
| virtual [Transform](./transform/)(System::SharedPtr\<TransformationMatrix\>) | Transforme les coordonnées avec la matrice de transformation. |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font::RenderingPath](../)
* Library [Aspose.Font for C++](../../)
