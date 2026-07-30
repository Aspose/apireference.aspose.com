---
title: "System::IO::StringWriter sınıfı"
linktitle: "StringWriter"
second_title: "Aspose.Font için C++"
description: "System::IO::StringWriter sınıfı. Bilgiyi bir dizeye yazan bir TextWriter uygular. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2500
url: /tr/cpp/system.io/stringwriter/
---
## StringWriter class


Bir [TextWriter](../textwriter/) uygular ve bilgiyi bir dizeye yazar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class StringWriter : public System::IO::TextWriter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Şu anda kullanılan kodlamayı döndürür. |
| virtual [GetStringBuilder](./getstringbuilder/)() | Şu anda kullanılan StringBuilder'ı döndürür. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | Belirtilen StringBuilder ve [IFormatProvider](../../system/iformatprovider/) kullanarak yeni bir [StringWriter](./) örneği oluşturur. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | Belirtilen StringBuilder ve geçerli kültürden [IFormatProvider](../../system/iformatprovider/) kullanarak yeni bir [StringWriter](./) örneği oluşturur. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | Belirtilen [IFormatProvider](../../system/iformatprovider/) kullanarak yeni bir [StringWriter](./) örneği oluşturur. |
| [StringWriter](./stringwriter/)() | Geçerli kültürden [IFormatProvider](../../system/iformatprovider/) kullanarak yeni bir [StringWriter](./) örneği oluşturur. |
| [ToString](./tostring/)() const override | Temel dizeyi döndürür. |
| [Write](./write/)(char_t) override | Belirtilen karakteri akışa yazar. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Belirtilen karakter dizisinden belirtilen karakter alt aralığını akışa yazar. |
| [Write](./write/)(const String\&) override | Belirtilen dizeyi akışa yazar. |
## Ayrıca Bakınız

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
