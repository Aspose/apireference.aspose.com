---
title: "System::Drawing::SizeF-Klasse"
linktitle: "SizeF"
second_title: "Aspose.Page für C++"
description: "System::Drawing::SizeF Klasse. Stellt ein Paar von Gleitkommawerten einfacher Genauigkeit dar, die Breite und Höhe eines Bildes repräsentieren. Dieser Typ sollte auf dem Stack zugewiesen und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 2300
url: /de/cpp/system.drawing/sizef/
---
## SizeF class


Stellt ein Paar von Gleitkommawerten einfacher Genauigkeit dar, die Breite und Höhe eines Bildes repräsentieren. Dieser Typ sollte auf dem Stack zugewiesen und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die [System::SmartPtr](../../system/smartptr/) Klasse, um Objekte dieses Typs zu verwalten.

```cpp
class SizeF
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Add](./add/)(const SizeF\&, const SizeF\&) | Gibt ein neues [SizeF](./) Objekt zurück, das die Summe der angegebenen [SizeF](./) Objekte ist, d. h. dessen Breitenwert gleich der Summe der Breitenwerte der angegebenen Objekte und dessen Höhenwert gleich der Summe der Höhenwerte der angegebenen Objekte ist. |
| [Equals](./equals/)(const SizeF\&) const | Bestimmt, ob das aktuelle Objekt und das angegebene Objekt gleich sind, d. h. dass sie dasselbe Paar von Breiten- und Höhenwerten darstellen. |
| [get_Height](./get_height/)() const | Gibt den von dem aktuellen Objekt repräsentierten Höhenwert zurück. |
| [get_IsEmpty](./get_isempty/)() const | Bestimmt, ob sowohl Breiten- als auch Höhenwerte gleich 0 sind. |
| [get_Width](./get_width/)() const | Gibt den von dem aktuellen Objekt dargestellten Breitenwert zurück. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [operator PointF](./operatorpointf/)() const | Konvertiert das aktuelle Objekt in eine Instanz des [Point](../point/) Objekts, indem seine X- und Y-Koordinaten entsprechend mit den Breiten- und Höhenwerten des aktuellen Objekts initialisiert werden. |
| [operator+=](./operator+=/)(const SizeF\&) | Addiert die Breiten- und Höhenwerte des angegebenen [SizeF](./) Objekts zu den Breiten- und Höhenwerten des aktuellen [SizeF](./) Objekts entsprechend. |
| [set_Height](./set_height/)(float) | Legt den von dem aktuellen Objekt dargestellten Höhenwert fest. |
| [set_Width](./set_width/)(float) | Legt den von dem aktuellen Objekt dargestellten Breitenwert fest. |
| [SizeF](./sizef/)() | Erstellt ein neues [SizeF](./) Objekt und initialisiert seine Breiten- und Höhenwerte mit 0. |
| [SizeF](./sizef/)(const PointF\&) | Erstellt ein neues [SizeF](./) Objekt und initialisiert seine Breiten- und Höhenwerte mit den X- und Y-Koordinaten des angegebenen Punktes entsprechend. |
| [SizeF](./sizef/)(float, float) | Erstellt ein neues [SizeF](./) Objekt und initialisiert es mit dem angegebenen Wert. |
| static [Subtract](./subtract/)(const SizeF\&, const SizeF\&) | Gibt ein neues [SizeF](./) Objekt zurück, das das Ergebnis der Subtraktion von **size2** von **size1** ist, d. h. dessen Breitenwert das Ergebnis der Subtraktion des Breitenwerts von **size2** vom Breitenwert von **size1** ist und dessen Höhenwert das Ergebnis der Subtraktion des Höhenwerts von **size2** vom Höhenwert von **size1** ist. |
| [ToPointF](./topointf/)() const | Konvertiert das aktuelle Objekt in eine Instanz des [Point](../point/) Objekts, indem seine X- und Y-Koordinaten entsprechend mit den Breiten- und Höhenwerten des aktuellen Objekts initialisiert werden. |
| [ToSize](./tosize/)() const | Erstellt ein [Size](../size/) Objekt aus dem aktuellen [SizeF](./) Objekt, indem die Breiten- und Höhenwerte des [SizeF](./) Objekts auf die nächstniedrigeren Ganzzahlwerte abgeschnitten werden. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des Paares von Breiten- und Höhenwerten zurück, die vom aktuellen Objekt dargestellt werden. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Eine leere Instanz der [SizeF](./) Klasse, deren Breiten- und Höhenwerte 0 sind. |
## Siehe auch

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
