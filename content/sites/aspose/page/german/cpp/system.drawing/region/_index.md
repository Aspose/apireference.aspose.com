---
title: "System::Drawing::Region‑Klasse"
linktitle: "Region"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Region‑Klasse. Stellt das Innere einer grafischen Form dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2100
url: /de/cpp/system.drawing/region/
---
## Region class


Stellt das Innere einer grafischen Form dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Region : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() const | Gibt eine Kopie des aktuellen Objekts zurück. |
| [Complement](./complement/)(const RectangleF\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch den Teil der Region, der durch das angegebene Rechteck definiert ist und nicht mit dieser Region überschneidet. |
| [Complement](./complement/)(const Rectangle\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch den Teil der Region, der durch das angegebene Rechteck definiert ist und nicht mit dieser Region überschneidet. |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch den Teil der Region, der durch den angegebenen Pfad definiert ist und nicht mit dieser Region überschneidet. |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch den Teil der angegebenen Region, der nicht mit dieser Region überschneidet. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | Bestimmt, ob die angegebene Region identisch ist mit der von dem aktuellen Objekt dargestellten Region auf der angegebenen Zeichenfläche. |
| [Exclude](./exclude/)(const RectangleF\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis des Ausschlusses der durch das angegebene Rechteck definierten Region. |
| [Exclude](./exclude/)(const Rectangle\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis des Ausschlusses der durch das angegebene Rechteck definierten Region. |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis des Ausschlusses der durch den angegebenen Pfad definierten Region. |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis des Ausschlusses der angegebenen Region. |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | Erhält eine [RectangleF](../rectanglef/)-Struktur, die ein Rechteck darstellt, das diese [Region](./) auf der Zeichenfläche eines [Graphics](../graphics/)-Objekts begrenzt. |
| [GetRegionData](./getregiondata/)() const | Gibt ein RegionData-Objekt zurück, das Daten enthält, die die von dem aktuellen Objekt dargestellte Region definieren. |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | Gibt ein Array von [RectangleF](../rectanglef/)-Strukturen zurück, die dieses [Region](./) nach Anwendung der angegebenen Matrixtransformation annähern. |
| [Intersect](./intersect/)(const RectangleF\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch das Ergebnis der Schnittmenge dieser Region und einer durch das angegebene Rechteck definierten Region. |
| [Intersect](./intersect/)(const Rectangle\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch das Ergebnis der Schnittmenge dieser Region und einer durch das angegebene Rechteck definierten Region. |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch das Ergebnis der Schnittmenge dieser Region und einer durch den angegebenen Pfad definierten Region. |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch das Ergebnis der Schnittmenge dieser Region und der angegebenen Region. |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | Bestimmt, ob die durch das aktuelle Objekt dargestellte Region auf der angegebenen Zeichenfläche ein leeres Inneres hat. |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | Bestimmt, ob die durch das aktuelle Objekt dargestellte Region auf der angegebenen Zeichenfläche ein unendliches Inneres hat. |
| [IsVisible](./isvisible/)(const Point\&) const | Bestimmt, ob der angegebene Punkt innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const PointF\&) const | Bestimmt, ob der angegebene Punkt innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const Rectangle\&) | Bestimmt, ob ein Teil des angegebenen Rechtecks innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const RectangleF\&) | Bestimmt, ob ein Teil des angegebenen Rechtecks innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | Bestimmt, ob der angegebene Punkt unter Verwendung der angegebenen Grafik innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | Bestimmt, ob der angegebene Punkt unter Verwendung der angegebenen Grafik innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | Bestimmt, ob ein Teil des angegebenen Rechtecks unter Verwendung der angegebenen Grafik innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | Bestimmt, ob ein Teil des angegebenen Rechtecks unter Verwendung der angegebenen Grafik innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(float, float) const | Bestimmt, ob der angegebene Punkt innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | Bestimmt, ob der angegebene Punkt unter Verwendung der angegebenen Grafik innerhalb der durch das aktuelle Objekt dargestellten Region liegt. |
| [MakeEmpty](./makeempty/)() | Initialisiert das aktuelle Objekt mit leerem Inneres. |
| [MakeInfinite](./makeinfinite/)() | Initialisiert dieses Regionsobjekt mit unendlichem Inneres. |
| [Region](./region/)() | Erstellt eine neue Instanz der Klasse [Region](./). |
| [Region](./region/)(const RectangleF\&) | Erstellt eine neue Instanz der Klasse [Region](./), die eine durch das angegebene Rechteck definierte Region darstellt. |
| [Region](./region/)(const Rectangle\&) | Erstellt eine neue Instanz der Klasse [Region](./), die eine durch das angegebene Rechteck definierte Region darstellt. |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Erstellt eine neue Instanz der Klasse [Region](./), die eine durch den angegebenen Pfad definierte Region darstellt. |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | Erstellt eine neue Instanz der Klasse [Region](./), die eine durch das angegebene RegionData-Objekt definierte Region darstellt. |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Transformiert diese Region mittels der angegebenen Matrix. |
| [Transform](./transform/)(const SkMatrix\&) | Transformiert diese Region mittels der angegebenen Matrix. |
| [Translate](./translate/)(int, int) | Verschiebt die Koordinaten der Region um den angegebenen Betrag. |
| [Translate](./translate/)(float, float) | Verschiebt die Koordinaten der Region um den angegebenen Betrag. |
| [Union](./union/)(const RectangleF\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch das Ergebnis der Vereinigungsoperation dieser Region und einer durch das angegebene Rechteck definierten Region. |
| [Union](./union/)(const Rectangle\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch das Ergebnis der Vereinigung dieser Region und einer durch das angegebene Rechteck definierten Region. |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch das Ergebnis der Vereinigung dieser Region und einer durch den angegebenen Pfad definierten Region. |
| [Union](./union/)(const SharedPtr\<Region\>\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch das Ergebnis der Vereinigung dieser Region und der angegebenen Region. |
| [Xor](./xor/)(const RectangleF\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch die Teile dieser Region und der durch das angegebene Rechteck definierten Region, die nicht schneiden. |
| [Xor](./xor/)(const Rectangle\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch die Teile dieser Region und der durch das angegebene Rechteck definierten Region, die nicht schneiden. |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch die Teile dieser Region und der durch den angegebenen Pfad definierten Region, die nicht schneiden. |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | Ersetzt die durch das aktuelle Objekt dargestellte Region durch die Teile dieser Region und der angegebenen Region, die nicht schneiden. |
| virtual [~Region](./~region/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
