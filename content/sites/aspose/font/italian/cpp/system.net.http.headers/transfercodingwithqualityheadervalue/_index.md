---
title: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue classe"
linktitle: "TransferCodingWithQualityHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue classe. Rappresenta un valore con una qualità aggiuntiva dell'intestazione ''Accept-Encoding''. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2500
url: /it/cpp/system.net.http.headers/transfercodingwithqualityheadervalue/
---
## TransferCodingWithQualityHeaderValue class


Rappresenta un valore con una qualità aggiuntiva dell'intestazione 'Accept-Encoding'. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class TransferCodingWithQualityHeaderValue : public System::Net::Http::Headers::TransferCodingHeaderValue
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Quality](./get_quality/)() | Informazioni RTTI. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [TransferCodingWithQualityHeaderValue](./). |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Imposta il valore di qualità dell'intestazione 'Accept-Encoding'. |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)() | Crea una nuova istanza. |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String) | Crea una nuova istanza. |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String, double) | Crea una nuova istanza. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingWithQualityHeaderValue\>\&) | Tenta di convertire una stringa passata in un'istanza della classe [TransferCodingWithQualityHeaderValue](./). |
## Vedi anche

* Class [TransferCodingHeaderValue](../transfercodingheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
