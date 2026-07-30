---
title: "classe System::Boolean"
linktitle: "Booleano"
second_title: "Aspose.Font per C++"
description: "classe System::Boolean. Classe che conserva i membri statici del tipo System.Boolean .Net in C++."
type: docs
weight: 600
url: /it/cpp/system/boolean/
---
## Boolean class


Classe che conserva i membri statici del tipo [System.Boolean](./) .[Net](../../system.net/).

```cpp
class Boolean
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Converte la stringa specificata in un valore di tipo bool. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Converte la stringa specificata in un valore di tipo bool. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [FalseString](./falsestring/) | Rappresentazione [String](../string/) del valore booleano 'false'. |
| static [TrueString](./truestring/) | Rappresentazione [String](../string/) del valore booleano 'true'. |
## Osservazioni



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Crea la variabile booleana.
  bool isWeekend = false;

  // Analizza la stringa di input e stampa il risultato.
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

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
