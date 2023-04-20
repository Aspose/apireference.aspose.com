---
title: Interface ICSSKeyframesRule
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Dom.Css.ICSSKeyframesRule interface. Linterface CSSKeyframesRule représente un ensemble complet dimages clés pour une seule animation
type: docs
weight: 580
url: /fr/net/aspose.svg.dom.css/icsskeyframesrule/
---
## ICSSKeyframesRule interface

L'interface CSSKeyframesRule représente un ensemble complet d'images clés pour une seule animation

```csharp
public interface ICSSKeyframesRule : ICSSRule
```

## Propriétés

| Nom | La description |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icsskeyframesrule/cssrules/) { get; } | Cet attribut donne accès aux images clés de la liste |
| [Name](../../aspose.svg.dom.css/icsskeyframesrule/name/) { get; } | Cet attribut est le nom des images clés, utilisé par la propriété 'animation-name'. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AppendRule](../../aspose.svg.dom.css/icsskeyframesrule/appendrule/)(string) | La méthode appendRule ajoute la CSSKeyframeRule passée dans la liste à la clé passée |
| [DeleteRule](../../aspose.svg.dom.css/icsskeyframesrule/deleterule/)(string) | La méthode deleteRule supprime la CSSKeyframeRule avec la clé transmise. Si une règle avec cette clé n'existe pas, la méthode ne fait rien |
| [FindRule](../../aspose.svg.dom.css/icsskeyframesrule/findrule/)(string) | La méthode findRule renvoie la règle avec une clé correspondant à la clé transmise. Si aucune règle de ce type n'existe, une valeur nulle est renvoyée |

### Voir également

* interface [ICSSRule](../icssrule/)
* espace de noms [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* Assemblée [Aspose.SVG](../../)


