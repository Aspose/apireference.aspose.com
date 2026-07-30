---
title: "System::Text::Decoder sınıfı"
linktitle: "Decoder"
second_title: "Aspose.Font için C++"
description: "System::Text::Decoder sınıfı. Bayt dizisini karakter dizisine dönüştürmeyi kapsüller. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.text/decoder/
---
## Decoder class


Bayt dizisini karakter dizisine dönüştürmeyi kapsüller. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Decoder : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Baytları karakterlere dönüştürür. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Baytları karakterlere dönüştürür. |
| [get_Fallback](./get_fallback/)() const | Hata işleme geri dönüşünü alır. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Geri dönüş tamponunu alır. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Bir tamponu çözmek için gereken karakter sayısını alır. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Bir tamponu çözmek için gereken karakter sayısını alır. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Bir tamponu çözmek için gereken karakter sayısını alır. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Bir tamponun çözülmesinden elde edilen karakterleri al. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Bir tamponun çözülmesinden elde edilen karakterleri al. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Bir tamponun çözülmesinden elde edilen karakterleri al. |
| virtual [Reset](./reset/)() | Kod çözücünün iç durumunu temizler. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | Hata işleme geri dönüşünü ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
