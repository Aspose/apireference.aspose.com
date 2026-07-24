---
title: "System::Net::IWebProxy class"
linktitle: "IWebProxy"
second_title: "Aspose.Page voor C++"
description: "System::Net::IWebProxy class. Deze interface wordt gebruikt voor de implementatie van proxy-toegang tot de WebRequest class. Objecten van deze class mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze class altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2700
url: /nl/cpp/system.net/iwebproxy/
---
## IWebProxy class


Deze interface wordt gebruikt voor de implementatie van proxy-toegang tot de [WebRequest](../webrequest/) class. Objecten van deze class mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze class altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class IWebProxy : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | RTTI-informatie. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Retourneert de proxy-URI. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Retourneert een waarde die aangeeft of de proxy niet mag worden gebruikt voor de opgegeven host. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Stelt inloggegevens in voor authenticatie op de proxy-server. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
