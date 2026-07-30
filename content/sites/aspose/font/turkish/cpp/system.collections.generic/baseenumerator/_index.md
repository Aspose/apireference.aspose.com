---
title: "System::Collections::Generic::BaseEnumerator sınıfı"
linktitle: "BaseEnumerator"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::BaseEnumerator sınıfı. STL tarzı tipleri C# tarzı kullanım için saran bir Enumerator tanımı. Sıralı yineleyicinin varlığı dışında konteyner yapısı hakkında hiçbir doğrulama yapmaz. begin() ve end() işlevlerini kullanır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 600
url: /tr/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| Parametre | Açıklama |
| --- | --- |
| Container | STL tarzı konteyner türü. |
| Element | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | Yineleyiciyi başlatır. |
| [IsValid](./isvalid/)() const | [MoveNext()](./movenext/) çağrılıp çağrılmadığını ve sonun ulaşılmadığını kontrol eder. |
| [MoveNext](./movenext/)() override | Yineleyici tarzı artış. |
| [Reset](./reset/)() override | Elemanları yeniden yinelemek için yineleyiciyi sıfırlar. |

## Ayrıca Bakınız

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
