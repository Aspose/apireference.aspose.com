---
title: "System::Net::WebRequest::HttpRequestCreator klasse"
linktitle: "HttpRequestCreator"
second_title: "Aspose.Page voor C++"
description: "System::Net::WebRequest::HttpRequestCreator klasse. Maakt de WebRequest-klasse-instanties aan. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3900
url: /nl/cpp/system.net/webrequest/httprequestcreator/
---
## HttpRequestCreator class


Maakt de WebRequest-klasse-instanties aan. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class HttpRequestCreator : public System::Net::IWebRequestCreate
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<Uri\>) | Maakt een nieuwe instantie van de WebRequest-klasse met de opgegeven URI. |
## Zie ook

* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
