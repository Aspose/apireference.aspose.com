---
title: Document.FontSettings
linktitle: FontSettings
articleTitle: FontSettings
second_title: Aspose.Words per .NET
description: Document FontSettings proprietà. Ottiene o imposta le impostazioni dei caratteri del documento in C#.
type: docs
weight: 140
url: /it/net/aspose.words/document/fontsettings/
---
## Document.FontSettings property

Ottiene o imposta le impostazioni dei caratteri del documento.

```csharp
public FontSettings FontSettings { get; set; }
```

## Osservazioni

Questa proprietà consente di specificare le impostazioni dei caratteri per documento. Se impostato su`nullo` , impostazioni predefinite dei caratteri statici [`DefaultInstance`](../../../aspose.words.fonts/fontsettings/defaultinstance/) sarà usato.

Il valore predefinito è`nullo`.

## Esempi

Mostra come impostare le regole di sostituzione dei caratteri.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Name = "Arial";
builder.Writeln("Hello world!");
builder.Font.Name = "Amethysta";
builder.Writeln("The quick brown fox jumps over the lazy dog.");

FontSourceBase[] fontSources = FontSettings.DefaultInstance.GetFontsSources();

// Le origini dei caratteri predefinite contengono il primo carattere utilizzato dal documento.
Assert.AreEqual(1, fontSources.Length);
Assert.True(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arial"));

// Il secondo carattere, "Amethysta", non è disponibile.
Assert.False(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Amethysta"));

// Possiamo configurare una tabella di sostituzione dei caratteri che determina
// quali caratteri Aspose.Words utilizzerà come sostituti dei caratteri non disponibili.
// Imposta due caratteri sostitutivi per "Amethysta": "Arvo" e "Courier New".
// Se il primo sostituto non è disponibile, Aspose.Words tenta di utilizzare il secondo sostituto e così via.
doc.FontSettings = new FontSettings();
doc.FontSettings.SubstitutionSettings.TableSubstitution.SetSubstitutes(
    "Amethysta", new[] {"Arvo", "Courier New"});

 // "Amethysta" non è disponibile e la regola di sostituzione afferma che il primo carattere da utilizzare come sostituto è "Arvo".
Assert.False(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arvo"));

 // Anche "Arvo" non è disponibile, ma "Courier New" lo è.
Assert.True(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Courier New"));

// Il documento di output visualizzerà il testo che utilizza il carattere "Amethysta" formattato con "Courier New".
doc.Save(ArtifactsDir + "FontSettings.TableSubstitution.pdf");
```

### Guarda anche

* class [FontSettings](../../../aspose.words.fonts/fontsettings/)
* class [Document](../)
* spazio dei nomi [Aspose.Words](../../../aspose.words/)
* assemblea [Aspose.Words](../../../)
