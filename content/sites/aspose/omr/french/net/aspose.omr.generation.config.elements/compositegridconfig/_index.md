---
title: Class CompositeGridConfig
second_title: Référence de l'API Aspose.OMR pour .NET
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig classe. Grid element. Produire un tableau de bulles. Chaque bulle remplie représente un symbole dans la valeur composite Tous les symboles marqués seront concaténés en une seule valeur
type: docs
weight: 120
url: /fr/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

Grid element. Produire un tableau de bulles. Chaque bulle remplie représente un symbole dans la valeur composite Tous les symboles marqués seront concaténés en une seule valeur

```csharp
public class CompositeGridConfig : BaseConfig
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | Default_Constructor |

## Propriétés

| Nom | La description |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | Le type d'une bulle |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | Lorsque l'élément est dessiné dans un parent multi-colonnes - représente la position. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | Quantité de colonnes à l'intérieur de la grille. Chaque colonne représente un symbole unique dans le résultat value Le montant doit être égal à[`ExtraRow`](./extrarow/) nombre de colonnes |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | Le nom de cette grille doit-il être affiché |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | Valeurs spécifiques aux colonnes qui seront placées au-dessus de celles par défaut -[`Values`](./values/) . Présenté sous forme de tableau à deux dimensions. Première ligne. Deuxième - colonne. Chaque chaîne représente le texte à l'intérieur de la bulle. si la chaîne est nulle, aucune bulle ne sera placée. Le nombre de colonnes doit être égal à[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | Alignement de la grille, indique où la grille doit être dessinée sur la page |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | Orientation de la grille : horizontale ou verticale. Indique comment les éléments enfants doivent être positionnés |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | Couleur de bordure carrée |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | Taille de la bordure carrée |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | Indique quel type d'élément dessiner au début de la grille |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | Nom de la grille. Utilisé comme identifiant dans la reconnaissance |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | Décrire la rotation de l'élément Grid autour de son propre axe. "90" - faire pivoter CompositeGrid de 90 degrés "-90" - faire pivoter ComopositeGrid à -90 degrés |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | Type d'élément omr. Champ obligatoire pour la sérialisation JSON. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | Collection de chaînes décrivant les symboles possibles dans chaque colonne. Les valeurs spécifiques aux colonnes sont placées dans[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | Position X de la grille sur la page, remplace l'alignement |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | Position Y de la grille sur la page, remplace l'alignement |

## Des champs

| Nom | La description |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | La taille d'une bulle |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | La marge entre les lignes |

### Voir également

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* espace de noms [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* Assemblée [Aspose.OMR](../../)


