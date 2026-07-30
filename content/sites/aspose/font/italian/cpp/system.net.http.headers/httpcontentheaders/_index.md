---
title: "System::Net::Http::Headers::HttpContentHeaders classe"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::HttpContentHeaders classe. Rappresenta la raccolta delle intestazioni ''Content''. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


Rappresenta la raccolta delle intestazioni 'Content'. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Aggiunge le intestazioni conosciute alla raccolta specificata. |
| [get_Allow](./get_allow/)() | Informazioni RTTI. |
| [get_ContentDisposition](./get_contentdisposition/)() | Ottiene un valore dell'intestazione 'Content-Disposition'. |
| [get_ContentEncoding](./get_contentencoding/)() | Ottiene un valore dell'intestazione 'Content-Encoding'. |
| [get_ContentLanguage](./get_contentlanguage/)() | Ottiene un valore dell'intestazione 'Content-Language'. |
| [get_ContentLength](./get_contentlength/)() | Ottiene un valore dell'intestazione 'Content-Length'. |
| [get_ContentLocation](./get_contentlocation/)() | Ottiene un valore dell'intestazione 'Content-Location'. |
| [get_ContentMD5](./get_contentmd5/)() | Ottiene un valore dell'intestazione 'Content-MD5'. |
| [get_ContentRange](./get_contentrange/)() | Ottiene un valore dell'intestazione 'Content-Range'. |
| [get_ContentType](./get_contenttype/)() | Ottiene un valore dell'intestazione 'Content-Type'. |
| [get_Expires](./get_expires/)() | Ottiene un valore dell'intestazione 'Expires'. |
| [get_LastModified](./get_lastmodified/)() | Ottiene un valore dell'intestazione 'Last-Modified'. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | Crea una nuova istanza. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | Imposta un valore dell'intestazione 'Content-Disposition'. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | Imposta un valore dell'intestazione 'Content-Length'. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | Imposta un valore dell'intestazione 'Content-Location'. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | Imposta un valore dell'intestazione 'Content-MD5'. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | Imposta un valore dell'intestazione 'Content-Range'. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | Imposta un valore dell'intestazione 'Content-Type'. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | Imposta un valore dell'intestazione 'Expires'. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | Imposta un valore dell'intestazione 'Last-Modified'. |
## Vedi anche

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
