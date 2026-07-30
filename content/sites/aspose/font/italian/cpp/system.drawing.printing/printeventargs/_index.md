---
title: "System::Drawing::Printing::PrintEventArgs classe"
linktitle: "PrintEventArgs"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Printing::PrintEventArgs class. Fornisce dati per gli eventi BeginPrint e EndPrint. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


Fornisce dati per gli eventi BeginPrint e EndPrint. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | Restituisce un valore che specifica un'azione di stampa rappresentata dall'oggetto corrente. |
| [PrintEventArgs](./printeventargs/)() | Crea una nuova istanza dell'oggetto [PrintEventArgs](./). |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "empty" [EventArgs](../../system/eventargs/) (null-pointer). |
## Vedi anche

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
