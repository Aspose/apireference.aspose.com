---
title: "Classe System::Drawing::Rectangle"
linktitle: "Rectangle"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::Rectangle. Rappresenta un'area rettangolare di un'immagine definita come coordinate intere X e Y dell'angolo superiore sinistro e la sua larghezza e altezza. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 1900
url: /it/cpp/system.drawing/rectangle/
---
## Rectangle class


Rappresenta un'area rettangolare di un'immagine definita come coordinate intere X e Y dell'angolo superiore sinistro e la sua larghezza e altezza. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../../system/smartptr/) per gestire oggetti di questo tipo.

```cpp
class Rectangle
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Ceiling](./ceiling/)(const RectangleF\&) | Crea un oggetto [Rectangle](./) a partire dall'oggetto [RectangleF](../rectanglef/) specificato arrotondando i valori di posizione e dimensione dell'oggetto [RectangleF](../rectanglef/) al prossimo intero superiore. |
| [Contains](./contains/)(int, int) const | Determina se il punto specificato si trova all'interno del rettangolo rappresentato dall'oggetto corrente. |
| [Contains](./contains/)(const Point\&) const | Determina se il punto specificato si trova all'interno del rettangolo rappresentato dall'oggetto corrente. |
| [Contains](./contains/)(const Rectangle\&) const | Determina se il rettangolo specificato si trova all'interno del rettangolo rappresentato dall'oggetto corrente. |
| [Equals](./equals/)(const Rectangle\&) const | Determina se i rettangoli rappresentati dall'oggetto corrente e da quello specificato sono identici. |
| static [FromLTRB](./fromltrb/)(int, int, int, int) | Crea un nuovo oggetto [Rectangle](./) che rappresenta un rettangolo con le posizioni dei bordi specificate. |
| [get_Bottom](./get_bottom/)() const | Restituisce la coordinata y del bordo inferiore del rettangolo rappresentato dall'oggetto corrente. |
| [get_Height](./get_height/)() const | Restituisce l'altezza del rettangolo rappresentato dall'oggetto corrente. |
| [get_IsEmpty](./get_isempty/)() const | Determina se le coordinate X e Y dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente, così come la sua larghezza e altezza, hanno valore 0. |
| [get_Left](./get_left/)() const | Restituisce la coordinata X del bordo sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [get_Location](./get_location/)() const | Restituisce un'istanza della classe [Point](../point/) che specifica la posizione dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [get_Right](./get_right/)() const | Restituisce la coordinata X del bordo destro del rettangolo rappresentato dall'oggetto corrente. |
| [get_Size](./get_size/)() const | Restituisce un'istanza della classe [Size](../size/) che specifica la larghezza e l'altezza del rettangolo rappresentato dall'oggetto corrente. |
| [get_Top](./get_top/)() const | Restituisce la coordinata Y del bordo superiore del rettangolo rappresentato dall'oggetto corrente. |
| [get_Width](./get_width/)() const | Restituisce la larghezza del rettangolo rappresentato dall'oggetto corrente. |
| [get_X](./get_x/)() const | Restituisce la coordinata X dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [get_Y](./get_y/)() const | Restituisce la coordinata Y dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash dell'oggetto corrente. |
| [Inflate](./inflate/)(int, int) | Aumenta la larghezza e l'altezza del rettangolo rappresentato dall'oggetto corrente, mantenendo la posizione del centro geometrico del rettangolo. La larghezza e l'altezza vengono incrementate in entrambe le direzioni degli importi specificati. |
| [Inflate](./inflate/)(const Size\&) | Aumenta la larghezza e l'altezza del rettangolo rappresentato dall'oggetto corrente, mantenendo la posizione del centro geometrico del rettangolo. La larghezza e l'altezza vengono incrementate in entrambe le direzioni degli importi specificati dai valori di larghezza e altezza dell'oggetto dimensione specificato, corrispondentemente. |
| static [Inflate](./inflate/)(const Rectangle\&, int, int) | Aumenta la larghezza e l'altezza del rettangolo rappresentato dall'oggetto specificato, mantenendo la posizione del centro geometrico del rettangolo. La larghezza e l'altezza vengono incrementate in entrambe le direzioni degli importi specificati. |
| [Intersect](./intersect/)(const Rectangle\&) | Sostituisce il rettangolo rappresentato dall'oggetto corrente con il rettangolo risultante dalla sua intersezione con il rettangolo rappresentato dall'oggetto specificato. |
| static [Intersect](./intersect/)(const Rectangle\&, const Rectangle\&) | Restituisce un rettangolo che è il risultato dell'intersezione dei rettangoli specificati. |
| [IntersectsWith](./intersectswith/)(const Rectangle\&) | Determina se i rettangoli rappresentati dall'oggetto corrente e da quello specificato si intersecano. |
| [Offset](./offset/)(const Point\&) | Sposta la posizione del rettangolo rappresentato dall'oggetto corrente degli importi specificati. |
| [Offset](./offset/)(int, int) | Sposta la posizione del rettangolo rappresentato dall'oggetto corrente degli importi specificati. |
| [operator RectangleF](./operatorrectanglef/)() const | Restituisce un oggetto [RectangleF](../rectanglef/) che rappresenta un rettangolo equivalente al rettangolo rappresentato dall'oggetto corrente. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Restituisce sempre true. |
| [operator==](./operator==/)(std::nullptr_t) const | Restituisce sempre false. |
| [Rectangle](./rectangle/)() | Crea una nuova istanza dell'oggetto [Rectangle](./) che rappresenta un rettangolo con coordinate X e Y e valori di larghezza e altezza impostati a 0. |
| [Rectangle](./rectangle/)(int, int, int, int) | Crea una nuova istanza dell'oggetto [Rectangle](./) che rappresenta un rettangolo con le coordinate specificate dell'angolo superiore sinistro e la larghezza e l'altezza. |
| [Rectangle](./rectangle/)(const Point\&, const Size\&) | Crea una nuova istanza dell'oggetto [Rectangle](./) che rappresenta un rettangolo con le coordinate dell'angolo superiore sinistro specificate come un'istanza della classe [Point](../point/) e la larghezza e l'altezza come un'istanza della classe [Size](../size/). |
| [Rectangle](./rectangle/)(const System::Windows::Forms::Screen::Rectangle_\&) | Crea una nuova istanza dell'oggetto [Rectangle](./) che rappresenta il rettangolo equivalente a quello specificato. |
| static [Round](./round/)(const RectangleF\&) | Crea un oggetto [Rectangle](./) a partire dall'oggetto [RectangleF](../rectanglef/) specificato arrotondando i valori di posizione e dimensione dell'oggetto [RectangleF](../rectanglef/) al valore intero più vicino. |
| [set_Height](./set_height/)(int) | Imposta l'altezza del rettangolo rappresentato dall'oggetto corrente. |
| [set_Location](./set_location/)(Point) | Imposta la posizione dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [set_Size](./set_size/)(Size) | Imposta la larghezza e l'altezza del rettangolo rappresentato dall'oggetto corrente. |
| [set_Width](./set_width/)(int) | Imposta la larghezza del rettangolo rappresentato dall'oggetto corrente. |
| [set_X](./set_x/)(int) | Imposta la coordinata X dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [set_Y](./set_y/)(int) | Imposta la coordinata Y dell'angolo superiore sinistro del rettangolo rappresentato dall'oggetto corrente. |
| [ToString](./tostring/)() const | Restituisce la rappresentazione stringa dell'oggetto corrente. |
| static [Truncate](./truncate/)(const RectangleF\&) | Crea un oggetto [Rectangle](./) a partire dall'oggetto [RectangleF](../rectanglef/) specificato troncando i valori di posizione e dimensione dell'oggetto [RectangleF](../rectanglef/) al prossimo intero inferiore. |
| static [Union](./union/)(const Rectangle\&, const Rectangle\&) | Restituisce un rettangolo che è il risultato dell'unione dei rettangoli specificati. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](./empty/) | Un rettangolo vuoto, cioè un rettangolo i cui valori di posizione e dimensione sono zero. |
## Vedi anche

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
