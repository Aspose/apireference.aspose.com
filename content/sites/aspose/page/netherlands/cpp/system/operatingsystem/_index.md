---
title: "System::OperatingSystem klasse"
linktitle: "OperatingSystem"
second_title: "Aspose.Page voor C++"
description: "System::OperatingSystem klasse. Vertegenwoordigt een specifiek besturingssysteem en biedt informatie erover. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 5100
url: /nl/cpp/system/operatingsystem/
---
## OperatingSystem class


Vertegenwoordigt een specifiek besturingssysteem en biedt informatie erover. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/) function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class OperatingSystem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Platform](./get_platform/)() const | Retourneert de platform‑identificatie van het besturingssysteem dat wordt vertegenwoordigd door het huidige object. |
| [get_ServicePack](./get_servicepack/)() const | Retourneert de naam van het service‑pack van het besturingssysteem dat wordt vertegenwoordigd door het huidige object. |
| [get_Version](./get_version/)() const | Retourneert een constante referentie naar een [Version](../version/) object dat de versie van het besturingssysteem dat wordt vertegenwoordigd door het huidige object weergeeft. |
| [get_VersionString](./get_versionstring/)() const | Retourneert de tekenreeksrepresentatie van de versie van het besturingssysteem dat wordt vertegenwoordigd door het huidige object. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | Construeert een instantie die een besturingssysteem vertegenwoordigt, gespecificeerd als een bepaald platform‑id en versie. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | Construeert een instantie die een besturingssysteem vertegenwoordigt, gespecificeerd als een bepaald platform‑id, versie en service‑pack. |
| [ToString](./tostring/)() const | Retourneert de tekenreeksrepresentatie van de versie van het besturingssysteem dat wordt vertegenwoordigd door het huidige object. |
## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
