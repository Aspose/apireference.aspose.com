---
title: "System::Text::DecoderExceptionFallback sınıfı"
linktitle: "DecoderExceptionFallback"
second_title: "Aspose.Font için C++"
description: "System::Text::DecoderExceptionFallback sınıfı. İstisna fırlatan bir geri dönüş stratejisi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.text/decoderexceptionfallback/
---
## DecoderExceptionFallback class


İstisna fırlatan bir geri dönüş stratejisi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class DecoderExceptionFallback : public System::Text::DecoderFallback
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Geri dönüş tamponu oluşturur. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Örneğin döndürebileceği azami karakter sayısını alır. |
## Ayrıca Bakınız

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
