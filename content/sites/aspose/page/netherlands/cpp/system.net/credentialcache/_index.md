---
title: "System::Net::CredentialCache klasse"
linktitle: "CredentialCache"
second_title: "Aspose.Page voor C++"
description: "System::Net::CredentialCache klasse. Biedt opslag voor referenties. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.net/credentialcache/
---
## CredentialCache class


Biedt opslag voor referenties. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | Voegt de opgegeven netwerkreferenties toe aan de cache. |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | Voegt de opgegeven netwerkreferenties toe aan de cache. |
| [CredentialCache](./credentialcache/)() | Construeert een nieuw exemplaar. |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | RTTI-informatie. |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | Retourneert de netwerkreferenties van de huidige gebruiker of applicatie. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Retourneert referenties voor het opgegeven URI-voorvoegsel en authenticatietype. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Retourneert referenties voor de opgegeven hostnaam, poort en authenticatietype. |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | Verwijdert netwerkreferenties voor het opgegeven URI-voorvoegsel en authenticatietype. |
| [Remove](./remove/)(String, int32_t, String) | Verwijdert netwerkreferenties voor de opgegeven hostnaam, poort en authenticatietype. |
## Zie ook

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
