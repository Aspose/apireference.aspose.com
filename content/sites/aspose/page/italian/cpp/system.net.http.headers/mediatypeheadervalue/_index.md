---
title: "System::Net::Http::Headers::MediaTypeHeaderValue classe"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Page per C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue classe. Rappresenta un tipo MIME nel valore dell'intestazione ''Content-Type''. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


Rappresenta un tipo MIME nel valore dell'intestazione 'Content-Type'. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_CharSet](./get_charset/)() | Informazioni RTTI. |
| [get_MediaType](./get_mediatype/)() | Ottiene un valore dell'intestazione media-type. |
| [get_Parameters](./get_parameters/)() | Restituisce i parametri di valore dell'intestazione media-type. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [MediaTypeHeaderValue](./). |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | Crea una nuova istanza. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | Crea una nuova istanza. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [MediaTypeHeaderValue](./). |
| [set_CharSet](./set_charset/)(String) | Imposta un set di caratteri. |
| [set_MediaType](./set_mediatype/)(String) | Imposta un valore dell'intestazione media-type. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Prova a convertire una stringa passata in un'istanza della classe [MediaTypeHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
