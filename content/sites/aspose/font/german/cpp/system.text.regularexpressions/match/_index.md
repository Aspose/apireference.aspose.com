---
title: "System::Text::RegularExpressions::Match Klasse"
linktitle: "Match"
second_title: "Aspose.Font für C++"
description: "System::Text::RegularExpressions::Match Klasse. Einzelner Treffer eines regulären Ausdrucks in einem String. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Fügt eine Erfassung zum Treffer hinzu. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Fügt eine Gruppe zum Treffer hinzu. |
| static [get_Empty](./get_empty/)() | Zugriff auf leeren Treffer. |
| [get_Groups](./get_groups/)() | Ruft die Gruppenliste ab. |
| [Match](./match/)(const UStringPtr\&, int, int) | Konstruktor. |
| [NextMatch](./nextmatch/)() | Iteration über Treffer. |
| virtual [Result](./result/)(const String\&) | Formatiert einen String, indem Submatch-Referenzen durch ihre Werte ersetzt werden. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## Siehe auch

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
