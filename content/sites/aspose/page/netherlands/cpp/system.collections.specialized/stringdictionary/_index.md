---
title: "System::Collections::Specialized::StringDictionary klasse"
linktitle: "StringDictionary"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Specialized::StringDictionary klasse. String-naar-string woordenboek. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 500
url: /nl/cpp/system.collections.specialized/stringdictionary/
---
## StringDictionary class


[String](../../system/string/) to string dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class StringDictionary : public System::Collections::Generic::Dictionary<String, String>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const override | Haalt de waarde op bij een specifieke sleutel. |
## Zie ook

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
