---
title: Class NodeList
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Collections.NodeList classe. La NodeList fournit labstraction dune collection ordonnée de nœuds sans définir ni contraindre la façon dont cette collection est implémentée.
type: docs
weight: 40
url: /fr/net/aspose.svg.collections/nodelist/
---
## NodeList class

La NodeList fournit l'abstraction d'une collection ordonnée de nœuds, sans définir ni contraindre la façon dont cette collection est implémentée.

```csharp
public abstract class NodeList : DOMObject, IEnumerable<Node>
```

## Propriétés

| Nom | La description |
| --- | --- |
| abstract [Item](../../aspose.svg.collections/nodelist/item/) { get; } | La méthode renvoie l'élément d'index de la collection. Si index est supérieur ou égal au nombre de nœuds dans la liste, cela renvoie null. |
| abstract [Length](../../aspose.svg.collections/nodelist/length/) { get; } | Le nombre de nœuds dans la liste. |

## Méthodes

| Nom | La description |
| --- | --- |
| abstract [GetEnumerator](../../aspose.svg.collections/nodelist/getenumerator/)() | Renvoie un énumérateur qui parcourt la collection. |
| override [GetPlatformType](../../aspose.svg.collections/nodelist/getplatformtype/)() | Cette méthode est utilisée pour récupérer l'objet ECMAScriptType . |

### Voir également

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Node](../../aspose.svg.dom/node/)
* espace de noms [Aspose.Svg.Collections](../../aspose.svg.collections/)
* Assemblée [Aspose.SVG](../../)


