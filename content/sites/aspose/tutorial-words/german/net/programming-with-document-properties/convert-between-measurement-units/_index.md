---
title: Zwischen Maßeinheiten umrechnen
linktitle: Zwischen Maßeinheiten umrechnen
second_title: Aspose.Words für .NET API-Referenz
description: Schritt-für-Schritt-Anleitung zum Konvertieren zwischen Maßeinheiten in einem Dokument mit Aspose.Words für .NET.
type: docs
weight: 10
url: /de/net/programming-with-document-properties/convert-between-measurement-units/
---

In diesem Tutorial führen wir Sie durch den C#-Quellcode zur Konvertierung zwischen Maßeinheiten mit Aspose.Words für .NET. Mit dieser Funktion können Sie Ränder, Kopf- und Fußzeilenabstände usw. in verschiedenen Maßeinheiten angeben.

## Schritt 1: Projekteinrichtung

Erstellen Sie zunächst ein neues C#-Projekt in Ihrer bevorzugten IDE. Stellen Sie sicher, dass in Ihrem Projekt auf die Aspose.Words for .NET-Bibliothek verwiesen wird.

## Schritt 2: Dokument und Konstruktor erstellen

In diesem Schritt erstellen wir ein neues Dokument und initialisieren den Konstruktor. Verwenden Sie den folgenden Code:

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Schritt 3: Maßeinheiten konfigurieren

Jetzt werden wir die Werte für Ränder, Kopf- und Fußzeilenabstände usw. in verschiedene Maßeinheiten umrechnen. Verwenden Sie den folgenden Code, um Werte in bestimmten Maßeinheiten anzugeben:

```csharp
PageSetup pageSetup = builder.PageSetup;
pageSetup.TopMargin = ConvertUtil.InchToPoint(1.0);
pageSetup.BottomMargin = ConvertUtil.InchToPoint(1.0);
pageSetup.LeftMargin = ConvertUtil.InchToPoint(1.5);
pageSetup.RightMargin = ConvertUtil.InchToPoint(1.5);
pageSetup.HeaderDistance = ConvertUtil.InchToPoint(0.2);
pageSetup.FooterDistance = ConvertUtil.InchToPoint(0.2);
```

 Dieser Code verwendet die`ConvertUtil` Klasse von Aspose.Words zum Konvertieren der angegebenen Werte in Zoll (`InchToPoint` ). Sie können auch andere im verfügbare Konvertierungsmethoden verwenden`ConvertUtil` Klasse, um Werte in andere Maßeinheiten umzuwandeln.

### Beispielquellcode für die Konvertierung zwischen Maßeinheiten mit Aspose.Words für .NET

```csharp

	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);

	PageSetup pageSetup = builder.PageSetup;
	pageSetup.TopMargin = ConvertUtil.InchToPoint(1.0);
	pageSetup.BottomMargin = ConvertUtil.InchToPoint(1.0);
	pageSetup.LeftMargin = ConvertUtil.InchToPoint(1.5);
	pageSetup.RightMargin = ConvertUtil.InchToPoint(1.5);
	pageSetup.HeaderDistance = ConvertUtil.InchToPoint(0.2);
	pageSetup.FooterDistance = ConvertUtil.InchToPoint(0.2);
  
```

Sie haben jetzt gelernt, wie Sie zwischen Maßeinheiten konvertieren, wenn Sie Ränder, Kopf- und Fußzeilenabstände usw. in einem Dokument mit Aspose.Words für .NET angeben. Wenn Sie der Schritt-für-Schritt-Anleitung in diesem Tutorial folgen, können Sie die Werte in den gewünschten Maßeinheiten ganz einfach in Ihren eigenen Dokumenten angeben.