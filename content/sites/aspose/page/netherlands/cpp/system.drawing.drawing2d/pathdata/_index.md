---
title: "System::Drawing::Drawing2D::PathData klasse"
linktitle: "PathData"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Drawing2D::PathData klasse. Bevat de grafische gegevens die een pad vertegenwoordigen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1100
url: /nl/cpp/system.drawing.drawing2d/pathdata/
---
## PathData class


Bevat de grafische gegevens die een pad vertegenwoordigen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class PathData : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Points](./get_points/)() | Retourneert een array met de punten die een pad vormen. |
| [get_Types](./get_types/)() | Retourneert een array met de waarden die de typen van de overeenkomstige punten in de **Points** array specificeren. |
| [PathData](./pathdata/)() | Construeert een leeg [PathData](./) object. |
| [set_Points](./set_points/)(const ArrayPtr\<PointF\>\&) | Stelt een array in die de punten bevat waaruit een pad bestaat. |
| [set_Types](./set_types/)(const ArrayPtr\<uint8_t\>\&) | Stelt een array in die de waarden bevat die de typen van de overeenkomstige punten in de **Points** array specificeren. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
