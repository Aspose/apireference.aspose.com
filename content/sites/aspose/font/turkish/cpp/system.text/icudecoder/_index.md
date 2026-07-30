---
title: "System::Text::ICUDecoder sınıfı"
linktitle: "ICUDecoder"
second_title: "Aspose.Font için C++"
description: "System::Text::ICUDecoder sınıfı. Kod çözme için ICU kullanan bir çözücüdür. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2000
url: /tr/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Baytları karakterlere dönüştürür. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Baytları karakterlere dönüştürür. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Bir tamponu çözmek için gereken karakter sayısını alır. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Bir tamponu çözmek için gereken karakter sayısını alır. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Bir tamponu çözmek için gereken karakter sayısını alır. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Bir tamponun çözülmesinden elde edilen karakterleri al. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Bir tamponun çözülmesinden elde edilen karakterleri al. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Bir tamponun çözülmesinden elde edilen karakterleri al. |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | Yapıcı. |
| virtual [Reset](./reset/)() | İç değişkenleri başlangıç durumuna ayarlar. |
| virtual [~ICUDecoder](./~icudecoder/)() | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Base](./base/) | [Base](./base/) türü. |
## Ayrıca Bakınız

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
