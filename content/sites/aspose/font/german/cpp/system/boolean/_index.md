---
title: "System::Boolean class"
linktitle: "Boolean"
second_title: "Aspose.Font für C++"
description: "System::Boolean class. Klasse, die statische Mitglieder des System.Boolean .Net Typs in C++ enthält."
type: docs
weight: 600
url: /de/cpp/system/boolean/
---
## Boolean class


Klasse, die statische Mitglieder des Typs [System.Boolean](./) .[Net](../../system.net/) enthält.

```cpp
class Boolean
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Konvertiert die angegebene Zeichenkette in einen Wert des bool-Typs. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Konvertiert die angegebene Zeichenkette in einen Wert des bool-Typs. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [FalseString](./falsestring/) | [String](../string/) Darstellung des booleschen Werts 'false'. |
| static [TrueString](./truestring/) | [String](../string/) Darstellung des booleschen Werts 'true'. |
## Hinweise



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Erstelle die boolesche Variable.
  bool isWeekend = false;

  // Parse die Eingabezeichenkette und gib das Ergebnis aus.
  if (Boolean::TryParse(u"True", isWeekend))
  {
    std::cout << "Is weekend: " << (isWeekend ? "Yes" : "No");
  }
  else
  {
    std::cerr << "Something went wrong" << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
Is weekend: Yes
*/
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
