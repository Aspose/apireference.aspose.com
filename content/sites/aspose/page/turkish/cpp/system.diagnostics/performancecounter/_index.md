---
title: "System::Diagnostics::PerformanceCounter class"
linktitle: "PerformanceCounter"
second_title: "Aspose.Page için C++"
description: "System::Diagnostics::PerformanceCounter sınıfı. PerformanceCounter kullanan çevrilmiş kodun derlenebilmesi için sahte sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve C++'da fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 200
url: /tr/cpp/system.diagnostics/performancecounter/
---
## PerformanceCounter class


PerformanceCounter kullanan çevrilmiş kodun derlenebilmesi için sahte sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

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
* Library [Aspose.Page for C++](../../)
