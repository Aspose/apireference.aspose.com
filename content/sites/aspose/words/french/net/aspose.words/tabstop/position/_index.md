---
title: TabStop.Position
linktitle: Position
articleTitle: Position
second_title: Aspose.Words pour .NET
description: TabStop Position propriété. Obtient la position du taquet de tabulation en points en C#.
type: docs
weight: 50
url: /fr/net/aspose.words/tabstop/position/
---
## TabStop.Position property

Obtient la position du taquet de tabulation en points.

```csharp
public double Position { get; }
```

## Exemples

Montre comment modifier la position du taquet de tabulation droit dans les paragraphes liés à la table des matières.

```csharp
Document doc = new Document(MyDir + "Table of contents.docx");

// Parcourez tous les paragraphes avec les styles basés sur les résultats de la table des matières ; c'est n'importe quel style entre TOC et TOC9.
foreach (Paragraph para in doc.GetChildNodes(NodeType.Paragraph, true).OfType<Paragraph>())
    if (para.ParagraphFormat.Style.StyleIdentifier >= StyleIdentifier.Toc1 &&
        para.ParagraphFormat.Style.StyleIdentifier <= StyleIdentifier.Toc9)
    {
        // Récupère le premier onglet utilisé dans ce paragraphe, ce doit être l'onglet utilisé pour aligner les numéros de page.
        TabStop tab = para.ParagraphFormat.TabStops[0];

        // Remplacez la première tabulation par défaut, arrêtez-vous par un taquet de tabulation personnalisé.
        para.ParagraphFormat.TabStops.RemoveByPosition(tab.Position);
        para.ParagraphFormat.TabStops.Add(tab.Position - 50, tab.Alignment, tab.Leader);
    }

doc.Save(ArtifactsDir + "Styles.ChangeTocsTabStops.docx");
```

### Voir également

* class [TabStop](../)
* espace de noms [Aspose.Words](../../../aspose.words/)
* Assemblée [Aspose.Words](../../../)
