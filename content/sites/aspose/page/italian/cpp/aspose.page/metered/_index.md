---
title: "classe Aspose::Page::Metered"
linktitle: "Tariffato"
second_title: "Aspose.Page per C++"
description: "classe Aspose::Page::Metered. Fornisce metodi per impostare la chiave tariffata in C++."
type: docs
weight: 1400
url: /it/cpp/aspose.page/metered/
---
## Metered class


Fornisce metodi per impostare la chiave misurata.

```cpp
class Metered : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | Ottiene il credito di consumo. |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | Ottiene la dimensione del file di consumo. |
| [Metered](./metered/)() | Inizializza una nuova istanza di questa classe. |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | Imposta la chiave pubblica e privata tariffata. Se acquisti una licenza tariffata, all'avvio dell'applicazione questa API dovrebbe essere chiamata; normalmente è sufficiente. Tuttavia, se il caricamento dei dati di consumo fallisce continuamente e supera le 24 ore, la licenza verrà impostata in stato di valutazione; per evitare questo caso, dovresti controllare regolarmente lo stato della licenza e, se è in stato di valutazione, chiamare nuovamente questa API. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
