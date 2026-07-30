---
title: "Classe System::Net::Http::HttpMethod"
linktitle: "HttpMethod"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Http::HttpMethod. Rappresenta un metodo HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.net.http/httpmethod/
---
## HttpMethod class


Rappresenta un metodo HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | Determina se gli oggetti corrente e specificato sono uguali. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| static [get_Delete](./get_delete/)() | Restituisce il metodo HTTP 'DELETE'. |
| static [get_Get](./get_get/)() | Restituisce il metodo HTTP 'GET'. |
| static [get_Head](./get_head/)() | Restituisce il metodo HTTP 'HEAD'. |
| [get_Method](./get_method/)() | Restituisce una rappresentazione stringa del metodo HTTP. |
| static [get_Options](./get_options/)() | Restituisce il metodo HTTP 'OPTIONS'. |
| static [get_Post](./get_post/)() | Restituisce il metodo HTTP 'POST'. |
| static [get_Put](./get_put/)() | Restituisce il metodo HTTP 'PUT'. |
| static [get_Trace](./get_trace/)() | Restituisce il metodo HTTP 'TRACE'. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| [HttpMethod](./httpmethod/)(String) | Crea una nuova istanza. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
