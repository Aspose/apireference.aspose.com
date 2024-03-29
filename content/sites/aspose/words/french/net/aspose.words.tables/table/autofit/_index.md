---
title: Table.AutoFit
linktitle: AutoFit
articleTitle: AutoFit
second_title: Aspose.Words pour .NET
description: Table AutoFit méthode. Redimensionne le tableau et les cellules en fonction du comportement dajustement automatique spécifié en C#.
type: docs
weight: 360
url: /fr/net/aspose.words.tables/table/autofit/
---
## Table.AutoFit method

Redimensionne le tableau et les cellules en fonction du comportement d'ajustement automatique spécifié.

```csharp
public void AutoFit(AutoFitBehavior behavior)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| behavior | AutoFitBehavior | Spécifie comment ajuster automatiquement le tableau. |

## Remarques

Cette méthode imite les commandes disponibles dans le menu Ajustement automatique d'un tableau dans Microsoft Word. Les commandes disponibles sont « Ajustement automatique au contenu », « Ajustement automatique à la fenêtre » et « Largeur de colonne fixe ». Dans Microsoft Word , ces commandes définissent les propriétés de table pertinentes, puis mettent à jour la disposition du tableau et Aspose.Words fait de même pour vous.

## Exemples

Montre comment créer un nouveau tableau tout en appliquant un style.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
Table table = builder.StartTable();

// Nous devons insérer au moins une ligne avant de définir un formatage de tableau.
builder.InsertCell();

// Définit le style de tableau utilisé en fonction de l'identifiant de style.
// Notez que tous les styles de tableau ne sont pas disponibles lors de l'enregistrement au format .doc.
table.StyleIdentifier = StyleIdentifier.MediumShading1Accent1;

// Applique partiellement le style aux fonctionnalités de la table en fonction des prédicats, puis construit la table.
table.StyleOptions =
    TableStyleOptions.FirstColumn | TableStyleOptions.RowBands | TableStyleOptions.FirstRow;
table.AutoFit(AutoFitBehavior.AutoFitToContents);

builder.Writeln("Item");
builder.CellFormat.RightPadding = 40;
builder.InsertCell();
builder.Writeln("Quantity (kg)");
builder.EndRow();

builder.InsertCell();
builder.Writeln("Apples");
builder.InsertCell();
builder.Writeln("20");
builder.EndRow();

builder.InsertCell();
builder.Writeln("Bananas");
builder.InsertCell();
builder.Writeln("40");
builder.EndRow();

builder.InsertCell();
builder.Writeln("Carrots");
builder.InsertCell();
builder.Writeln("50");
builder.EndRow();

doc.Save(ArtifactsDir + "DocumentBuilder.InsertTableWithStyle.docx");
```

### Voir également

* enum [AutoFitBehavior](../../autofitbehavior/)
* class [Table](../)
* espace de noms [Aspose.Words.Tables](../../../aspose.words.tables/)
* Assemblée [Aspose.Words](../../../)
