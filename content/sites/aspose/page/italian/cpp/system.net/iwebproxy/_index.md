---
title: "classe System::Net::IWebProxy"
linktitle: "IWebProxy"
second_title: "Aspose.Page per C++"
description: "Classe System::Net::IWebProxy. Questa interfaccia è usata per l'implementazione dell'accesso al proxy per la classe WebRequest. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2700
url: /it/cpp/system.net/iwebproxy/
---
## IWebProxy class


Questa interfaccia è usata per l'implementazione dell'accesso al proxy per la classe [WebRequest](../webrequest/). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class IWebProxy : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | Informazioni RTTI. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Restituisce l'URI del proxy. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Restituisce un valore che indica se il proxy non deve essere usato per l'host specificato. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Imposta le credenziali per l'autenticazione sul server proxy. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
