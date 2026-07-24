---
title: "System::Boolean class"
linktitle: "Boolesk"
second_title: "Aspose.Page för C++"
description: "System::Boolean class. Klass som behåller statiska medlemmar av System.Boolean .Net-typen i C++."
type: docs
weight: 600
url: /sv/cpp/system/boolean/
---
## Boolean class


Klass som behåller statiska medlemmar av [System.Boolean](./) .[Net](../../system.net/) typ.

```cpp
class Boolean
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Konverterar den angivna strängen till ett värde av bool-typ. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Konverterar den angivna strängen till ett värde av bool-typ. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [FalseString](./falsestring/) | [String](../string/) representation av det boolska värdet 'false'. |
| static [TrueString](./truestring/) | [String](../string/) representation av det boolska värdet 'true'. |
## Anmärkningar



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Skapa den boolska variabeln.
  bool isWeekend = false;

  // Analysera indatasträngen och skriv ut resultatet.
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

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
