---
title: "System::Net::NetworkInformation::IPGlobalProperties klasse"
linktitle: "IPGlobalProperties"
second_title: "Aspose.Page voor C++"
description: "System::Net::NetworkInformation::IPGlobalProperties klasse. Vertegenwoordigt informatie over de netwerkverbinding van de lokale computer. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 200
url: /nl/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


Stelt informatie over de netwerkverbinding van de lokale computer voor. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wrap deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class IPGlobalProperties : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | Retourneert het domein waarin de lokale computer is geregistreerd. |
| virtual [get_HostName](./get_hostname/)() | Retourneert de hostnaam van de lokale computer. |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | RTTI-informatie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Page for C++](../../)
