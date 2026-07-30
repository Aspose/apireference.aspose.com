---
title: "System::Data::DataTable sınıfı"
linktitle: "DataTable"
second_title: "Aspose.Font için C++"
description: "System::Data::DataTable sınıfı. Veri satırlar ve sütunlar halinde yapılandırılmıştır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'daki fonksiyonlara argüman olarak geçirin."
type: docs
weight: 900
url: /tr/cpp/system.data/datatable/
---
## DataTable class


[Data](../) structured in rows and columns. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DataTable : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Columns](./get_columns/)() | Tablodaki mevcut sütunları alır. |
| [get_DataSet](./get_dataset/)() | Veri kümesinin ait olduğu tabloyu alır. |
| [get_Rows](./get_rows/)() | RTTI bilgisi. |
| [get_TableName](./get_tablename/)() | Tablo adını alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
