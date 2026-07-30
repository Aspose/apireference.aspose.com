---
title: "System::Net::Http::Headers::WarningHeaderValue sınıfı"
linktitle: "WarningHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::WarningHeaderValue sınıfı. ''Warning'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2700
url: /tr/cpp/system.net.http.headers/warningheadervalue/
---
## WarningHeaderValue class


''Warning'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class WarningHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Agent](./get_agent/)() | Uyarıya ekli ana bilgisayarı döndürür. |
| [get_Code](./get_code/)() | RTTI bilgisi. |
| [get_Date](./get_date/)() | Uyarının tarih ve saatini döndürür. |
| [get_Text](./get_text/)() | Uyarı metnini döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetWarningLength](./getwarninglength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Belirtilen indeksden geçen bir dizeyi [WarningHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [Parse](./parse/)(String) | Geçen bir dizeyi [WarningHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<WarningHeaderValue\>\&) | Geçen bir dizeyi [WarningHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String) | Yeni bir örnek oluşturur. |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String, DateTimeOffset) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
