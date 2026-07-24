---
title: "System::Drawing::SizeF klasse"
linktitle: "SizeF"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::SizeF klasse. Vertegenwoordigt een paar enkelprecisie floating‑point waarden die de breedte en hoogte van een afbeelding weergeven. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr klasse om objecten van dit type te beheren in C++."
type: docs
weight: 2300
url: /nl/cpp/system.drawing/sizef/
---
## SizeF class


Vertegenwoordigt een paar enkelprecisie floating‑point waarden die de breedte en hoogte van een afbeelding weergeven. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../../system/smartptr/) klasse om objecten van dit type te beheren.

```cpp
class SizeF
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Add](./add/)(const SizeF\&, const SizeF\&) | Retourneert een nieuw [SizeF](./) object dat de som is van de opgegeven [SizeF](./) objecten, d.w.z. waarvan de breedtewaarde gelijk is aan de som van de breedtewaarden van de opgegeven objecten en de hoogtewaarde gelijk is aan de som van de hoogtewaarden van de opgegeven objecten. |
| [Equals](./equals/)(const SizeF\&) const | Bepaalt of het huidige object en het opgegeven object gelijk zijn, d.w.z. of ze hetzelfde paar breedte- en hoogtewaarden vertegenwoordigen. |
| [get_Height](./get_height/)() const | Retourneert de hoogtewaarde die door het huidige object wordt weergegeven. |
| [get_IsEmpty](./get_isempty/)() const | Bepaalt of zowel de breedte- als de hoogtewaarden gelijk zijn aan 0. |
| [get_Width](./get_width/)() const | Retourneert de breedtewaarde die door het huidige object wordt weergegeven. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| [operator PointF](./operatorpointf/)() const | Converteert het huidige object naar een instantie van het [Point](../point/) object door zijn X- en Y-coördinaat te initialiseren met respectievelijk de breedte‑ en hoogtewaarden van het huidige object. |
| [operator+=](./operator+=/)(const SizeF\&) | Voegt de breedte‑ en hoogtewaarden van het opgegeven [SizeF](./) object toe aan respectievelijk de breedte‑ en hoogtewaarden van het huidige [SizeF](./) object. |
| [set_Height](./set_height/)(float) | Stelt de hoogtewaarde in die door het huidige object wordt weergegeven. |
| [set_Width](./set_width/)(float) | Stelt de breedtewaarde in die door het huidige object wordt weergegeven. |
| [SizeF](./sizef/)() | Construeert een nieuw [SizeF](./) object en initialiseert zijn breedte‑ en hoogtewaarden met 0. |
| [SizeF](./sizef/)(const PointF\&) | Construeert een nieuw [SizeF](./) object en initialiseert zijn breedte‑ en hoogtewaarden met respectievelijk de waarden van de X‑ en Y‑coördinaten van het opgegeven punt. |
| [SizeF](./sizef/)(float, float) | Construeert een nieuw [SizeF](./) object en initialiseert het met de opgegeven waarde. |
| static [Subtract](./subtract/)(const SizeF\&, const SizeF\&) | Retourneert een nieuw [SizeF](./) object dat het resultaat is van de aftrekking van **size2** van **size1**, d.w.z. waarvan de breedtewaarde het resultaat is van het aftrekken van de breedtewaarde van **size2** van de breedtewaarde van **size1** en de hoogtewaarde het resultaat is van het aftrekken van de hoogtewaarde van **size2** van de hoogtewaarde van **size1**. |
| [ToPointF](./topointf/)() const | Converteert het huidige object naar een instantie van het [Point](../point/) object door zijn X- en Y-coördinaat te initialiseren met respectievelijk de breedte‑ en hoogtewaarden van het huidige object. |
| [ToSize](./tosize/)() const | Construeert een [Size](../size/) object van het huidige [SizeF](./) object door de breedte‑ en hoogtewaarden van het [SizeF](./) object af te kappen tot de eerstvolgende lagere gehele getallen. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van het paar breedte- en hoogtewaarden dat door het huidige object wordt weergegeven. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Een lege instantie van de [SizeF](./) klasse waarvan de breedte‑ en hoogtewaarden 0 zijn. |
## Zie ook

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
