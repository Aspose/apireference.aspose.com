---
title: "System::Text::EncoderExceptionFallbackBuffer sınıfı"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Font için C++"
description: "System::Text::EncoderExceptionFallbackBuffer sınıfı. İstisna fırlatan kodlama geri dönüş stratejisi için tampon. Aslında hiçbir şey depolamaz, bunun yerine istisna fırlatır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1100
url: /tr/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | Yapıcı. |
| [Fallback](./fallback/)(char_t, int) override | Kodlama hatasını işler. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Kodlama hatasını işler. |
| [get_Remaining](./get_remaining/)() const override | Kalan karakter sayısını alır. |
| [GetNextChar](./getnextchar/)() override | Sonraki kullanılabilir karakteri alır. |
| [MovePrevious](./moveprevious/)() override | Önceki karaktere hareket eder. |
## Ayrıca Bakınız

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
