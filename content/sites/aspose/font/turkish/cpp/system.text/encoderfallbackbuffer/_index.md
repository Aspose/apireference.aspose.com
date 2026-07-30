---
title: "System::Text::EncoderFallbackBuffer sınıfı"
linktitle: "EncoderFallbackBuffer"
second_title: "Aspose.Font için C++"
description: "System::Text::EncoderFallbackBuffer sınıfı. Geri dönüş uygulaması için tampon sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1300
url: /tr/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


Geri dönüş uygulaması için tampon sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class EncoderFallbackBuffer : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | Gerçek geri dönüş prosedürünü uygular. |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | Gerçek geri dönüş prosedürünü uygular. |
| virtual [get_Remaining](./get_remaining/)() const | İşlenecek kalan karakter sayısını alır. |
| virtual [GetNextChar](./getnextchar/)() | Geri dönüş tamponundaki bir sonraki karakteri çıkarır. |
| virtual [MovePrevious](./moveprevious/)() | Mümkünse tampon konumunu bir adım geri hareket ettirir. |
| virtual [Reset](./reset/)() | Tamponu başlangıç durumuna sıfırlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
