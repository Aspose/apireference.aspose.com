---
title: "System::Drawing::Printing::PrintEventArgs sınıfı"
linktitle: "PrintEventArgs"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Printing::PrintEventArgs sınıfı. BeginPrint ve EndPrint olayları için veri sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


BeginPrint ve EndPrint olayları için veri sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | Geçerli nesne tarafından temsil edilen bir yazdırma eylemini belirten bir değer döndürür. |
| [PrintEventArgs](./printeventargs/)() | Yeni bir [PrintEventArgs](./) nesnesi oluşturur. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Ayrıca Bakınız

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
