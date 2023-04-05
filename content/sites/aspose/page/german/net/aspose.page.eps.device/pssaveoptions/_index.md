---
title: Class PsSaveOptions
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.EPS.Device.PsSaveOptions klas. Diese Klasse enthält Optionen die für die Verwaltung des Konvertierungsprozesses von Dokumenten in PostScript PS oder Encapsulated PostScript EPSDateien erforderlich sind.
type: docs
weight: 80
url: /de/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

Diese Klasse enthält Optionen, die für die Verwaltung des Konvertierungsprozesses von Dokumenten in PostScript (PS)- oder Encapsulated PostScript (EPS)-Dateien erforderlich sind.

```csharp
public class PsSaveOptions : SaveOptions
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | Initialisiert eine neue Instanz von`PsSaveOptions` Klasse mit Standardwerten für Flags!:SuppressErrors (wahr) und!:Debug (falsch). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | Initialisiert eine neue Instanz von`PsSaveOptions` Klasse mit Standardwerten für Flag!:Debug (falsch). |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Gibt zusätzliche Ordner an, in denen der Konverter Schriftarten für Eingabedokumente finden soll. Standardordner sind Standardschriftartenordner, in denen das Betriebssystem Schriftarten für interne Zwecke findet. |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | Die Hintergrundfarbe. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Gibt an, ob Debug-Informationen in den Standardausgabestrom gedruckt werden müssen oder nicht. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | Gibt an, ob verwendete Schriftarten in das PS-Dokument eingebettet werden sollen. |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | Ein Schriftarttyp zum Einbetten von Schriftarten in ein PS-Dokument. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Gibt eine Liste unterdrückter Konvertierungsfehler zurück. If!:SuppressErrors ist wahr. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Die Kategorie Qualität gibt die Komprimierungsstufe für ein Bild an. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Komprimierung und desto geringer die Qualität des Bildes. Der Wert 0 ergibt die niedrigste Bildqualität, während 100 die höchste ergibt. |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | Die Ränder der Seite. |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | Die Größe der Seite. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | Das Speicherformat der resultierenden Datei. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Gibt an, ob Fehler unterdrückt werden müssen oder nicht. Wenn wahr, werden unterdrückte Fehler hinzugefügt[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Wenn falsch, wird der erste Fehler das Programm beenden. |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | Gibt an, ob der Hintergrund transparent ist. |

### Siehe auch

* class [SaveOptions](../../aspose.page/saveoptions/)
* namensraum [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* Montage [Aspose.Page](../../)


