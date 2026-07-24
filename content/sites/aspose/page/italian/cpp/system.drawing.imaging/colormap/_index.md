---
title: "classe System::Drawing::Imaging::ColorMap"
linktitle: "ColorMap"
second_title: "Aspose.Page per C++"
description: "classe System::Drawing::Imaging::ColorMap. Rappresenta una mappa per la conversione dei colori. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.drawing.imaging/colormap/
---
## ColorMap class


Rappresenta una mappa per la conversione dei colori. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class ColorMap : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_NewColor](./get_newcolor/)() const | Restituisce il nuovo oggetto [Color](../../system.drawing/color/) che rappresenta il colore verso cui convertire. |
| [get_OldColor](./get_oldcolor/)() const | Restituisce il vecchio oggetto [Color](../../system.drawing/color/) che rappresenta il colore da convertire. |
| [set_NewColor](./set_newcolor/)(const Color\&) | Imposta il nuovo oggetto [Color](../../system.drawing/color/) che rappresenta il colore verso cui convertire. |
| [set_OldColor](./set_oldcolor/)(const Color\&) | Imposta il vecchio oggetto [Color](../../system.drawing/color/) che rappresenta il colore da convertire. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
