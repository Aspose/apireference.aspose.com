---
title: "System::Boolean clase"
linktitle: "Boolean"
second_title: "Aspose.Page para C++"
description: "System::Boolean clase. Clase que mantiene los miembros estáticos del tipo System.Boolean .Net en C++."
type: docs
weight: 600
url: /es/cpp/system/boolean/
---
## Boolean class


Clase que mantiene los miembros estáticos del tipo [System.Boolean](./) .[Net](../../system.net/).

```cpp
class Boolean
```

## Métodos

| Método | Descripción |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Convierte la cadena especificada a un valor del tipo bool. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Convierte la cadena especificada a un valor del tipo bool. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [FalseString](./falsestring/) | Representación de [String](../string/) del valor booleano 'false'. |
| static [TrueString](./truestring/) | Representación de [String](../string/) del valor booleano 'true'. |
## Observaciones



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Crea la variable booleana.
  bool isWeekend = false;

  // Analiza la cadena de entrada e imprime el resultado.
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

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
