---
title: "System::Text::RegularExpressions::Group class"
linktitle: "Group"
second_title: "Aspose.Font per C++"
description: "System::Text::RegularExpressions::Group class. Risultato di una corrispondenza effettuata da un singolo gruppo di cattura. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.text.regularexpressions/group/
---
## Group class


Risultato di una corrispondenza effettuata da un singolo gruppo di cattura. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Aggiunge una cattura al gruppo. |
| [get_Captures](./get_captures/)() | Ottiene le catture disponibili. |
| [get_Success](./get_success/)() | Verifica se la cattura è riuscita per questo gruppo. |
| [Group](./group/)(const UStringPtr\&, int, int) | Costruttore. |
| [Group](./group/)() | Costruttore di gruppo vuoto. |
## Vedi anche

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
