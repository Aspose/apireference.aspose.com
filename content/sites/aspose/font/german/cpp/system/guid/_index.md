---
title: "System::Guid class"
linktitle: "Guid"
second_title: "Aspose.Font für C++"
description: "System::Guid class. Stellt einen global eindeutigen Bezeichner (GUID) dar. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse System::SmartPtr, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 3000
url: /de/cpp/system/guid/
---
## Guid class


Stellt einen global eindeutigen Bezeichner dar. Dieser Typ sollte auf dem Stack zugewiesen und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](../smartptr/), um Objekte dieses Typs zu verwalten.

```cpp
class Guid
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | Führt einen arithmetischen Vergleich der von dem aktuellen und dem angegebenen Objekt dargestellten GUIDs durch. |
| [Equals](./equals/)(const Guid\&) const | Bestimmt, ob die von dem aktuellen und dem angegebenen Objekt dargestellten GUIDs gleich sind. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [Guid](./guid/)() | Konstruiert ein Objekt, das eine GUID darstellt, die ausschließlich Nullen enthält. |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | Konstruiert ein Objekt, das eine GUID darstellt, die als Array von vorzeichenlosen 8‑Bit‑Ganzzahlen angegeben ist. |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | Konstruiert ein Objekt, das eine GUID darstellt, die als Array‑Ansicht von vorzeichenlosen 8‑Bit‑Ganzzahlen angegeben ist. |
| [Guid](./guid/)(const String\&) | Konstruiert ein Objekt, das eine GUID darstellt, die als Zeichenkette angegeben ist. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | Konstruiert eine Instanz der Klasse [Guid](./) aus den angegebenen GUID‑Komponenten. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | Konstruiert eine Instanz der Klasse [Guid](./) aus den angegebenen GUID‑Komponenten. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Konstruiert eine Instanz der Klasse [Guid](./) aus den angegebenen vorzeichenlosen Ganzzahlen und Bytes. |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Konstruiert eine Instanz der Klasse [Guid](./) aus den angegebenen vorzeichenlosen Ganzzahlen und Bytes. |
| [Guid](./guid/)(const Guid\&) | Konstruiert ein Objekt, das dieselbe GUID wie das angegebene Objekt darstellt. |
| static [NewGuid](./newguid/)() | Erzeugt eine neue GUID und gibt ein [Guid](./)-Objekt zurück, das sie darstellt. |
| [operator!=](./operator!=/)(const Guid\&) const | Bestimmt, ob die von dem aktuellen und dem angegebenen Objekt dargestellten GUIDs nicht gleich sind. |
| [operator=](./operator=/)(const Guid\&) | Weist dem aktuellen Objekt den GUID‑Wert zu, der vom angegebenen [Guid](./)-Objekt dargestellt wird. |
| [operator==](./operator==/)(const Guid\&) const | Bestimmt, ob die von dem aktuellen und dem angegebenen Objekt dargestellten GUIDs gleich sind. |
| static [Parse](./parse/)(const String\&) | Konvertiert die angegebene Zeichenketten­darstellung einer GUID in ein äquivalentes [Guid](./)-Objekt. |
| [ToByteArray](./tobytearray/)() const | Konvertiert die vom aktuellen Objekt dargestellte GUID in ein Byte‑Array. |
| [ToString](./tostring/)() const | Konvertiert die vom aktuellen Objekt dargestellte GUID in ihre Zeichenketten­darstellung. |
| [ToString](./tostring/)(const String\&) const | Konvertiert die vom aktuellen Objekt dargestellte GUID in ihre Zeichenketten­darstellung unter Verwendung des angegebenen Zeichenkettenformats. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | Konvertiert die vom aktuellen Objekt dargestellte GUID in ihre Zeichenketten­darstellung unter Verwendung des angegebenen Zeichenkettenformats und der Kultur. |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | Versucht, die angegebene Zeichenkette in ein [Guid](./)-Objekt zu konvertieren. |
| [~Guid](./~guid/)() | Destruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Stellt eine GUID dar, die den Wert 0 hat. |
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
