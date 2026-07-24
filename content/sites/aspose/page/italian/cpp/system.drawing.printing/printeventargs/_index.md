---
title: "System::Drawing::Printing::PrintEventArgs class"
linktitle: "PrintEventArgs"
second_title: "Aspose.Page per C++"
description: "System::Drawing::Printing::PrintEventArgs class. Fornisce dati per gli eventi BeginPrint e EndPrint. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 800
url: /it/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


Fornisce dati per gli eventi BeginPrint e EndPrint. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "vuoto" [EventArgs](../../system/eventargs/) (null-pointer). |
## Vedi anche

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
