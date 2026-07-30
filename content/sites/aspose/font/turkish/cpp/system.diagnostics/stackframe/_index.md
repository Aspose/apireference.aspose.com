---
title: "System::Diagnostics::StackFrame sınıfı"
linktitle: "StackFrame"
second_title: "Aspose.Font için C++"
description: "System::Diagnostics::StackFrame sınıfı. Tek bir yığın çerçevesi hakkında bilgi alır. MSVS yalnız. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığında veya operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 500
url: /tr/cpp/system.diagnostics/stackframe/
---
## StackFrame class


Tek bir yığın çerçevesi hakkında bilgi alır. MSVS yalnız. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığında veya operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StackFrame : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | colnum numarasını alır. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | Satır numarasını alır. |
| virtual [GetFileName](./getfilename/)() | Dosya adını alır. |
| [GetMethod](./getmethod/)() | Yöntem bilgilerini alır. |
| [operator=](./operator=/)(const StackFrame\&) const | Değişiklik yok. |
| [StackFrame](./stackframe/)(int) | Geçerli yığın ofsetinde yığın çerçevesi oluşturur. |
| [StackFrame](./stackframe/)(const StackFrame\&) | Kopyalama yok. |
| virtual [~StackFrame](./~stackframe/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
