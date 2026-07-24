---
title: "System::Collections::Generic::BaseEnumerator sınıfı"
linktitle: "BaseEnumerator"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::BaseEnumerator sınıfı. STL tarzı tipleri C# tarzı kullanım için sarmalayan bir Enumerator tanımı. Sıralı yineleyicinin varlığı dışındaki konteyner yapısı hakkında hiçbir varsayım yapmaz. begin() ve end() fonksiyonlarını kullanır. Bu sınıfın nesneleri yalnızca System::MakeObject() fonksiyonu ile ayrılmalıdır. Bu türün örneğini yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçmek için kullanın."
type: docs
weight: 600
url: /tr/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| Parameter | Açıklama |
| --- | --- |
| Kapsayıcı | STL tarzı konteyner türü. |
| Element | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | İteratörü başlatır. |
| [IsValid](./isvalid/)() const | [MoveNext()](./movenext/) çağrılıp çağrılmadığını ve sonun ulaşılmadığını kontrol eder. |
| [MoveNext](./movenext/)() override | Enumerator tarzı artırma. |
| [Reset](./reset/)() override | Elemanları yeniden saymak için enumerator'ı sıfırlar. |

## Ayrıca Bakınız

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
