---
title: "Aufzählung TtfNameTableNameId"
second_title: "Aspose.Font für .NET API-Referenz"
description: "Aspose.Font.TtfNameTableNameId Enum. Gibt NameId an"
type: docs
weight: 120
url: /de/nodejs-cpp/enumerations/ttfnametablenameid/
---
## TtfNameTableNameId enumeration

Gibt die NameId an.

```csharp
 enum TtfNameTableNameId
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
|  | CopyrightNotice | `0` | Copyright-Hinweis. |
|  | FontFamily | `1` | Schriftfamilie. Dieser String ist der Schriftfamilienname, den der Benutzer auf Macintosh-Plattformen sieht. |
|  | FontSubfamily | `2` | Schriftunterfamilie. Dieser String ist die Schriftfamilie, die der Benutzer auf Macintosh-Plattformen sieht. |
|  | UniqueFontId | `3` | Eindeutige Unterfamilienidentifikation (Apple-Spezifikation). 3 eindeutiger Schrift-Identifikator (MS-Spezifikation). |
|  | FullName | `4` | Vollständiger Name der Schrift. |
|  | Version | `5` | Version der Namens‑tabelle. |
|  | PostScriptName | `6` | PostScript‑Name der Schrift. Hinweis: Eine Schrift darf nur einen PostScript‑Namen haben und dieser Name muss ASCII sein. |
|  | TrademarkNotice | `7` | Markenhinweis. |
|  | ManufacturerName | `8` | Herstellername. |
|  | DesignerName | `9` | Designer; Name des Designers der Schriftart. |
|  | Description | `10` | Beschreibung; Beschreibung der Schriftart. Kann Versionsinformationen, Nutzungsempfehlungen, Geschichte, Merkmale usw. enthalten. |
|  | UrlVendor | `11` | URL des Schriftanbieters (mit Protokoll, z. B. http://, ftp://). Wenn eine eindeutige Seriennummer in der URL eingebettet ist, kann sie zur Registrierung der Schrift verwendet werden. |
|  | UrlDesigner | `12` | URL des Schrift‑Designers (mit Protokoll, z. B. http://, ftp://). |
|  | LicenseDescription | `13` | Lizenzbeschreibung; Beschreibung, wie die Schrift rechtlich verwendet werden darf, oder verschiedene Beispielszenarien für lizenzierte Nutzung. Dieses Feld sollte in klarer Sprache verfasst sein, nicht in Rechtssprache. |
|  | LicenseInfoUrl | `14` | URL zu Lizenzinformationen, wo zusätzliche Lizenzinformationen gefunden werden können. |
|  | PreferredFamily | `16` | `15` Reserviert `16` Bevorzugte Familie (nur Windows); In Windows wird der Familienname im Schriftmenü angezeigt; der Unterfamilienname wird als Stilname präsentiert. Aus historischen Gründen enthielten Schriftfamilien maximal vier Stile, aber Schriftgestalter können mehr als vier Schriften zu einer einzigen Familie gruppieren. Die IDs für bevorzugte Familie und bevorzugte Unterfamilie ermöglichen es Schriftgestaltern, die bevorzugten Familien-/Untergruppierungen einzubeziehen. Diese IDs sind nur vorhanden, wenn sie sich von den IDs 1 und 2 unterscheiden. |
|  | PreferredSubfamily | `17` | Bevorzugte Unterfamilie (nur Windows); In Windows wird der Familienname im Schriftmenü angezeigt; der Unterfamilienname wird als Stilname präsentiert. Aus historischen Gründen enthielten Schriftfamilien maximal vier Stile, aber Schriftgestalter können mehr als vier Schriften zu einer einzigen Familie gruppieren. Die IDs für bevorzugte Familie und bevorzugte Unterfamilie ermöglichen es Schriftgestaltern, die bevorzugten Familien-/Untergruppierungen einzubeziehen. Diese IDs sind nur vorhanden, wenn sie sich von den IDs 1 und 2 unterscheiden. |
|  | CompatibleFull | `18` | Kompatibler Vollname (nur Macintosh); Auf dem Macintosh wird der Menüname mithilfe der Schriftressource erstellt. Dieser entspricht normalerweise dem Vollnamen. Wenn der Name der Schrift anders als der Vollname angezeigt werden soll, kann der kompatible Vollname in ID 18 eingefügt werden. Dieser Name wird vom Mac‑OS selbst nicht verwendet, kann aber von Anwendungsentwicklern (z. B. Adobe) genutzt werden. |
|  | SampleText | `19` | Beispieltext. Dies kann der Schriftname sein oder jeder andere Text, den der Designer für den besten Beispieltext hält, um zu zeigen, wie die Schrift aussieht. |
|  | PostScriptCID | `20` | Seine Anwesenheit in einer Schrift bedeutet, dass nameID 6 einen PostScript-Schriftnamen enthält, der mit dem Aufruf "composefont" verwendet werden soll, um die Schrift in einem PostScript‑Interpreter zu aktivieren. |
|  | WwsFamilyName | `21` | Wird verwendet, um einen WWS-konformen Familiennamen bereitzustellen, falls die Einträge für IDs 16 und 17 nicht dem WWS‑Modell entsprechen. |
|  | WwsSubfamilyName | `22` | In Kombination mit ID 21 liefert diese ID einen WWS-konformen Unterfamiliennamen (der nur Gewicht-, Breiten- und Neigungsattribute widerspiegelt), falls die Einträge für IDs 16 und 17 nicht dem WWS‑Modell entsprechen. |
|  | LightBackground | `23` | Diese ID gibt, wenn sie im Palette‑Labels‑Array der CPAL‑Tabelle verwendet wird, an, dass die entsprechende Farbpalette in der CPAL‑Tabelle für die Verwendung mit der Schrift geeignet ist, wenn sie auf einem hellen Hintergrund wie Weiß angezeigt wird. |
|  | DarkBackground | `24` | Diese ID gibt, wenn sie im Palette‑Labels‑Array der CPAL‑Tabelle verwendet wird, an, dass die entsprechende Farbpalette in der CPAL‑Tabelle für die Verwendung mit der Schrift geeignet ist, wenn sie auf einem dunklen Hintergrund wie Schwarz angezeigt wird. |
|  | VariationsPostScriptNamePrefix | `25` | Falls in einer variablen Schrift vorhanden, kann sie als Familienpräfix im Algorithmus zur PostScript‑Namensgenerierung für Variationsschriften verwendet werden. |

