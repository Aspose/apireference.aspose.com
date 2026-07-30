---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue sınıfı"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue sınıfı. ''Content-Type'' başlığının değerinde ek bir kalite faktörüyle bir MIME türünü temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak C++ içinde geçirin."
type: docs
weight: 1300
url: /tr/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


''Content-Type'' başlığının değerinde ek bir kalite faktörüyle bir MIME türünü temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI bilgisi. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | Yeni bir örnek oluşturur. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | Yeni bir örnek oluşturur. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | Yeni bir örnek oluşturur. |
| static [Parse](./parse/)(String) | Geçirilen bir dizeyi [MediaTypeWithQualityHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Bir kalite değeri ayarlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | Geçirilen bir dizeyi [MediaTypeWithQualityHeaderValue](./) sınıfının bir örneğine dönüştürmeyi dener. |
## Ayrıca Bakınız

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
