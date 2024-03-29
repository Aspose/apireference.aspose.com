---
title: HtmlSaveOptions.EpubNavigationMapLevel
second_title: Aspose.Words für .NET-API-Referenz
description: HtmlSaveOptions eigendom. Gibt die maximale Ebene von Überschriften an die beim Exportieren in das IDPFEPUBFormat in die Navigationskarte eingetragen werden. Der Standardwert ist3 .
type: docs
weight: 110
url: /de/net/aspose.words.saving/htmlsaveoptions/epubnavigationmaplevel/
---
## HtmlSaveOptions.EpubNavigationMapLevel property

Gibt die maximale Ebene von Überschriften an, die beim Exportieren in das IDPF-EPUB-Format in die Navigationskarte eingetragen werden. Der Standardwert ist`3` .

```csharp
public int EpubNavigationMapLevel { get; set; }
```

### Bemerkungen

Die Navigationskarte im IDPF EPUB-Format ermöglicht Benutzerprogrammen eine einfache Möglichkeit der Navigation durch die Dokumentstruktur. Normalerweise entsprechen Navigationspunkte Überschriften im Dokument. Um Überschriften bis zur Ebene zu füllen **N** weisen Sie diesen Wert zu`EpubNavigationMapLevel`.

Standardmäßig werden drei Ebenen von Überschriften ausgefüllt: Absätze von Stilen **Überschrift 1** , **Überschrift 2** und **Überschrift 3**. Sie können diese Eigenschaft auf einen Wert von 1 bis 9 setzen, um den entsprechenden Maximalpegel anzufordern. Wenn Sie es auf Null setzen, wird die Navigationskarte nur auf den Dokumentstamm oder die Wurzeln von Dokumentteilen reduziert.

### Beispiele

Zeigt, wie Sie Überschriften filtern, die im Navigationsbereich eines gespeicherten Epub-Dokuments angezeigt werden.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Jeder Absatz, den wir mit einem "Überschrift"-Stil formatieren, kann als Überschrift dienen.
// Jede Überschrift kann auch eine Überschriftenebene haben, die durch die Nummer ihres Überschriftenstils bestimmt wird.
// Die folgenden Überschriften gehören zu den Ebenen 1-3.
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 1"];
builder.Writeln("Heading #1");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 2"];
builder.Writeln("Heading #2");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 3"];
builder.Writeln("Heading #3");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 1"];
builder.Writeln("Heading #4");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 2"];
builder.Writeln("Heading #5");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 3"];
builder.Writeln("Heading #6");

// Epub-Reader erstellen normalerweise ein Inhaltsverzeichnis für ihre Dokumente.
// Jeder Absatz mit einem "Überschrift"-Stil im Dokument erstellt einen Eintrag in diesem Inhaltsverzeichnis.
 // Wir können die Eigenschaft "EpubNavigationMapLevel" verwenden, um eine maximale Überschriftenebene festzulegen.
// Der Epub-Reader fügt dem Inhaltsverzeichnis keine Überschriften mit einer Ebene über der von uns angegebenen hinzu.
HtmlSaveOptions options = new HtmlSaveOptions(SaveFormat.Epub);
options.EpubNavigationMapLevel = 2;

// Unser Dokument hat sechs Überschriften, von denen zwei über Ebene 2 liegen.
// Das Inhaltsverzeichnis für dieses Dokument wird vier Einträge haben.
doc.Save(ArtifactsDir + "HtmlSaveOptions.EpubHeadings.epub", options);
```

### Siehe auch

* class [HtmlSaveOptions](../)
* namensraum [Aspose.Words.Saving](../../htmlsaveoptions/)
* Montage [Aspose.Words](../../../)


