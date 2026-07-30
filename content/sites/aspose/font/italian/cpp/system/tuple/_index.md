---
title: "classe System::Tuple"
linktitle: "Tuple"
second_title: "Aspose.Font per C++"
description: "classe System::Tuple. Classe che rappresenta una struttura dati tuple. Il numero massimo di elementi è 8 in C++."
type: docs
weight: 6400
url: /it/cpp/system/tuple/
---
## Tuple class


Classe che rappresenta una struttura dati tuple. Il numero massimo di elementi è 8.

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| Parametro | Descrizione |
| --- | --- |
| Argomenti | I tipi degli elementi della tupla. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Determina se l'oggetto corrente e quello specificato sono identici. |
| [get_Item](./get_item/)() const | Ottiene il valore del componente dell'oggetto [Tuple](./). |
| [Tuple](./tuple/)(Args...) | Costruisce un oggetto tuple. |
## Osservazioni



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::MakeObject<System::Tuple<int, int, int>>(32, 16, 128);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 32
Item 2: 16
Item 3: 128
*/
```

## Vedi anche

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
