---
title: "System::Text::DecoderFallback sınıfı"
linktitle: "DecoderFallback"
second_title: "Aspose.Page için C++"
description: "System::Text::DecoderFallback sınıfı. Kod çözme hatasını ele almak için geri dönüş API'si sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 500
url: /tr/cpp/system.text/decoderfallback/
---
## DecoderFallback class


Kod çözme hatasını ele almak için geri dönüş API'si sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class DecoderFallback : public System::Object
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
