---
title: "System::Drawing::PointF classe"
linktitle: "PointF"
second_title: "Aspose.Font per C++"
description: "System::Drawing::PointF classe. Rappresenta una coppia di coordinate X e Y a precisione singola di un punto su un piano bidimensionale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 1800
url: /it/cpp/system.drawing/pointf/
---
## PointF class


Rappresenta una coppia di coordinate X e Y a precisione singola di un punto su un piano bidimensionale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../../system/smartptr/) per gestire oggetti di questo tipo.

```cpp
class PointF
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Add](./add/)(const PointF\&, const SizeF\&) | Aggiunge i valori di larghezza e altezza dell'oggetto [SizeF](../sizef/) specificato ai valori delle coordinate X e Y dell'oggetto [PointF](./) specificato corrispondentemente. |
| static [Add](./add/)(const PointF\&, const Size\&) | Aggiunge i valori di larghezza e altezza dell'oggetto [Size](../size/) specificato ai valori delle coordinate X e Y dell'oggetto [PointF](./) specificato corrispondentemente. |
| [Equals](./equals/)(const PointF\&) const | Determina se l'oggetto corrente e l'oggetto specificato sono uguali, cioè rappresentano la stessa coppia di valori delle coordinate X e Y. |
| [get_IsEmpty](./get_isempty/)() const | Determina se entrambi i valori delle coordinate X e Y sono uguali a 0. |
| [get_X](./get_x/)() const | Restituisce il valore della coordinata X rappresentata dall'oggetto corrente. |
| [get_Y](./get_y/)() const | Restituisce il valore della coordinata Y rappresentata dall'oggetto corrente. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash per l'oggetto corrente. |
| [IsNull](./isnull/)() const | Restituisce sempre false. |
| explicit [operator bool](./operatorbool/)() | Restituisce sempre true. |
| [PointF](./pointf/)() | Crea un nuovo oggetto [PointF](./) e inizializza i suoi valori delle coordinate X e Y a 0. |
| [PointF](./pointf/)(float, float) | Crea un nuovo oggetto [PointF](./) e lo inizializza con i valori specificati. |
| [PointF](./pointf/)(const SizeF\&) | Crea un nuovo oggetto [PointF](./) e inizializza i valori delle sue coordinate X e Y con i valori di larghezza e altezza dell'oggetto [SizeF](../sizef/) specificato, rispettivamente. |
| [set_X](./set_x/)(float) | Imposta il valore della coordinata X rappresentata dall'oggetto corrente. |
| [set_Y](./set_y/)(float) | Imposta il valore della coordinata Y rappresentata dall'oggetto corrente. |
| static [Subtract](./subtract/)(const PointF\&, const SizeF\&) | Sottrae i valori di larghezza e altezza dell'oggetto [SizeF](../sizef/) specificato dai valori delle coordinate X e Y dell'oggetto [PointF](./) specificato, rispettivamente. |
| static [Subtract](./subtract/)(const PointF\&, const Size\&) | Sottrae i valori di larghezza e altezza dell'oggetto [Size](../size/) specificato dai valori delle coordinate X e Y dell'oggetto [PointF](./) specificato, rispettivamente. |
| [ToString](./tostring/)() const | Restituisce la rappresentazione stringa della coppia di valori delle coordinate X e Y rappresentata dall'oggetto corrente. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](./empty/) | Un'istanza vuota della classe [PointF](./) i cui valori delle coordinate X e Y sono 0. |
## Vedi anche

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
