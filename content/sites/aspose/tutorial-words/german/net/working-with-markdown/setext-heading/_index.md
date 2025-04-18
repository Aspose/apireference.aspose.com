---
title: Settext-Überschrift
linktitle: Settext-Überschrift
second_title: Aspose.Words für .NET API-Referenz
description: Erfahren Sie Schritt-für-Schritt-Anleitung, wie Sie Setext-Überschriften zum Formatieren Ihrer Dokumente mit Aspose.Words für .NET verwenden.
type: docs
weight: 10
url: /de/net/working-with-markdown/setext-heading/
---

In diesem Tutorial führen wir Sie durch die Verwendung der Setext-Überschriftenfunktion mit Aspose.Words für .NET. Setext-Überschriften sind eine alternative Methode zum Formatieren von Titeln in Markdown-Dokumenten.

## Schritt 1: Verwendung eines Dokumentengenerators

Zuerst verwenden wir einen Dokumentgenerator, um Inhalte zu unserem Dokument hinzuzufügen.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
DocumentBuilder builder = new DocumentBuilder();
```

## Schritt 2: Verwenden des Setext-Überschriftenstils

Wir werden den Standard-Absatzstil „Überschrift 1“ verwenden, um eine Überschrift der Ebene 1 in unserem Dokument zu erstellen.

```csharp
builder.ParagraphFormat.StyleName = "Heading 1";
builder.Writeln("This is an H1 tag");
```

## Schritt 3: Stile zurücksetzen

Wir setzen zuvor angewendete Schriftstile zurück, um unerwünschte Stilkombinationen zwischen Absätzen zu vermeiden.

```csharp
builder.Font.Bold = false;
builder.Font.Italic = false;
```

## Schritt 4: Anpassen der Setext-Überschriftenebenen

Wir können die Überschriftenebenen von Setext anpassen, indem wir neue Absatzstile hinzufügen, die auf vorhandenen Überschriftenstilen basieren. In diesem Beispiel erstellen wir einen „SetextHeading1“-Stil basierend auf dem „Heading 1“-Stil, um eine Überschrift der Ebene 1 im Setext-Format darzustellen.

```csharp
Style setexHeading1 = builder.Document.Styles.Add(StyleType.Paragraph, "SetextHeading1");
builder.ParagraphFormat.Style = setexHeading1;
builder.Document.Styles["SetextHeading1"].BaseStyleName = "Heading 1";
builder.Writeln("Title Setext level 1");
```

## Schritt 5: Speichern des Dokuments

Abschließend können wir das Dokument im gewünschten Format speichern.

```csharp
builder.Document.Save(dataDir + "Test.md");
```

### Beispielquellcode für Setext-Titel mit Aspose.Words für .NET

```csharp
	// Der Pfad zum Dokumentenverzeichnis.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	// Verwenden Sie einen Dokumentersteller, um dem Dokument Inhalte hinzuzufügen.
	DocumentBuilder builder = new DocumentBuilder();

	builder.ParagraphFormat.StyleName = "Heading 1";
	builder.Writeln("This is an H1 tag");

	// Setzen Sie die Stile des vorherigen Absatzes zurück, um Stile zwischen Absätzen nicht zu kombinieren.
	builder.Font.Bold = false;
	builder.Font.Italic = false;

	Style setexHeading1 = builder.Document.Styles.Add(StyleType.Paragraph, "SetextHeading1");
	builder.ParagraphFormat.Style = setexHeading1;
	builder.Document.Styles["SetextHeading1"].BaseStyleName = "Heading 1";
	builder.Writeln("Setext Heading level 1");

	builder.ParagraphFormat.Style = builder.Document.Styles["Heading 3"];
	builder.Writeln("This is an H3 tag");

	// Setzen Sie die Stile des vorherigen Absatzes zurück, um Stile zwischen Absätzen nicht zu kombinieren.
	builder.Font.Bold = false;
	builder.Font.Italic = false;

	Style setexHeading2 = builder.Document.Styles.Add(StyleType.Paragraph, "SetextHeading2");
	builder.ParagraphFormat.Style = setexHeading2;
	builder.Document.Styles["SetextHeading2"].BaseStyleName = "Heading 3";

	// Die Setex-Überschriftenebene wird auf 2 zurückgesetzt, wenn der Basisabsatz eine Überschriftenebene größer als 2 hat.
	builder.Writeln("Setext Heading level 2");
	

	builder.Document.Save(dataDir + "Test.md");
```



