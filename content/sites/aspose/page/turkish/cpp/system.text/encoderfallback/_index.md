---
title: "System::Text::EncoderFallback sınıfı"
linktitle: "EncoderFallback"
second_title: "Aspose.Page için C++"
description: "System::Text::EncoderFallback sınıfı. Kodlama hatasını ele almak için geri dönüş API'si sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1200
url: /tr/cpp/system.text/encoderfallback/
---
## EncoderFallback class


Kodlama hatasını ele almak için geri dönüş API'si sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class EncoderFallback : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Geri dönüş algoritmasıyla ilişkili tamponu alır. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Varsayılan istisna geri dönüş uygulamasını alır. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Geri dönüş tarafından döndürülebilecek azami karakter sayısını alır. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Varsayılan yerine koyma geri dönüş uygulamasını alır. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Varsayılan standart güvenli geri dönüş uygulamasını alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
