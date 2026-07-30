---
title: "System::Text::EncoderReplacementFallbackBuffer sınıfı"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "Aspose.Font için C++"
description: "System::Text::EncoderReplacementFallbackBuffer sınıfı. Kodlama geri dönüş stratejisini değiştirmek için tampon. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1500
url: /tr/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | Yapıcı. |
| [Fallback](./fallback/)(char_t, int) override | Kodlama hatasını işler. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Kodlama hatasını işler. |
| [get_Remaining](./get_remaining/)() const override | Tampondaki kalan karakter sayısını alır. |
| [GetNextChar](./getnextchar/)() override | Sonraki kullanılabilir karakteri alır. |
| [MovePrevious](./moveprevious/)() override | Önceki karaktere hareket eder. |
| [Reset](./reset/)() override | Tamponu başlangıç durumuna sıfırlar ([Fallback()](./fallback/) çağrısından önce). |
## Ayrıca Bakınız

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
