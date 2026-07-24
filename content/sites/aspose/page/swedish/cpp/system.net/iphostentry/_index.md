---
title: "System::Net::IPHostEntry-klass"
linktitle: "IPHostEntry"
second_title: "Aspose.Page för C++"
description: "System::Net::IPHostEntry-klass. Representerar information om en internetvärdadress. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller assertion-fel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 2600
url: /sv/cpp/system.net/iphostentry/
---
## IPHostEntry class


Representerar information om en internetvärdadress. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller assertion-fel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class IPHostEntry : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | Hämtar samlingen av IP-adresser för värden. |
| [get_Aliases](./get_aliases/)() | Hämtar samlingen av alias för värden. |
| [get_HostName](./get_hostname/)() const | RTTI-information. |
| [IPHostEntry](./iphostentry/)() | Skapar en ny instans. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | Ställer in en samling av IP-adresser för värden. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | Ställer in en samling av alias för värden. |
| [set_HostName](./set_hostname/)(String) | Ställer in värdens namn. |
| [ToString](./tostring/)() const override | Analog till C# [Object.ToString()](../../system/object/tostring/) metod. Gör det möjligt att konvertera anpassade objekt till sträng. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
