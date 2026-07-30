---
title: "Classe System::Comparison"
linktitle: "Comparison"
second_title: "Aspose.Font per C++"
description: "Classe System::Comparison. Rappresenta un puntatore al metodo che confronta due oggetti dello stesso tipo. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 1300
url: /it/cpp/system/comparison/
---
## Comparison class


Rappresenta un puntatore al metodo che confronta due oggetti dello stesso tipo. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli oggetti che il metodo confronta |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Comparison](./comparison/)(Y) | Crea un'istanza del delegato [Comparison](./) che rappresenta il puntatore all'entità invocabile specificata. |
| [operator()](./operator()/)(T, T) | Invoca l'oggetto invocabile a cui punta l'oggetto corrente. |
## Osservazioni



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// La classe template che rappresenta un array dinamico.
template <typename T>
class MyArray
{
  // Utilizzata per memorizzare i dati dell'array.
  std::vector<T> m_data;

public:
  // Crea una nuova istanza del nostro array dinamico.
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // Utilizzata per ordinare i dati dell'array. Questo metodo accetta un'istanza di
  // 'System::Comparison' classe template.
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // Restituisce il numero di elementi che il nostro array dinamico memorizza.
  size_t get_Size()
  {
    return m_data.size();
  }

  // Utilizzato per ottenere un elemento all'indice specificato.
  T& operator[](int index)
  {
    if (index < 0 || index >= m_data.size())
    {
      throw IndexOutOfRangeException(u"index");
    }
    return m_data[index];
  }
};

int main() {
  // Crea un'istanza della classe MyArray con gli elementi specificati.
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // Ordina gli elementi in ordine crescente dell'array dinamico.
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // Stampa gli elementi dell'array dinamico.
  for (auto i = 0; i < arr.get_Size(); ++i)
  {
    Console::WriteLine(arr[i]);
  }

  return 0;
}
/*
This code example produces the following output:
a
b
c
d
e
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
