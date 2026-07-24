---
title: "System::Security namespace"
linktitle: "System::Security"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de System::Security-namespace in C++."
type: docs
weight: 5400
url: /nl/cpp/system.security/
---



## Klassen

| Klasse | Beschrijving |
| --- | --- |
| [SecureString](./securestring/) | Secure string, stelt tekst voor die vertrouwelijk moet blijven. Deze klasse ENCRYPTT de interne gegevens NIET. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [SecureStringMarshal](./securestringmarshal/) | Collectie van methoden voor het alloceren en kopiëren van niet-beheerde geheugenblokken. |
| [SecurityElement](./securityelement/) | XML-objectmodel voor het coderen van beveiligingsobjecten. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [SecureStringPtr](./securestringptr/) | [SecureString](./securestring/) pointertype. |
