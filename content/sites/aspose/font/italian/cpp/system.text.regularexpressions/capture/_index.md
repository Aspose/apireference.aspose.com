---
title: "System::Text::RegularExpressions::Capture class"
linktitle: "Capture"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::RegularExpressions::Capture. Risultato della corrispondenza di una singola sottoespressione. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.text.regularexpressions/capture/
---
## Capture class


Risultato della corrispondenza di una singola sottoespressione. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Capture : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Capture](./capture/)(const UStringPtr\&, int, int) | Costruttore. |
| [get_Index](./get_index/)() const | Ottiene l'indice della sottostringa catturata. |
| [get_Length](./get_length/)() const | Ottiene la lunghezza della sottostringa catturata. |
| [get_Value](./get_value/)() const | Ottiene la sottostringa catturata. |
| [ToString](./tostring/)() const override | Ottiene la sottostringa catturata. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
