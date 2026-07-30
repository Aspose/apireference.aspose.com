---
title: "System::Diagnostics::PerformanceCounter sınıfı"
linktitle: "PerformanceCounter"
second_title: "Aspose.Font için C++"
description: "System::Diagnostics::PerformanceCounter sınıfı. Performans Sayacı kullanan çevrilmiş kodun derlenebilmesi için sahte sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.diagnostics/performancecounter/
---
## PerformanceCounter class


Performans Sayacı kullanan çevrilmiş kodun derlenebilmesi için sahte sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class PerformanceCounter : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() | Tüm performans sayma işlemlerini durdurur. |
| [NextValue](./nextvalue/)() | Sonraki ölçülen değeri alır. |
| [PerformanceCounter](./performancecounter/)() | Performans sayacı oluşturur. |
| [PerformanceCounter](./performancecounter/)(const String\&, const String\&) | Belirli bir kategori için performans sayacı oluşturur. |
| [PerformanceCounter](./performancecounter/)(const String\&, const String\&, const String\&, const String\&) | Belirli bir kategori ve örnek adı için performans sayacı oluşturur. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
