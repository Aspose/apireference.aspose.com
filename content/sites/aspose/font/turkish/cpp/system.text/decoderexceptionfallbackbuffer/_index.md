---
title: "System::Text::DecoderExceptionFallbackBuffer sınıfı"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "Aspose.Font için C++"
description: "System::Text::DecoderExceptionFallbackBuffer sınıfı. İstisna fırlatan kod çözme geri dönüş stratejisi için tampon. Aslında hiçbir şey depolamaz, ancak bunun yerine bir istisna fırlatır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmaktan kaçının, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | Yapıcı. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Kod çözme hatasını işler. |
| [get_Remaining](./get_remaining/)() const override | Kalan karakter sayısını alır. |
| [GetNextChar](./getnextchar/)() override | Sonraki kullanılabilir karakteri alır. |
| [MovePrevious](./moveprevious/)() override | Önceki karaktere hareket eder. |
## Ayrıca Bakınız

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
