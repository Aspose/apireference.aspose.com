---
title: "System::Net::FileWebResponse-klass"
linktitle: "FileWebResponse"
second_title: "Aspose.Page för C++"
description: "System::Net::FileWebResponse-klass. Tillhandahåller en implementation av den abstrakta klassen WebResponse för att arbeta med filsystemet. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller assert-fel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 1100
url: /sv/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Tillhandahåller en implementation av den abstrakta klassen [WebResponse](../webresponse/) för att arbeta med filsystemet. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller assert-fel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Close](./close/)() override | Stänger svarströmmen. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Skapar en ny instans. |
| [get_ContentLength](./get_contentlength/)() override | RTTI-information. |
| [get_ContentType](./get_contenttype/)() override | Returnerar resursens MIME-typ. |
| [get_Headers](./get_headers/)() override | Returnerar samlingen av headers som är associerade med det aktuella svaret. |
| [get_ResponseUri](./get_responseuri/)() override | Returnerar resursens URI. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Returnerar ett värde som indikerar om det aktuella svaret stöder rubriker. |
| [GetResponseStream](./getresponsestream/)() override | Returnerar svarströmmen. |
## Se även

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
