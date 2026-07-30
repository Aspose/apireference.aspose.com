---
title: "classe System::Net::Http::Headers::AuthenticationHeaderValue"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Font per C++"
description: "classe System::Net::Http::Headers::AuthenticationHeaderValue. Rappresenta i valori delle intestazioni ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'' e ''Proxy-Authenticate''. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


Rappresenta i valori delle intestazioni 'Authorization', 'ProxyAuthorization', 'WWW-Authenticate' e 'Proxy-Authenticate'. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | Costruttore. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | Costruttore. |
| [Clone](./clone/)() override | Informazioni RTTI. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Parameter](./get_parameter/)() | Ottiene le credenziali contenenti le informazioni di autenticazione. |
| [get_Scheme](./get_scheme/)() | Informazioni RTTI. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Analizza la stringa specificata e restituisce l'ultimo indice della rappresentazione della stringa. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [AuthenticationHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | Tentativo di convertire una stringa passata in un'istanza della classe [AuthenticationHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
