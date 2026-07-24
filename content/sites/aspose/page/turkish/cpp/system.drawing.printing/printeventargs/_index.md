---
title: "System::Drawing::Printing::PrintEventArgs class"
linktitle: "PrintEventArgs"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Printing::PrintEventArgs sınıfı. BeginPrint ve EndPrint olayları için veri sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek yığını üzerinde veya operator new kullanılarak oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Her zaman bu sınıfı System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 800
url: /tr/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


BeginPrint ve EndPrint olayları için veri sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek yığını üzerinde veya operator new kullanılarak oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Her zaman bu sınıfı [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | Geçerli nesne tarafından temsil edilen bir yazdırma eylemini belirten bir değeri döndürür. |
| [PrintEventArgs](./printeventargs/)() | Yeni bir [PrintEventArgs](./) nesnesi oluşturur. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null işaretçi) temsil eden statik üye. |
## Ayrıca Bakınız

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
