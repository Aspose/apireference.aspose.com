---
title: "Aspose::Page::EPS::Util::ThreadLocal klass"
linktitle: "ThreadLocal"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::Util::ThreadLocal klass. Klass som används för att duplicera funktionaliteten som tillhandahålls av .NET Framework 4.0 och 4.5''s System.Threading.ThreadLocal wrapper-typ. Detta implementerar instans- och statiska typer som är trådlokala och refererar till olika instanser över trådar, även om den faktiska instanstypen som klassen är en aggregat av kan vara densamma i C++."
type: docs
weight: 100
url: /sv/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Klass som används för att duplicera funktionaliteten som tillhandahålls av .NET Framework 4.0 och 4.5:s System.Threading.ThreadLocal-wrapper-typ. Detta implementerar instans- och statiska typer som är trådlokala och refererar till olika instanser över trådar, även om den faktiska instanstypen som klassen är en aggregat av kan vara densamma.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parameter | Beskrivning |
| --- | --- |
| T | Variabeltyp för att omsluta i trådväljarlogik |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Dispose](./dispose/)() override | Gör ingenting. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ställ in n:te mallargumentet som en svag pekare (istället för delad). Tillåter att byta pekare i behållare till svagt läge. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Factory](./factory/) |  |

## Se även

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
