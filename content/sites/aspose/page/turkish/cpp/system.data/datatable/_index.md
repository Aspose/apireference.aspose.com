---
title: "System::Data::DataTable sınıfı"
linktitle: "DataTable"
second_title: "Aspose.Page için C++"
description: "System::Data::DataTable sınıfı. Veri satır ve sütunlarda yapılandırılmıştır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
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
| [get_Columns](./get_columns/)() | Tabloda bulunan sütunları alır. |
| [get_DataSet](./get_dataset/)() | Tablonun ait olduğu veri kümesini alır. |
| [get_Rows](./get_rows/)() | RTTI bilgisi. |
| [get_TableName](./get_tablename/)() | Tablonun adını alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
