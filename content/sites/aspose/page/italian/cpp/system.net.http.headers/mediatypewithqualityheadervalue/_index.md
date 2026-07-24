---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue classe"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Page per C++"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue classe. Rappresenta un tipo MIME con un fattore di qualità aggiuntivo in un valore dell'intestazione ''Content-Type''. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1300
url: /it/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


Rappresenta un tipo MIME con un fattore di qualità aggiuntivo in un valore dell'intestazione 'Content-Type'. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Quality](./get_quality/)() | Informazioni RTTI. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | Crea una nuova istanza. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | Crea una nuova istanza. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | Crea una nuova istanza. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [MediaTypeWithQualityHeaderValue](./). |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Imposta un valore di qualità. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | Tenta di convertire una stringa passata in un'istanza della classe [MediaTypeWithQualityHeaderValue](./). |
## Vedi anche

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
