---
title: "Aspose::Font::TtfCommon::Version16Dot16 Klasse"
linktitle: "Version16Dot16"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfCommon::Version16Dot16 Klasse. Repräsentiert den Version16Dot16-Datentyp in C++."
type: docs
weight: 100
url: /de/cpp/aspose.font.ttfcommon/version16dot16/
---
## Version16Dot16 class


Repräsentiert den [Version16Dot16](./)-Datentyp.

```cpp
class Version16Dot16 : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Erstelle eine Kopie des [Version16Dot16](./)-Objekts. |
| [get_MajorNumber](./get_majornumber/)() const | Ermittelt die Hauptversionsnummer. Der Wert ist nur in hexadezimaler Schreibweise sinnvoll, zum Beispiel hat die Version 0.5 für 'maxp' in tatsächlichen Font-Dateien 4 Bytes: {0, 0, 80, 0}, was die hexadezimale Darstellung 0x00005000 hat. Nach dem Lesen dieser Version aus der Font-Datei werden die Haupt- und Neben­nummern für das Objekt [Version16Dot16](./) 0 bzw. 20480 sein. Und diese Werte in hexadezimaler Form sind 0x0000 und 0x5000. |
| [get_MinorNumber](./get_minornumber/)() const | Ermittelt die Nebenversionsnummer. Der Wert ist nur in hexadezimaler Schreibweise sinnvoll, zum Beispiel hat die Version 0.5 für 'maxp' in tatsächlichen Font-Dateien 4 Bytes: {0, 0, 80, 0}, was die hexadezimale Darstellung 0x00005000 hat. Nach dem Lesen dieser Version aus der Font-Datei werden die Haupt- und Neben­nummern für das Objekt [Version16Dot16](./) 0 bzw. 20480 sein. Und diese Werte in hexadezimaler Form sind 0x0000 und 0x5000. |
| [get_RawBytes](./get_rawbytes/)() | Ermittelt alle Rohbits für die [Version16Dot16](./)-Versionsnummer als Byte‑Array mit einer Größe von 4 Bytes. |
| [set_MajorNumber](./set_majornumber/)(uint16_t) | Setzt die Hauptversionsnummer. Der Wert ist nur in hexadezimaler Schreibweise sinnvoll, zum Beispiel hat die Version 0.5 für 'maxp' in tatsächlichen Font-Dateien 4 Bytes: {0, 0, 80, 0}, was die hexadezimale Darstellung 0x00005000 hat. Nach dem Lesen dieser Version aus der Font-Datei werden die Haupt- und Neben­nummern für das Objekt [Version16Dot16](./) 0 bzw. 20480 sein. Und diese Werte in hexadezimaler Form sind 0x0000 und 0x5000. |
| [set_MinorNumber](./set_minornumber/)(uint16_t) | Setzt die Nebenversionsnummer. Der Wert ist nur in hexadezimaler Schreibweise sinnvoll, zum Beispiel hat die Version 0.5 für 'maxp' in tatsächlichen Font-Dateien 4 Bytes: {0, 0, 80, 0}, was die hexadezimale Darstellung 0x00005000 hat. Nach dem Lesen dieser Version aus der Font-Datei werden die Haupt- und Neben­nummern für das Objekt [Version16Dot16](./) 0 bzw. 20480 sein. Und diese Werte in hexadezimaler Form sind 0x0000 und 0x5000. |
| [ToString](./tostring/)() const override | Gibt den Versionswert als formatierte Zeichenkette zurück, zum Beispiel "0.5", "1.1", "3.0" usw. |
| [Version16Dot16](./version16dot16/)() | Konstruktor. |
| [Version16Dot16](./version16dot16/)(uint16_t, uint16_t) | Konstruktor. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font::TtfCommon](../)
* Library [Aspose.Font for C++](../../)
