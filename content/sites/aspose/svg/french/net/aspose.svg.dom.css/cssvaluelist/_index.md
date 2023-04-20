---
title: Class CSSValueList
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Dom.Css.CSSValueList classe. Linterface CSSValueList fournit labstraction dune collection ordonnée de valeurs CSS.
type: docs
weight: 500
url: /fr/net/aspose.svg.dom.css/cssvaluelist/
---
## CSSValueList class

L'interface CSSValueList fournit l'abstraction d'une collection ordonnée de valeurs CSS.

```csharp
public class CSSValueList : CSSValue, ICSSValueList, IEnumerable<CSSValue>
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [CSSValueList](cssvaluelist/#constructor)() | Initialise une nouvelle instance du`CSSValueList` classe. |
| [CSSValueList](cssvaluelist/#constructor_1)(params CSSValue[]) | Initialise une nouvelle instance du`CSSValueList` classe. |
| [CSSValueList](cssvaluelist/#constructor_2)(IEnumerable&lt;CSSValue&gt;) | Initialise une nouvelle instance du`CSSValueList` classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| override [CSSText](../../aspose.svg.dom.css/cssvaluelist/csstext/) { get; set; } | Une représentation sous forme de chaîne de la valeur actuelle. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | Un code définissant le type de la valeur. |
| [Item](../../aspose.svg.dom.css/cssvaluelist/item/) { get; } | Obtient le[`CSSValue`](../cssvalue/) à l'index spécifié. |
| [Length](../../aspose.svg.dom.css/cssvaluelist/length/) { get; } | Le nombre de CSSValues dans la liste. |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | Détermine si la valeur spécifiéeObject est égal à cette instance. |
| [GetEnumerator](../../aspose.svg.dom.css/cssvaluelist/getenumerator/)() | Renvoie un énumérateur qui parcourt la collection. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | Renvoie un code de hachage pour cette instance. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvaluelist/getplatformtype/)() | Cette méthode est utilisée pour récupérer l'objet ECMAScriptType . |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | Renvoie unString qui représente cette instance. |

### Voir également

* class [CSSValue](../cssvalue/)
* interface [ICSSValueList](../icssvaluelist/)
* espace de noms [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* Assemblée [Aspose.SVG](../../)


