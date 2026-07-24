---
title: "Aspose::Page::EPS::Util::ThreadLocal класс"
linktitle: "ThreadLocal"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::Util::ThreadLocal класс. Класс, используемый для дублирования функциональности, предоставляемой оберткой System.Threading.ThreadLocal из .NET Framework 4.0 и 4.5''s. Это реализует экземплярные и статические типы, которые являются потоково‑локальными и ссылаются на разные экземпляры в разных потоках, даже если фактический тип экземпляра, из которого агрегируется класс, может быть одинаковым в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Класс, используемый для дублирования функциональности, предоставляемой типом-обёрткой System.Threading.ThreadLocal из .NET Framework 4.0 и 4.5. Он реализует экземплярные и статические типы, которые являются потоково‑локальными и ссылаются на разные экземпляры в разных потоках, даже если фактический тип экземпляра, агрегатом которого является класс, может быть одинаковым.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Параметр | Описание |
| --- | --- |
| T | Тип переменной для обертывания в логике выбора потока |
## Методы

| Метод | Описание |
| --- | --- |
| [Dispose](./dispose/)() override | Не делает ничего. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Устанавливает n‑й аргумент шаблона как слабый указатель (вместо shared). Позволяет переключать указатели в контейнерах в режим weak. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [Factory](./factory/) |  |

## См. также

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
