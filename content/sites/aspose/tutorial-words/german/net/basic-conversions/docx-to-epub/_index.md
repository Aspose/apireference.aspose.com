---
title: Docx zu Epub
linktitle: Docx zu Epub
second_title: Aspose.Words für .NET API-Referenz
description: Erfahren Sie, wie Sie Word-Dokumente mit Aspose.Words für .NET vom Docx- in das Epub-Format konvertieren. Schritt-für-Schritt-Anleitung mit Beispielquellcode.
type: docs
weight: 10
url: /de/net/basic-conversions/docx-to-epub/
---

In dieser Schritt-für-Schritt-Anleitung zeigen wir Ihnen, wie Sie mit Aspose.Words für .NET ein Word-Dokument im Docx-Format in das Epub-Format konvertieren. Wir erklären Ihnen den bereitgestellten C#-Quellcode und zeigen Ihnen, wie Sie ihn in Ihren eigenen Projekten implementieren.

Stellen Sie zunächst sicher, dass Aspose.Words für .NET in Ihrer Entwicklungsumgebung installiert und eingerichtet ist. Wenn Sie dies noch nicht getan haben, laden Sie die Bibliothek von der offiziellen Website herunter und installieren Sie sie.

## Schritt 1: Initialisieren des Dokumentobjekts

 Zuerst müssen Sie das initialisieren`Document` Objekt, indem Sie den Pfad zu Ihrem Quelldokument im Docx-Format angeben. Ersetzen`"YOUR DOCUMENT DIRECTORY"` mit dem tatsächlichen Verzeichnispfad, in dem sich Ihr Dokument befindet, und`"Document.docx"` mit dem Namen Ihres Quelldokuments. Hier ist der Codeausschnitt:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "Document.docx");
```

## Schritt 2: Konvertieren des Dokuments in das Epub-Format

 Als nächstes können Sie mit dem Konvertierungsprozess fortfahren. Ruf den`Save` Methode auf der`Document` Objekt und geben Sie den Pfad und Dateinamen für das Ausgabedokument im Epub-Format an. In diesem Beispiel speichern wir es als`"BaseConversions.DocxToEpub.epub"`. Hier ist der Codeausschnitt:

```csharp
doc.Save(dataDir + "BaseConversions.DocxToEpub.epub");
```

Das ist es! Sie haben mit Aspose.Words für .NET erfolgreich ein Word-Dokument im Docx-Format in das Epub-Format konvertiert.

### Beispielquellcode für Docx To Epub mit Aspose.Words für .NET

```csharp

	// Der Pfad zum Dokumentenverzeichnis.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Document.docx");

	doc.Save(dataDir + "BaseConversions.DocxToEpub.epub");

```

Sie können diesen Code gerne in Ihren eigenen Projekten verwenden und entsprechend Ihren spezifischen Anforderungen modifizieren.