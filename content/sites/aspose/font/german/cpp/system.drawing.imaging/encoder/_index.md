---
title: "System::Drawing::Imaging::Encoder class"
linktitle: "Encoder"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::Encoder class. Stellt eine GUID dar, die mit einem Satz von Bild-Encoder-Parametern verknüpft ist. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.drawing.imaging/encoder/
---
## Encoder class


Stellt eine GUID dar, die mit einem Satz von Bild-Encoder-Parametern verknüpft ist. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Encoder : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Encoder](./encoder/)(const Guid\&) | Konstruiert eine neue Instanz der Klasse [Encoder](./). |
| [get_Guid](./get_guid/)() const | Gibt eine GUID zurück, die einen Satz von Bild-Encoder-Parametern angibt, die das aktuelle Objekt repräsentiert. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [ChrominanceTable](./chrominancetable/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie der Chrominanz-Tabelle darstellt. |
| static [ColorDepth](./colordepth/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie für Farbtiefe darstellt. |
| static [Compression](./compression/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie für Kompression darstellt. |
| static [LuminanceTable](./luminancetable/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie für die Luminanztabelle darstellt. |
| static [Quality](./quality/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie für Qualität darstellt. |
| static [RenderMethod](./rendermethod/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie für die Render-Methode darstellt. |
| static [SaveFlag](./saveflag/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie für das Speicherflag darstellt. |
| static [ScanMethod](./scanmethod/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie für die Scan-Methode darstellt. |
| static [Transformation](./transformation/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie für Transformation darstellt. |
| static [Version](./version/) | Eine Instanz der Klasse [Encoder](./), die die Parameterkategorie für Version darstellt. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
