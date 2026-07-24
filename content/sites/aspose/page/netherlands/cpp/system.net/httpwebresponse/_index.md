---
title: "System::Net::HttpWebResponse klasse"
linktitle: "HttpWebResponse"
second_title: "Aspose.Page voor C++"
description: "System::Net::HttpWebResponse klasse. Vertegenwoordigt de HTTP-webrespons. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2100
url: /nl/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


Vertegenwoordigt de HTTP-webrespons. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Sluit de responsestream. |
| [get_CharacterSet](./get_characterset/)() | Niet geïmplementeerd. |
| [get_ContentLength](./get_contentlength/)() override | RTTI-informatie. |
| [get_ContentType](./get_contenttype/)() override | Retourneert het MIME-type van de bron. |
| virtual [get_Cookies](./get_cookies/)() | Retourneert cookies die gekoppeld zijn aan de webrespons. |
| [get_Headers](./get_headers/)() override | Retourneert de verzameling van de headers die gekoppeld zijn aan de huidige respons. |
| virtual [get_Method](./get_method/)() | Retourneert de HTTP-methode. |
| [get_ResponseUri](./get_responseuri/)() override | Retourneert de URI van de bron. |
| virtual [get_StatusCode](./get_statuscode/)() | Retourneert de HTTP-statuscode die gekoppeld is aan de webrespons. |
| virtual [get_StatusDescription](./get_statusdescription/)() | Retourneert de tekenreeksrepresentatie van de statuscode. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Retourneert een waarde die aangeeft of de huidige respons headers ondersteunt. |
| [GetResponseHeader](./getresponseheader/)(String) | Retourneert de overeenkomstige waarde voor de opgegeven headernaam. |
| [GetResponseStream](./getresponsestream/)() override | Retourneert de responsstroom. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
