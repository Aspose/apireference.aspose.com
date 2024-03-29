---
title: Interface ITrueTypeFont
second_title: Aspose.HTML für .NET-API-Referenz
description: Aspose.Html.Drawing.ITrueTypeFont koppel. Deklariert Methoden zum Arbeiten mit TrueTypeSchriftarten.
type: docs
weight: 2760
url: /de/net/aspose.html.drawing/itruetypefont/
---
## ITrueTypeFont interface

Deklariert Methoden zum Arbeiten mit TrueType-Schriftarten.

```csharp
public interface ITrueTypeFont
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [DataSize](../../aspose.html.drawing/itruetypefont/datasize/) { get; } | Gibt die Größe der Schriftdaten in Bytes zurück |
| [FamilyName](../../aspose.html.drawing/itruetypefont/familyname/) { get; } | Ruft den Namen der Schriftfamilie ab. |
| [FullFontName](../../aspose.html.drawing/itruetypefont/fullfontname/) { get; } | Dies sollte eine Kombination aus "FamilyName" und "SubFamilyName" sein. Ausnahme: Wenn die Schriftart "Regular" ist, wie in "SubFamilyName" angegeben , dann verwenden Sie nur den in "FamilyName" enthaltenen Familiennamen. Eine Ausnahme von der obigen Definition des vollständigen Schriftartnamens gilt für Zeichenfolgen der Microsoft-Plattform für CFF-OpenType-Schriftarten: In diesem Fall muss die Zeichenfolge für den vollständigen Schriftartnamen mit dem PostScript- FontName im CFF-Namensindex identisch sein. |
| [SubFamilyName](../../aspose.html.drawing/itruetypefont/subfamilyname/) { get; } | Der Name der Schriftunterfamilie unterscheidet die Schrift in einer Gruppe mit demselben Schriftfamiliennamen. Es wird davon ausgegangen, dass dies Stil (kursiv, schräg) und Gewicht (leicht, fett, schwarz usw.) anspricht. Eine Schriftart ohne besondere Unterschiede in Gewicht oder Stil (z. B. mittleres Gewicht, nicht kursiv und fsSelection-Bit 6 gesetzt) sollte den String "Regular" an dieser Position gespeichert haben. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [GetAscent](../../aspose.html.drawing/itruetypefont/getascent/)(float) | Gibt den Aufstieg in Punkten zurück. |
| [GetData](../../aspose.html.drawing/itruetypefont/getdata/)() | Öffnen Sie den Stream mit Schriftdaten. Der Aufrufer ist für die Entsorgung des Streams verantwortlich. |
| [GetDescent](../../aspose.html.drawing/itruetypefont/getdescent/)(float) | Gibt den Abstieg in Punkten zurück. |

### Siehe auch

* namensraum [Aspose.Html.Drawing](../../aspose.html.drawing/)
* Montage [Aspose.HTML](../../)


