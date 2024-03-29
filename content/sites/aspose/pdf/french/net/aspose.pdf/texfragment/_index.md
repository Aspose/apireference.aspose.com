---
title: TeXFragment
second_title: Référence de l'API Aspose.PDF pour .NET
description: Représente un fragment TeX.
type: docs
weight: 6560
url: /fr/net/aspose.pdf/texfragment/
---
## TeXFragment class

Représente un fragment TeX.

```csharp
public class TeXFragment : FormattedFragment
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [TeXFragment](texfragment#constructor)(string) | Initialise une nouvelle instance de la classe HtmlFragment. |
| [TeXFragment](texfragment#constructor_1)(string, bool) | Initialise une nouvelle instance de la classe HtmlFragment. |

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [HorizontalAlignment](../../aspose.pdf/baseparagraph/horizontalalignment) { get; set; } | Obtient ou définit un alignement horizontal du paragraphe |
| virtual [Hyperlink](../../aspose.pdf/baseparagraph/hyperlink) { get; set; } | Obtient ou définit le lien hypertexte du fragment (pour le générateur de pdf). |
| [IsFirstParagraphInColumn](../../aspose.pdf/baseparagraph/isfirstparagraphincolumn) { get; set; } | Obtient ou définit une valeur booléenne qui indique si ce paragraphe sera dans la colonne suivante. La valeur par défaut est false.(for pdf generation) |
| [IsInLineParagraph](../../aspose.pdf/baseparagraph/isinlineparagraph) { get; set; } | Obtient ou définit qu'un paragraphe est en ligne. La valeur par défaut est false.(pour la génération de pdf) |
| [IsInNewPage](../../aspose.pdf/baseparagraph/isinnewpage) { get; set; } | Obtient ou définit une valeur booléenne qui force la génération de ce paragraphe sur une nouvelle page. La valeur par défaut est false.(for pdf generation) |
| [IsKeptWithNext](../../aspose.pdf/baseparagraph/iskeptwithnext) { get; set; } | Obtient ou définit une valeur booléenne qui indique si le paragraphe actuel reste dans la même page avec le paragraphe suivant. La valeur par défaut est false.(for pdf generation) |
| [Margin](../../aspose.pdf/baseparagraph/margin) { get; set; } | Obtient ou définit une marge extérieure pour le paragraphe (pour la génération de pdf) |
| [TeXLoadOptionsOfInstance](../../aspose.pdf/texfragment/texloadoptionsofinstance) { get; set; } | Obtient ou définit TeXLoadOptions qui sera utilisé pour le chargement (et le rendu) de LaTeX dans cette instance de classe. Veuillez l'utiliser quand il est nécessaire d'utiliser un paramètre spécifique pour l'importation de LaTeX pour telle ou telle instance (par exemple lorsque telle ou telle instance devrait utilisez un BasePath spécifique pour LaTeX importé ou utilisez un chargeur spécifique de ressources externes) Si le paramètre est par défaut (null), les options de chargement LaTeX standard seront utilisées. |
| virtual [VerticalAlignment](../../aspose.pdf/baseparagraph/verticalalignment) { get; set; } | Obtient ou définit un alignement vertical du paragraphe |
| [ZIndex](../../aspose.pdf/baseparagraph/zindex) { get; set; } | Obtient ou définit une valeur int qui indique l'ordre Z du graphique. Un graphique avec un ZIndex plus grand sera placé sur le graphique avec un ZIndex plus petit. ZIndex peut être négatif. Le graphique avec ZIndex négatif sera placé derrière le texte dans la page. |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Clone](../../aspose.pdf/texfragment/clone)() | Clone fragment. |

### Voir également

* class [FormattedFragment](../formattedfragment)
* espace de noms [Aspose.Pdf](../../aspose.pdf)
* Assemblée [Aspose.PDF](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
