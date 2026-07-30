---
title: "System::Drawing::Pen class"
linktitle: "Pen"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Pen class. Rappresenta proprietà come colore, larghezza ecc. delle linee e curve disegnate. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1500
url: /it/cpp/system.drawing/pen/
---
## Pen class


Rappresenta proprietà come colore, larghezza ecc. delle linee e curve disegnate. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Pen : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Restituisce una copia dell'oggetto corrente. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse operative acquisite dall'oggetto corrente. |
| [get_Alignment](./get_alignment/)() const | Restituisce un valore che indica l'allineamento dell'oggetto [Pen](./) corrente. |
| [get_Brush](./get_brush/)() | Restituisce l'oggetto [Brush](../brush/) di questa penna. |
| [get_Color](./get_color/)() const | Restituisce il colore di questa penna. |
| [get_CompoundArray](./get_compoundarray/)() const | Restituisce un array di valori che specifica una penna composta. |
| [get_DashCap](./get_dashcap/)() const | Restituisce un valore che indica il cap usato alle due estremità di una linea tratteggiata. |
| [get_DashOffset](./get_dashoffset/)() const | Restituisce la distanza dall'inizio di una linea all'inizio del modello di tratteggio. |
| [get_DashPattern](./get_dashpattern/)() const | Restituisce un array che indica il modello di tratteggio personalizzato in una linea tratteggiata. |
| [get_DashStyle](./get_dashstyle/)() const | Restituisce un valore che indica lo stile del tratto dell'oggetto [Pen](./) corrente. |
| [get_EndCap](./get_endcap/)() const | Restituisce un valore che indica il cap finale della linea dell'oggetto [Pen](./) corrente. |
| [get_LineJoin](./get_linejoin/)() const | Restituisce un valore che indica come le linee disegnate da questo oggetto [Pen](./) sono unite. |
| [get_MiterLimit](./get_miterlimit/)() const | Restituisce il limite dello spessore della giunzione in un angolo a spigolo. |
| [get_PenType](./get_pentype/)() const | NON IMPLEMENTATO. |
| [get_StartCap](./get_startcap/)() const | Restituisce un valore che indica il cap iniziale della linea dell'oggetto [Pen](./) corrente. |
| [get_Transform](./get_transform/)() | Restituisce una copia di un oggetto Matrix che specifica le trasformazioni geometriche per la penna rappresentata dall'oggetto corrente. |
| [get_Width](./get_width/)() const | Restituisce la larghezza dell'oggetto [Pen](./) corrente. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Moltiplica la matrice di trasformazione dell'oggetto corrente per la matrice specificata. |
| [Pen](./pen/)(const Color\&) | Crea un nuovo oggetto [Pen](./) che rappresenta il colore specificato. |
| [Pen](./pen/)(const Color\&, float) | Crea un nuovo oggetto [Pen](./) che rappresenta il colore e la larghezza specificati. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | Crea un nuovo oggetto [Pen](./) e lo inizializza con l'oggetto [Brush](../brush/) specificato. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | Crea un nuovo oggetto [Pen](./) e lo inizializza con l'oggetto [Brush](../brush/) specificato. |
| [ResetTransform](./resettransform/)() | Reimposta la matrice di trasformazione dell'oggetto corrente affinché diventi una matrice identità. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Ruota la trasformazione geometrica locale dell'angolo specificato nell'ordine specificato. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Scala la trasformazione geometrica locale dei fattori specificati nell'ordine specificato. |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | Imposta l'allineamento dell'oggetto [Pen](./) corrente. |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | Imposta l'oggetto [Brush](../brush/) di questa penna. |
| [set_Color](./set_color/)(const Color\&) | Imposta il colore di questa penna. |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | Imposta un array di valori che specifica una penna composta. |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Imposta il cap finale della linea personalizzato. |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Imposta il cap iniziale della linea personalizzato. |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | Imposta un valore che specifica il cap usato alle due estremità di una linea tratteggiata. |
| [set_DashOffset](./set_dashoffset/)(float) | Imposta la distanza dall'inizio di una linea all'inizio di un modello di tratteggio. |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | Imposta un array che specifica un modello di tratteggio personalizzato in una linea tratteggiata. L'array è composto da numeri che indicano le lunghezze di trattini e spazi alternati. |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | Imposta un valore che specifica lo stile del tratto dell'oggetto [Pen](./) corrente. |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | Imposta il cap finale della linea dell'oggetto [Pen](./) corrente. |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | Imposta un valore che specifica come le linee disegnate da questo oggetto [Pen](./) sono unite. |
| [set_MiterLimit](./set_miterlimit/)(float) | Imposta il limite dello spessore della giunzione in un angolo a spigolo. |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | Imposta il cap iniziale della linea dell'oggetto [Pen](./) corrente. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Imposta un oggetto Matrix che specifica le trasformazioni geometriche per la penna rappresentata dall'oggetto corrente. |
| [set_Width](./set_width/)(float) | Imposta la larghezza dell'oggetto [Pen](./) corrente. |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | NON IMPLEMENTATO. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Trasla la trasformazione geometrica locale delle dimensioni specificate nell'ordine specificato. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
