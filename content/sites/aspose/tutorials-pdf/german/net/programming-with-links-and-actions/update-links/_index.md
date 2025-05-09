---
title: Aktualisieren Sie Links in der PDF-Datei
linktitle: Aktualisieren Sie Links in der PDF-Datei
second_title: Aspose.PDF für .NET API-Referenz
description: Erfahren Sie, wie Sie Links in PDF-Dateien mit Aspose.PDF für .NET aktualisieren.
type: docs
weight: 120
url: /de/net/programming-with-links-and-actions/update-links/
---
Erfahren Sie in dieser Schritt-für-Schritt-Anleitung, wie Sie Links in PDF-Dateien mit Aspose.PDF für .NET aktualisieren.

## Schritt 1: Einrichten der Umgebung

Stellen Sie sicher, dass Sie Ihre Entwicklungsumgebung mit einem C#-Projekt und den entsprechenden Aspose.PDF-Referenzen eingerichtet haben.

## Schritt 2: Laden der PDF-Datei

Legen Sie den Verzeichnispfad Ihrer Dokumente fest und laden Sie die PDF-Datei mit dem folgenden Code hoch:

```csharp
// Der Pfad zum Dokumentenverzeichnis.
string dataDir = "YOUR DOCUMENTS DIRECTORY";
// Laden Sie die PDF-Datei
Document doc = new Document(dataDir + "UpdateLinks.pdf");
```

## Schritt 3: Bearbeiten des Links

Rufen Sie die zu ändernde Linkanmerkung mit dem folgenden Code ab:

```csharp
LinkAnnotation linkAnnot = (LinkAnnotation)doc.Pages[1].Annotations[1];
```

 Sie können die anpassen`[1]` Indizes, um eine bestimmte Seite oder Anmerkung auszuwählen.

Ändern Sie als Nächstes den Link, indem Sie das Ziel ändern:

```csharp
GoToAction goToAction = (GoToAction)linkAnnot.Action;
goToAction.Destination = new Aspose.Pdf.Annotations.XYZExplicitDestination(1, 1, 2, 2);
```

Der erste Parameter stellt den Betreff des Dokuments dar, der zweite ist die Zielseitennummer. Das fünfte Argument ist der Zoomfaktor bei der Anzeige der jeweiligen Seite. Bei der Einstellung 2 wird die Seite mit 200 % Zoom angezeigt.

## Schritt 4: Speichern Sie das Dokument mit dem aktualisierten Link

 Speichern Sie das Dokument mit dem aktualisierten Link mithilfe von`Save` Methode:

```csharp
dataDir = dataDir + "PDFLINK_Modified_UpdateLinks_out.pdf";
doc.Save(dataDir);
```

## Schritt 5: Ergebnis anzeigen

Zeigen Sie eine Meldung an, dass die Links erfolgreich aktualisiert wurden, und geben Sie den Speicherort der gespeicherten Datei an:

```csharp
Console.WriteLine("\nLinks updated successfully.\nFile saved to location: " + dataDir);
```

### Beispielquellcode für Update Links mit Aspose.PDF für .NET 
```csharp
try
{
	// Der Pfad zum Dokumentenverzeichnis.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	// Laden Sie die PDF-Datei
	Document doc = new Document(dataDir + "UpdateLinks.pdf");
	// Holen Sie sich die erste Linkanmerkung von der ersten Seite des Dokuments
	LinkAnnotation linkAnnot = (LinkAnnotation)doc.Pages[1].Annotations[1];
	// Änderungslink: Linkziel ändern
	GoToAction goToAction = (GoToAction)linkAnnot.Action;
	// Geben Sie das Ziel für das Linkobjekt an
	// Der erste Parameter ist das Dokumentobjekt, der zweite die Zielseitennummer.
	// Das 5ht-Argument ist der Zoomfaktor bei der Anzeige der jeweiligen Seite. Bei Verwendung von 2 wird die Seite mit 200 % Zoom angezeigt
	goToAction.Destination = new Aspose.Pdf.Annotations.XYZExplicitDestination(1, 1, 2, 2);
	dataDir = dataDir + "PDFLINK_Modified_UpdateLinks_out.pdf";
	// Speichern Sie das Dokument mit dem aktualisierten Link
	doc.Save(dataDir);
	Console.WriteLine("\nLinks updated successfully.\nFile saved at " + dataDir);
}
catch (Exception ex)
{
	Console.WriteLine(ex.Message);
}
```

## Abschluss

Herzlichen Glückwunsch! Sie wissen jetzt, wie Sie Links in einer PDF-Datei mit Aspose.PDF für .NET aktualisieren. Nutzen Sie dieses Wissen, um Links in Ihren PDF-Dokumenten anzupassen und interaktive Erlebnisse für Benutzer zu erstellen.

Nachdem Sie dieses Handbuch abgeschlossen haben, können Sie diese Konzepte auf Ihre eigenen Projekte anwenden und die von Aspose.PDF für .NET angebotenen Funktionen weiter erkunden.

### FAQs für Update-Links in PDF-Dateien 

#### F: Warum sollte ich Links in einem PDF-Dokument aktualisieren wollen?

A: Durch das Aktualisieren von Links in einem PDF-Dokument können Sie das Verhalten und das Ziel von Hyperlinks ändern und so interaktivere und benutzerfreundlichere PDF-Dateien erstellen.

#### F: Wie kann ich von der Aktualisierung der Links in meinen PDF-Dokumenten profitieren?

A: Durch die Aktualisierung von Links können Sie sicherstellen, dass Benutzer zu den richtigen Seiten oder externen Ressourcen weitergeleitet werden, wodurch das Navigationserlebnis in Ihren PDF-Dateien verbessert wird.

#### F: Kann ich mehrere Links in einem einzigen PDF-Dokument aktualisieren?

A: Ja, Sie können den bereitgestellten Code als Grundlage verwenden, um alle Linkanmerkungen zu durchlaufen und deren Ziele oder Verhalten nach Bedarf zu ändern.

####  F: Was bedeutet das?`GoToAction` class do in the provided code?

 A: Die`GoToAction` Die Klasse stellt eine Aktion dar, die zu einer bestimmten Seite im PDF-Dokument navigiert. Damit können Sie das Ziel einer Linkanmerkung ändern.

#### F: Wie stelle ich die Zielseite und die Zoomstufe für einen Link ein?

 A: Im bereitgestellten Code können Sie die an übergebenen Argumente ändern`XYZExplicitDestination`Konstrukteur. Der erste Parameter ist die Zielseitennummer und der fünfte Parameter steuert den Zoomfaktor.

#### F: Ist es möglich, andere Attribute eines Links zu aktualisieren, beispielsweise sein Erscheinungsbild?

A: Dieses Tutorial konzentriert sich auf die Aktualisierung von Linkzielen. Weitere Informationen zum Anpassen des Erscheinungsbilds von Links finden Sie jedoch in der Aspose.PDF-Dokumentation.

#### F: Was passiert, wenn ich eine ungültige Zielseitennummer angebe?

A: Wenn Sie eine ungültige Zielseitennummer angeben, führt der Link möglicherweise zu einer falschen oder nicht vorhandenen Seite im PDF-Dokument.

#### F: Kann ich die Linkänderungen bei Bedarf rückgängig machen?

A: Ja, Sie können die ursprünglichen Linkanmerkungen vor der Änderung speichern und diese Informationen verwenden, um die Links bei Bedarf wieder in ihren ursprünglichen Zustand zu versetzen.

#### F: Wie kann ich testen, ob die Links erfolgreich aktualisiert wurden?

A: Nachdem Sie den bereitgestellten Code zum Aktualisieren der Links angewendet haben, öffnen Sie die geänderte PDF-Datei und überprüfen Sie, ob die Links mit der richtigen Zoomstufe zu den angegebenen Seiten navigieren.

#### F: Beeinflusst das Aktualisieren von Links die Gesamtstruktur oder den Inhalt des PDF-Dokuments?

A: Nein, das Aktualisieren von Links ändert nur das Verhalten und das Ziel der Links. Es hat keinen Einfluss auf den Inhalt oder die Struktur des PDF-Dokuments.