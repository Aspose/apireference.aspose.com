---
title: "System::Diagnostics::StackFrame sınıfı"
linktitle: "StackFrame"
second_title: "Aspose.Page için C++"
description: "System::Diagnostics::StackFrame sınıfı. Tek bir yığın çerçevesi hakkında bilgi alır. Yalnızca MSVS. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığında veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçmek için kullanın."
type: docs
weight: 500
url: /tr/cpp/system.diagnostics/stackframe/
---
## StackFrame class


Tek bir yığın çerçevesi hakkında bilgi alır. Yalnızca MSVS. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığında veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StackFrame : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | Sütun numarasını alır. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | Satır numarasını alır. |
| virtual [GetFileName](./getfilename/)() | Dosya adını alır. |
| [GetMethod](./getmethod/)() | Yöntem bilgilerini alır. |
| [operator=](./operator=/)(const StackFrame\&) const | Değişiklik yok. |
| [StackFrame](./stackframe/)(int) | Mevcut yığın ofsetinde yığın çerçevesi oluşturur. |
| [StackFrame](./stackframe/)(const StackFrame\&) | Kopyalama yok. |
| virtual [~StackFrame](./~stackframe/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
