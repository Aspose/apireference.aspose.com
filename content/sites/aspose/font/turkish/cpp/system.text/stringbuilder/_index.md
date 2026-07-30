---
title: "System::Text::StringBuilder class"
linktitle: "StringBuilder"
second_title: "Aspose.Font için C++"
description: "System::Text::StringBuilder sınıfı. Dizeyi parça parça biriktirmek için tampon. Bu tür, değer tipi olarak yığında veya System::MakeObject() işlevi kullanılarak yığında tahsis edilebilir. Nesne tahsis edildikten sonra, bu iki kullanım durumunu asla karıştırmayın: yığında tahsis edilen nesnelere SmartPtr işaretçileri sahip olmak C++'ta kesinlikle yasaktır."
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
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Yapıcıya başka bir yapıcının içeriğini ekler. |
| [Append](./append/)(float) | Yapıcıya kayan nokta değerini ekler. |
| [Append](./append/)(double) | Yapıcıya kayan nokta değerini ekler. |
| [Append](./append/)(int) | Builder'a tam sayı değeri ekler. |
| [Append](./append/)(T) | Builder'a aritmetik değer ekler. |
| [Append](./append/)(E) | Builder'a enum değeri dize temsili ekler. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Builder'a biçimlendirilmiş dize ekler. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Builder'a biçimlendirilmiş dize ekler. |
| [AppendLine](./appendline/)() | Builder'a yeni satır karakteri ekler. |
| [AppendLine](./appendline/)(const String\&) | Builder'a yeni satır karakteri izleyen dize ekler. |
| [Clear](./clear/)() | Builder'dan tüm karakterleri kaldırır. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Builder'ın verilerini mevcut dizi konumlarına kopyalar. |
| [get_Capacity](./get_capacity/)() const | String builder'ın mevcut kapasitesini alır. |
| [get_Length](./get_length/)() const | Builder'da şu anda bulunan dize uzunluğunu alır. |
| [idx_get](./idx_get/)(int) const | Belirtilen konumdaki karakteri alır. |
| [idx_set](./idx_set/)(int, char_t) | Belirtilen konumdaki karakteri ayarlar. |
| [Insert](./insert/)(int, const String\&) | Builder'ın sabit konumuna dize ekler. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Builder'ın sabit konumuna yinelenen dize ekler. |
| [Insert](./insert/)(int, char_t) | Builder'ın sabit konumuna karakter ekler. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Builder'ın sabit konumuna karakterler ekler. |
| [Insert](./insert/)(int, T) | Builder'ın sabit konumuna değeri ekler. |
| [operator[]](./operator[]/)(int) const | Belirtilen konumdaki karakteri alır. |
| [Remove](./remove/)(int, int) | Builder'dan parçayı kaldırır. |
| [Replace](./replace/)(const String\&, const String\&) | Builder üzerinden alt diziyi değiştirir. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Builder'ın aralığı üzerinden alt diziyi değiştirir. |
| [Replace](./replace/)(char_t, char_t) | Builder üzerinden karakteri değiştirir. |
| [Replace](./replace/)(char_t, char_t, int, int) | Builder'ın aralığı üzerinden karakteri değiştirir. |
| [set_Capacity](./set_capacity/)(int) | String builder'ın mevcut kapasitesini ayarlar. |
| [set_Length](./set_length/)(int) | String builder'ı belirtilen uzunluğa kırpar veya uzatır. |
| [StringBuilder](./stringbuilder/)() | Yapıcı. |
| [StringBuilder](./stringbuilder/)(int) | Yapıcı. |
| [StringBuilder](./stringbuilder/)(const String\&) | Yapıcı. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Yapıcı. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Yapıcı. |
| [ToString](./tostring/)() const override | Builder'da şu anda bulunan dizeyi alır. |
| [ToString](./tostring/)(int, int) const | Builder'da şu anda bulunan alt diziyi alır. |
| [~StringBuilder](./~stringbuilder/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
