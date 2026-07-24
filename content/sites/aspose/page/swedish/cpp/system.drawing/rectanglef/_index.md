---
title: "System::Drawing::RectangleF klass"
linktitle: "RectangleF"
second_title: "Aspose.Page för C++"
description: "System::Drawing::RectangleF klass. Representerar ett rektangulärt område i en bild definierat som enkelprecisions flyttal för X‑ och Y‑koordinaterna för dess övre vänstra hörn samt dess bredd och höjd. Denna typ bör allokeras på stacken och skickas till funktioner som värde eller referens. Använd aldrig System::SmartPtr‑klassen för att hantera objekt av denna typ i C++."
type: docs
weight: 2000
url: /sv/cpp/system.drawing/rectanglef/
---
## RectangleF class


Representerar ett rektangulärt område i en bild definierat som enkelprecisions flyttal för X‑ och Y‑koordinaterna för dess övre vänstra hörn samt dess bredd och höjd. Denna typ bör allokeras på stacken och skickas till funktioner som värde eller referens. Använd aldrig [System::SmartPtr](../../system/smartptr/) klassen för att hantera objekt av denna typ.

```cpp
class RectangleF
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Contains](./contains/)(float, float) | Bestämmer om den angivna punkten är placerad inom rektangeln som representeras av det aktuella objektet. |
| [Contains](./contains/)(const PointF\&) | Bestämmer om den angivna punkten är placerad inom rektangeln som representeras av det aktuella objektet. |
| [Contains](./contains/)(const RectangleF\&) | Bestämmer om den angivna rektangeln är placerad inom rektangeln som representeras av det aktuella objektet. |
| [Equals](./equals/)(const RectangleF\&) const | Bestämmer om rektanglarna som representeras av det aktuella och det angivna objektet är identiska. |
| static [FromLTRB](./fromltrb/)(float, float, float, float) | Skapar ett nytt [RectangleF](./)-objekt som representerar en rektangel med de angivna kantpositionerna. |
| [get_Bottom](./get_bottom/)() const | Returnerar y‑koordinaten för rektangelns nedre kant som representeras av det aktuella objektet. |
| [get_Height](./get_height/)() const | Returnerar höjden på rektangeln som representeras av det aktuella objektet. |
| [get_IsEmpty](./get_isempty/)() const | Bestämmer om X‑ och Y‑koordinaterna för rektangelns övre vänstra hörn samt dess bredd och höjd har värdet 0. |
| [get_Left](./get_left/)() const | Returnerar X‑koordinaten för rektangelns vänstra kant som representeras av det aktuella objektet. |
| [get_Location](./get_location/)() const | Returnerar en instans av klassen [PointF](../pointf/) som anger platsen för rektangelns övre vänstra hörn som representeras av det aktuella objektet. |
| [get_Right](./get_right/)() const | Returnerar X‑koordinaten för rektangelns högra kant som representeras av det aktuella objektet. |
| [get_Size](./get_size/)() const | Returnerar en instans av klassen [SizeF](../sizef/) som anger rektangelns bredd och höjd som representeras av det aktuella objektet. |
| [get_Top](./get_top/)() const | Returnerar Y‑koordinaten för rektangelns övre kant som representeras av det aktuella objektet. |
| [get_Width](./get_width/)() const | Returnerar bredden på rektangeln som representeras av det aktuella objektet. |
| [get_X](./get_x/)() const | Returnerar X‑koordinaten för rektangelns övre vänstra hörn som representeras av det aktuella objektet. |
| [get_Y](./get_y/)() const | Returnerar Y‑koordinaten för rektangelns övre vänstra hörn som representeras av det aktuella objektet. |
| [GetHashCode](./gethashcode/)() const | Returnerar en hash‑kod för det aktuella objektet. |
| [Inflate](./inflate/)(float, float) | Ökar bredden och höjden på rektangeln som representeras av det aktuella objektet, samtidigt som den geometriska mittens position behålls. Bredden och höjden ökas i båda riktningarna med de angivna mängderna. |
| [Inflate](./inflate/)(const SizeF\&) | Ökar bredden och höjden på rektangeln som representeras av det aktuella objektet, samtidigt som den geometriska mittens position behålls. Bredden och höjden ökas i båda riktningarna med de mängder som motsvarar bredd‑ och höjdvärdena i det angivna storleksobjektet. |
| static [Inflate](./inflate/)(const RectangleF\&, float, float) | Ökar bredden och höjden på rektangeln som representeras av det angivna objektet, samtidigt som den geometriska mittens position behålls. Bredden och höjden ökas i båda riktningarna med de angivna mängderna. |
| [Intersect](./intersect/)(const RectangleF\&) | Ersätter rektangeln som representeras av det aktuella objektet med den rektangel som erhålls genom dess skärning med rektangeln som representeras av det angivna objektet. |
| static [Intersect](./intersect/)(const RectangleF\&, const RectangleF\&) | Returnerar en rektangel som är resultatet av skärningen av de angivna rektanglarna. |
| [IntersectsWith](./intersectswith/)(const RectangleF\&) | Bestämmer om rektanglarna som representeras av det aktuella och det angivna objektet skär varandra. |
| [Offset](./offset/)(const PointF\&) | Förskjuter positionen för rektangeln som representeras av det aktuella objektet med de angivna mängderna. |
| [Offset](./offset/)(float, float) | Förskjuter positionen för rektangeln som representeras av det aktuella objektet med de angivna mängderna. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Returnerar alltid true. |
| [operator==](./operator==/)(std::nullptr_t) const | Returnerar alltid falskt. |
| [RectangleF](./rectanglef/)() | Skapar en ny instans av [RectangleF](./)-objekt som representerar en rektangel med X‑ och Y‑koordinater samt bredd‑ och höjdvärden satta till 0. |
| [RectangleF](./rectanglef/)(float, float, float, float) | Skapar en ny instans av [RectangleF](./)-objekt som representerar en rektangel med de angivna koordinaterna för dess övre vänstra hörn samt bredd och höjd. |
| [RectangleF](./rectanglef/)(const PointF\&, const SizeF\&) | Skapar en ny instans av [RectangleF](./)-objektet som representerar en rektangel med koordinaterna för dess övre vänstra hörn angivna som en instans av klassen [PointF](../pointf/) och dess bredd och höjd som en instans av klassen [SizeF](../sizef/). |
| explicit [RectangleF](./rectanglef/)(const Rectangle\&) | Skapar en ny instans av [RectangleF](./)-objektet som representerar den rektangel som är ekvivalent med den angivna. |
| [set_Height](./set_height/)(float) | Ställer in höjden på rektangeln som representeras av det aktuella objektet. |
| [set_Location](./set_location/)(PointF) | Ställer in platsen för rektangelns övre vänstra hörn som representeras av det aktuella objektet. |
| [set_Size](./set_size/)(SizeF) | Ställer in bredden och höjden på rektangeln som representeras av det aktuella objektet. |
| [set_Width](./set_width/)(float) | Ställer in bredden på rektangeln som representeras av det aktuella objektet. |
| [set_X](./set_x/)(float) | Ställer in X-koordinaten för rektangelns övre vänstra hörn som representeras av det aktuella objektet. |
| [set_Y](./set_y/)(float) | Ställer in Y-koordinaten för rektangelns övre vänstra hörn som representeras av det aktuella objektet. |
| [ToString](./tostring/)() const | Returnerar strängrepresentationen av det aktuella objektet. |
| static [Union](./union/)(const RectangleF\&, const RectangleF\&) | Returnerar en rektangel som är resultatet av föreningen av de angivna rektanglarna. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [Empty](./empty/) | En tom rektangel, d.v.s. en rektangel vars plats- och storleksvärden är noll. |
## Se även

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
