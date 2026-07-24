---
title: "System::Net::Http::StringContent sınıfı"
linktitle: "StringContent"
second_title: "Aspose.Page için C++"
description: "System::Net::Http::StringContent sınıfı. HTTP içeriğini bir dize olarak temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek, yığına (stack) veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin C++'ta."
type: docs
weight: 1100
url: /tr/cpp/system.net.http/stringcontent/
---
## StringContent class


HTTP içeriğini bir dize olarak temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek, yığına (stack) veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [StringContent](./stringcontent/)(String) | RTTI bilgisi. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | Yeni bir örnek oluşturur. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | Yeni bir örnek oluşturur. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | Varsayılan kodlama. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Maksimum bayt sayısı. |
## Ayrıca Bakınız

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
