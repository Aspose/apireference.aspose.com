---
title: "System::Text::RegularExpressions::Group class"
linktitle: "Group"
second_title: "Aspose.Page voor C++"
description: "System::Text::RegularExpressions::Group class. Resultaat van een overeenkomst uitgevoerd door een enkele capture-groep. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.text.regularexpressions/group/
---
## Group class


Resultaat van een overeenkomst uitgevoerd door een enkele capture-groep. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Voegt capture toe aan groep. |
| [get_Captures](./get_captures/)() | Haalt beschikbare captures op. |
| [get_Success](./get_success/)() | Controleert of capture succesvol was voor deze groep. |
| [Group](./group/)(const UStringPtr\&, int, int) | Constructor. |
| [Group](./group/)() | Constructor van lege groep. |
## Zie ook

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
