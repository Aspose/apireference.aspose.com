---
title: "classe System::Drawing::Drawing2D::CustomLineCap"
linktitle: "CustomLineCap"
second_title: "Aspose.Font per C++"
description: "classe System::Drawing::Drawing2D::CustomLineCap. Rappresenta un cappuccio di linea definito dall'utente. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Rappresenta un cappuccio di linea definito dall'utente. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class CustomLineCap : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Clone](./clone/)() | Restituisce una copia dell'oggetto corrente. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Crea una nuova istanza della classe [CustomLineCap](./) che rappresenta un cappuccio di linea definito dall'utente con le proprietà specificate. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [get_BaseCap](./get_basecap/)() const | Restituisce il cappuccio di linea base da cui è stato creato questo cappuccio personalizzato. |
| [get_BaseInset](./get_baseinset/)() const | Restituisce la distanza tra la linea e il cappuccio. |
| [get_StrokeJoin](./get_strokejoin/)() const | Restituisce il valore [LineJoin](../linejoin/) che determina come le linee di questo cappuccio personalizzato sono unite. |
| [get_WidthScale](./get_widthscale/)() const | Restituisce la scala di questo cappuccio personalizzato. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Ottiene i cappucci di linea iniziale e finale del cappuccio personalizzato rappresentato dall'oggetto corrente. |
| [set_BaseCap](./set_basecap/)(LineCap) | Imposta il valore del cappuccio di linea base per questo cappuccio personalizzato. |
| [set_BaseInset](./set_baseinset/)(float) | Imposta la distanza tra la linea e il cappuccio. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Imposta il valore [LineJoin](../linejoin/) che determina come le linee di questo cappuccio personalizzato sono unite. |
| [set_WidthScale](./set_widthscale/)(float) | Imposta il valore di scala di questo cappuccio personalizzato. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Imposta i cappucci di linea iniziale e finale del cappuccio personalizzato rappresentato dall'oggetto corrente. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
