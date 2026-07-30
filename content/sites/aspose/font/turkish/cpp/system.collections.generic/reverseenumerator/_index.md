---
title: "System::Collections::Generic::ReverseEnumerator sınıfı"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::ReverseEnumerator sınıfı. Konteyner içinde ters yönde yineleme yapan yineleyici. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 3800
url: /tr/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| Parametre | Açıklama |
| --- | --- |
| Container | İçinden geçilecek konteyner. |
| Element | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Current](./get_current/)() const override | 'current' öğesini alır. |
| [IsValid](./isvalid/)() const | [MoveNext()](./movenext/) çağrılıp çağrılmadığını ve sonun ulaşılmadığını kontrol eder. |
| [MoveNext](./movenext/)() override | Yineleyici tarzı artış. |
| [Reset](./reset/)() override | Elemanları yeniden yinelemek için yineleyiciyi sıfırlar. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | Yineleyiciyi başlatır. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | Yıkıcı. |

## Ayrıca Bakınız

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
