---
title: Anmerkung hinzufügen
linktitle: Anmerkung hinzufügen
second_title: Aspose.PDF für .NET API-Referenz
description: Erfahren Sie, wie Sie mithilfe dieses C#-Quellcodes Textanmerkungen mit Aspose.PDF für .NET hinzufügen. Passen Sie Ihre Anmerkungen mit spezifischen Details und Symbolen an.
type: docs
weight: 10
url: /de/net/annotations/addannotation/
---

Das Hinzufügen von Anmerkungen zu PDF-Dokumenten ist eine leistungsstarke Funktion, die die Zusammenarbeit und Überprüfungsprozesse verbessern kann. Aspose.PDF für .NET erleichtert das programmgesteuerte Hinzufügen von Anmerkungen zu PDF-Dokumenten mit C#. In dieser Anleitung erklären wir Ihnen Schritt für Schritt, wie Sie mit Aspose.PDF für .NET Anmerkungen zu einem PDF-Dokument hinzufügen.

## Schritt 1: Erstellen Sie ein neues Projekt und installieren Sie Aspose.PDF für .NET

Bevor wir mit dem Schreiben des Codes zum Hinzufügen von Anmerkungen beginnen, müssen wir ein neues Projekt erstellen und Aspose.PDF für .NET installieren. Um Aspose.PDF für .NET zu installieren, gehen Sie folgendermaßen vor:

1. Öffnen Sie Visual Studio und erstellen Sie ein neues C#-Projekt.
2. Klicken Sie im Projektmappen-Explorer mit der rechten Maustaste auf das Projekt und wählen Sie „NuGet-Pakete verwalten“.
3. Suchen Sie nach „Aspose.PDF“ und wählen Sie „Installieren“.

Sobald die Installation abgeschlossen ist, können wir mit dem Schreiben des Codes beginnen.

## Schritt 2: Öffnen Sie das PDF-Dokument

Der erste Schritt beim Hinzufügen von Anmerkungen besteht darin, das PDF-Dokument zu öffnen. Wir können den folgenden Code verwenden, um das Dokument zu öffnen:

```
string dataDir = "YOUR DATA DIRECTORY";
Document pdfDocument = new Document(dataDir + "AddAnnotation.pdf");
```

In diesem Code geben wir den Pfad zu dem PDF-Dokument an, das wir öffnen möchten. Stellen Sie sicher, dass Sie „IHR DATENVERZEICHNIS“ durch den tatsächlichen Pfad zu Ihrem Datenverzeichnis ersetzen.

## Schritt 3: Erstellen Sie die Anmerkung

 Um eine Anmerkung hinzuzufügen, müssen wir eine neue Instanz von erstellen`TextAnnotation` Klasse. Mit dem folgenden Code können wir eine neue Textanmerkung erstellen:

```
TextAnnotation textAnnotation = new TextAnnotation(pdfDocument.Pages[1], new Aspose.Pdf.Rectangle(200, 400, 400, 600));
textAnnotation.Title = "Sample Annotation Title";
textAnnotation.Subject = "Sample Subject";
textAnnotation.State = AnnotationState.Accepted;
textAnnotation.Contents = "Sample contents for the annotation";
textAnnotation.Open = true;
textAnnotation.Icon = TextIcon.Key;
```

In diesem Code erstellen wir eine neue Textanmerkung auf der zweiten Seite des PDF-Dokuments. Wir legen außerdem die Titel-, Betreff-, Status-, Inhalts-, Öffnungs- und Symboleigenschaften der Anmerkung fest.

## Schritt 4: Passen Sie die Anmerkung an

 Wir können das Erscheinungsbild der Anmerkung mithilfe von anpassen`Border` Klasse. Wir können den folgenden Code verwenden, um den Rand der Anmerkung anzupassen:

```
Border border = new Border(textAnnotation);
border.Width = 5;
border.Dash = new Dash(1, 1);
textAnnotation.Border = border;
textAnnotation.Rect = new Aspose.Pdf.Rectangle(200, 400, 400, 600);
```

 In diesem Code erstellen wir einen neuen`Border` Objekt und legen Sie seine Breiten- und Stricheigenschaften fest. Wir stellen dann die ein`Border`Eigenschaft der Annotation zum Neuen`Border` Objekt. Zum Schluss legen wir fest`Rect` Eigenschaft der Anmerkung, um ihre Position und Größe anzugeben.

## Schritt 5: Fügen Sie die Anmerkung zum PDF-Dokument hinzu

Nachdem wir die Anmerkung erstellt und angepasst haben, müssen wir sie dem PDF-Dokument hinzufügen. Wir können den folgenden Code verwenden, um die Anmerkung zum PDF-Dokument hinzuzufügen:

```
pdfDocument.Pages[1].Annotations.Add(textAnnotation);
```

In diesem Code fügen wir die Anmerkung zur Anmerkungssammlung der zweiten Seite des PDF-Dokuments hinzu.

## Schritt 6: Speichern Sie die Ausgabedatei

Abschließend müssen wir das PDF-Dokument mit der hinzugefügten Anmerkung speichern. Wir können den folgenden Code verwenden, um die Ausgabedatei zu speichern:

```
dataDir = dataDir + "AddAnnotation_out.pdf";
pdfDocument.Save(dataDir);
```
### Beispielquellcode zum Hinzufügen von Anmerkungen mit Aspose.PDF für .NET


```csharp   
	 // Der Pfad zum Dokumentenverzeichnis.
	string dataDir = "YOUR DATA DIRECTORY";

	// Dokument öffnen
	Document pdfDocument = new Document(dataDir + "AddAnnotation.pdf");

	// Anmerkung erstellen
	TextAnnotation textAnnotation = new TextAnnotation(pdfDocument.Pages[1], new Aspose.Pdf.Rectangle(200, 400, 400, 600));
	textAnnotation.Title = "Sample Annotation Title";
	textAnnotation.Subject = "Sample Subject";
	textAnnotation.State = AnnotationState.Accepted;
	textAnnotation.Contents = "Sample contents for the annotation";
	textAnnotation.Open = true;
	textAnnotation.Icon = TextIcon.Key;
   
	Border border = new Border(textAnnotation);
	border.Width = 5;
	border.Dash = new Dash(1, 1);
	textAnnotation.Border = border;
	textAnnotation.Rect = new Aspose.Pdf.Rectangle(200, 400, 400, 600);
   
	// Fügen Sie der Anmerkungssammlung der Seite eine Anmerkung hinzu
	pdfDocument.Pages[1].Annotations.Add(textAnnotation);
	dataDir = dataDir + "AddAnnotation_out.pdf";
	// Ausgabedatei speichern
	pdfDocument.Save(dataDir);
```
Dieser Code zeigt, wie Sie mit Aspose.PDF für .NET eine Textanmerkung mit einem bestimmten Titel, Betreff, Status, Inhalt und Symbol zu einer PDF-Seite hinzufügen. Sie können diesen Code entsprechend Ihren Anforderungen zum Hinzufügen von Anmerkungen zu Ihren PDF-Dokumenten ändern. Denken Sie daran, IHR DATENVERZEICHNIS durch den tatsächlichen Verzeichnispfad zu ersetzen, in dem sich Ihre PDF-Datei befindet und in dem Sie die Ausgabedatei speichern möchten.