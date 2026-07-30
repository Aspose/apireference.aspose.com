---
title: "classe System::Comparison"
linktitle: "Comparison"
second_title: "Aspose.Font pour C++"
description: "classe System::Comparison. Représente un pointeur vers la méthode qui compare deux objets du même type. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 1300
url: /fr/cpp/system/comparison/
---
## Comparison class


Représente un pointeur vers la méthode qui compare deux objets du même type. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| Paramètre | Description |
| --- | --- |
| T | Le type des objets que la méthode compare |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Comparison](./comparison/)(Y) | Construit une instance du délégué [Comparison](./) qui représente le pointeur vers l'entité invoquable spécifiée. |
| [operator()](./operator()/)(T, T) | Invoque l'objet invoquable pointé par l'objet actuel. |
## Remarques



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// La classe modèle qui représente un tableau dynamique.
template <typename T>
class MyArray
{
  // Utilisée pour stocker les données du tableau.
  std::vector<T> m_data;

public:
  // Construit une nouvelle instance de notre tableau dynamique.
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // Utilisée pour trier les données du tableau. Cette méthode accepte une instance de la
  // classe modèle 'System::Comparison'.
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // Renvoie le nombre d'éléments que notre tableau dynamique stocke.
  size_t get_Size()
  {
    return m_data.size();
  }

  // Utilisée pour obtenir un élément à l'index spécifié.
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
  // Créez une instance de la classe MyArray avec les éléments spécifiés.
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // Trier par ordre croissant les éléments du tableau dynamique.
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // Imprimez les éléments du tableau dynamique.
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

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
