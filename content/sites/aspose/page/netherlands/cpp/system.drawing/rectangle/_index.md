---
title: "System::Drawing::Rectangle klasse"
linktitle: "Rechthoek"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Rectangle klasse. Vertegenwoordigt een rechthoekig gebied van een afbeelding gedefinieerd door gehele X- en Y-coördinaten van de linkerbovenhoek en de breedte en hoogte. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 1900
url: /nl/cpp/system.drawing/rectangle/
---
## Rectangle class


Vertegenwoordigt een rechthoekig gebied van een afbeelding gedefinieerd door gehele X- en Y-coördinaten van de linkerbovenhoek en de breedte en hoogte. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../../system/smartptr/) klasse om objecten van dit type te beheren.

```cpp
class Rectangle
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Ceiling](./ceiling/)(const RectangleF\&) | Construeert een [Rectangle](./) object van het opgegeven [RectangleF](../rectanglef/) object door de locatie- en groottewaarden van het [RectangleF](../rectanglef/) object af te ronden naar de volgende hogere gehele waarden. |
| [Contains](./contains/)(int, int) const | Bepaalt of het opgegeven punt zich binnen de rechthoek bevindt die door het huidige object wordt vertegenwoordigd. |
| [Contains](./contains/)(const Point\&) const | Bepaalt of het opgegeven punt zich binnen de rechthoek bevindt die door het huidige object wordt vertegenwoordigd. |
| [Contains](./contains/)(const Rectangle\&) const | Bepaalt of de opgegeven rechthoek zich binnen de rechthoek bevindt die door het huidige object wordt vertegenwoordigd. |
| [Equals](./equals/)(const Rectangle\&) const | Bepaalt of de rechthoeken die door het huidige en het opgegeven object worden vertegenwoordigd identiek zijn. |
| static [FromLTRB](./fromltrb/)(int, int, int, int) | Construeert een nieuw [Rectangle](./) object dat een rechthoek vertegenwoordigt met de opgegeven randlocaties. |
| [get_Bottom](./get_bottom/)() const | Retourneert de y-coördinaat van de onderkant van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Height](./get_height/)() const | Retourneert de hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_IsEmpty](./get_isempty/)() const | Bepaalt of de X- en Y-coördinaten van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd, evenals de breedte en hoogte, de waarde 0 hebben. |
| [get_Left](./get_left/)() const | Retourneert de X-coördinaat van de linkerkant van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Location](./get_location/)() const | Retourneert een instantie van de [Point](../point/) klasse die de locatie van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd, specificeert. |
| [get_Right](./get_right/)() const | Retourneert de X-coördinaat van de rechterkant van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Size](./get_size/)() const | Retourneert een instantie van de [Size](../size/) klasse die de breedte en hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd, specificeert. |
| [get_Top](./get_top/)() const | Retourneert de Y-coördinaat van de bovenkant van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Width](./get_width/)() const | Retourneert de breedte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_X](./get_x/)() const | Retourneert de X-coördinaat van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Y](./get_y/)() const | Retourneert de Y-coördinaat van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode van het huidige object. |
| [Inflate](./inflate/)(int, int) | Vergroot de breedte en hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd, waarbij de locatie van het geometrisch middelpunt van de rechthoek behouden blijft. De breedte en hoogte worden in beide richtingen met de opgegeven hoeveelheden vergroot. |
| [Inflate](./inflate/)(const Size\&) | Vergroot de breedte en hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd, waarbij de locatie van het geometrisch middelpunt van de rechthoek behouden blijft. De breedte en hoogte worden in beide richtingen vergroot met de hoeveelheden die zijn opgegeven door de breedte‑ en hoogtewaarden van het opgegeven grootte‑object. |
| static [Inflate](./inflate/)(const Rectangle\&, int, int) | Vergroot de breedte en hoogte van de rechthoek die door het opgegeven object wordt vertegenwoordigd, waarbij de locatie van het geometrisch middelpunt van de rechthoek behouden blijft. De breedte en hoogte worden in beide richtingen met de opgegeven hoeveelheden vergroot. |
| [Intersect](./intersect/)(const Rectangle\&) | Vervangt de rechthoek die door het huidige object wordt vertegenwoordigd door de rechthoek die ontstaat door de intersectie met de rechthoek die door het opgegeven object wordt vertegenwoordigd. |
| static [Intersect](./intersect/)(const Rectangle\&, const Rectangle\&) | Retourneert een rechthoek die het resultaat is van de intersectie van de opgegeven rechthoeken. |
| [IntersectsWith](./intersectswith/)(const Rectangle\&) | Bepaalt of de rechthoeken die door het huidige en opgegeven objecten worden vertegenwoordigd elkaar snijden. |
| [Offset](./offset/)(const Point\&) | Verplaatst de positie van de rechthoek die door het huidige object wordt vertegenwoordigd met de opgegeven hoeveelheden. |
| [Offset](./offset/)(int, int) | Verplaatst de positie van de rechthoek die door het huidige object wordt vertegenwoordigd met de opgegeven hoeveelheden. |
| [operator RectangleF](./operatorrectanglef/)() const | Retourneert een [RectangleF](../rectanglef/) object dat een rechthoek vertegenwoordigt die gelijk is aan de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Geeft altijd true terug. |
| [operator==](./operator==/)(std::nullptr_t) const | Geeft altijd false terug. |
| [Rectangle](./rectangle/)() | Construeert een nieuwe instantie van een [Rectangle](./) object dat een rechthoek vertegenwoordigt met X- en Y-coördinaten en breedte- en hoogtewaarden ingesteld op 0. |
| [Rectangle](./rectangle/)(int, int, int, int) | Construeert een nieuwe instantie van een [Rectangle](./) object dat een rechthoek vertegenwoordigt met de opgegeven coördinaten van de linkerbovenhoek en de breedte en hoogte. |
| [Rectangle](./rectangle/)(const Point\&, const Size\&) | Construeert een nieuwe instantie van een [Rectangle](./) object dat een rechthoek vertegenwoordigt waarbij de coördinaten van de linkerbovenhoek zijn gespecificeerd als een instantie van de [Point](../point/) klasse en de breedte en hoogte als een instantie van de [Size](../size/) klasse. |
| [Rectangle](./rectangle/)(const System::Windows::Forms::Screen::Rectangle_\&) | Construeert een nieuwe instantie van een [Rectangle](./) object dat de rechthoek vertegenwoordigt die gelijk is aan de opgegeven. |
| static [Round](./round/)(const RectangleF\&) | Construeert een [Rectangle](./) object van het opgegeven [RectangleF](../rectanglef/) object door de locatie- en groottewaarden van het [RectangleF](../rectanglef/) object af te ronden naar de dichtstbijzijnde gehele waarden. |
| [set_Height](./set_height/)(int) | Stelt de hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_Location](./set_location/)(Point) | Stelt de locatie van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_Size](./set_size/)(Size) | Stelt de breedte en hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_Width](./set_width/)(int) | Stelt de breedte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_X](./set_x/)(int) | Stelt de X-coördinaat van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_Y](./set_y/)(int) | Stelt de Y-coördinaat van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van het huidige object. |
| static [Truncate](./truncate/)(const RectangleF\&) | Construeert een [Rectangle](./) object van het opgegeven [RectangleF](../rectanglef/) object door de locatie- en groottewaarden van het [RectangleF](../rectanglef/) object af te kappen naar de volgende lagere gehele waarden. |
| static [Union](./union/)(const Rectangle\&, const Rectangle\&) | Retourneert een rechthoek die het resultaat is van de unie van de opgegeven rechthoeken. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Een lege rechthoek, d.w.z. een rechthoek waarvan de locatie- en groottewaarden nul zijn. |
## Zie ook

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
