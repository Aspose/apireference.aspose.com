---
title: Class SVGListBaseT
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Collections.SVGListBase1T classe. Cette interface définit une liste de base de toutes les listes SVG.
type: docs
weight: 50
url: /fr/net/aspose.svg.collections/svglistbase-1/
---
## SVGListBase&lt;T&gt; class

Cette interface définit une liste de base de toutes les listes SVG.

```csharp
public abstract class SVGListBase<T> : SVGValueType, IEnumerable<T>
```

| Paramètre | La description |
| --- | --- |
| T | Type d'élément stocké dans la liste. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Item](../../aspose.svg.collections/svglistbase-1/item/) { get; set; } | Renvoie l'élément d'index de la liste. |
| [Length](../../aspose.svg.collections/svglistbase-1/length/) { get; } | Le nombre d'éléments dans la liste. |
| [NumberOfItems](../../aspose.svg.collections/svglistbase-1/numberofitems/) { get; } | Le nombre d'éléments dans la liste. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AppendItem](../../aspose.svg.collections/svglistbase-1/appenditem/)(T) | Insère un nouvel élément à la fin de la liste. |
| [Clear](../../aspose.svg.collections/svglistbase-1/clear/)() | Efface tous les éléments actuels existants de la liste, le résultat étant une liste vide. |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Libère les ressources non gérées et - éventuellement - gérées. |
| [GetEnumerator](../../aspose.svg.collections/svglistbase-1/getenumerator/)() | Obtient l'énumérateur. |
| [GetItem](../../aspose.svg.collections/svglistbase-1/getitem/)(ulong) | Renvoie l'élément spécifié de la liste. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Cette méthode est utilisée pour récupérer l'objet ECMAScriptType . |
| [Initialize](../../aspose.svg.collections/svglistbase-1/initialize/)(T) | Efface tous les éléments actuels existants de la liste et réinitialise la liste pour contenir l'élément unique spécifié par le paramètre. |
| [InsertItemBefore](../../aspose.svg.collections/svglistbase-1/insertitembefore/)(T, ulong) | Insère un nouvel élément dans la liste à la position spécifiée. Le premier élément porte le numéro 0. |
| [RemoveItem](../../aspose.svg.collections/svglistbase-1/removeitem/)(ulong) | Supprime un élément existant de la liste. |
| [ReplaceItem](../../aspose.svg.collections/svglistbase-1/replaceitem/)(T, ulong) | Remplace un élément existant dans la liste par un nouvel élément. |

### Voir également

* class [SVGValueType](../../aspose.svg.datatypes/svgvaluetype/)
* espace de noms [Aspose.Svg.Collections](../../aspose.svg.collections/)
* Assemblée [Aspose.SVG](../../)


