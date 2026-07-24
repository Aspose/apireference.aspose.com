---
title: "Klasse Aspose::Page::SaveOptions"
linktitle: "SaveOptions"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::SaveOptions Klasse. Diese Klasse enthält Optionen, die für die Verwaltung des Konvertierungsprozesses in C++ erforderlich sind."
type: docs
weight: 1500
url: /de/cpp/aspose.page/saveoptions/
---
## SaveOptions class


Diese Klasse enthält Optionen, die für die Verwaltung des Konvertierungsprozesses erforderlich sind.

```cpp
class SaveOptions : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Gibt zusätzliche Ordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. Der Standardordner ist der übliche Schriftartenordner, in dem das Betriebssystem Schriftarten für interne Zwecke findet. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | Gibt an, ob nicht-TrueType-Schriften als TTF gespeichert werden sollen. Es verringert das Volumen des resultierenden Dokuments bei der PS-zu-PDF-Konvertierung erheblich und erhöht die Geschwindigkeit der Konvertierung von PS-Dateien mit einer großen Menge Text in nicht-TrueType-Schriften in jedes Ausgabeformat. Allerdings gibt es bei der Konvertierung von PostScript-Dateien in ein Bild eine leichte vertikale Verschiebung des Textes. |
| virtual [get_Debug](./get_debug/)() | Gibt an, ob Debug‑Informationen in den Standardausgabestream geschrieben werden sollen oder nicht. |
| virtual [get_Exceptions](./get_exceptions/)() | Gibt eine Liste unterdrückter Konvertierungsfehler zurück, wenn [SuppressErrors](../) true ist. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Die Kategorie „Qualität“ gibt das Kompressionsniveau für ein Bild an. Verfügbare Werte liegen zwischen 0 und 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt. |
| [get_Size](./get_size/)() const | Liest/Setzt die Größe des Bildes. |
| virtual [get_SupressErrors](./get_supresserrors/)() | Gibt an, ob Fehler unterdrückt werden sollen oder nicht. Wenn true, werden unterdrückte Fehler zur [Exceptions](../) Liste hinzugefügt. Wenn false, beendet der erste Fehler das Programm. |
| [SaveOptions](./saveoptions/)() | Initialisiert eine neue Instanz der [SaveOptions](./) Klasse mit Standardwerten für die Flags [SuppressErrors](../) (true) und [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(bool) | Initialisiert eine neue Instanz der [SaveOptions](./) Klasse mit dem Standardwert für das Flag [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | Initialisiert eine neue Instanz von [SaveOptions](./) mit der angegebenen Seitengröße. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | Initialisiert eine neue Instanz der [SaveOptions](./) Klasse mit dem Standardwert für das Flag [Debug](../) (false) und mit der angegebenen Seitengröße. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Gibt zusätzliche Ordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. Der Standardordner ist der übliche Schriftartenordner, in dem das Betriebssystem Schriftarten für interne Zwecke findet. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | Gibt an, ob nicht-TrueType-Schriften als TTF gespeichert werden sollen. Es verringert das Volumen des resultierenden Dokuments bei der PS-zu-PDF-Konvertierung erheblich und erhöht die Geschwindigkeit der Konvertierung von PS-Dateien mit einer großen Menge Text in nicht-TrueType-Schriften in jedes Ausgabeformat. Allerdings gibt es bei der Konvertierung von PostScript-Dateien in ein Bild eine leichte vertikale Verschiebung des Textes. |
| virtual [set_Debug](./set_debug/)(bool) | Gibt an, ob Debug‑Informationen in den Standardausgabestream geschrieben werden sollen oder nicht. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Die Kategorie „Qualität“ gibt das Kompressionsniveau für ein Bild an. Verfügbare Werte liegen zwischen 0 und 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | Liest/Setzt die Größe des Bildes. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | Gibt an, ob Fehler unterdrückt werden sollen oder nicht. Wenn true, werden unterdrückte Fehler zur [Exceptions](../) Liste hinzugefügt. Wenn false, beendet der erste Fehler das Programm. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
