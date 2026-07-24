---
title: "Aspose::Page::EPS::Util::ThreadLocal klasse"
linktitle: "ThreadLocal"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::Util::ThreadLocal klasse. Klasse die wordt gebruikt om de functionaliteit die wordt geleverd door de .NET Framework 4.0 en 4.5''s System.Threading.ThreadLocal wrappertype te dupliceren. Dit implementeert instantie- en statische typen die thread‑lokaal zijn en naar verschillende instanties over threads verwijzen, zelfs al is het daadwerkelijke instantie‑type waar de klasse een aggregaat van is mogelijk hetzelfde in C++."
type: docs
weight: 100
url: /nl/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Klasse die wordt gebruikt om de functionaliteit van het .NET Framework 4.0 en 4.5's System.Threading.ThreadLocal‑wrappertype te dupliceren. Deze implementeert instantie‑ en statische types die thread‑lokaal zijn en naar verschillende instanties over threads verwijzen, hoewel het daadwerkelijke instantie‑type waaruit de klasse een aggregaat vormt, hetzelfde kan zijn.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parameter | Beschrijving |
| --- | --- |
| T | Variabel type om te omhullen in thread‑selectielogica. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Dispose](./dispose/)() override | Doet niets. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Factory](./factory/) |  |

## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
