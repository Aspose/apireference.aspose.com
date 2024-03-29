---
title: Font.HasDmlEffect
linktitle: HasDmlEffect
articleTitle: HasDmlEffect
second_title: Aspose.Words för .NET
description: Font HasDmlEffect metod. Kontrollerar om en viss DrawingMLtexteffekt tillämpas i C#.
type: docs
weight: 560
url: /sv/net/aspose.words/font/hasdmleffect/
---
## Font.HasDmlEffect method

Kontrollerar om en viss DrawingML-texteffekt tillämpas.

```csharp
public bool HasDmlEffect(TextDmlEffect dmlEffectType)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| dmlEffectType | TextDmlEffect | DrawingML texteffekttyp. |

### Returvärde

`Sann` om en viss DrawingML-texteffekt tillämpas.

## Exempel

Visar hur man kontrollerar om en körning visar en DrawingML-texteffekt.

```csharp
Document doc = new Document(MyDir + "DrawingML text effects.docx");

RunCollection runs = doc.FirstSection.Body.FirstParagraph.Runs;

Assert.True(runs[0].Font.HasDmlEffect(TextDmlEffect.Shadow));
Assert.True(runs[1].Font.HasDmlEffect(TextDmlEffect.Shadow));
Assert.True(runs[2].Font.HasDmlEffect(TextDmlEffect.Reflection));
Assert.True(runs[3].Font.HasDmlEffect(TextDmlEffect.Effect3D));
Assert.True(runs[4].Font.HasDmlEffect(TextDmlEffect.Fill));
```

### Se även

* enum [TextDmlEffect](../../textdmleffect/)
* class [Font](../)
* namnutrymme [Aspose.Words](../../../aspose.words/)
* hopsättning [Aspose.Words](../../../)
