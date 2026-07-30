---
title: "System::Net::WebResponse classe"
linktitle: "WebResponse"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::WebResponse. Rappresenta una risposta web. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 4000
url: /it/cpp/system.net/webresponse/
---
## WebResponse class


Rappresenta una risposta web. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class WebResponse : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Close](./close/)() | Chiude lo stream di risposta. |
| [Dispose](./dispose/)() override | Non fa nulla. |
| virtual [get_ContentLength](./get_contentlength/)() | Informazioni RTTI. |
| virtual [get_ContentType](./get_contenttype/)() | Restituisce il tipo MIME della risorsa. |
| virtual [get_Headers](./get_headers/)() | Restituisce la collezione delle intestazioni associate alla risposta corrente. |
| virtual [get_ResponseUri](./get_responseuri/)() | Restituisce l'URI della risorsa. |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | Restituisce un valore che indica se la risposta corrente supporta le intestazioni. |
| virtual [GetResponseStream](./getresponsestream/)() | Restituisce lo stream della risposta. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
