---
title: "classe System::Drawing::Drawing2D::PathData"
linktitle: "PathData"
second_title: "Aspose.Font per C++"
description: "classe System::Drawing::Drawing2D::PathData. Contiene i dati grafici che rappresentano un percorso. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.drawing.drawing2d/pathdata/
---
## PathData class


Contiene i dati grafici che rappresentano un percorso. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class PathData : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Points](./get_points/)() | Restituisce un array contenente i punti che compongono un percorso. |
| [get_Types](./get_types/)() | Restituisce un array contenente i valori che specificano i tipi dei punti corrispondenti nell'array **Points**. |
| [PathData](./pathdata/)() | Crea un oggetto [PathData](./) vuoto. |
| [set_Points](./set_points/)(const ArrayPtr\<PointF\>\&) | Imposta un array contenente i punti che compongono un percorso. |
| [set_Types](./set_types/)(const ArrayPtr\<uint8_t\>\&) | Imposta un array contenente i valori che specificano i tipi dei punti corrispondenti nell'array **Points**. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
