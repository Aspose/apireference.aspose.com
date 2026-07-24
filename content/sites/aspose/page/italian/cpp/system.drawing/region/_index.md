---
title: "System::Drawing::Region classe"
linktitle: "Region"
second_title: "Aspose.Page per C++"
description: "System::Drawing::Region class. Rappresenta l'interno di una forma grafica. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.drawing/region/
---
## Region class


Rappresenta l'interno di una forma grafica. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Region : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() const | Restituisce una copia dell'oggetto corrente. |
| [Complement](./complement/)(const RectangleF\&) | Sostituisce la regione rappresentata dall'oggetto corrente con la porzione della regione definita dal rettangolo specificato che non interseca questa regione. |
| [Complement](./complement/)(const Rectangle\&) | Sostituisce la regione rappresentata dall'oggetto corrente con la porzione della regione definita dal rettangolo specificato che non interseca questa regione. |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con la porzione della regione definita dal percorso specificato che non interseca questa regione. |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con la porzione della regione specificata che non interseca questa regione. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | Determina se la regione specificata è identica alla regione rappresentata dall'oggetto corrente sulla superficie di disegno specificata. |
| [Exclude](./exclude/)(const RectangleF\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'esclusione della regione definita dal rettangolo specificato. |
| [Exclude](./exclude/)(const Rectangle\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'esclusione della regione definita dal rettangolo specificato. |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'esclusione della regione definita dal percorso specificato. |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'esclusione della regione specificata. |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | Ottiene una struttura [RectangleF](../rectanglef/) che rappresenta un rettangolo che delimita questo [Region](./) sulla superficie di disegno di un oggetto [Graphics](../graphics/). |
| [GetRegionData](./getregiondata/)() const | Restituisce un oggetto RegionData contenente i dati che definiscono la regione rappresentata dall'oggetto corrente. |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | Restituisce un array di strutture [RectangleF](../rectanglef/) che approssimano questa [Region](./) dopo l'applicazione della trasformazione matriciale specificata. |
| [Intersect](./intersect/)(const RectangleF\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'intersezione di questa regione e di una regione definita dal rettangolo specificato. |
| [Intersect](./intersect/)(const Rectangle\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'intersezione di questa regione e di una regione definita dal rettangolo specificato. |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'intersezione di questa regione e di una regione definita dal percorso specificato. |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'intersezione di questa regione e della regione specificata. |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | Determina se la regione rappresentata dall'oggetto corrente ha un interno vuoto sulla superficie di disegno specificata. |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | Determina se la regione rappresentata dall'oggetto corrente ha un interno infinito sulla superficie di disegno specificata. |
| [IsVisible](./isvisible/)(const Point\&) const | Determina se il punto specificato è contenuto nella regione rappresentata dall'oggetto corrente. |
| [IsVisible](./isvisible/)(const PointF\&) const | Determina se il punto specificato è contenuto nella regione rappresentata dall'oggetto corrente. |
| [IsVisible](./isvisible/)(const Rectangle\&) | Determina se una qualsiasi porzione del rettangolo specificato è contenuta nella regione rappresentata dall'oggetto corrente. |
| [IsVisible](./isvisible/)(const RectangleF\&) | Determina se una qualsiasi porzione del rettangolo specificato è contenuta nella regione rappresentata dall'oggetto corrente. |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | Determina se il punto specificato è contenuto nella regione rappresentata dall'oggetto corrente utilizzando la grafica specificata. |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | Determina se il punto specificato è contenuto nella regione rappresentata dall'oggetto corrente utilizzando la grafica specificata. |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | Determina se una qualsiasi porzione del rettangolo specificato è contenuta nella regione rappresentata dall'oggetto corrente utilizzando la grafica specificata. |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | Determina se una qualsiasi porzione del rettangolo specificato è contenuta nella regione rappresentata dall'oggetto corrente utilizzando la grafica specificata. |
| [IsVisible](./isvisible/)(float, float) const | Determina se il punto specificato è contenuto nella regione rappresentata dall'oggetto corrente. |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | Determina se il punto specificato è contenuto nella regione rappresentata dall'oggetto corrente utilizzando la grafica specificata. |
| [MakeEmpty](./makeempty/)() | Inizializza l'oggetto corrente con un interno vuoto. |
| [MakeInfinite](./makeinfinite/)() | Inizializza questo oggetto regione con un interno infinito. |
| [Region](./region/)() | Crea una nuova istanza della classe [Region](./). |
| [Region](./region/)(const RectangleF\&) | Crea una nuova istanza della classe [Region](./) che rappresenta una regione definita dal rettangolo specificato. |
| [Region](./region/)(const Rectangle\&) | Crea una nuova istanza della classe [Region](./) che rappresenta una regione definita dal rettangolo specificato. |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Crea una nuova istanza della classe [Region](./) che rappresenta una regione definita dal percorso specificato. |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | Crea una nuova istanza della classe [Region](./) che rappresenta una regione definita dall'oggetto RegionData specificato. |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Trasforma questa regione mediante la matrice specificata. |
| [Transform](./transform/)(const SkMatrix\&) | Trasforma questa regione mediante la matrice specificata. |
| [Translate](./translate/)(int, int) | Sposta le coordinate della regione dell'importo specificato. |
| [Translate](./translate/)(float, float) | Sposta le coordinate della regione dell'importo specificato. |
| [Union](./union/)(const RectangleF\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'operazione di unione di questa regione e di una regione definita dal rettangolo specificato. |
| [Union](./union/)(const Rectangle\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'unione di questa regione e di una regione definita dal rettangolo specificato. |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'unione di questa regione e di una regione definita dal percorso specificato. |
| [Union](./union/)(const SharedPtr\<Region\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con il risultato dell'unione di questa regione e della regione specificata. |
| [Xor](./xor/)(const RectangleF\&) | Sostituisce la regione rappresentata dall'oggetto corrente con le parti di questa regione e della regione definita dal rettangolo specificato che non si intersecano. |
| [Xor](./xor/)(const Rectangle\&) | Sostituisce la regione rappresentata dall'oggetto corrente con le parti di questa regione e della regione definita dal rettangolo specificato che non si intersecano. |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con le parti di questa regione e della regione definita dal percorso specificato che non si intersecano. |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | Sostituisce la regione rappresentata dall'oggetto corrente con le parti di questa regione e della regione specificata che non si intersecano. |
| virtual [~Region](./~region/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
