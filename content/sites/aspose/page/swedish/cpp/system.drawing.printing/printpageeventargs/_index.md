---
title: "System::Drawing::Printing::PrintPageEventArgs-klass"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Printing::PrintPageEventArgs-klass. Tillhandahåller data för PrintPage‑händelsen. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 900
url: /sv/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


Tillhandahåller data för PrintPage‑händelsen. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Graphics](./get_graphics/)() | INTE IMPLEMENTERAT. |
| [get_HasMorePages](./get_hasmorepages/)() | INTE IMPLEMENTERAT. |
| [get_PageSettings](./get_pagesettings/)() | INTE IMPLEMENTERAT. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | Skapar en ny instans av [PrintPageEventArgs](./)-klassen. |
| [set_HasMorePages](./set_hasmorepages/)(bool) | INTE IMPLEMENTERAT. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | En statisk medlem som representerar en "tom" [EventArgs](../../system/eventargs/) delad pekare (null‑pekare). |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [ptr](./ptr/) | Ett alias för en delad pekare till en instans av denna klass. |
## Se även

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
