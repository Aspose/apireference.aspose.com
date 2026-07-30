---
title: "System::Data::DataRow sınıfı"
linktitle: "DataRow"
second_title: "Aspose.Font için C++"
description: "System::Data::DataRow sınıfı. Veri kümesindeki satır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için C++'ta kullanın."
type: docs
weight: 500
url: /tr/cpp/system.data/datarow/
---
## DataRow class


Veri kümesindeki satır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class DataRow : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Table](./get_table/)() | Tablonun ait olduğu satırı alır. |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | Belirtilen ilişki aracılığıyla alt olarak kabul edilen satırları alır. |
| [idx_get](./idx_get/)(const int32_t) | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
