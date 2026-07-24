---
title: "System::Globalization::TextElementEnumerator klasse"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::TextElementEnumerator klasse. Enumerator om door tekenreeks-elementen (tekens) te itereren. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2700
url: /nl/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


Enumerator om door tekenreeks-elementen (tekens) te itereren. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class TextElementEnumerator : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Current](./get_current/)() const | Haalt het huidige textelement op. |
| [get_ElementIndex](./get_elementindex/)() const | Haalt de index van het huidige textelement op. |
| [GetTextElement](./gettextelement/)() const | Haalt het huidige element op. |
| [MoveNext](./movenext/)() | Verplaatst zich naar het volgende element. |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | Stelt de enumerator in op de beginpositie. |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
