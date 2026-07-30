---
title: "System::Globalization::EastAsianLunisolarCalendar class"
linktitle: "EastAsianLunisolarCalendar"
second_title: "Aspose.Font per C++"
description: "System::Globalization::EastAsianLunisolarCalendar class. Calendario lunisolare dell'Est asiatico. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.globalization/eastasianlunisolarcalendar/
---
## EastAsianLunisolarCalendar class


Calendario lunisolare dell'Est asiatico. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EastAsianLunisolarCalendar : public System::Globalization::Calendar
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Informazioni RTTI. |
| [GetCelestialStem](./getcelestialstem/)(int) const | Restituisce il tronco celeste. |
| virtual [GetSexagenaryYear](./getsexagenaryyear/)(DateTime) const | Restituisce l'anno nel ciclo sessagenario. |
| [GetTerrestrialBranch](./getterrestrialbranch/)(int) const | Restituisce il ramo terrestre. |
## Vedi anche

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
