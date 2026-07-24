---
title: "System::Comparison klasse"
linktitle: "Comparison"
second_title: "Aspose.Page voor C++"
description: "System::Comparison‑klasse. Vertegenwoordigt een pointer naar de methode die twee objecten van hetzelfde type vergelijkt. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr‑klasse om objecten van dit type te beheren in C++."
type: docs
weight: 1300
url: /nl/cpp/system/comparison/
---
## Comparison class


Vertegenwoordigt een pointer naar de methode die twee objecten van hetzelfde type vergelijkt. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/)‑klasse om objecten van dit type te beheren.

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de objecten die de methode vergelijkt |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Comparison](./comparison/)(Y) | Construeert een instantie van de [Comparison](./)‑delegate die de pointer naar de opgegeven aanroepbare entiteit vertegenwoordigt. |
| [operator()](./operator()/)(T, T) | Roep het aanroepbare object aan waar de huidige instantie naar wijst. |
## Opmerkingen



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// De sjabloonklasse die een dynamische array vertegenwoordigt.
template <typename T>
class MyArray
{
  // Wordt gebruikt om de array‑gegevens op te slaan.
  std::vector<T> m_data;

public:
  // Construeert een nieuwe instantie van onze dynamische array.
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // Wordt gebruikt om de array‑gegevens te sorteren. Deze methode accepteert een instantie van de
  // 'System::Comparison'‑sjabloonklasse.
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // Retourneert het aantal elementen dat onze dynamische array opslaat.
  size_t get_Size()
  {
    return m_data.size();
  }

  // Wordt gebruikt om een element op de opgegeven index te verkrijgen.
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
  // Maak een instantie van de MyArray‑klasse met de opgegeven elementen.
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // Sorteer de elementen van de dynamische array oplopend.
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // Print de elementen van de dynamische array.
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

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
