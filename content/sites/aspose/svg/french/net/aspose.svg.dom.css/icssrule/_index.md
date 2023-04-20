---
title: Interface ICSSRule
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Dom.Css.ICSSRule interface. Linterface CSSRule est linterface de base abstraite pour tout type dinstruction CSS. Cela inclut à la fois les ensembles de règles et les règles at. Une implémentation est censée préserver toutes les règles spécifiées dans une feuille de style CSS même si la règle nest pas reconnue par lanalyseur. Les règles non reconnues sont représentées à laide de laICSSUnknownRule interface.
type: docs
weight: 620
url: /fr/net/aspose.svg.dom.css/icssrule/
---
## ICSSRule interface

L'interface CSSRule est l'interface de base abstraite pour tout type d'instruction CSS. Cela inclut à la fois les ensembles de règles et les règles at. Une implémentation est censée préserver toutes les règles spécifiées dans une feuille de style CSS, même si la règle n'est pas reconnue par l'analyseur. Les règles non reconnues sont représentées à l'aide de la!:ICSSUnknownRule interface.

```csharp
public interface ICSSRule
```

## Propriétés

| Nom | La description |
| --- | --- |
| [CSSText](../../aspose.svg.dom.css/icssrule/csstext/) { get; set; } | La représentation textuelle analysable de la règle. Cela reflète l'état actuel de la règle et non sa valeur initiale. |
| [ParentRule](../../aspose.svg.dom.css/icssrule/parentrule/) { get; } | Si cette règle est contenue dans une autre règle (par exemple une règle de style dans un bloc @media), c'est la règle contenante. Si cette règle n'est pas imbriquée dans d'autres règles, cela renvoie null. |
| [ParentStyleSheet](../../aspose.svg.dom.css/icssrule/parentstylesheet/) { get; } | La feuille de style qui contient cette règle. |
| [Type](../../aspose.svg.dom.css/icssrule/type/) { get; } | Le type de la règle, tel que défini ci-dessus. On s'attend à ce que les méthodes de conversion spécifiques à la liaison puissent être utilisées pour convertir une instance de l'interface CSSRule en interface dérivée spécifique impliquée par le type. |

### Voir également

* espace de noms [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* Assemblée [Aspose.SVG](../../)


