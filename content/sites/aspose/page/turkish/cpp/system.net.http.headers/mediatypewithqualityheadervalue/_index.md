---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue sınıfı"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Page için C++"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue sınıfı. ''Content-Type'' başlığının değerinde ek bir kalite faktörü içeren bir MIME tipini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Yığın üzerinde veya operator new kullanarak bu tipten bir örnek oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1300
url: /tr/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


Bir MIME tipini, 'Content-Type' başlığının değerinde ek bir kalite faktörüyle temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Yığın üzerinde veya operator new kullanarak bu tipten bir örnek oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

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
| static [Parse](./parse/)(String) | Verilen bir dizeyi [MediaTypeWithQualityHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Bir kalite değeri ayarlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | Verilen bir dizeyi [MediaTypeWithQualityHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
