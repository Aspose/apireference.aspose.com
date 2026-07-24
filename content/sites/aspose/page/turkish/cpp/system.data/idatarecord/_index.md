---
title: "System::Data::IDataRecord sınıfı"
linktitle: "IDataRecord"
second_title: "Aspose.Page için C++"
description: "System::Data::IDataRecord sınıfı. Sütunlu kayıt arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt (stack) üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 1300
url: /tr/cpp/system.data/idatarecord/
---
## IDataRecord class


Sütunlu kayıt arayüzü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class IDataRecord : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | RTTI bilgisi. |
| virtual [GetName](./getname/)(const int32_t) | Belirtilen konumdaki alanın adını alır. |
| virtual [idx_get](./idx_get/)(const int32_t) | Belirtilen indeksteki değeri alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
