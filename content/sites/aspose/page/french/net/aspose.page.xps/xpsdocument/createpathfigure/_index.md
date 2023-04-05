---
title: XpsDocument.CreatePathFigure
second_title: Aspose.Page pour la référence de l'API .NET
description: XpsDocument méthode. Crée une nouvelle figure de chemin.
type: docs
weight: 280
url: /fr/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

Crée une nouvelle figure de chemin.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| startPoint | PointF | Le point de départ du premier segment de la figure du chemin. |
| isClosed | Boolean | Spécifie si le chemin est fermé. S'il est défini sur true, le trait est dessiné "fermé", c'est-à-dire que le dernier point du dernier segment de la figure de chemin est connecté avec le point spécifié dans l'attribut StartPoint, sinon le trait est dessiné "ouvert" et le dernier le point n'est pas connecté au point de départ. Applicable uniquement si la figure de chemin is est utilisée dans un élément {Path} qui spécifie un trait. |

### Return_Value

Nouvelle figure de chemin.

### Voir également

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* espace de noms [Aspose.Page.XPS](../../xpsdocument/)
* Assemblée [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

Crée une nouvelle figure de chemin.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| startPoint | PointF | Le point de départ du premier segment de la figure du chemin. |
| segments | List`1 | Liste des segments de chemin. |
| isClosed | Boolean | Spécifie si le chemin est fermé. S'il est défini sur true, le trait est dessiné "fermé", c'est-à-dire que le dernier point du dernier segment de la figure de chemin est connecté avec le point spécifié dans l'attribut StartPoint, sinon le trait est dessiné "ouvert" et le dernier le point n'est pas connecté au point de départ. Applicable uniquement si la figure de chemin is est utilisée dans un élément {Path} qui spécifie un trait. |

### Return_Value

Nouvelle figure de chemin.

### Voir également

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* espace de noms [Aspose.Page.XPS](../../xpsdocument/)
* Assemblée [Aspose.Page](../../../)


