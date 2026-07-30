---
title: "System::Drawing::Region Klasse"
linktitle: "Region"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Region Klasse. Stellt das Innere einer grafischen Form dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2100
url: /de/cpp/system.drawing/region/
---
## Region class


Stellt das Innere einer grafischen Form dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Region : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() const | Gibt eine Kopie des aktuellen Objekts zurück. |
| [Complement](./complement/)(const RectangleF\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch den Teil der Region, der durch das angegebene Rechteck definiert ist und nicht mit dieser Region überschneidet. |
| [Complement](./complement/)(const Rectangle\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch den Teil der Region, der durch das angegebene Rechteck definiert ist und nicht mit dieser Region überschneidet. |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch den Teil der Region, der durch den angegebenen Pfad definiert ist und nicht mit dieser Region überschneidet. |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch den Teil der angegebenen Region, der nicht mit dieser Region überschneidet. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | Bestimmt, ob die angegebene Region identisch ist mit der vom aktuellen Objekt auf der angegebenen Zeichenfläche dargestellten Region. |
| [Exclude](./exclude/)(const RectangleF\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch das Ergebnis des Ausschlusses der durch das angegebene Rechteck definierten Region. |
| [Exclude](./exclude/)(const Rectangle\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch das Ergebnis des Ausschlusses der durch das angegebene Rechteck definierten Region. |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch das Ergebnis des Ausschlusses der durch den angegebenen Pfad definierten Region. |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch das Ergebnis des Ausschlusses der angegebenen Region. |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | Liefert eine [RectangleF](../rectanglef/)-Struktur, die ein Rechteck darstellt, das diese [Region](./) auf der Zeichenfläche eines [Graphics](../graphics/)-Objekts begrenzt. |
| [GetRegionData](./getregiondata/)() const | Gibt ein RegionData-Objekt zurück, das Daten enthält, die die vom aktuellen Objekt dargestellte Region definieren. |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | Gibt ein Array von [RectangleF](../rectanglef/)-Strukturen zurück, die diese [Region](./) nach Anwendung der angegebenen Matrixtransformation annähern. |
| [Intersect](./intersect/)(const RectangleF\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch das Ergebnis der Schnittmenge dieser Region und einer durch das angegebene Rechteck definierten Region. |
| [Intersect](./intersect/)(const Rectangle\&) | Ersetzt die vom aktuellen Objekt dargestellte Region durch das Ergebnis der Schnittmenge dieser Region und einer durch das angegebene Rechteck definierten Region. |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis der Schnittmenge dieser Region und einer durch den angegebenen Pfad definierten Region. |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis der Schnittmenge dieser Region und der angegebenen Region. |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | Bestimmt, ob die von dem aktuellen Objekt dargestellte Region auf der angegebenen Zeichenfläche ein leeres Inneres hat. |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | Bestimmt, ob die von dem aktuellen Objekt dargestellte Region auf der angegebenen Zeichenfläche ein unendliches Inneres hat. |
| [IsVisible](./isvisible/)(const Point\&) const | Bestimmt, ob der angegebene Punkt innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const PointF\&) const | Bestimmt, ob der angegebene Punkt innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const Rectangle\&) | Bestimmt, ob ein Teil des angegebenen Rechtecks innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const RectangleF\&) | Bestimmt, ob ein Teil des angegebenen Rechtecks innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | Bestimmt, ob der angegebene Punkt unter Verwendung der angegebenen Grafik innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | Bestimmt, ob der angegebene Punkt unter Verwendung der angegebenen Grafik innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | Bestimmt, ob ein Teil des angegebenen Rechtecks unter Verwendung der angegebenen Grafik innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | Bestimmt, ob ein Teil des angegebenen Rechtecks unter Verwendung der angegebenen Grafik innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(float, float) const | Bestimmt, ob der angegebene Punkt innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | Bestimmt, ob der angegebene Punkt unter Verwendung der angegebenen Grafik innerhalb der von dem aktuellen Objekt dargestellten Region liegt. |
| [MakeEmpty](./makeempty/)() | Initialisiert das aktuelle Objekt mit leerem Inneres. |
| [MakeInfinite](./makeinfinite/)() | Initialisiert dieses Regionsobjekt mit unendlichem Inneres. |
| [Region](./region/)() | Konstruiert eine neue Instanz der Klasse [Region](./). |
| [Region](./region/)(const RectangleF\&) | Konstruiert eine neue Instanz der Klasse [Region](./), die eine durch das angegebene Rechteck definierte Region darstellt. |
| [Region](./region/)(const Rectangle\&) | Konstruiert eine neue Instanz der Klasse [Region](./), die eine durch das angegebene Rechteck definierte Region darstellt. |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Konstruiert eine neue Instanz der Klasse [Region](./), die eine durch den angegebenen Pfad definierte Region darstellt. |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | Konstruiert eine neue Instanz der Klasse [Region](./), die eine durch das angegebene RegionData-Objekt definierte Region darstellt. |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Transformiert diese Region mittels der angegebenen Matrix. |
| [Transform](./transform/)(const SkMatrix\&) | Transformiert diese Region mittels der angegebenen Matrix. |
| [Translate](./translate/)(int, int) | Verschiebt die Koordinaten der Region um den angegebenen Betrag. |
| [Translate](./translate/)(float, float) | Verschiebt die Koordinaten der Region um den angegebenen Betrag. |
| [Union](./union/)(const RectangleF\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis der Vereinigungsoperation dieser Region und einer durch das angegebene Rechteck definierten Region. |
| [Union](./union/)(const Rectangle\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis der Vereinigung dieser Region und einer durch das angegebene Rechteck definierten Region. |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis der Vereinigung dieser Region und einer durch den angegebenen Pfad definierten Region. |
| [Union](./union/)(const SharedPtr\<Region\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch das Ergebnis der Vereinigung dieser Region und der angegebenen Region. |
| [Xor](./xor/)(const RectangleF\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch die Teile dieser Region und der durch das angegebene Rechteck definierten Region, die nicht miteinander schneiden. |
| [Xor](./xor/)(const Rectangle\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch die Teile dieser Region und der durch das angegebene Rechteck definierten Region, die nicht miteinander schneiden. |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch die Teile dieser Region und der durch den angegebenen Pfad definierten Region, die nicht miteinander schneiden. |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | Ersetzt die von dem aktuellen Objekt dargestellte Region durch die Teile dieser Region und der angegebenen Region, die nicht miteinander schneiden. |
| virtual [~Region](./~region/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
