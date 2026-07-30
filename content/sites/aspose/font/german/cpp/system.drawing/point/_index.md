---
title: "System::Drawing::Point Klasse"
linktitle: "Point"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Point Klasse. Stellt ein Paar von ganzzahligen X‑ und Y‑Koordinaten eines Punktes in einer zweidimensionalen Ebene dar. Dieser Typ sollte auf dem Stack zugewiesen und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr‑Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 1700
url: /de/cpp/system.drawing/point/
---
## Point class


Stellt ein Paar von ganzzahligen X‑ und Y‑Koordinaten eines Punktes in einer zweidimensionalen Ebene dar. Dieser Typ sollte auf dem Stack zugewiesen und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die [System::SmartPtr](../../system/smartptr/)-Klasse, um Objekte dieses Typs zu verwalten.

```cpp
class Point
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Add](./add/)(const Point\&, const Size\&) | Addiert die Breiten‑ und Höhenwerte des angegebenen [Size](../size/)-Objekts zu den X‑ und Y‑Koordinatenwerten des angegebenen [Point](./)-Objekts entsprechend. |
| static [Ceiling](./ceiling/)(const PointF\&) | Erstellt ein [Point](./)-Objekt aus dem angegebenen [PointF](../pointf/)-Objekt, indem die X‑ und Y‑Koordinatenwerte des [PointF](../pointf/)-Objekts auf die nächsthöhere ganze Zahl gerundet werden. |
| [Equals](./equals/)(const Point\&) const | Bestimmt, ob das aktuelle Objekt und das angegebene Objekt gleich sind, d. h. das gleiche Paar von X‑ und Y‑Koordinatenwerten darstellen. |
| [get_IsEmpty](./get_isempty/)() const | Bestimmt, ob sowohl X‑ als auch Y‑Koordinatenwerte gleich 0 sind. |
| [get_X](./get_x/)() const | Gibt den vom aktuellen Objekt dargestellten X‑Koordinatenwert zurück. |
| [get_Y](./get_y/)() const | Gibt den vom aktuellen Objekt dargestellten Y‑Koordinatenwert zurück. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [getStdHash](./getstdhash/)() const | Gibt einen Hash‑Wert für das aktuelle Objekt zurück. |
| [IsNull](./isnull/)() const | Gibt immer false zurück. |
| [Offset](./offset/)(int, int) | Verschiebt die vom aktuellen Objekt dargestellten X‑ und Y‑Koordinatenwerte um die angegebenen Werte. |
| [Offset](./offset/)(Point) | Verschiebt die vom aktuellen Objekt dargestellten X‑ und Y‑Koordinaten um die X‑ und Y‑Koordinatenwerte des angegebenen [Point](./)-Objekts entsprechend. |
| [operator PointF](./operatorpointf/)() const | Erstellt eine Instanz des [PointF](../pointf/)-Objekts und initialisiert sie mit den X‑ und Y‑Koordinatenwerten des aktuellen [Point](./)-Objekts. |
| [operator Size](./operatorsize/)() const | Erstellt eine Instanz des [Size](../size/)-Objekts und initialisiert seine Breiten‑ und Höhenwerte mit den vom aktuellen Objekt dargestellten X‑ und Y‑Koordinatenwerten entsprechend. |
| [Point](./point/)() | Erstellt ein neues [Point](./)-Objekt und initialisiert seine X‑ und Y‑Koordinatenwerte mit 0. |
| [Point](./point/)(int, int) | Erstellt ein neues [Point](./)-Objekt und initialisiert es mit den angegebenen Werten. |
| [Point](./point/)(const Size\&) | Erstellt ein neues [Point](./)-Objekt und initialisiert seine X‑ und Y‑Koordinatenwerte mit den Breiten‑ und Höhenwerten des angegebenen [SizeF](../sizef/)-Objekts entsprechend. |
| [Point](./point/)(int) | Erstellt ein neues [Point](./)-Objekt und initialisiert seinen X‑Koordinatenwert mit einem Wert, der aus den oberen 16 Bits des angegebenen 32‑Bit‑Integers gebildet wird, und seinen Y‑Koordinatenwert mit einem Wert, der aus den unteren 16 Bits des angegebenen 32‑Bit‑Integers gebildet wird. |
| static [Round](./round/)(const PointF\&) | Erstellt ein [Point](./)-Objekt aus dem angegebenen [PointF](../pointf/)-Objekt, indem die X‑ und Y‑Koordinatenwerte des [PointF](../pointf/)-Objekts auf die nächstgelegene ganze Zahl gerundet werden. |
| [set_X](./set_x/)(int) | Setzt den Wert der X-Koordinate, die vom aktuellen Objekt repräsentiert wird. |
| [set_Y](./set_y/)(int) | Setzt den Wert der Y-Koordinate, die vom aktuellen Objekt repräsentiert wird. |
| static [Subtract](./subtract/)(const Point\&, const Size\&) | Subtrahiert die Breiten‑ und Höhenwerte des angegebenen [Size](../size/)-Objekts von den X‑ und Y‑Koordinatenwerten des angegebenen [Point](./)-Objekts entsprechend. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des Paares von X- und Y-Koordinatenwerten zurück, die vom aktuellen Objekt repräsentiert werden. |
| static [Truncate](./truncate/)(const PointF\&) | Erstellt ein [Point](./)-Objekt aus dem angegebenen [PointF](../pointf/)-Objekt, indem die X‑ und Y‑Koordinatenwerte des [PointF](../pointf/)-Objekts auf die nächstniedrigere ganze Zahl abgeschnitten werden. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Eine leere Instanz der [Point](./)-Klasse, deren X‑ und Y‑Koordinatenwerte 0 sind. |
## Siehe auch

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
