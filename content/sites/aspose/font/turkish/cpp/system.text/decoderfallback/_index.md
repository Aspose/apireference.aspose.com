---
title: "System::Text::DecoderFallback sınıfı"
linktitle: "DecoderFallback"
second_title: "Aspose.Font için C++"
description: "System::Text::DecoderFallback sınıfı. Kod çözme hatalarını ele almak için geri dönüş API'si sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 500
url: /tr/cpp/system.text/decoderfallback/
---
## DecoderFallback class


Kod çözme hatasını işlemek için fallback API'si sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class DecoderFallback : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Fallback algoritmasıyla ilişkili tamponu alır. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Varsayılan istisna fallback uygulamasını alır. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Fallback tarafından döndürülebilecek azami karakter sayısını alır. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Varsayılan değiştirme fallback uygulamasını alır. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Varsayılan standart güvenli fallback uygulamasını alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
