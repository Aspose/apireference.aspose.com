---
title: "System::Boolean klasse"
linktitle: "Boolean"
second_title: "Aspose.Page voor C++"
description: "System::Boolean klasse. Klasse die statische leden van het System.Boolean .Net-type in C++ bijhoudt."
type: docs
weight: 600
url: /nl/cpp/system/boolean/
---
## Boolean class


Klasse die statische leden van [System.Boolean](./) .[Net](../../system.net/) type bijhoudt.

```cpp
class Boolean
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Converteert de opgegeven string naar een waarde van het bool-type. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Converteert de opgegeven string naar een waarde van het bool-type. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [FalseString](./falsestring/) | [String](../string/) representatie van de booleaanse waarde 'false'. |
| static [TrueString](./truestring/) | [String](../string/) representatie van de booleaanse waarde 'true'. |
## Opmerkingen



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Maak de booleaanse variabele.
  bool isWeekend = false;

  // Ontleed de invoerstring en druk het resultaat af.
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

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
