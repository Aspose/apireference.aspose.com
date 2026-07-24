---
title: "System::Data::DataTable 클래스"
linktitle: "DataTable"
second_title: "C++용 Aspose.Page"
description: "System::Data::DataTable 클래스. 데이터가 행과 열로 구조화됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++ 함수에 인수로 전달하십시오."
type: docs
weight: 900
url: /ko/cpp/system.data/datatable/
---
## DataTable class


[Data](../) structured in rows and columns. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DataTable : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Columns](./get_columns/)() | 테이블에 존재하는 열을 가져옵니다. |
| [get_DataSet](./get_dataset/)() | 테이블이 속한 데이터 세트를 가져옵니다. |
| [get_Rows](./get_rows/)() | RTTI 정보. |
| [get_TableName](./get_tablename/)() | 테이블 이름을 가져옵니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
