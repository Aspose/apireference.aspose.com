---
title: "Aspose::Font::TtfTables::TtfNameTable::NameId enum"
linktitle: "NameId"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfNameTable::NameId enum. Stellt NameId in C++ dar."
type: docs
weight: 1600
url: /de/cpp/aspose.font.ttftables/ttfnametable/nameid/
---
## NameId enum


Stellt [NameId](./) dar.

```cpp
enum class NameId : uint16_t
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| CopyrightNotice | 0 | 0 Urheberrechtshinweis. |
| FontFamily | 1 | 1 [Font](../../../aspose.font/font/) Familie. Dieser String ist der [Font](../../../aspose.font/font/) Familienname, den der Benutzer auf Macintosh-Plattformen sieht. |
| FontSubfamily | 2 | 2 [Font](../../../aspose.font/font/) Unterfamilie. Dieser String ist die [Font](../../../aspose.font/font/) Familie, die der Benutzer auf Macintosh-Plattformen sieht. |
| UniqueFontId | 3 | 3 Eindeutige Unterfamilienidentifikation (Apple-Spezifikation). 3 Eindeutiger [Font](../../../aspose.font/font/) Bezeichner (MS-Spezifikation). |
| FullName | 4 | 4 Vollständiger Name des [Font](../../../aspose.font/font/). |
| Version | 5 | 5 Version der Namens-Tabelle. |
| PostScriptName | 6 | 6 PostScript-Name des [Font](../../../aspose.font/font/). Hinweis: Ein [Font](../../../aspose.font/font/) kann nur einen PostScript-Namen haben und dieser Name muss ASCII sein. |
| TrademarkNotice | 7 | 7 Markenhinweis. |
| ManufacturerName | 8 | 8 Herstellername. |
| DesignerName | 9 | 9 Designer; Name des Designers der Schriftart. |
| Beschreibung | 10 | 10 Beschreibung; Beschreibung der Schriftart. Kann Revisionsinformationen, Nutzungsempfehlungen, Geschichte, Merkmale und dergleichen enthalten. |
| UrlVendor | 11 | 11 URL des [Font](../../../aspose.font/font/) Anbieters (mit Protokoll, z.B. [http://](http://), [ftp://](ftp://)). Wenn eine eindeutige Seriennummer in der URL eingebettet ist, kann sie verwendet werden, um das [Font](../../../aspose.font/font/) zu registrieren. |
| UrlDesigner | 12 | 12 URL des [Font](../../../aspose.font/font/) Designers (mit Protokoll, z.B. [http://](http://), [ftp://](ftp://)) |
| LicenseDescription | 13 | 13 [License](../../../aspose.font/license/) Beschreibung; Beschreibung, wie das [Font](../../../aspose.font/font/) rechtlich verwendet werden darf, oder verschiedene Beispiel‑Szenarien für lizenzierte Nutzung. Dieses Feld sollte in klarer Sprache verfasst sein, nicht in Rechtssprache. |
| LicenseInfoUrl | 14 | 14 [License](../../../aspose.font/license/) Informations‑URL, unter der zusätzliche Lizenzinformationen zu finden sind. |
| PreferredFamily | 16 | 15 Reserviert 16 Bevorzugte Familie (nur Windows); Unter Windows wird der Familienname im [Font](../../../aspose.font/font/) Menü angezeigt; der Unterfamilienname wird als Stilname dargestellt. Aus historischen Gründen enthalten [Font](../../../aspose.font/font/) Familien maximal vier Stile, aber [Font](../../../aspose.font/font/) Designer können mehr als vier Schriften zu einer einzigen Familie gruppieren. Die IDs für Bevorzugte Familie und Bevorzugte Unterfamilie ermöglichen es [Font](../../../aspose.font/font/) Designern, die bevorzugten Familien‑/Unterfamilien‑Gruppierungen aufzunehmen. Diese IDs sind nur vorhanden, wenn sie von den IDs 1 und 2 abweichen. |
| PreferredSubfamily | 17 | 17 Bevorzugte Unterfamilie (nur Windows); Unter Windows wird der Familienname im [Font](../../../aspose.font/font/) Menü angezeigt; der Unterfamilienname wird als Stilname dargestellt. Aus historischen Gründen enthalten [Font](../../../aspose.font/font/) Familien maximal vier Stile, aber [Font](../../../aspose.font/font/) Designer können mehr als vier Schriften zu einer einzigen Familie gruppieren. Die IDs für Bevorzugte Familie und Bevorzugte Unterfamilie ermöglichen es [Font](../../../aspose.font/font/) Designern, die bevorzugten Familien‑/Unterfamilien‑Gruppierungen aufzunehmen. Diese IDs sind nur vorhanden, wenn sie von den IDs 1 und 2 abweichen. |
| CompatibleFull | 18 | 18 Kompatibler Vollname (nur Macintosh); Auf dem Macintosh wird der Menüname mithilfe der [Font](../../../aspose.font/font/) Ressource erstellt. Dieser entspricht in der Regel dem Vollnamen. Wenn der Name des [Font](../../../aspose.font/font/) anders als der Vollname angezeigt werden soll, kann der Kompatible Vollname in ID 18 eingefügt werden. Dieser Name wird vom Mac‑OS selbst nicht verwendet, kann aber von Anwendungsentwicklern (z.B. Adobe) genutzt werden. |
| SampleText | 19 | 19 Beispieltext. Dies kann der Name des [Font](../../../aspose.font/font/) sein oder jeder andere Text, den der Designer für den besten Beispieltext hält, um zu zeigen, wie das [Font](../../../aspose.font/font/) aussieht. |
| PostScriptCID | 20 | Seine Anwesenheit in einer Schrift bedeutet, dass nameID 6 einen PostScript‑Schriftnamen enthält, der mit dem Aufruf „composefont“ verwendet werden soll, um die Schrift in einem PostScript‑Interpreter zu aktivieren. |
| WwsFamilyName | 21 | Wird verwendet, um einen WWS‑konformen Familiennamen bereitzustellen, falls die Einträge für IDs 16 und 17 nicht dem WWS‑Modell entsprechen. |
| WwsSubfamilyName | 22 | In Verbindung mit ID 21 liefert diese ID einen WWS‑konformen Unterfamiliennamen (der nur Gewicht-, Breiten- und Neigungs‑Attribute widerspiegelt), falls die Einträge für IDs 16 und 17 nicht dem WWS‑Modell entsprechen. |
| LightBackground | 23 | Diese ID gibt, wenn sie im CPAL‑Tabellen‑Palette‑Labels‑Array verwendet wird, an, dass die entsprechende Farbpalette in der CPAL‑Tabelle für die Verwendung mit der Schrift geeignet ist, wenn sie auf einem hellen Hintergrund wie Weiß angezeigt wird. |
| DarkBackground | 24 | Diese ID gibt, wenn sie im CPAL‑Tabellen‑Palette‑Labels‑Array verwendet wird, an, dass die entsprechende Farbpalette in der CPAL‑Tabelle für die Verwendung mit der Schrift geeignet ist, wenn sie auf einem dunklen Hintergrund wie Schwarz angezeigt wird. |
| VariationsPostScriptNamePrefix | 25 | Falls in einer variablen Schrift vorhanden, kann es als Familienpräfix im Algorithmus zur PostScript‑Namensgenerierung für Variationsschriften verwendet werden. |

## Siehe auch

* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
