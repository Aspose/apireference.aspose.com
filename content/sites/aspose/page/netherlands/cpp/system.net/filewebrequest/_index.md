---
title: "System::Net::FileWebRequest klasse"
linktitle: "FileWebRequest"
second_title: "Aspose.Page voor C++"
description: "System::Net::FileWebRequest class. Biedt een implementatie van de abstracte klasse WebRequest om met het bestandssysteem te werken. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1000
url: /nl/cpp/system.net/filewebrequest/
---
## FileWebRequest class


Biedt een implementatie van de abstracte klasse [WebRequest](../webrequest/) om met het bestandssysteem te werken. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Abort](./abort/)() override | Annuleert het huidige verzoek. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Initieert een asynchrone bewerking om een stream te verkrijgen voor het schrijven van gegevens naar de bron. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Initieert een asynchrone aanvraag voor de bron. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Wacht tot de opgegeven asynchrone bewerking om een stream te verkrijgen voltooid is. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Wacht tot de opgegeven asynchrone aanvraag voor de bron voltooid is. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | Construeert een nieuw exemplaar. |
| [get_ContentType](./get_contenttype/)() override | Haalt het MIME-type van het verzoek op. |
| [get_Headers](./get_headers/)() override | Haalt de verzameling van de HTTP-headers op. |
| [get_Method](./get_method/)() override | Haalt de HTTP-methode op. |
| [get_RequestUri](./get_requesturi/)() override | Retourneert de URI van het verzoek. |
| [GetResponse](./getresponse/)() override | Retourneert de webrespons die bij het huidige webverzoek hoort. |
| [set_ContentType](./set_contenttype/)(String) override | Stelt het MIME-type van het verzoek in. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Stelt de verzameling van de HTTP-headers in. |
| [set_Method](./set_method/)(String) override | Stelt de HTTP-methode in. |
| [set_Timeout](./set_timeout/)(int) override | RTTI-informatie. |
## Zie ook

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
