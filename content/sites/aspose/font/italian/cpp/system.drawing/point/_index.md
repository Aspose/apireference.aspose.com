---
title: "Classe System::Drawing::Point"
linktitle: "Punto"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::Point. Rappresenta una coppia di coordinate intere X e Y di un punto su un piano bidimensionale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 1700
url: /it/cpp/system.drawing/point/
---
## Point class


Rappresenta una coppia di coordinate intere X e Y di un punto su un piano bidimensionale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../../system/smartptr/) per gestire oggetti di questo tipo.

```cpp
class Point
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Add](./add/)(const Point\&, const Size\&) | Aggiunge i valori di larghezza e altezza dell'oggetto [Size](../size/) specificato ai valori delle coordinate X e Y dell'oggetto [Point](./) specificato corrispondentemente. |
| static [Ceiling](./ceiling/)(const PointF\&) | Costruisce un oggetto [Point](./) dall'oggetto [PointF](../pointf/) specificato arrotondando i valori delle coordinate X e Y dell'oggetto [PointF](../pointf/) al prossimo intero superiore. |
| [Equals](./equals/)(const Point\&) const | Determina se l'oggetto corrente e l'oggetto specificato sono uguali, cioè rappresentano la stessa coppia di valori delle coordinate X e Y. |
| [get_IsEmpty](./get_isempty/)() const | Determina se entrambi i valori delle coordinate X e Y sono uguali a 0. |
| [get_X](./get_x/)() const | Restituisce il valore della coordinata X rappresentata dall'oggetto corrente. |
| [get_Y](./get_y/)() const | Restituisce il valore della coordinata Y rappresentata dall'oggetto corrente. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash per l'oggetto corrente. |
| [getStdHash](./getstdhash/)() const | Restituisce un valore hash per l'oggetto corrente. |
| [IsNull](./isnull/)() const | Restituisce sempre false. |
| [Offset](./offset/)(int, int) | Sposta i valori delle coordinate X e Y rappresentati dall'oggetto corrente dei valori specificati. |
| [Offset](./offset/)(Point) | Sposta le coordinate X e Y rappresentate dall'oggetto corrente dei valori delle coordinate X e Y rappresentate dall'oggetto [Point](./) specificato corrispondentemente. |
| [operator PointF](./operatorpointf/)() const | Costruisce un'istanza dell'oggetto [PointF](../pointf/) e la inizializza con i valori delle coordinate X e Y dell'oggetto [Point](./) corrente. |
| [operator Size](./operatorsize/)() const | Costruisce un'istanza dell'oggetto [Size](../size/) e ne inizializza i valori di larghezza e altezza con i valori delle coordinate X e Y rappresentati dall'oggetto corrente corrispondentemente. |
| [Point](./point/)() | Costruisce un nuovo oggetto [Point](./) e ne inizializza i valori delle coordinate X e Y a 0. |
| [Point](./point/)(int, int) | Costruisce un nuovo oggetto [Point](./) e lo inizializza con i valori specificati. |
| [Point](./point/)(const Size\&) | Costruisce un nuovo oggetto [Point](./) e ne inizializza i valori delle coordinate X e Y con i valori di larghezza e altezza dell'oggetto [SizeF](../sizef/) specificato corrispondentemente. |
| [Point](./point/)(int) | Costruisce un nuovo oggetto [Point](./) e ne inizializza il valore della coordinata X con un valore formato dai 16 bit più alti del intero a 32 bit specificato e il valore della coordinata Y con un valore formato dai 16 bit più bassi del valore intero a 32 bit specificato. |
| static [Round](./round/)(const PointF\&) | Costruisce un oggetto [Point](./) dall'oggetto [PointF](../pointf/) specificato arrotondando i valori delle coordinate X e Y dell'oggetto [PointF](../pointf/) al valore intero più vicino. |
| [set_X](./set_x/)(int) | Imposta il valore della coordinata X rappresentata dall'oggetto corrente. |
| [set_Y](./set_y/)(int) | Imposta il valore della coordinata Y rappresentata dall'oggetto corrente. |
| static [Subtract](./subtract/)(const Point\&, const Size\&) | Sottrae i valori di larghezza e altezza dell'oggetto [Size](../size/) specificato dai valori delle coordinate X e Y dell'oggetto [Point](./) specificato corrispondentemente. |
| [ToString](./tostring/)() const | Restituisce la rappresentazione stringa della coppia di valori delle coordinate X e Y rappresentata dall'oggetto corrente. |
| static [Truncate](./truncate/)(const PointF\&) | Costruisce un oggetto [Point](./) dall'oggetto [PointF](../pointf/) specificato troncando i valori delle coordinate X e Y dell'oggetto [PointF](../pointf/) al prossimo intero inferiore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](./empty/) | Un'istanza vuota della classe [Point](./) i cui valori delle coordinate X e Y sono 0. |
## Vedi anche

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
