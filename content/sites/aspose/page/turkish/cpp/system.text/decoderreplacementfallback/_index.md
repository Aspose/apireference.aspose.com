---
title: "System::Text::DecoderReplacementFallback sınıfı"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Page için C++"
description: "System::Text::DecoderReplacementFallback sınıfı. Hatalı sembolü bir yedekle (stub) değiştirerek bir geri dönüş stratejisi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığın üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirin."
type: docs
weight: 700
url: /tr/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


Hatalı sembolü bir yedekle (stub) değiştirerek bir geri dönüş stratejisi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığın üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Geri dönüş tamponu oluşturur. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | Varsayılan "?" değiştirme dizesini kullanan yapıcı. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | Yapıcı. |
| [get_DefaultString](./get_defaultstring/)() const | Değiştirme dizesini alır. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Örneğin döndürebileceği azami karakter sayısını alır. |
## Ayrıca Bakınız

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
