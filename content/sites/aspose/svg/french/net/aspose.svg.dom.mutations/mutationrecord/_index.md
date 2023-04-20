---
title: Class MutationRecord
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Dom.Mutations.MutationRecord classe. Un MutationRecord représente une mutation DOM individuelle. Cest lobjet qui est passé àMutationObserver sMutationCallback .
type: docs
weight: 1140
url: /fr/net/aspose.svg.dom.mutations/mutationrecord/
---
## MutationRecord class

Un MutationRecord représente une mutation DOM individuelle. C'est l'objet qui est passé à[`MutationObserver`](../mutationobserver/) s[`MutationCallback`](../mutationcallback/) .

```csharp
public class MutationRecord : DOMObject
```

## Propriétés

| Nom | La description |
| --- | --- |
| [AddedNodes](../../aspose.svg.dom.mutations/mutationrecord/addednodes/) { get; } | Renvoie les nœuds ajoutés. |
| [AttributeName](../../aspose.svg.dom.mutations/mutationrecord/attributename/) { get; } | Renvoie le nom local de l'attribut modifié, et null sinon. |
| [AttributeNamespace](../../aspose.svg.dom.mutations/mutationrecord/attributenamespace/) { get; } | Renvoie l'espace de noms de l'attribut modifié, et null sinon. |
| [NextSibling](../../aspose.svg.dom.mutations/mutationrecord/nextsibling/) { get; } | Renvoie le frère suivant des nœuds ajoutés ou supprimés, ou null. |
| [OldValue](../../aspose.svg.dom.mutations/mutationrecord/oldvalue/) { get; } | La valeur de retour dépend du type. Pour "attributes", c'est la valeur de l'attribut changé avant le changement. Pour "characterData", c'est la donnée du noeud changé avant le changement. Pour "childList", c'est null. |
| [PreviousSibling](../../aspose.svg.dom.mutations/mutationrecord/previoussibling/) { get; } | Renvoie le frère précédent des nœuds ajoutés ou supprimés, ou null. |
| [RemovedNodes](../../aspose.svg.dom.mutations/mutationrecord/removednodes/) { get; } | Renvoie les nœuds supprimés. |
| [Target](../../aspose.svg.dom.mutations/mutationrecord/target/) { get; } | Renvoie le nœud affecté par la mutation, selon le type. Pour les "attributs", il s'agit de l'élément dont l'attribut a changé. Pour "characterData", il s'agit du noeud CharacterData. Pour "childList", c'est le nœud dont les enfants ont changé. |
| [Type](../../aspose.svg.dom.mutations/mutationrecord/type/) { get; } | Renvoie "attributes" s'il s'agissait d'une mutation d'attribut, "characterData" s'il s'agissait d'une mutation vers un nœud CharacterData et "childList" s'il s'agissait d'une mutation vers l'arborescence des nœuds. |

## Méthodes

| Nom | La description |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Cette méthode est utilisée pour récupérer l'objet ECMAScriptType . |

### Voir également

* class [DOMObject](../../aspose.svg.dom/domobject/)
* espace de noms [Aspose.Svg.Dom.Mutations](../../aspose.svg.dom.mutations/)
* Assemblée [Aspose.SVG](../../)


