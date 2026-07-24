---
title: "System::Xml::Xsl::XsltSettings klasse"
linktitle: "XsltSettings"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XsltSettings klasse. Specificeert de XSLT‑functies die ondersteund moeten worden tijdens de uitvoering van het XSLT‑stijlblad in C++."
type: docs
weight: 800
url: /nl/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


Specificeert de XSLT-functies die ondersteund moeten worden tijdens de uitvoering van het XSLT-stylesheet.

```cpp
class XsltSettings : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [get_Default](./get_default/)() | Retourneert een [XsltSettings](./) object met standaardinstellingen. Ondersteuning voor de XSLT **document()** functie en ingebedde scriptblokken is uitgeschakeld. |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | Retourneert een waarde die aangeeft of ondersteuning voor de XSLT **document()** functie moet worden ingeschakeld. |
| [get_EnableScript](./get_enablescript/)() | Retourneert een waarde die aangeeft of ondersteuning voor ingebedde scriptblokken moet worden ingeschakeld. |
| static [get_TrustedXslt](./get_trustedxslt/)() | Retourneert een [XsltSettings](./) object dat ondersteuning voor de XSLT **document()** functie en ingebedde scriptblokken inschakelt. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | Stelt een waarde in die aangeeft of ondersteuning voor de XSLT **document()** functie moet worden ingeschakeld. |
| [set_EnableScript](./set_enablescript/)(bool) | Stelt een waarde in die aangeeft of ondersteuning voor ingebedde scriptblokken moet worden ingeschakeld. |
| [XsltSettings](./xsltsettings/)() | Initialiseert een nieuw exemplaar van de [XsltSettings](./) klasse met standaardinstellingen. |
| [XsltSettings](./xsltsettings/)(bool, bool) | Initialiseert een nieuw exemplaar van de [XsltSettings](./) klasse met de opgegeven instellingen. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
