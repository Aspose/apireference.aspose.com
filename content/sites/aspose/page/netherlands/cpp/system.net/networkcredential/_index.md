---
title: "System::Net::NetworkCredential class"
linktitle: "NetworkCredential"
second_title: "Aspose.Page voor C++"
description: "System::Net::NetworkCredential class. Biedt referenties voor de wachtwoordgebaseerde authenticatieschema's. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 2900
url: /nl/cpp/system.net/networkcredential/
---
## NetworkCredential class


Biedt referenties voor de wachtwoordgebaseerde authenticatieschema's. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Domain](./get_domain/)() | Haalt het domein op dat de referenties verifieert. |
| [get_Password](./get_password/)() | Haalt het wachtwoord op. |
| [get_UserName](./get_username/)() | RTTI-informatie. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Retourneert referenties voor de opgegeven URI en authenticatietype. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Retourneert referenties voor de opgegeven hostnaam, poort en authenticatietype. |
| [NetworkCredential](./networkcredential/)() | Construeert een nieuw exemplaar. |
| [NetworkCredential](./networkcredential/)(String, String) | Construeert een nieuw exemplaar. |
| [NetworkCredential](./networkcredential/)(String, String, String) | Construeert een nieuw exemplaar. |
| [set_Domain](./set_domain/)(String) | Stelt het domein in dat de referenties verifieert. |
| [set_Password](./set_password/)(String) | Stelt het wachtwoord in. |
| [set_UserName](./set_username/)(String) | Stelt de gebruikersnaam in. |
## Zie ook

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
