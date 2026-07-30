---
title: "Classe System::Drawing::RectangleF"
linktitle: "RectangleF"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::RectangleF. Rappresenta un'area rettangolare di un'immagine definita dalle coordinate X e Y a precisione singola del suo angolo superiore sinistro e dalla sua larghezza e altezza. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 2000
url: /it/cpp/system.drawing/rectanglef/
---
## RectangleF class


Rappresenta un'area rettangolare di un'immagine definita dalle coordinate X e Y a precisione singola del suo angolo superiore sinistro e dalla sua larghezza e altezza. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../../system/smartptr/) per gestire oggetti di questo tipo.

```cpp
class RectangleF
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Contains](./contains/)(float, float) | Determina se il punto specificato si trova all'interno del rettangolo rappresentato dall'oggetto corrente. |
| [Contains](./contains/)(const PointF\&) | Determina se il punto specificato si trova all'interno del rettangolo rappresentato dall'oggetto corrente. |
| [Contains](./contains/)(const RectangleF\&) | Determina se il rettangolo specificato si trova all'interno del rettangolo rappresentato dall'oggetto corrente. |
| [Equals](./equals/)(const RectangleF\&) const | Determina se i rettangoli rappresentati dall'oggetto corrente e da quello specificato sono identici. |
| static [FromLTRB](./fromltrb/)(float, float, float, float) | Crea un nuovo oggetto [RectangleF](./) che rappresenta un rettangolo con le posizioni dei bordi specificate. |
| [get_Bottom](./get_bottom/)() const | Restituisce la coordinata y del bordo inferiore del rettangolo rappresentato dall'oggetto corrente. |
| [get_Height](./get_height/)() const | Restituisce l'altezza del rettangolo rappresentato dall'oggetto corrente. |
| [get_IsEmpty](./get_isempty/)() const | Determina se le coordinate X e Y dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente, così come la sua larghezza e altezza, hanno valore 0. |
| [get_Left](./get_left/)() const | Restituisce la coordinata X del bordo sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [get_Location](./get_location/)() const | Restituisce un'istanza della classe [PointF](../pointf/) che specifica la posizione dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [get_Right](./get_right/)() const | Restituisce la coordinata X del bordo destro del rettangolo rappresentato dall'oggetto corrente. |
| [get_Size](./get_size/)() const | Restituisce un'istanza della classe [SizeF](../sizef/) che specifica la larghezza e l'altezza del rettangolo rappresentato dall'oggetto corrente. |
| [get_Top](./get_top/)() const | Restituisce la coordinata Y del bordo superiore del rettangolo rappresentato dall'oggetto corrente. |
| [get_Width](./get_width/)() const | Restituisce la larghezza del rettangolo rappresentato dall'oggetto corrente. |
| [get_X](./get_x/)() const | Restituisce la coordinata X dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [get_Y](./get_y/)() const | Restituisce la coordinata Y dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash dell'oggetto corrente. |
| [Inflate](./inflate/)(float, float) | Aumenta la larghezza e l'altezza del rettangolo rappresentato dall'oggetto corrente, mantenendo la posizione del centro geometrico del rettangolo. La larghezza e l'altezza vengono incrementate in entrambe le direzioni degli importi specificati. |
| [Inflate](./inflate/)(const SizeF\&) | Aumenta la larghezza e l'altezza del rettangolo rappresentato dall'oggetto corrente, mantenendo la posizione del centro geometrico del rettangolo. La larghezza e l'altezza vengono incrementate in entrambe le direzioni degli importi specificati dai valori di larghezza e altezza dell'oggetto dimensione specificato, corrispondentemente. |
| static [Inflate](./inflate/)(const RectangleF\&, float, float) | Aumenta la larghezza e l'altezza del rettangolo rappresentato dall'oggetto specificato, mantenendo la posizione del centro geometrico del rettangolo. La larghezza e l'altezza vengono incrementate in entrambe le direzioni degli importi specificati. |
| [Intersect](./intersect/)(const RectangleF\&) | Sostituisce il rettangolo rappresentato dall'oggetto corrente con il rettangolo risultante dalla sua intersezione con il rettangolo rappresentato dall'oggetto specificato. |
| static [Intersect](./intersect/)(const RectangleF\&, const RectangleF\&) | Restituisce un rettangolo che è il risultato dell'intersezione dei rettangoli specificati. |
| [IntersectsWith](./intersectswith/)(const RectangleF\&) | Determina se i rettangoli rappresentati dall'oggetto corrente e da quello specificato si intersecano. |
| [Offset](./offset/)(const PointF\&) | Sposta la posizione del rettangolo rappresentato dall'oggetto corrente degli importi specificati. |
| [Offset](./offset/)(float, float) | Sposta la posizione del rettangolo rappresentato dall'oggetto corrente degli importi specificati. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Restituisce sempre true. |
| [operator==](./operator==/)(std::nullptr_t) const | Restituisce sempre false. |
| [RectangleF](./rectanglef/)() | Crea una nuova istanza dell'oggetto [RectangleF](./) che rappresenta un rettangolo con le coordinate X e Y e i valori di larghezza e altezza impostati a 0. |
| [RectangleF](./rectanglef/)(float, float, float, float) | Crea una nuova istanza dell'oggetto [RectangleF](./) che rappresenta un rettangolo con le coordinate specificate dell'angolo superiore sinistro e la larghezza e l'altezza. |
| [RectangleF](./rectanglef/)(const PointF\&, const SizeF\&) | Crea una nuova istanza dell'oggetto [RectangleF](./) che rappresenta un rettangolo con le coordinate dell'angolo superiore sinistro specificate come un'istanza della classe [PointF](../pointf/) e la sua larghezza e altezza come un'istanza della classe [SizeF](../sizef/). |
| explicit [RectangleF](./rectanglef/)(const Rectangle\&) | Crea una nuova istanza dell'oggetto [RectangleF](./) che rappresenta il rettangolo equivalente a quello specificato. |
| [set_Height](./set_height/)(float) | Imposta l'altezza del rettangolo rappresentato dall'oggetto corrente. |
| [set_Location](./set_location/)(PointF) | Imposta la posizione dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [set_Size](./set_size/)(SizeF) | Imposta la larghezza e l'altezza del rettangolo rappresentato dall'oggetto corrente. |
| [set_Width](./set_width/)(float) | Imposta la larghezza del rettangolo rappresentato dall'oggetto corrente. |
| [set_X](./set_x/)(float) | Imposta la coordinata X dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [set_Y](./set_y/)(float) | Imposta la coordinata Y dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [ToString](./tostring/)() const | Restituisce la rappresentazione stringa dell'oggetto corrente. |
| static [Union](./union/)(const RectangleF\&, const RectangleF\&) | Restituisce un rettangolo che è il risultato dell'unione dei rettangoli specificati. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](./empty/) | Un rettangolo vuoto, cioè un rettangolo i cui valori di posizione e dimensione sono zero. |
## Vedi anche

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
