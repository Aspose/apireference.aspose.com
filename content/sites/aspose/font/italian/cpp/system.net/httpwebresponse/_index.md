---
title: "System::Net::HttpWebResponse classe"
linktitle: "HttpWebResponse"
second_title: "Aspose.Font per C++"
description: "System::Net::HttpWebResponse class. Rappresenta la risposta web HTTP. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò può provocare errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


Rappresenta la risposta web HTTP. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò può provocare errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude lo stream di risposta. |
| [get_CharacterSet](./get_characterset/)() | Non implementato. |
| [get_ContentLength](./get_contentlength/)() override | Informazioni RTTI. |
| [get_ContentType](./get_contenttype/)() override | Restituisce il tipo MIME della risorsa. |
| virtual [get_Cookies](./get_cookies/)() | Restituisce i cookie associati alla risposta web. |
| [get_Headers](./get_headers/)() override | Restituisce la collezione delle intestazioni associate alla risposta corrente. |
| virtual [get_Method](./get_method/)() | Restituisce il metodo HTTP. |
| [get_ResponseUri](./get_responseuri/)() override | Restituisce l'URI della risorsa. |
| virtual [get_StatusCode](./get_statuscode/)() | Restituisce il codice di stato HTTP associato alla risposta web. |
| virtual [get_StatusDescription](./get_statusdescription/)() | Restituisce la rappresentazione stringa del codice di stato. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Restituisce un valore che indica se la risposta corrente supporta le intestazioni. |
| [GetResponseHeader](./getresponseheader/)(String) | Restituisce il valore corrispondente per il nome dell'intestazione specificato. |
| [GetResponseStream](./getresponsestream/)() override | Restituisce lo stream della risposta. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | Crea una nuova istanza. |
## Vedi anche

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
