---
title: "System::Net::Http::HttpMessageInvoker klasse"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::HttpMessageInvoker klasse. Staat toepassingen toe om de Send-methode aan te roepen op een HTTP-handlerketen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 600
url: /nl/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


Staat toepassingen toe om de Send-methode aan te roepen op een HTTP-handlerketen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Dispose](./dispose/)() override | Disposeert de huidige instantie. Deze methode disposeert ook de handler indien nodig. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | RTTI-informatie. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Construeert een nieuw exemplaar. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Verzendt het opgegeven verzoek. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
