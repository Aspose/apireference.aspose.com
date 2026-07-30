---
title: "System::Drawing::Rectangle-Klasse"
linktitle: "Rechteck"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Rectangle-Klasse. Stellt einen rechteckigen Bereich eines Bildes dar, definiert durch ganzzahlige X- und Y-Koordinaten seiner oberen linken Ecke sowie seine Breite und Höhe. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr-Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 1900
url: /de/cpp/system.drawing/rectangle/
---
## Rectangle class


Stellt einen rechteckigen Bereich eines Bildes dar, definiert durch ganzzahlige X- und Y-Koordinaten seiner oberen linken Ecke sowie seine Breite und Höhe. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die [System::SmartPtr](../../system/smartptr/)-Klasse, um Objekte dieses Typs zu verwalten.

```cpp
class Rectangle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Ceiling](./ceiling/)(const RectangleF\&) | Konstruiert ein [Rectangle](./)-Objekt aus dem angegebenen [RectangleF](../rectanglef/)-Objekt, indem die Positions- und Größenwerte des [RectangleF](../rectanglef/)-Objekts auf die nächsthöheren Ganzzahlen gerundet werden. |
| [Contains](./contains/)(int, int) const | Bestimmt, ob der angegebene Punkt innerhalb des vom aktuellen Objekt dargestellten Rechtecks liegt. |
| [Contains](./contains/)(const Point\&) const | Bestimmt, ob der angegebene Punkt innerhalb des vom aktuellen Objekt dargestellten Rechtecks liegt. |
| [Contains](./contains/)(const Rectangle\&) const | Bestimmt, ob das angegebene Rechteck innerhalb des durch das aktuelle Objekt dargestellten Rechtecks liegt. |
| [Equals](./equals/)(const Rectangle\&) const | Bestimmt, ob die durch das aktuelle und das angegebene Objekt dargestellten Rechtecke identisch sind. |
| static [FromLTRB](./fromltrb/)(int, int, int, int) | Konstruiert ein neues [Rectangle](./)-Objekt, das ein Rechteck mit den angegebenen Kantenpositionen darstellt. |
| [get_Bottom](./get_bottom/)() const | Gibt die y‑Koordinate der unteren Kante des durch das aktuelle Objekt dargestellten Rechtecks zurück. |
| [get_Height](./get_height/)() const | Gibt die Höhe des durch das aktuelle Objekt dargestellten Rechtecks zurück. |
| [get_IsEmpty](./get_isempty/)() const | Bestimmt, ob die X‑ und Y‑Koordinaten der oberen linken Ecke des durch das aktuelle Objekt dargestellten Rechtecks sowie dessen Breite und Höhe den Wert 0 haben. |
| [get_Left](./get_left/)() const | Gibt die X‑Koordinate der linken Kante des durch das aktuelle Objekt dargestellten Rechtecks zurück. |
| [get_Location](./get_location/)() const | Gibt eine Instanz der Klasse [Point](../point/) zurück, die die Position der oberen linken Ecke des vom aktuellen Objekt dargestellten Rechtecks angibt. |
| [get_Right](./get_right/)() const | Gibt die X‑Koordinate der rechten Kante des durch das aktuelle Objekt dargestellten Rechtecks zurück. |
| [get_Size](./get_size/)() const | Gibt eine Instanz der Klasse [Size](../size/) zurück, die die Breite und Höhe des vom aktuellen Objekt dargestellten Rechtecks angibt. |
| [get_Top](./get_top/)() const | Gibt die Y‑Koordinate der oberen Kante des durch das aktuelle Objekt dargestellten Rechtecks zurück. |
| [get_Width](./get_width/)() const | Gibt die Breite des durch das aktuelle Objekt dargestellten Rechtecks zurück. |
| [get_X](./get_x/)() const | Gibt die X‑Koordinate der oberen linken Ecke des durch das aktuelle Objekt dargestellten Rechtecks zurück. |
| [get_Y](./get_y/)() const | Gibt die Y‑Koordinate der oberen linken Ecke des durch das aktuelle Objekt dargestellten Rechtecks zurück. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hash‑Code des aktuellen Objekts zurück. |
| [Inflate](./inflate/)(int, int) | Erhöht die Breite und Höhe des durch das aktuelle Objekt dargestellten Rechtecks, wobei die Lage des geometrischen Zentrums des Rechtecks beibehalten wird. Breite und Höhe werden in beide Richtungen um die angegebenen Beträge vergrößert. |
| [Inflate](./inflate/)(const Size\&) | Erhöht die Breite und Höhe des durch das aktuelle Objekt dargestellten Rechtecks, wobei die Lage des geometrischen Zentrums des Rechtecks beibehalten wird. Breite und Höhe werden in beide Richtungen um die durch die Breiten‑ und Höhenwerte des angegebenen Größenobjekts festgelegten Beträge entsprechend vergrößert. |
| static [Inflate](./inflate/)(const Rectangle\&, int, int) | Erhöht die Breite und Höhe des durch das angegebene Objekt dargestellten Rechtecks, wobei die Lage des geometrischen Zentrums des Rechtecks beibehalten wird. Breite und Höhe werden in beide Richtungen um die angegebenen Beträge vergrößert. |
| [Intersect](./intersect/)(const Rectangle\&) | Ersetzt das durch das aktuelle Objekt dargestellte Rechteck durch das Rechteck, das aus seiner Schnittmenge mit dem durch das angegebene Objekt dargestellten Rechteck entsteht. |
| static [Intersect](./intersect/)(const Rectangle\&, const Rectangle\&) | Gibt ein Rechteck zurück, das das Ergebnis der Schnittmenge der angegebenen Rechtecke ist. |
| [IntersectsWith](./intersectswith/)(const Rectangle\&) | Bestimmt, ob die durch das aktuelle und das angegebene Objekt dargestellten Rechtecke sich schneiden. |
| [Offset](./offset/)(const Point\&) | Verschiebt die Position des durch das aktuelle Objekt dargestellten Rechtecks um die angegebenen Beträge. |
| [Offset](./offset/)(int, int) | Verschiebt die Position des durch das aktuelle Objekt dargestellten Rechtecks um die angegebenen Beträge. |
| [operator RectangleF](./operatorrectanglef/)() const | Gibt ein [RectangleF](../rectanglef/)-Objekt zurück, das ein Rechteck darstellt, das dem vom aktuellen Objekt dargestellten Rechteck entspricht. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Gibt immer true zurück. |
| [operator==](./operator==/)(std::nullptr_t) const | Gibt immer false zurück. |
| [Rectangle](./rectangle/)() | Konstruiert eine neue Instanz des [Rectangle](./)-Objekts, das ein Rechteck mit X- und Y-Koordinaten sowie Breiten- und Höhenwerten von 0 darstellt. |
| [Rectangle](./rectangle/)(int, int, int, int) | Konstruiert eine neue Instanz des [Rectangle](./)-Objekts, das ein Rechteck mit den angegebenen Koordinaten seiner oberen linken Ecke sowie Breite und Höhe darstellt. |
| [Rectangle](./rectangle/)(const Point\&, const Size\&) | Konstruiert eine neue Instanz des [Rectangle](./)-Objekts, das ein Rechteck mit den Koordinaten seiner oberen linken Ecke, angegeben als Instanz der Klasse [Point](../point/), sowie Breite und Höhe, angegeben als Instanz der Klasse [Size](../size/), darstellt. |
| [Rectangle](./rectangle/)(const System::Windows::Forms::Screen::Rectangle_\&) | Konstruiert eine neue Instanz des [Rectangle](./)-Objekts, das das dem angegebenen Rechteck entsprechende Rechteck darstellt. |
| static [Round](./round/)(const RectangleF\&) | Konstruiert ein [Rectangle](./)-Objekt aus dem angegebenen [RectangleF](../rectanglef/)-Objekt, indem die Positions- und Größenwerte des [RectangleF](../rectanglef/)-Objekts auf die nächsten Ganzzahlen gerundet werden. |
| [set_Height](./set_height/)(int) | Legt die Höhe des vom aktuellen Objekt dargestellten Rechtecks fest. |
| [set_Location](./set_location/)(Point) | Legt die Position der oberen linken Ecke des vom aktuellen Objekt dargestellten Rechtecks fest. |
| [set_Size](./set_size/)(Size) | Legt die Breite und Höhe des vom aktuellen Objekt dargestellten Rechtecks fest. |
| [set_Width](./set_width/)(int) | Legt die Breite des vom aktuellen Objekt dargestellten Rechtecks fest. |
| [set_X](./set_x/)(int) | Legt die X‑Koordinate der oberen linken Ecke des vom aktuellen Objekt dargestellten Rechtecks fest. |
| [set_Y](./set_y/)(int) | Legt die Y‑Koordinate der oberen linken Ecke des vom aktuellen Objekt dargestellten Rechtecks fest. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des aktuellen Objekts zurück. |
| static [Truncate](./truncate/)(const RectangleF\&) | Konstruiert ein [Rectangle](./)-Objekt aus dem angegebenen [RectangleF](../rectanglef/)-Objekt, indem die Positions- und Größenwerte des [RectangleF](../rectanglef/)-Objekts auf die nächstniedrigeren Ganzzahlen abgeschnitten werden. |
| static [Union](./union/)(const Rectangle\&, const Rectangle\&) | Gibt ein Rechteck zurück, das das Ergebnis der Vereinigung der angegebenen Rechtecke ist. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Ein leeres Rechteck, d. h. ein Rechteck, dessen Positions‑ und Größenwerte null sind. |
## Siehe auch

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
