---
title: "System::Text::EncoderReplacementFallback sınıfı"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Font için C++"
description: "System::Text::EncoderReplacementFallback sınıfı. Hatalı sembolü bir geçici (stub) ile değiştirme geri dönüş stratejisi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1400
url: /tr/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


Hatalı sembolü bir yedek ile değiştiren bir geri dönüş stratejisi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Geri dönüş tamponu oluşturur. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | Varsayılan "?" değiştirme dizesini kullanan yapıcı. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | Yapıcı. |
| [get_DefaultString](./get_defaultstring/)() const | Değiştirme dizesini alır. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Örneğin döndürebileceği azami karakter sayısını alır. |
## Ayrıca Bakınız

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
