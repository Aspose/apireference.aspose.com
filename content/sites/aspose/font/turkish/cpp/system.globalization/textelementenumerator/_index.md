---
title: "System::Globalization::TextElementEnumerator sınıfı"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Font için C++"
description: "System::Globalization::TextElementEnumerator sınıfı. Dize öğeleri (karakterler) üzerinde yineleme yapmak için enumerator. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2700
url: /tr/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


Dize öğeleri (karakterler) üzerinde yineleme yapmak için enumerator. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class TextElementEnumerator : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Current](./get_current/)() const | Geçerli metin öğesini alır. |
| [get_ElementIndex](./get_elementindex/)() const | Geçerli metin öğesinin dizinini alır. |
| [GetTextElement](./gettextelement/)() const | Geçerli öğeyi alır. |
| [MoveNext](./movenext/)() | Sonraki öğeye geçer. |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | Enumerator'ı başlangıç konumuna ayarlar. |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
