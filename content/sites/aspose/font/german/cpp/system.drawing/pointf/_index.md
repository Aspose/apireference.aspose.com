---
title: "Klasse System::Drawing::PointF"
linktitle: "PointF"
second_title: "Aspose.Font für C++"
description: "Klasse System::Drawing::PointF. Stellt ein Paar von Gleitkomma‑X‑ und Y‑Koordinaten mit einfacher Genauigkeit eines Punktes in einer zweidimensionalen Ebene dar. Dieser Typ sollte auf dem Stack zugewiesen und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse System::SmartPtr, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 1800
url: /de/cpp/system.drawing/pointf/
---
## PointF class


Stellt ein Paar von Gleitkomma‑X‑ und Y‑Koordinaten mit einfacher Genauigkeit eines Punktes in einer zweidimensionalen Ebene dar. Dieser Typ sollte auf dem Stack zugewiesen und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](../../system/smartptr/), um Objekte dieses Typs zu verwalten.

```cpp
class PointF
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Add](./add/)(const PointF\&, const SizeF\&) | Addiert die Breiten‑ und Höhenwerte des angegebenen [SizeF](../sizef/)-Objekts zu den X‑ und Y‑Koordinatenwerten des angegebenen [PointF](./)-Objekts entsprechend. |
| static [Add](./add/)(const PointF\&, const Size\&) | Addiert die Breiten‑ und Höhenwerte des angegebenen [Size](../size/)-Objekts zu den X‑ und Y‑Koordinatenwerten des angegebenen [PointF](./)-Objekts entsprechend. |
| [Equals](./equals/)(const PointF\&) const | Bestimmt, ob das aktuelle Objekt und das angegebene Objekt gleich sind, d. h. das gleiche Paar von X‑ und Y‑Koordinatenwerten darstellen. |
| [get_IsEmpty](./get_isempty/)() const | Bestimmt, ob sowohl X‑ als auch Y‑Koordinatenwerte gleich 0 sind. |
| [get_X](./get_x/)() const | Gibt den vom aktuellen Objekt dargestellten X‑Koordinatenwert zurück. |
| [get_Y](./get_y/)() const | Gibt den vom aktuellen Objekt dargestellten Y‑Koordinatenwert zurück. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [IsNull](./isnull/)() const | Gibt immer false zurück. |
| explicit [operator bool](./operatorbool/)() | Gibt immer true zurück. |
| [PointF](./pointf/)() | Konstruiert ein neues [PointF](./)-Objekt und initialisiert seine X‑ und Y‑Koordinatenwerte mit 0. |
| [PointF](./pointf/)(float, float) | Konstruiert ein neues [PointF](./)-Objekt und initialisiert es mit den angegebenen Werten. |
| [PointF](./pointf/)(const SizeF\&) | Konstruiert ein neues [PointF](./)-Objekt und initialisiert seine X- und Y-Koordinatenwerte mit den Breiten- und Höhenwerten des angegebenen [SizeF](../sizef/)-Objekts entsprechend. |
| [set_X](./set_x/)(float) | Setzt den Wert der X-Koordinate, die vom aktuellen Objekt repräsentiert wird. |
| [set_Y](./set_y/)(float) | Setzt den Wert der Y-Koordinate, die vom aktuellen Objekt repräsentiert wird. |
| static [Subtract](./subtract/)(const PointF\&, const SizeF\&) | Subtrahiert die Breiten- und Höhenwerte des angegebenen [SizeF](../sizef/)-Objekts von den X- und Y-Koordinatenwerten des angegebenen [PointF](./)-Objekts entsprechend. |
| static [Subtract](./subtract/)(const PointF\&, const Size\&) | Subtrahiert die Breiten- und Höhenwerte des angegebenen [Size](../size/)-Objekts von den X- und Y-Koordinatenwerten des angegebenen [PointF](./)-Objekts entsprechend. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des Paares von X- und Y-Koordinatenwerten zurück, die vom aktuellen Objekt repräsentiert werden. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Eine leere Instanz der Klasse [PointF](./), deren X- und Y-Koordinatenwerte 0 sind. |
## Siehe auch

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
