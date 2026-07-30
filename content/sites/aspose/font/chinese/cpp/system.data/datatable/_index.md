---
title: "System::Data::DataTable 类"
linktitle: "DataTable"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::DataTable 类。数据以行和列的形式组织。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 900
url: /zh/cpp/system.data/datatable/
---
## DataTable class


[Data](../) structured in rows and columns. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DataTable : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Columns](./get_columns/)() | 获取表中存在的列。 |
| [get_DataSet](./get_dataset/)() | 获取数据集所属的表。 |
| [get_Rows](./get_rows/)() | RTTI 信息。 |
| [get_TableName](./get_tablename/)() | 获取表名。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
