---
title: HtmlFixedSaveOptions.OptimizeOutput
linktitle: OptimizeOutput
articleTitle: OptimizeOutput
second_title: Aspose.Words pour .NET
description: HtmlFixedSaveOptions OptimizeOutput propriété. Lindicateur indique sil est nécessaire doptimiser la sortie. Si cet indicateur est défini les canevas imbriqués redondants et les canevas vides sont supprimés également les glyphes voisins avec le même formatage sont concaténés. Remarque  la précision de laffichage du contenu peut être affectée si cette propriété est définie survrai . La valeur par défaut estvrai  en C#.
type: docs
weight: 100
url: /fr/net/aspose.words.saving/htmlfixedsaveoptions/optimizeoutput/
---
## HtmlFixedSaveOptions.OptimizeOutput property

L'indicateur indique s'il est nécessaire d'optimiser la sortie. Si cet indicateur est défini, les canevas imbriqués redondants et les canevas vides sont supprimés, également les glyphes voisins avec le même formatage sont concaténés. Remarque : la précision de l'affichage du contenu peut être affectée si cette propriété est définie sur`vrai` . La valeur par défaut est`vrai` .

```csharp
public override bool OptimizeOutput { get; set; }
```

## Exemples

Montre comment simplifier un document lors de son enregistrement au format HTML en supprimant divers objets redondants.

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

HtmlFixedSaveOptions saveOptions = new HtmlFixedSaveOptions { OptimizeOutput = optimizeOutput };

doc.Save(ArtifactsDir + "HtmlFixedSaveOptions.OptimizeGraphicsOutput.html", saveOptions);

// La taille de la version optimisée du document est presque un tiers de la taille du document non optimisé.
Assert.AreEqual(optimizeOutput ? 62521 : 191770,
    new FileInfo(ArtifactsDir + "HtmlFixedSaveOptions.OptimizeGraphicsOutput.html").Length, 200);
```

### Voir également

* class [HtmlFixedSaveOptions](../)
* espace de noms [Aspose.Words.Saving](../../../aspose.words.saving/)
* Assemblée [Aspose.Words](../../../)
