---
title: "System::Text::RegularExpressions::Match class"
linktitle: "Match"
second_title: "Aspose.Page voor C++"
description: "System::Text::RegularExpressions::Match class. Enkele overeenkomst van een regexp over een string. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Voegt een capture toe aan de overeenkomst. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Voegt een groep toe aan de overeenkomst. |
| static [get_Empty](./get_empty/)() | Lege overeenkomst accessor. |
| [get_Groups](./get_groups/)() | Haalt de groepslijst op. |
| [Match](./match/)(const UStringPtr\&, int, int) | Constructor. |
| [NextMatch](./nextmatch/)() | Iteratie over overeenkomsten. |
| virtual [Result](./result/)(const String\&) | Formatteert een string door submatch-referenties te vervangen door hun waarden. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## Zie ook

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
