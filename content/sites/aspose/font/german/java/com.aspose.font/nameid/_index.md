---
title: "NameId"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die NameId-Aufzählung dar."
type: docs
weight: 67
url: /de/java/com.aspose.font/nameid/
---
**Inheritance:**
java.lang.Object
```
public final class NameId
```

Stellt die NameId-Aufzählung dar.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [CompatibleFull](#CompatibleFull) | 18 Kompatibel Voll (nur Macintosh); Auf dem Macintosh wird der Menüname mit der Font-Ressource erstellt. |
| [CopyrightNotice](#CopyrightNotice) | 0 Urheberrechtshinweis. |
| [DarkBackground](#DarkBackground) | Diese ID, wenn sie im CPAL table\\u2019s Palette Labels Array verwendet wird, gibt an, dass die entsprechende Farbpalette in der CPAL‑Tabelle für die Verwendung mit der Font geeignet ist, wenn sie auf einem dunklen Hintergrund wie Schwarz angezeigt wird. |
| [Description](#Description) | 10 Beschreibung; Beschreibung des Schriftsatzes. |
| [DesignerName](#DesignerName) | 9 Designer; Name des Designers der Schriftart. |
| [FontFamily](#FontFamily) | 1 Schriftfamilie. |
| [FontSubfamily](#FontSubfamily) | 2 Schriftunterfamilie. |
| [FullName](#FullName) | 4 Vollständiger Name der Schrift. |
| [LicenseDescription](#LicenseDescription) | 13 Lizenzbeschreibung; Beschreibung, wie die Schrift rechtlich verwendet werden darf, oder verschiedene Beispielszenarien für die lizenzierte Nutzung. |
| [LicenseInfoUrl](#LicenseInfoUrl) | 14 Lizenzinformationen-URL, wo zusätzliche Lizenzinformationen gefunden werden können. |
| [LightBackground](#LightBackground) | Diese ID gibt, wenn sie im Palette Labels Array der CPAL\\u2019s verwendet wird, an, dass die entsprechende Farbpalette in der CPAL‑Tabelle geeignet ist, mit der Schrift verwendet zu werden, wenn sie auf einem hellen Hintergrund wie Weiß angezeigt wird. |
| [ManufacturerName](#ManufacturerName) | 8 Herstellername. |
| [PostScriptCID](#PostScriptCID) | Seine Anwesenheit in einer Schrift bedeutet, dass nameID 6 einen PostScript‑Schriftnamen enthält, der mit dem Aufruf \\u201ccomposefont\\u201d verwendet werden soll, um die Schrift in einem PostScript‑Interpreter zu aktivieren. |
| [PostScriptName](#PostScriptName) | 6 PostScript‑Name der Schrift. |
| [PreferredFamily](#PreferredFamily) | 15 Reserviert 16 Bevorzugte Familie (nur Windows); In Windows wird der Familienname im Schriftmenü angezeigt; der Unterfamilienname wird als Stilname dargestellt. |
| [PreferredSubfamily](#PreferredSubfamily) | 17 Bevorzugte Unterfamilie (nur Windows); In Windows wird der Familienname im Schriftmenü angezeigt; der Unterfamilienname wird als Stilname dargestellt. |
| [SampleText](#SampleText) | 19 Beispieltext. |
| [TrademarkNotice](#TrademarkNotice) | 7 Markenhinweis. |
| [UniqueFontId](#UniqueFontId) | 3 Apple‑Spezifikation: Eindeutige Unterfamilienidentifikation. 3 MS‑Spezifikation: Eindeutiger Schriftidentifikator |
| [UrlDesigner](#UrlDesigner) | 12 URL des Schrift‑Designers (mit Protokoll, z. B. http://, ftp://) |
| [UrlVendor](#UrlVendor) | 11 URL des Schrift‑Anbieters (mit Protokoll, z. B. http://, ftp://). |
| [VariationsPostScriptNamePrefix](#VariationsPostScriptNamePrefix) | Falls in einer variablen Schrift vorhanden, kann es als Familienpräfix im Algorithmus zur PostScript‑Namensgenerierung für Variationsschriften verwendet werden. |
| [Version](#Version) | 5 Version der Namens‑Tabelle. |
| [WwsFamilyName](#WwsFamilyName) | Wird verwendet, um einen WWS‑konformen Familiennamen bereitzustellen, falls die Einträge für IDs 16 und 17 nicht dem WWS‑Modell entsprechen. |
| [WwsSubfamilyName](#WwsSubfamilyName) | In Kombination mit ID 21 liefert diese ID einen WWS‑konformen Unterfamiliennamen (der nur Gewicht-, Breiten- und Neigungsattribute widerspiegelt), falls die Einträge für IDs 16 und 17 nicht dem WWS‑Modell entsprechen. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromId(int id)](#fromId-int-) | Erstellt eine Namens‑ID aus einem ganzzahligen Wert. |
| [getClass()](#getClass--) |  |
| [getId()](#getId--) | Gib den ganzzahligen Wert zurück. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompatibleFull {#CompatibleFull}
```
public static final NameId CompatibleFull
```


18 Kompatibler Vollname (nur Macintosh); Auf dem Macintosh wird der Menüname mithilfe der Schriftressource erstellt. Dieser stimmt in der Regel mit dem Vollständigen Namen überein. Wenn der Name der Schrift anders als der Vollständige Name angezeigt werden soll, kann der Kompatible Vollname in ID 18 eingefügt werden. Dieser Name wird vom Mac‑OS selbst nicht verwendet, kann aber von Anwendungsentwicklern (z. B. Adobe) genutzt werden.

### CopyrightNotice {#CopyrightNotice}
```
public static final NameId CopyrightNotice
```


0 Urheberrechtshinweis.

### DarkBackground {#DarkBackground}
```
public static final NameId DarkBackground
```


Diese ID, wenn sie im CPAL table\\u2019s Palette Labels Array verwendet wird, gibt an, dass die entsprechende Farbpalette in der CPAL‑Tabelle für die Verwendung mit der Font geeignet ist, wenn sie auf einem dunklen Hintergrund wie Schwarz angezeigt wird.

### Description {#Description}
```
public static final NameId Description
```


10 Beschreibung; Beschreibung der Schriftart. Kann Versionsinformationen, Nutzungsempfehlungen, Geschichte, Merkmale usw. enthalten.

### DesignerName {#DesignerName}
```
public static final NameId DesignerName
```


9 Designer; Name des Designers der Schriftart.

### FontFamily {#FontFamily}
```
public static final NameId FontFamily
```


1 Schriftfamilie. Diese Zeichenkette ist der Schriftfamilienname, den der Benutzer auf Macintosh‑Plattformen sieht.

### FontSubfamily {#FontSubfamily}
```
public static final NameId FontSubfamily
```


2 Font Subfamily. Dieser String ist die Schriftfamilie, die der Benutzer auf Macintosh-Plattformen sieht.

### FullName {#FullName}
```
public static final NameId FullName
```


4 Vollständiger Name der Schrift.

### LicenseDescription {#LicenseDescription}
```
public static final NameId LicenseDescription
```


13 Lizenzbeschreibung; Beschreibung, wie die Schrift legal verwendet werden darf, oder verschiedene Beispielszenarien für lizenzierte Nutzung. Dieses Feld sollte in klarer Sprache verfasst sein, nicht in Rechtssprache.

### LicenseInfoUrl {#LicenseInfoUrl}
```
public static final NameId LicenseInfoUrl
```


14 Lizenzinformationen-URL, wo zusätzliche Lizenzinformationen gefunden werden können.

### LightBackground {#LightBackground}
```
public static final NameId LightBackground
```


Diese ID gibt, wenn sie im Palette Labels Array der CPAL\\u2019s verwendet wird, an, dass die entsprechende Farbpalette in der CPAL‑Tabelle geeignet ist, mit der Schrift verwendet zu werden, wenn sie auf einem hellen Hintergrund wie Weiß angezeigt wird.

### ManufacturerName {#ManufacturerName}
```
public static final NameId ManufacturerName
```


8 Herstellername.

### PostScriptCID {#PostScriptCID}
```
public static final NameId PostScriptCID
```


Seine Anwesenheit in einer Schrift bedeutet, dass nameID 6 einen PostScript‑Schriftnamen enthält, der mit dem Aufruf \\u201ccomposefont\\u201d verwendet werden soll, um die Schrift in einem PostScript‑Interpreter zu aktivieren.

### PostScriptName {#PostScriptName}
```
public static final NameId PostScriptName
```


6 PostScript-Name der Schrift. Hinweis: Eine Schrift darf nur einen PostScript-Namen haben und dieser Name muss ASCII sein.

### PreferredFamily {#PreferredFamily}
```
public static final NameId PreferredFamily
```


15 Reserved 16 Preferred Family (nur Windows); In Windows wird der Familienname im Schriftmenü angezeigt; der Subfamilienname wird als Stilname dargestellt. Aus historischen Gründen enthielten Schriftfamilien maximal vier Stile, aber Schriftgestalter können mehr als vier Schriften zu einer einzigen Familie gruppieren. Die Preferred Family- und Preferred Subfamily-IDs ermöglichen es den Schriftgestaltern, die bevorzugten Familien‑/Subfamilien‑Gruppierungen anzugeben. Diese IDs sind nur vorhanden, wenn sie sich von den IDs 1 und 2 unterscheiden.

### PreferredSubfamily {#PreferredSubfamily}
```
public static final NameId PreferredSubfamily
```


17 Preferred Subfamily (nur Windows); In Windows wird der Familienname im Schriftmenü angezeigt; der Subfamilienname wird als Stilname dargestellt. Aus historischen Gründen enthielten Schriftfamilien maximal vier Stile, aber Schriftgestalter können mehr als vier Schriften zu einer einzigen Familie gruppieren. Die Preferred Family- und Preferred Subfamily-IDs ermöglichen es den Schriftgestaltern, die bevorzugten Familien‑/Subfamilien‑Gruppierungen anzugeben. Diese IDs sind nur vorhanden, wenn sie sich von den IDs 1 und 2 unterscheiden.

### SampleText {#SampleText}
```
public static final NameId SampleText
```


19 Beispieltext. Dies kann der Schriftname sein oder jeder andere Text, den der Gestalter für den besten Beispieltext hält, um zu zeigen, wie die Schrift aussieht.

### TrademarkNotice {#TrademarkNotice}
```
public static final NameId TrademarkNotice
```


7 Markenhinweis.

### UniqueFontId {#UniqueFontId}
```
public static final NameId UniqueFontId
```


3 Apple‑Spezifikation: Eindeutige Unterfamilienidentifikation. 3 MS‑Spezifikation: Eindeutiger Schriftidentifikator

### UrlDesigner {#UrlDesigner}
```
public static final NameId UrlDesigner
```


12 URL des Schrift‑Designers (mit Protokoll, z. B. http://, ftp://)

### UrlVendor {#UrlVendor}
```
public static final NameId UrlVendor
```


11 URL des Schriftanbieters (mit Protokoll, z. B. http://, ftp://). Wenn eine eindeutige Seriennummer in der URL eingebettet ist, kann sie zur Registrierung der Schrift verwendet werden.

### VariationsPostScriptNamePrefix {#VariationsPostScriptNamePrefix}
```
public static final NameId VariationsPostScriptNamePrefix
```


Falls in einer variablen Schrift vorhanden, kann es als Familienpräfix im Algorithmus zur PostScript‑Namensgenerierung für Variationsschriften verwendet werden.

### Version {#Version}
```
public static final NameId Version
```


5 Version der Namens‑Tabelle.

### WwsFamilyName {#WwsFamilyName}
```
public static final NameId WwsFamilyName
```


Wird verwendet, um einen WWS‑konformen Familiennamen bereitzustellen, falls die Einträge für IDs 16 und 17 nicht dem WWS‑Modell entsprechen.

### WwsSubfamilyName {#WwsSubfamilyName}
```
public static final NameId WwsSubfamilyName
```


In Kombination mit ID 21 liefert diese ID einen WWS‑konformen Unterfamiliennamen (der nur Gewicht-, Breiten- und Neigungsattribute widerspiegelt), falls die Einträge für IDs 16 und 17 nicht dem WWS‑Modell entsprechen.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fromId(int id) {#fromId-int-}
```
public static NameId fromId(int id)
```


Erstellt eine Namens‑ID aus einem ganzzahligen Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | int | Ein ganzzahliger Wert. |

**Returns:**
[NameId](../../com.aspose.font/nameid) - The name id.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getId() {#getId--}
```
public int getId()
```


Gib den ganzzahligen Wert zurück.

**Returns:**
int - Der ganzzahlige Wert.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

