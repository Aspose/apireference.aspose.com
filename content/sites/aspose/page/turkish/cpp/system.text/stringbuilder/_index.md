---
title: "System::Text::StringBuilder sınıfı"
linktitle: "StringBuilder"
second_title: "Aspose.Page için C++"
description: "System::Text::StringBuilder sınıfı. Dizeyi parça parça biriktirmek için tampon. Bu tür, değer tipi olarak yığında ya da System::MakeObject() işlevi kullanılarak yığında (heap) tahsis edilebilir. Nesne tahsis edildikten sonra, bu iki kullanım durumunu asla karıştırmayın: yığında tahsis edilen nesnelere SmartPtr işaretçileri sahip olmak C++'ta kesinlikle yasaktır."
type: docs
weight: 2400
url: /tr/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Append](./append/)(char_t) | Yapıcıya karakter ekler. |
| [Append](./append/)(char_t, int) | Yapıcıya karakterler ekler. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | Yapıcıya karakter dizisi ekler. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | Yapıcıya karakter dizisi dilimini ekler. |
| [Append](./append/)(const String\&) | Yapıcıya dize ekler. |
| [Append](./append/)(const String\&, int, int) | Yapıcıya dize dilimini ekler. |
| [Append](./append/)(const SharedPtr\<T\>\&) | Yapıcıya nesnenin dize temsilini ekler. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Yapıcının içeriğini yapıcıya ekler. |
| [Append](./append/)(float) | Yapıcıya kayan nokta değerini ekler. |
| [Append](./append/)(double) | Yapıcıya kayan nokta değerini ekler. |
| [Append](./append/)(int) | Yapıcıya tam sayı değerini ekler. |
| [Append](./append/)(T) | Yapıcıya aritmetik değeri ekler. |
| [Append](./append/)(E) | Enum değerinin dize temsilini oluşturucuya ekler. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Biçimlendirilmiş dizeyi oluşturucuya ekler. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Biçimlendirilmiş dizeyi oluşturucuya ekler. |
| [AppendLine](./appendline/)() | Yeni satır karakterini oluşturucuya ekler. |
| [AppendLine](./appendline/)(const String\&) | Dizeyi yeni satır karakteriyle birlikte oluşturucuya ekler. |
| [Clear](./clear/)() | Oluşturucudan tüm karakterleri kaldırır. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Oluşturucunun verilerini mevcut dizi konumlarına kopyalar. |
| [get_Capacity](./get_capacity/)() const | Dize oluşturucunun mevcut kapasitesini alır. |
| [get_Length](./get_length/)() const | Oluşturucuda şu anda bulunan dizenin uzunluğunu alır. |
| [idx_get](./idx_get/)(int) const | Belirtilen konumdaki karakteri alır. |
| [idx_set](./idx_set/)(int, char_t) | Belirtilen konumdaki karakteri ayarlar. |
| [Insert](./insert/)(int, const String\&) | Dizeyi oluşturucunun sabit konumuna ekler. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Tekrarlanan dizeyi oluşturucunun sabit konumuna ekler. |
| [Insert](./insert/)(int, char_t) | Karakteri oluşturucunun sabit konumuna ekler. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Karakterleri oluşturucunun sabit konumuna ekler. |
| [Insert](./insert/)(int, T) | Değeri oluşturucunun sabit konumuna ekler. |
| [operator[]](./operator[]/)(int) const | Belirtilen konumdaki karakteri alır. |
| [Remove](./remove/)(int, int) | Oluşturucudan parçayı kaldırır. |
| [Replace](./replace/)(const String\&, const String\&) | Alt diziyi oluşturucu aracılığıyla değiştirir. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Alt diziyi oluşturucunun aralığı içinde değiştirir. |
| [Replace](./replace/)(char_t, char_t) | Karakteri oluşturucu aracılığıyla değiştirir. |
| [Replace](./replace/)(char_t, char_t, int, int) | Karakteri oluşturucunun aralığı içinde değiştirir. |
| [set_Capacity](./set_capacity/)(int) | Dize oluşturucunun mevcut kapasitesini ayarlar. |
| [set_Length](./set_length/)(int) | String builder'ı belirtilen uzunluğa kırpar veya uzatır. |
| [StringBuilder](./stringbuilder/)() | Yapıcı. |
| [StringBuilder](./stringbuilder/)(int) | Yapıcı. |
| [StringBuilder](./stringbuilder/)(const String\&) | Yapıcı. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Yapıcı. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Yapıcı. |
| [ToString](./tostring/)() const override | Oluşturucuda şu anda bulunan dizeyi alır. |
| [ToString](./tostring/)(int, int) const | Oluşturucuda şu anda bulunan alt diziyi alır. |
| [~StringBuilder](./~stringbuilder/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
