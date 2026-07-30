---
title: "System::Comparison sınıfı"
linktitle: "Karşılaştırma"
second_title: "Aspose.Font için C++"
description: "System::Comparison sınıfı. Aynı türdeki iki nesneyi karşılaştıran yönteme işaretçi temsil eder. Bu tür yığına (stack) tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tür nesneleri yönetmek için C++'ta System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 1300
url: /tr/cpp/system/comparison/
---
## Comparison class


Aynı türdeki iki nesneyi karşılaştıran yönteme işaretçi temsil eder. Bu tür yığına tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tür nesneleri yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| Parametre | Açıklama |
| --- | --- |
| T | Yöntemin karşılaştırdığı nesnelerin türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Comparison](./comparison/)(Y) | Belirtilen çalıştırılabilir varlığa işaretçi temsil eden bir [Comparison](./) temsilcisi örneği oluşturur. |
| [operator()](./operator()/)(T, T) | Mevcut nesne tarafından işaret edilen çalıştırılabilir nesneyi çağırır. |
## Açıklamalar



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// Dinamik bir dizi temsil eden şablon sınıfı.
template <typename T>
class MyArray
{
  // Dizi verilerini depolamak için kullanılır.
  std::vector<T> m_data;

public:
  // Dinamik dizimizin yeni bir örneğini oluşturur.
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // Dizi verilerini sıralamak için kullanılır. Bu yöntem, şunun bir örneğini kabul eder:
  // 'System::Comparison' şablon sınıfı.
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // Dinamik dizimizin sakladığı öğe sayısını döndürür.
  size_t get_Size()
  {
    return m_data.size();
  }

  // Belirtilen indeksteki bir öğeyi almak için kullanılır.
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
  // Belirtilen öğelerle MyArray sınıfının bir örneğini oluştur.
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // Dinamik dizinin öğelerini artan sırayla sıralar.
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // Dinamik dizinin öğelerini yazdır.
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

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
