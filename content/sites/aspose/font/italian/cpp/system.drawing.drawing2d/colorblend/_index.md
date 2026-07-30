---
title: "System::Drawing::Drawing2D::ColorBlend class"
linktitle: "ColorBlend"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Drawing2D::ColorBlend class. Contiene array di colori e posizioni usati per interpolare la fusione dei colori in un gradiente multicolore. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.drawing.drawing2d/colorblend/
---
## ColorBlend class


Contiene array di colori e posizioni usati per interpolare la fusione dei colori in un gradiente multicolore. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class ColorBlend : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ColorBlend](./colorblend/)() | Costruisce una nuova istanza della classe [ColorBlend](./). |
| [ColorBlend](./colorblend/)(int) | Costruisce una nuova istanza della classe [Blend](../blend/). |
| [get_Colors](./get_colors/)() | Restituisce un array di colori da usare nelle posizioni corrispondenti lungo un gradiente. |
| [get_Positions](./get_positions/)() | Restituisce l'array delle posizioni di fusione lungo un gradiente. |
| [set_Colors](./set_colors/)(const ArrayPtr\<Color\>\&) | Imposta un array di colori da utilizzare nelle posizioni corrispondenti lungo un gradiente. |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | Imposta l'array delle posizioni di fusione lungo un gradiente. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
