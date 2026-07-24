---
title: "System::Drawing::Size Klasse"
linktitle: "Size"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Size Klasse. Stellt ein Paar von Ganzzahlwerten dar, die Breite und Höhe eines Bildes repräsentieren. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse System::SmartPtr, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 2200
url: /de/cpp/system.drawing/size/
---
## Size class


Stellt ein Paar von Ganzzahlwerten dar, die Breite und Höhe eines Bildes repräsentieren. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](../../system/smartptr/), um Objekte dieses Typs zu verwalten.

```cpp
class Size
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Add](./add/)(const Size\&, const Size\&) | Gibt ein neues [Size](./)-Objekt zurück, das die Summe des angegebenen [Size](./)-Objekts ist, d. h. dessen Breitenwert gleich der Summe der Breitenwerte der angegebenen Objekte und dessen Höhenwert gleich der Summe der Höhenwerte der angegebenen Objekte ist. |
| static [Ceiling](./ceiling/)(const SizeF\&) | Erstellt ein [Size](./)-Objekt aus dem angegebenen [SizeF](../sizef/)-Objekt, indem die Breiten- und Höhenwerte des [SizeF](../sizef/)-Objekts auf die nächsthöhere ganze Zahl gerundet werden. |
| [Equals](./equals/)(const Size\&) const | Bestimmt, ob das aktuelle Objekt und das angegebene Objekt gleich sind, d. h. dass sie dasselbe Paar von Breiten- und Höhenwerten darstellen. |
| [get_Height](./get_height/)() const | Gibt den von dem aktuellen Objekt dargestellten Höhenwert zurück. |
| [get_IsEmpty](./get_isempty/)() const | Bestimmt, ob sowohl Breiten- als auch Höhenwerte gleich 0 sind. |
| [get_Width](./get_width/)() const | Gibt den von dem aktuellen Objekt dargestellten Breitenwert zurück. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [operator Point](./operatorpoint/)() const | Erstellt eine Instanz des [Point](../point/)-Objekts und initialisiert dessen X‑ und Y‑Koordinate mit den Breiten- bzw. Höhenwerten des aktuellen Objekts. |
| [operator SizeF](./operatorsizef/)() const | Erstellt eine Instanz des [SizeF](../sizef/)-Objekts und initialisiert sie mit den Breiten- und Höhenwerten des aktuellen [Size](./)-Objekts. |
| static [Round](./round/)(const SizeF\&) | Erstellt ein [Size](./)-Objekt aus dem angegebenen [SizeF](../sizef/)-Objekt, indem die Breiten- und Höhenwerte des [SizeF](../sizef/)-Objekts auf die nächstgelegene ganze Zahl gerundet werden. |
| [set_Height](./set_height/)(int) | Legt den von dem aktuellen Objekt dargestellten Höhenwert fest. |
| [set_Width](./set_width/)(int) | Legt den von dem aktuellen Objekt dargestellten Breitenwert fest. |
| [Size](./size/)() | Erstellt ein neues [Size](./)-Objekt und initialisiert dessen Breiten- und Höhenwerte mit 0. |
| [Size](./size/)(const Point\&) | Erstellt ein neues [Size](./)-Objekt und initialisiert dessen Breiten- und Höhenwerte mit den X‑ und Y‑Koordinatenwerten des angegebenen Punktes entsprechend. |
| [Size](./size/)(int, int) | Konstruiert ein neues [Size](./)-Objekt und initialisiert es mit dem angegebenen Wert. |
| static [Subtract](./subtract/)(const Size\&, const Size\&) | Gibt ein neues [Size](./)-Objekt zurück, das das Ergebnis der Subtraktion von **size2** von **size1** ist, d. h. dessen Breitenwert das Ergebnis der Subtraktion des Breitenwerts von **size2** vom Breitenwert von **size1** ist und dessen Höhenwert das Ergebnis der Subtraktion des Höhenwerts von **size2** vom Höhenwert von **size1** ist. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des Paares von Breiten- und Höhenwerten zurück, die vom aktuellen Objekt dargestellt werden. |
| static [Truncate](./truncate/)(const SizeF\&) | Konstruiert ein [Size](./)-Objekt aus dem angegebenen [SizeF](../sizef/)-Objekt, indem die Breiten- und Höhenwerte des [SizeF](../sizef/)-Objekts auf die nächstniedrigere Ganzzahl abgerundet werden. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Eine leere Instanz der [Size](./)-Klasse, deren Breiten- und Höhenwerte 0 sind. |
## Siehe auch

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
