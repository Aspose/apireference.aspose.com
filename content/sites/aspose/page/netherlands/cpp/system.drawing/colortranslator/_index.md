---
title: "System::Drawing::ColorTranslator klasse"
linktitle: "ColorTranslator"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::ColorTranslator klasse. Voert kleuroversetzingen uit. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een exemplaar van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om het als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.drawing/colortranslator/
---
## ColorTranslator class


Voert kleuroversetzingen uit. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een exemplaar van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven.

```cpp
class ColorTranslator
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [FromHtml](./fromhtml/)(const System::String\&) | Converteert de opgegeven HTML-kleurrepresentatie naar het equivalente [Color](../color/) object. |
| static [FromWin32](./fromwin32/)(int) | Converteert de opgegeven [Windows](../../system.windows/) kleur naar het equivalente [Color](../color/) object. |
| static [ToHtml](./tohtml/)(const Color\&) | Converteert het opgegeven [Color](../color/) object naar de tekenreeksrepresentatie van de equivalente HTML-kleur. |
## Zie ook

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
