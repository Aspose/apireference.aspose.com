---
title: "System::OperatingSystem klass"
linktitle: "OperatingSystem"
second_title: "Aspose.Page för C++"
description: "System::OperatingSystem klass. Representerar ett specifikt operativsystem och tillhandahåller information om det. Objekt av denna klass bör endast allokeras med funktionen System::MakeObject(). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 5100
url: /sv/cpp/system/operatingsystem/
---
## OperatingSystem class


Representerar ett specifikt operativsystem och tillhandahåller information om det. Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/)-pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class OperatingSystem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Platform](./get_platform/)() const | Returnerar plattformsidentifieraren för operativsystemet som representeras av det aktuella objektet. |
| [get_ServicePack](./get_servicepack/)() const | Returnerar namn på service pack för operativsystemet som representeras av det aktuella objektet. |
| [get_Version](./get_version/)() const | Returnerar en konstant referens till ett [Version](../version/) objekt som representerar versionen av operativsystemet som representeras av det aktuella objektet. |
| [get_VersionString](./get_versionstring/)() const | Returnerar strängrepresentationen av versionen av operativsystemet som representeras av det aktuella objektet. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | Skapar en instans som representerar ett operativsystem specificerat med ett visst plattforms-ID och version. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | Skapar en instans som representerar ett operativsystem specificerat med ett visst plattforms-ID, version och servicepaket. |
| [ToString](./tostring/)() const | Returnerar strängrepresentationen av versionen av operativsystemet som representeras av det aktuella objektet. |
## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
