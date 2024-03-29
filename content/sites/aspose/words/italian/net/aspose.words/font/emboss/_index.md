---
title: Font.Emboss
linktitle: Emboss
articleTitle: Emboss
second_title: Aspose.Words per .NET
description: Font Emboss proprietà. Vero se il carattere è formattato in rilievo in C#.
type: docs
weight: 100
url: /it/net/aspose.words/font/emboss/
---
## Font.Emboss property

Vero se il carattere è formattato in rilievo.

```csharp
public bool Emboss { get; set; }
```

## Esempi

Mostra come applicare effetti di incisione/rilievo al testo.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Size = 36;
builder.Font.Color = Color.LightBlue;

// Di seguito sono riportati due modi per utilizzare le ombre per applicare un effetto simile al 3D al testo.
// 1 - Incidi il testo per far sembrare che le lettere siano infossate nella pagina:
builder.Font.Engrave = true;

builder.Writeln("This text is engraved.");

// 2 - Metti il testo in rilievo per far sembrare che le lettere escano fuori dalla pagina:
builder.Font.Engrave = false;
builder.Font.Emboss = true;

builder.Writeln("This text is embossed.");

doc.Save(ArtifactsDir + "Font.EngraveEmboss.docx");
```

### Guarda anche

* class [Font](../)
* spazio dei nomi [Aspose.Words](../../../aspose.words/)
* assemblea [Aspose.Words](../../../)
