---
title: Verschlüsseltes PDF laden
linktitle: Verschlüsseltes PDF laden
second_title: Aspose.Words für .NET API-Referenz
description: Schritt-für-Schritt-Anleitung zum Laden einer verschlüsselten PDF-Datei mit Aspose.Words für .NET.
type: docs
weight: 10
url: /de/net/programming-with-pdfloadoptions/load-encrypted-pdf/
---

Wenn Sie in Ihrer .NET-Anwendung mit PDF-Dokumenten arbeiten, kann es erforderlich sein, passwortgeschützte PDF-Dateien zu laden. Aspose.Words für .NET ist eine leistungsstarke Bibliothek, die Funktionen zum Laden verschlüsselter PDF-Dokumente bietet. In diesem Artikel führen wir Sie Schritt für Schritt durch das Verständnis und die Verwendung dieser Funktion.

## Grundlegendes zur Funktion zum Laden verschlüsselter PDFs

Mit der Funktion „Verschlüsselte PDF laden“ von Aspose.Words für .NET können Sie passwortgeschützte PDF-Dateien laden. Sie können das Passwort beim Laden des Dokuments angeben, damit Sie auf dessen Inhalt zugreifen und ihn nach Bedarf bearbeiten können.

## Schritt 1: Laden des verschlüsselten PDF-Dokuments

Der erste Schritt besteht darin, das verschlüsselte PDF-Dokument in Ihre Anwendung zu laden. So geht's:

```csharp
// Pfad zum Dokumentenverzeichnis.
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";
Document doc = new Document(dataDir + "Document.pdf");
```

 Stellen Sie sicher, dass Sie den korrekten Pfad zur verschlüsselten PDF-Datei im angeben`dataDir` Variable.

## Schritt 2: Verschlüsseln des PDF-Dokuments

 Wenn Sie Ihr PDF-Dokument auch verschlüsseln möchten, können Sie dies mit dem tun`PdfSaveOptions` Klasse und Angabe der Verschlüsselungsdetails:

```csharp
PdfSaveOptions saveOptions = new PdfSaveOptions
{
EncryptionDetails = new PdfEncryptionDetails("Aspose", null)
};

```

Dadurch wird eine verschlüsselte Version des PDF-Dokuments im angegebenen Verzeichnis erstellt.

## Schritt 3: Speichern des verschlüsselten PDF-Dokuments

Nach dem Hochladen und optionalen Verschlüsseln des PDF-Dokuments können Sie es in einem anderen Format speichern oder ganz nach Ihren spezifischen Bedürfnissen weiterverarbeiten.

```csharp
doc.Save(dataDir + "WorkingWithPdfLoadOptions.LoadEncryptedPdf.pdf", saveOptions);
```

## Schritt 5: Laden des verschlüsselten PDF-Dokuments mit Passwort

Wartung

 Wenn Sie jedoch das verschlüsselte PDF-Dokument mit einem Passwort laden möchten, müssen Sie das verwenden`PdfLoadOptions` Klasse und geben Sie beim Laden des Dokuments das Passwort an:

```csharp
PdfLoadOptions loadOptions = new PdfLoadOptions { Password = "Aspose", LoadFormat = LoadFormat.Pdf };

doc = new Document(dataDir + "WorkingWithPdfLoadOptions.LoadEncryptedPdf.pdf", loadOptions);
```

 Stellen Sie sicher, dass Sie das richtige Passwort angeben`Password` Variable.

### Beispielquellcode zum Laden verschlüsselter PDFs mit Aspose.Words für .NET

```csharp

	// Der Pfad zum Dokumentenverzeichnis.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Pdf Document.pdf");

	PdfSaveOptions saveOptions = new PdfSaveOptions
	{
		EncryptionDetails = new PdfEncryptionDetails("Aspose", null)
	};

	doc.Save(dataDir + "WorkingWithPdfLoadOptions.LoadEncryptedPdf.pdf", saveOptions);

	PdfLoadOptions loadOptions = new PdfLoadOptions { Password = "Aspose", LoadFormat = LoadFormat.Pdf };

	doc = new Document(dataDir + "WorkingWithPdfLoadOptions.LoadEncryptedPdf.pdf", loadOptions);
        
```

## Abschluss

In diesem Artikel haben wir untersucht, wie Sie die Funktion „Verschlüsselte PDF laden“ von Aspose.Words für .NET verwenden. Sie haben gelernt, wie Sie verschlüsselte PDF-Dateien hochladen, wie Sie ein PDF-Dokument verschlüsseln, wie Sie ein verschlüsseltes PDF mit einem Passwort hochladen und wie Sie eine Ausgabe im Markdown-Format generieren. Diese Funktion ist äußerst nützlich, wenn Sie mit sicheren PDF-Dokumenten arbeiten.


