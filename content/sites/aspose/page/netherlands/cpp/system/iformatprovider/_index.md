---
title: "System::IFormatProvider klasse"
linktitle: "IFormatProvider"
second_title: "Aspose.Page voor C++"
description: "System::IFormatProvider klasse. Definieert een methode die opmaak‑informatie levert. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 3800
url: /nl/cpp/system/iformatprovider/
---
## IFormatProvider class


Definieert een methode die opmaak‑informatie levert. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class IFormatProvider : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | Retourneert een object dat opmaak‑services levert voor het opgegeven type. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
