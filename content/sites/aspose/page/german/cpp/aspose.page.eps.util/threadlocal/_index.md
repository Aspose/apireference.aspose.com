---
title: "Aspose::Page::EPS::Util::ThreadLocal Klasse"
linktitle: "ThreadLocal"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::Util::ThreadLocal Klasse. Klasse, die verwendet wird, um die von .NET Framework 4.0 und 4.5''s System.Threading.ThreadLocal Wrapper-Typ bereitgestellte Funktionalität zu duplizieren. Sie implementiert Instanz- und statische Typen, die threadlokal sind und auf verschiedene Instanzen über Threads hinweg verweisen, obwohl der tatsächliche Instanztyp, von dem die Klasse ein Aggregat ist, in C++ derselbe sein könnte."
type: docs
weight: 100
url: /de/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Klasse, die verwendet wird, um die Funktionalität des .NET Framework 4.0 und 4.5‑Wrappers System.Threading.ThreadLocal zu duplizieren. Sie implementiert Instanz‑ und statische Typen, die thread‑lokal sind und auf verschiedene Instanzen über Threads hinweg verweisen, obwohl der eigentliche Instanztyp, aus dem die Klasse aggregiert wird, derselbe sein kann.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parameter | Beschreibung |
| --- | --- |
| T | Variablentyp zum Einwickeln in der Thread-Auswahllogik |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Dispose](./dispose/)() override | Tut nichts. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Vorlagenargument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den schwachen Modus. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Factory](./factory/) |  |

## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
