---
title: "System::Drawing::Size Klasse"
linktitle: "Size"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Size Klasse. Stellt ein Paar von Ganzzahlwerten dar, die Breite und Höhe eines Bildes repräsentieren. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 2200
url: /de/cpp/system.drawing/size/
---
## Size class


Stellt ein Paar von Ganzzahlwerten dar, die Breite und Höhe eines Bildes repräsentieren. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die [System::SmartPtr](../../system/smartptr/) Klasse, um Objekte dieses Typs zu verwalten.

```cpp
class Size
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Add](./add/)(const Size\&, const Size\&) | Gibt ein neues [Size](./)-Objekt zurück, das die Summe des angegebenen [Size](./)-Objekts ist, d. h. dessen Breitenwert gleich der Summe der Breitenwerte der angegebenen Objekte und dessen Höhenwert gleich der Summe der Höhenwerte der angegebenen Objekte ist. |
| static [Ceiling](./ceiling/)(const SizeF\&) | Erstellt ein [Size](./)-Objekt aus dem angegebenen [SizeF](../sizef/)-Objekt, indem die Breiten- und Höhenwerte des [SizeF](../sizef/)-Objekts auf die nächsthöhere Ganzzahl gerundet werden. |
| [Equals](./equals/)(const Size\&) const | Bestimmt, ob das aktuelle Objekt und das angegebene Objekt gleich sind, d. h. dass sie dasselbe Paar von Breiten- und Höhenwerten darstellen. |
| [get_Height](./get_height/)() const | Gibt den von dem aktuellen Objekt dargestellten Höhenwert zurück. |
| [get_IsEmpty](./get_isempty/)() const | Bestimmt, ob sowohl Breiten- als auch Höhenwerte gleich 0 sind. |
| [get_Width](./get_width/)() const | Gibt den von dem aktuellen Objekt dargestellten Breitenwert zurück. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [operator Point](./operatorpoint/)() const | Erstellt eine Instanz des [Point](../point/)-Objekts und initialisiert dessen X‑ und Y‑Koordinaten mit den Breiten- bzw. Höhenwerten des aktuellen Objekts. |
| [operator SizeF](./operatorsizef/)() const | Erstellt eine Instanz des [SizeF](../sizef/)-Objekts und initialisiert sie mit den Breiten- und Höhenwerten des aktuellen [Size](./)-Objekts. |
| static [Round](./round/)(const SizeF\&) | Erstellt ein [Size](./)-Objekt aus dem angegebenen [SizeF](../sizef/)-Objekt, indem die Breiten- und Höhenwerte des [SizeF](../sizef/)-Objekts auf die nächstgelegene Ganzzahl gerundet werden. |
| [set_Height](./set_height/)(int) | Setzt den von dem aktuellen Objekt dargestellten Höhenwert. |
| [set_Width](./set_width/)(int) | Setzt den von dem aktuellen Objekt dargestellten Breitenwert. |
| [Size](./size/)() | Erstellt ein neues [Size](./)-Objekt und initialisiert dessen Breiten- und Höhenwerte mit 0. |
| [Size](./size/)(const Point\&) | Erstellt ein neues [Size](./)-Objekt und initialisiert dessen Breiten- und Höhenwerte mit den X‑ und Y‑Koordinaten des angegebenen Punktes entsprechend. |
| [Size](./size/)(int, int) | Erstellt ein neues [Size](./)-Objekt und initialisiert es mit dem angegebenen Wert. |
| static [Subtract](./subtract/)(const Size\&, const Size\&) | Gibt ein neues [Size](./)-Objekt zurück, das das Ergebnis der Subtraktion von **size2** von **size1** ist, d. h. dessen Breitenwert das Ergebnis der Subtraktion des Breitenwerts von **size2's** vom Breitenwert von **size1's** und dessen Höhenwert das Ergebnis der Subtraktion des Höhenwerts von **size2's** vom Höhenwert von **size1's** ist. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des Paares von Breiten- und Höhenwerten zurück, das vom aktuellen Objekt dargestellt wird. |
| static [Truncate](./truncate/)(const SizeF\&) | Erstellt ein [Size](./)-Objekt aus dem angegebenen [SizeF](../sizef/)-Objekt, indem die Breiten- und Höhenwerte des [SizeF](../sizef/)-Objekts auf die nächstniedrigere Ganzzahl abgeschnitten werden. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Eine leere Instanz der Klasse [Size](./), deren Breiten- und Höhenwerte 0 sind. |
## Siehe auch

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
