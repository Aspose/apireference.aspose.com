---
title: Aspose::Page::EPS::Util::ThreadLocal class
linktitle: ThreadLocal
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::Util::ThreadLocal class. Class used to duplicate the functionality provided by the .NET Framework 4.0 and 4.5''s System.Threading.ThreadLocal wrapper type. This implements instance and static types that are thread local and refer to different instances across threads, even though the actual instance type that the class is a aggregate of might be the same in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Class used to duplicate the functionality provided by the .NET Framework 4.0 and 4.5's System.Threading.ThreadLocal wrapper type. This implements instance and static types that are thread local and refer to different instances across threads, even though the actual instance type that the class is a aggregate of might be the same.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parameter | Description |
| --- | --- |
| T | Variable type to wrap in thread selection logic |
## Methods

| Method | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Does nothing. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Set n'th template argument a weak pointer (rather than shared). Allows switching pointers in containers to weak mode. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Factory](./factory/) |  |

## See Also

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
