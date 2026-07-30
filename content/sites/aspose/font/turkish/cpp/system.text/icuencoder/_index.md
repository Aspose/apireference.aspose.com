---
title: "System::Text::ICUEncoder sınıfı"
linktitle: "ICUEncoder"
second_title: "Aspose.Font için C++"
description: "System::Text::ICUEncoder sınıfı. Kodlama için ICU kullanan bir kodlayıcı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2100
url: /tr/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Karakterleri baytlara dönüştürür. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Karakterleri baytlara dönüştürür. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Bir tamponu kodlamak için gereken bayt sayısını alır. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Bir tamponu kodlamak için gereken bayt sayısını alır. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Bir tamponun kodlanmasından elde edilen baytları al. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Bir tamponun kodlanmasından elde edilen baytları al. |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | Yapıcı. |
| virtual [Reset](./reset/)() | İç değişkenleri başlangıç durumuna ayarlar. |
| [~ICUEncoder](./~icuencoder/)() | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Base](./base/) | [Base](./base/) türü. |
## Ayrıca Bakınız

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
