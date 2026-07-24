---
title: "System::Security::Cryptography::Oid classe"
linktitle: "Oid"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::Oid classe. Identificatore di oggetto crittografico. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2500
url: /it/cpp/system.security.cryptography/oid/
---
## Oid class


Identificatore di oggetto crittografico. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Oid : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Crea un oggetto OID dal nome amichevole OID specificato. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Crea un oggetto OID dal valore OID specificato. |
| [get_FriendlyName](./get_friendlyname/)() const | Restituisce il nome leggibile dall'utente dell'oggetto. |
| [get_Value](./get_value/)() const | Restituisce la stringa dell'identificatore dell'oggetto. |
| [Oid](./oid/)() | Informazioni RTTI. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | Costruttore di copia. |
| [Oid](./oid/)(const String\&) | Costruttore. |
| [Oid](./oid/)(const String\&, const String\&) | Costruttore. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Imposta il nome leggibile dall'utente dell'oggetto. |
| [set_Value](./set_value/)(const String\&) | Imposta la stringa dell'identificatore dell'oggetto. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
