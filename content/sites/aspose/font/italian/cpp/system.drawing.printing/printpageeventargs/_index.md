---
title: "Classe System::Drawing::Printing::PrintPageEventArgs"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::Printing::PrintPageEventArgs. Fornisce dati per l'evento PrintPage. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


Fornisce dati per l'evento PrintPage. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Graphics](./get_graphics/)() | NON IMPLEMENTATO. |
| [get_HasMorePages](./get_hasmorepages/)() | NON IMPLEMENTATO. |
| [get_PageSettings](./get_pagesettings/)() | NON IMPLEMENTATO. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | Costruisce una nuova istanza della classe [PrintPageEventArgs](./). |
| [set_HasMorePages](./set_hasmorepages/)(bool) | NON IMPLEMENTATO. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "empty" [EventArgs](../../system/eventargs/) (null-pointer). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
