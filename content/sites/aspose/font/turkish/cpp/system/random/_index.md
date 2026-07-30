---
title: "System::Random sınıfı"
linktitle: "Random"
second_title: "Aspose.Font için C++"
description: "System::Random sınıfı. Sahte rastgele sayı üreteci temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 5200
url: /tr/cpp/system/random/
---
## Random class


Sahte rastgele sayı üreteci temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class Random : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [IsNull](./isnull/)() const | Her zaman false döndürür. |
| virtual [Next](./next/)() | int32 maksimum değerinden daha küçük, negatif olmayan bir rastgele sayı döndürür. |
| virtual [Next](./next/)(int32_t) | Belirtilen maksimum değerden daha küçük, negatif olmayan bir rastgele sayı döndürür. |
| virtual [Next](./next/)(int32_t, int32_t) | Belirtilen aralık içinde bir rastgele sayı döndürür. |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | Belirtilen bayt dizisinin elemanlarını rastgele sayılarla doldurur. |
| virtual [NextDouble](./nextdouble/)() | 0.0 ile 1.0 arasında bir rastgele sayı döndürür. |
| [Random](./random/)() | Zaman bağımlı varsayılan tohum değeri kullanarak yeni bir örnek başlatır. |
| [Random](./random/)(int32_t) | Belirtilen tohum değerini kullanarak [System.Random](./) sınıfının yeni bir örneğini başlatır. |
## Açıklamalar



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // Rastgele bir ay numarası al ve yazdır.
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // Diziyi rastgele sayılarla doldur.
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // Diziyi yazdır.
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

## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
