---
title: "Classe System::Net::Http::Headers::MediaTypeHeaderValue"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Http::Headers::MediaTypeHeaderValue. Rappresenta un tipo MIME nel valore dell'header ''Content-Type''. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


Rappresenta un tipo MIME nel valore dell'header 'Content-Type'. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza tale puntatore per passarla alle funzioni come argomento.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_CharSet](./get_charset/)() | Informazioni RTTI. |
| [get_MediaType](./get_mediatype/)() | Ottiene un valore dell'header media-type. |
| [get_Parameters](./get_parameters/)() | Restituisce i parametri di valore dell'header media-type. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Converte una stringa fornita dall'indice specificato in un'istanza della classe [MediaTypeHeaderValue](./). |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | Crea una nuova istanza. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | Crea una nuova istanza. |
| static [Parse](./parse/)(String) | Converte una stringa fornita in un'istanza della classe [MediaTypeHeaderValue](./). |
| [set_CharSet](./set_charset/)(String) | Imposta un set di caratteri. |
| [set_MediaType](./set_mediatype/)(String) | Imposta un valore dell'header media-type. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Tenta di convertire una stringa fornita in un'istanza della classe [MediaTypeHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
