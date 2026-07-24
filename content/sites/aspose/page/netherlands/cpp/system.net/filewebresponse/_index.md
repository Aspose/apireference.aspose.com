---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Page voor C++"
description: "System::Net::FileWebResponse class. Biedt een implementatie van de abstracte klasse WebResponse om met het bestandssysteem te werken. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wrap deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1100
url: /nl/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Biedt een implementatie van de abstracte klasse [WebResponse](../webresponse/) om met het bestandssysteem te werken. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wrap deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Sluit de responsestream. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Construeert een nieuw exemplaar. |
| [get_ContentLength](./get_contentlength/)() override | RTTI-informatie. |
| [get_ContentType](./get_contenttype/)() override | Retourneert het MIME-type van de bron. |
| [get_Headers](./get_headers/)() override | Retourneert de verzameling van de headers die gekoppeld zijn aan de huidige respons. |
| [get_ResponseUri](./get_responseuri/)() override | Retourneert de URI van de bron. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Retourneert een waarde die aangeeft of de huidige respons headers ondersteunt. |
| [GetResponseStream](./getresponsestream/)() override | Retourneert de responsstroom. |
## Zie ook

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
