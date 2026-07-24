---
title: "System::Drawing::RectangleF klasse"
linktitle: "RectangleF"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::RectangleF klasse. Vertegenwoordigt een rechthoekig gebied van een afbeelding gedefinieerd door enkelprecisie zwevende-komma X‑ en Y‑coördinaten van de linkerbovenhoek en de breedte en hoogte. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 2000
url: /nl/cpp/system.drawing/rectanglef/
---
## RectangleF class


Stelt een rechthoekig gebied van een afbeelding voor, gedefinieerd door enkelprecisie zwevende-komma X‑ en Y‑coördinaten van de linkerbovenhoek en de breedte en hoogte. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../../system/smartptr/) klasse om objecten van dit type te beheren.

```cpp
class RectangleF
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Contains](./contains/)(float, float) | Bepaalt of het opgegeven punt zich binnen de rechthoek bevindt die door het huidige object wordt vertegenwoordigd. |
| [Contains](./contains/)(const PointF\&) | Bepaalt of het opgegeven punt zich binnen de rechthoek bevindt die door het huidige object wordt vertegenwoordigd. |
| [Contains](./contains/)(const RectangleF\&) | Bepaalt of de opgegeven rechthoek zich binnen de rechthoek bevindt die door het huidige object wordt vertegenwoordigd. |
| [Equals](./equals/)(const RectangleF\&) const | Bepaalt of de rechthoeken die door het huidige en het opgegeven object worden vertegenwoordigd identiek zijn. |
| static [FromLTRB](./fromltrb/)(float, float, float, float) | Construeert een nieuw [RectangleF](./) object dat een rechthoek vertegenwoordigt met de opgegeven randlocaties. |
| [get_Bottom](./get_bottom/)() const | Retourneert de y-coördinaat van de onderkant van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Height](./get_height/)() const | Retourneert de hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_IsEmpty](./get_isempty/)() const | Bepaalt of de X- en Y-coördinaten van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd, evenals de breedte en hoogte, de waarde 0 hebben. |
| [get_Left](./get_left/)() const | Retourneert de X-coördinaat van de linkerkant van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Location](./get_location/)() const | Retourneert een instantie van de [PointF](../pointf/) klasse die de locatie van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd, specificeert. |
| [get_Right](./get_right/)() const | Retourneert de X-coördinaat van de rechterkant van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Size](./get_size/)() const | Retourneert een instantie van de [SizeF](../sizef/) klasse die de breedte en hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd, specificeert. |
| [get_Top](./get_top/)() const | Retourneert de Y-coördinaat van de bovenkant van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Width](./get_width/)() const | Retourneert de breedte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_X](./get_x/)() const | Retourneert de X-coördinaat van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [get_Y](./get_y/)() const | Retourneert de Y-coördinaat van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode van het huidige object. |
| [Inflate](./inflate/)(float, float) | Vergroot de breedte en hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd, waarbij de locatie van het geometrisch middelpunt van de rechthoek behouden blijft. De breedte en hoogte worden in beide richtingen met de opgegeven hoeveelheden vergroot. |
| [Inflate](./inflate/)(const SizeF\&) | Vergroot de breedte en hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd, waarbij de locatie van het geometrisch middelpunt van de rechthoek behouden blijft. De breedte en hoogte worden in beide richtingen vergroot met de hoeveelheden die zijn opgegeven door de breedte‑ en hoogtewaarden van het opgegeven grootte‑object. |
| static [Inflate](./inflate/)(const RectangleF\&, float, float) | Vergroot de breedte en hoogte van de rechthoek die door het opgegeven object wordt vertegenwoordigd, waarbij de locatie van het geometrisch middelpunt van de rechthoek behouden blijft. De breedte en hoogte worden in beide richtingen met de opgegeven hoeveelheden vergroot. |
| [Intersect](./intersect/)(const RectangleF\&) | Vervangt de rechthoek die door het huidige object wordt vertegenwoordigd door de rechthoek die ontstaat door de intersectie met de rechthoek die door het opgegeven object wordt vertegenwoordigd. |
| static [Intersect](./intersect/)(const RectangleF\&, const RectangleF\&) | Retourneert een rechthoek die het resultaat is van de intersectie van de opgegeven rechthoeken. |
| [IntersectsWith](./intersectswith/)(const RectangleF\&) | Bepaalt of de rechthoeken die door het huidige en opgegeven objecten worden vertegenwoordigd elkaar snijden. |
| [Offset](./offset/)(const PointF\&) | Verplaatst de positie van de rechthoek die door het huidige object wordt vertegenwoordigd met de opgegeven hoeveelheden. |
| [Offset](./offset/)(float, float) | Verplaatst de positie van de rechthoek die door het huidige object wordt vertegenwoordigd met de opgegeven hoeveelheden. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Geeft altijd true terug. |
| [operator==](./operator==/)(std::nullptr_t) const | Geeft altijd false terug. |
| [RectangleF](./rectanglef/)() | Construeert een nieuw exemplaar van een [RectangleF](./) object dat een rechthoek vertegenwoordigt met X‑ en Y‑coördinaten en breedte‑ en hoogtewaarden ingesteld op 0. |
| [RectangleF](./rectanglef/)(float, float, float, float) | Construeert een nieuw exemplaar van een [RectangleF](./) object dat een rechthoek vertegenwoordigt met de opgegeven coördinaten van de linkerbovenhoek en breedte en hoogte. |
| [RectangleF](./rectanglef/)(const PointF\&, const SizeF\&) | Construeert een nieuw exemplaar van het [RectangleF](./) object dat een rechthoek voorstelt met de coördinaten van de linkerbovenhoek gespecificeerd als een instantie van de [PointF](../pointf/) klasse en de breedte en hoogte als een instantie van de [SizeF](../sizef/) klasse. |
| explicit [RectangleF](./rectanglef/)(const Rectangle\&) | Construeert een nieuw exemplaar van het [RectangleF](./) object dat de rechthoek equivalent aan de opgegeven voorstelt. |
| [set_Height](./set_height/)(float) | Stelt de hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_Location](./set_location/)(PointF) | Stelt de locatie van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_Size](./set_size/)(SizeF) | Stelt de breedte en hoogte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_Width](./set_width/)(float) | Stelt de breedte van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_X](./set_x/)(float) | Stelt de X-coördinaat van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [set_Y](./set_y/)(float) | Stelt de Y-coördinaat van de linkerbovenhoek van de rechthoek die door het huidige object wordt vertegenwoordigd. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van het huidige object. |
| static [Union](./union/)(const RectangleF\&, const RectangleF\&) | Retourneert een rechthoek die het resultaat is van de unie van de opgegeven rechthoeken. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Een lege rechthoek, d.w.z. een rechthoek waarvan de locatie- en groottewaarden nul zijn. |
## Zie ook

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
