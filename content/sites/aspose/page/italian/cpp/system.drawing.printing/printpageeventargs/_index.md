---
title: "System::Drawing::Printing::PrintPageEventArgs class"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Page per C++"
description: "System::Drawing::Printing::PrintPageEventArgs class. Fornisce dati per l'evento PrintPage. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


Fornisce dati per l'evento PrintPage. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Graphics](./get_graphics/)() | NOT IMPLEMENTED. |
| [get_HasMorePages](./get_hasmorepages/)() | NOT IMPLEMENTED. |
| [get_PageSettings](./get_pagesettings/)() | NOT IMPLEMENTED. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | Costruisce una nuova istanza della classe [PrintPageEventArgs](./). |
| [set_HasMorePages](./set_hasmorepages/)(bool) | NOT IMPLEMENTED. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "vuoto" [EventArgs](../../system/eventargs/) (null-pointer). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
