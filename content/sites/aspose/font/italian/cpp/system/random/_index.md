---
title: "Classe System::Random"
linktitle: "Random"
second_title: "Aspose.Font per C++"
description: "Classe System::Random. Rappresenta un generatore di numeri pseudo-casuali. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 5200
url: /it/cpp/system/random/
---
## Random class


Rappresenta un generatore di numeri pseudo-casuali. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Random : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [IsNull](./isnull/)() const | Restituisce sempre false. |
| virtual [Next](./next/)() | Restituisce un numero casuale non negativo inferiore al valore massimo int32. |
| virtual [Next](./next/)(int32_t) | Restituisce un numero casuale non negativo inferiore al massimo specificato. |
| virtual [Next](./next/)(int32_t, int32_t) | Restituisce un numero casuale entro l'intervallo specificato. |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | Riempie gli elementi dell'array di byte specificato con numeri casuali. |
| virtual [NextDouble](./nextdouble/)() | Restituisce un numero casuale compreso tra 0.0 e 1.0. |
| [Random](./random/)() | Inizializza una nuova istanza, utilizzando un valore di seme predefinito dipendente dal tempo. |
| [Random](./random/)(int32_t) | Inizializza una nuova istanza della classe [System.Random](./), utilizzando il valore di seme specificato. |
## Osservazioni



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // Ottieni un numero di mese casuale e stampalo.
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // Riempire l'array con numeri casuali.
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // Stampa l'array.
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
