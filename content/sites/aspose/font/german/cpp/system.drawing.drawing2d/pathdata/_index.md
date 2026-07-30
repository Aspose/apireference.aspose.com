---
title: "System::Drawing::Drawing2D::PathData Klasse"
linktitle: "PathData"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Drawing2D::PathData Klasse. Enthält die grafischen Daten, die einen Pfad darstellen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.drawing.drawing2d/pathdata/
---
## PathData class


Enthält die grafischen Daten, die einen Pfad darstellen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PathData : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Points](./get_points/)() | Gibt ein Array zurück, das die Punkte enthält, aus denen ein Pfad besteht. |
| [get_Types](./get_types/)() | Gibt ein Array zurück, das die Werte enthält, die die Typen der entsprechenden Punkte im **Points**-Array angeben. |
| [PathData](./pathdata/)() | Konstruiert ein leeres [PathData](./)-Objekt. |
| [set_Points](./set_points/)(const ArrayPtr\<PointF\>\&) | Setzt ein Array, das die Punkte enthält, aus denen ein Pfad besteht. |
| [set_Types](./set_types/)(const ArrayPtr\<uint8_t\>\&) | Legt ein Array fest, das die Werte enthält, die die Typen der entsprechenden Punkte im **Points**-Array angeben. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
