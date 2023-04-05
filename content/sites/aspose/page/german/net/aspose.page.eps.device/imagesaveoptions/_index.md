---
title: Class ImageSaveOptions
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.EPS.Device.ImageSaveOptions klas. Diese Klasse enthält Optionen die zum Verwalten des Bildspeicherprozesses erforderlich sind.
type: docs
weight: 50
url: /de/net/aspose.page.eps.device/imagesaveoptions/
---
## ImageSaveOptions class

Diese Klasse enthält Optionen, die zum Verwalten des Bildspeicherprozesses erforderlich sind.

```csharp
public class ImageSaveOptions : SaveOptions
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [ImageSaveOptions](imagesaveoptions/#constructor)() | Initialisiert eine neue Instanz von`ImageSaveOptions` Klasse mit Standardwerten für Flags!:SuppressErrors (wahr) und!:Debug (falsch). |
| [ImageSaveOptions](imagesaveoptions/#constructor_1)(bool) | Initialisiert eine neue Instanz von`ImageSaveOptions` with Standardwert für Flag!:Debug (falsch). |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Gibt zusätzliche Ordner an, in denen der Konverter Schriftarten für Eingabedokumente finden soll. Standardordner sind Standardschriftartenordner, in denen das Betriebssystem Schriftarten für interne Zwecke findet. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Gibt an, ob Debug-Informationen in den Standardausgabestrom gedruckt werden müssen oder nicht. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Gibt eine Liste unterdrückter Konvertierungsfehler zurück. If!:SuppressErrors ist wahr. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Die Kategorie Qualität gibt die Komprimierungsstufe für ein Bild an. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Komprimierung und desto geringer die Qualität des Bildes. Der Wert 0 ergibt die niedrigste Bildqualität, während 100 die höchste ergibt. |
| [Resolution](../../aspose.page.eps.device/imagesaveoptions/resolution/) { get; set; } | Liest/setzt die Bildauflösung. |
| [SmoothingMode](../../aspose.page.eps.device/imagesaveoptions/smoothingmode/) { get; set; } | Holt/legt den Glättungsmodus für das Rendern von Bildern fest. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Gibt an, ob Fehler unterdrückt werden müssen oder nicht. Wenn wahr, werden unterdrückte Fehler hinzugefügt[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Wenn falsch, wird der erste Fehler das Programm beenden. |

### Siehe auch

* class [SaveOptions](../../aspose.page/saveoptions/)
* namensraum [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* Montage [Aspose.Page](../../)


