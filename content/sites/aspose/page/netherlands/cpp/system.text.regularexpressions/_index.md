---
title: "System::Text::RegularExpressions namespace"
linktitle: "System::Text::RegularExpressions"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de System::Text::RegularExpressions namespace in C++."
type: docs
weight: 6400
url: /nl/cpp/system.text.regularexpressions/
---



## Klassen

| Klasse | Beschrijving |
| --- | --- |
| [Capture](./capture/) | Resultaat van een enkele subexpressie-overeenkomst. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven. |
| [CaptureCollection](./capturecollection/) | Lijst van captures uitgevoerd door een enkele capture-groep. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven. |
| [Group](./group/) | Resultaat van de overeenkomst uitgevoerd door een enkele capture-groep. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [GroupCollection](./groupcollection/) | Lijst van capture-groepen in één overeenkomst. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [GroupCollectionPtr](./groupcollectionptr/) | [Group](./group/) collectie-pointer. Dit type is een pointer om de verwijdering van andere objecten te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const-referentie. |
| [Match](./match/) | [Single](../system/single/) overeenkomst van regexp over een string. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [MatchCollection](./matchcollection/) | Collectie van overeenkomsten verkregen door herhaaldelijk een regexp toe te passen op een string. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [Regex](./regex/) | Reguliere expressie die C#-achtige syntaxis volgt. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
## Enums

| Enum | Beschrijving |
| --- | --- |
| [RegexOptions](./regexoptions/) | [Regex](./regex/) opties. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [CaptureCollectionPtr](./capturecollectionptr/) | Pointer naar capture-collectie. |
| [CapturePtr](./captureptr/) | Pointer naar enkel capture-object. |
| [GroupPtr](./groupptr/) | Pointer naar groep. |
| [MatchCollectionPtr](./matchcollectionptr/) | [Match](./match/) collectie-pointer. |
| [MatchEvaluator](./matchevaluator/) | Delegate-type om een overeenkomst te evalueren. |
| [MatchPtr](./matchptr/) | [Match](./match/) pointer. |
| [RegexPtr](./regexptr/) | [Regex](./regex/) pointer. |
| [UStringPtr](./ustringptr/) | Gedeelde UnicodeString om kopiëren te voorkomen. |
