---
title: FontFallbackSettings.Save
linktitle: Save
articleTitle: Save
second_title: Aspose.Words per .NET
description: FontFallbackSettings Save metodo. Salva le impostazioni di fallback correnti nello streaming in C#.
type: docs
weight: 50
url: /it/net/aspose.words.fonts/fontfallbacksettings/save/
---
## Save(*Stream*) {#save}

Salva le impostazioni di fallback correnti nello streaming.

```csharp
public void Save(Stream outputStream)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outputStream | Stream | Flusso di uscita. |

## Esempi

Mostra come caricare e salvare le impostazioni di fallback dei caratteri in/da un flusso.

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

// Carica un documento XML che definisce una serie di impostazioni di fallback dei caratteri.
using (FileStream fontFallbackStream = new FileStream(MyDir + "Font fallback rules.xml", FileMode.Open))
{
    FontSettings fontSettings = new FontSettings();
    fontSettings.FallbackSettings.Load(fontFallbackStream);

    doc.FontSettings = fontSettings;
}

doc.Save(ArtifactsDir + "FontSettings.LoadFontFallbackSettingsFromStream.pdf");

// Utilizza uno stream per salvare le impostazioni di fallback dei caratteri correnti del nostro documento come documento XML.
using (FileStream fontFallbackStream =
    new FileStream(ArtifactsDir + "FallbackSettings.xml", FileMode.Create))
{
    doc.FontSettings.FallbackSettings.Save(fontFallbackStream);
}
```

### Guarda anche

* class [FontFallbackSettings](../)
* spazio dei nomi [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assemblea [Aspose.Words](../../../)

---

## Save(*string*) {#save_1}

Salva le impostazioni di fallback correnti in un file.

```csharp
public void Save(string fileName)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fileName | String | Nome del file di output. |

## Esempi

Mostra come caricare e salvare le impostazioni di fallback dei caratteri in/da un documento XML nel file system locale.

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

// Carica un documento XML che definisce una serie di impostazioni di fallback dei caratteri.
FontSettings fontSettings = new FontSettings();
fontSettings.FallbackSettings.Load(MyDir + "Font fallback rules.xml");

doc.FontSettings = fontSettings;
doc.Save(ArtifactsDir + "FontSettings.LoadFontFallbackSettingsFromFile.pdf");

// Salva le attuali impostazioni di fallback dei caratteri del nostro documento come documento XML.
doc.FontSettings.FallbackSettings.Save(ArtifactsDir + "FallbackSettings.xml");
```

### Guarda anche

* class [FontFallbackSettings](../)
* spazio dei nomi [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assemblea [Aspose.Words](../../../)
