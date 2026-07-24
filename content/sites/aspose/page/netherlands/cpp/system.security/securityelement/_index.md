---
title: "System::Security::SecurityElement klasse"
linktitle: "SecurityElement"
second_title: "Aspose.Page voor C++"
description: "System::Security::SecurityElement klasse. XML-objectmodel voor het coderen van beveiligingsobjecten. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 300
url: /nl/cpp/system.security/securityelement/
---
## SecurityElement class


XML-objectmodel voor het coderen van beveiligingsobjecten. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class SecurityElement : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | Voegt een attribuut toe aan tag. |
| [AddChild](./addchild/)(SecurityElement) | Voegt een kind-tag toe. |
| [Attribute](./attribute/)(const String\&) | Haalt attribuutwaarde op. |
| [Copy](./copy/)() | Kloont tag. |
| [Equal](./equal/)(SecurityElement) | Controleert op gelijkheid van parameters. |
| static [Escape](./escape/)(const String\&) | Escapet tekens in XML-string. |
| static [FromString](./fromstring/)(const String\&) | Maakt element aan vanuit XML-code. |
| [get_Attributes](./get_attributes/)() | Haalt tag-attributen op. |
| [get_Children](./get_children/)() | Haalt kindobjecten van tag op. |
| [get_Tag](./get_tag/)() | Haalt tagnaam op. |
| [get_Text](./get_text/)() | Haalt de binnenste tekst van de tag op. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | Controleert of de attribuutnaam geldig is. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | Controleert of de attribuutwaarde geldig is. |
| static [IsValidTag](./isvalidtag/)(const String\&) | Controleert of de tag geldig is. |
| static [IsValidText](./isvalidtext/)(const String\&) | Controleert of de tekst geldig is. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | Haalt kindtag op op naam. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | Haalt de binnenste tekst van een kindtag op op tagnaam. |
| [SecurityElement](./securityelement/)(const String\&) | Constructor. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | Constructor. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | Stelt tag-attributen in. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | Stelt kindobjecten van de tag in. |
| [set_Tag](./set_tag/)(const String\&) | Stelt de tagnaam in. |
| [set_Text](./set_text/)(const String\&) | Stelt de binnenste tekst van de tag in. |
| [ToString](./tostring/)() const override | Converteert tag naar string. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
