---
title: "System::Xml::Xsl::XsltArgumentList klasse"
linktitle: "XsltArgumentList"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XsltArgumentList klasse. Bevat een variabel aantal argumenten die ofwel XSLT‑parameters of extensie‑objecten in C++ zijn."
type: docs
weight: 400
url: /nl/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


Bevat een variabel aantal argumenten die ofwel XSLT‑parameters of extensie‑objecten zijn.

```cpp
class XsltArgumentList : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | Voegt een nieuw object toe aan de [XsltArgumentList](./) en koppelt het aan de namespace‑URI. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | Voegt een parameter toe aan de [XsltArgumentList](./) en koppelt deze aan de naam met namespace‑kwalificatie. |
| [Clear](./clear/)() | Verwijdert alle parameters en extensie‑objecten uit de [XsltArgumentList](./). |
| [GetExtensionObject](./getextensionobject/)(const String\&) | Retourneert het object dat is gekoppeld aan de opgegeven namespace. |
| [GetParam](./getparam/)(const String\&, const String\&) | Retourneert de parameter die is gekoppeld aan de naam met namespace‑kwalificatie. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | Verwijdert het object met de namespace‑URI uit de [XsltArgumentList](./). |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | Verwijdert de parameter uit de [XsltArgumentList](./). |
| [XsltArgumentList](./xsltargumentlist/)() | Implementeert een nieuw exemplaar van de [XsltArgumentList](./). |
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
