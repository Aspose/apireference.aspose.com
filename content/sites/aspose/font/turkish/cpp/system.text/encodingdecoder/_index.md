---
title: "System::Text::EncodingDecoder sınıfı"
linktitle: "EncodingDecoder"
second_title: "Aspose.Font için C++"
description: "System::Text::EncodingDecoder sınıfı. Kodlama nesnesini çözümleme için kullanan bir çözücü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1700
url: /tr/cpp/system.text/encodingdecoder/
---
## EncodingDecoder class


[Decoder](../decoder/) that uses encoding object for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncodingDecoder : public System::Text::Decoder
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) override | Baytları karakterlere dönüştürür. |
| [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) override | Baytları karakterlere dönüştürür. |
## Ayrıca Bakınız

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
