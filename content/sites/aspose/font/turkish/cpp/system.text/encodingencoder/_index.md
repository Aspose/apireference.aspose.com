---
title: "System::Text::EncodingEncoder sınıfı"
linktitle: "EncodingEncoder"
second_title: "Aspose.Font için C++"
description: "System::Text::EncodingEncoder sınıfı. Kodlama için kodlama nesnesini kullanan bir kodlayıcı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1800
url: /tr/cpp/system.text/encodingencoder/
---
## EncodingEncoder class


[Encoder](../encoder/) that uses encoding object for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncodingEncoder : public System::Text::Encoder
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Karakterleri baytlara dönüştürür. |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Karakterleri baytlara dönüştürür. |
## Ayrıca Bakınız

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
