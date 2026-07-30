---
title: "System::Text::RegularExpressions::Match class"
linktitle: "Match"
second_title: "Aspose.Font per C++"
description: "System::Text::RegularExpressions::Match class. Corrispondenza singola di un'espressione regolare su una stringa. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Aggiunge una cattura alla corrispondenza. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Aggiunge un gruppo alla corrispondenza. |
| static [get_Empty](./get_empty/)() | Accessor per corrispondenza vuota. |
| [get_Groups](./get_groups/)() | Ottiene l'elenco dei gruppi. |
| [Match](./match/)(const UStringPtr\&, int, int) | Costruttore. |
| [NextMatch](./nextmatch/)() | Iterazione sulle corrispondenze. |
| virtual [Result](./result/)(const String\&) | Formatta la stringa sostituendo i riferimenti ai sotto‑corrispondenze con i loro valori. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## Vedi anche

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
